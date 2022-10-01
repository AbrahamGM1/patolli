/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dibujos;

import entidades.CasillaCentral;
import entidades.CasillaEntradaSalida;
import entidades.CasillaNormal;
import entidades.CasillaTriangular;
import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.util.List;

/**
 *
 * @author luisg
 */
public class CanvasTablero extends Canvas {

    private int numTablero;
    private DibujoTablero dibujoTablero;
    private final int centro = 230;
    private final int tamanioCasilla = 20;
    private Graphics2D g2d;

    public CanvasTablero(int numTablero, DibujoTablero dibujoTablero) {
        this.numTablero = numTablero - 1;
        this.dibujoTablero = dibujoTablero;
    }

    @Override
    public void paint(Graphics g) {
        g2d = (Graphics2D) g;
        g2d.setColor(Color.BLACK);
        Rectangle rect = new Rectangle();
        rect.setBounds(0, 0, this.getWidth() - 1, this.getHeight() - 1);
        g2d.draw(rect);
        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(2));
        this.dTablero();
        this.dFichas();
    }

    private void dTablero() {
        List<DibujoCasilla> dCasillas = this.dibujoTablero.getCasillas();

        for (DibujoCasilla dCasilla : dCasillas) {
            if (dCasilla.getCasilla() instanceof CasillaEntradaSalida) {
                //Agregar color dependiendo del jugador
                this.dCasillas(dCasilla, g2d);
            }
            if (dCasilla.getCasilla() instanceof CasillaTriangular) {
                this.dCasillas(dCasilla, g2d);
            }
            if (dCasilla.getCasilla() instanceof CasillaNormal || dCasilla.getCasilla() instanceof CasillaCentral) {
                this.dCasillas(dCasilla, g2d);
            }
        }
        this.dibujarTriangulos(g2d);
        this.dibujarCirculo(g2d);
        this.dibujarLinea(this.centro, this.centro, g2d);
    }

    //Metodos visibles desde una clase externa
    public void actualizarTablero() {
        this.repaint();
    }

    /**
     * checar donde añadir el método repaint que se vincula con el método
     * dibujarFichas
     */
    public void dFichas() {
        g2d.setStroke(new BasicStroke(1));
        Ellipse2D.Double ficha;
        g2d.setColor(Color.BLUE);
        List<DibujoCasilla> dCasillas = this.dibujoTablero.getCasillas();
        for (DibujoCasilla dCasilla : dCasillas) {
            if (!dCasilla.getCasilla().isDisponible()) {
                ficha = new Ellipse2D.Double(dCasilla.getX(),
                        dCasilla.getY(), tamanioCasilla / 2, tamanioCasilla / 2);
                g2d.fill(ficha);
                g2d.setColor(Color.LIGHT_GRAY);
                g2d.draw(ficha);
            }
        }
    }

//    public void dibujarFichas() {
//        this.repaint();
//    }
    private void dCasillas(DibujoCasilla dCasilla, Graphics2D g) {
        Rectangle rect = new Rectangle();
        rect.setBounds(dCasilla.getX(), dCasilla.getY(), this.tamanioCasilla, this.tamanioCasilla);
        g.draw(rect);
    }

    /**
     * Dibuja las casillas semicirculares del tablero
     *
     * @param g2d variable de los graficos 2d
     */
    private void dibujarCirculo(Graphics2D g2d) {
        g2d.drawArc(this.centro - (this.tamanioCasilla * this.numTablero) - 17, this.centro, this.tamanioCasilla * 2, this.tamanioCasilla * 2, 90, 180);
        g2d.drawArc(this.centro, this.centro + (this.tamanioCasilla * this.numTablero) + 17, this.tamanioCasilla * 2, this.tamanioCasilla * 2, 180, 180);
        g2d.drawArc(this.centro + (this.tamanioCasilla * this.numTablero) + 17, this.centro, this.tamanioCasilla * 2, this.tamanioCasilla * 2, 90, -180);
        g2d.drawArc(this.centro, this.centro - (this.tamanioCasilla * this.numTablero) - 17, this.tamanioCasilla * 2, this.tamanioCasilla * 2, -180, -180);
        this.dibujarLinea(this.centro, this.centro, g2d);
    }

    /**
     * Dibuja una linea
     *
     * @param x coordenada x
     * @param y coordenada y
     * @param g2d variable de los graficos 2d
     */
    private void dibujarLinea(int x, int y, Graphics2D g2d) {
        g2d.drawLine(x - (this.numTablero * this.tamanioCasilla) - 17, y + this.tamanioCasilla, x, y + this.tamanioCasilla);
        g2d.drawLine(x + (this.numTablero * this.tamanioCasilla) + 57, y + this.tamanioCasilla, x, y + this.tamanioCasilla);
        g2d.drawLine(x + this.tamanioCasilla, y - (this.numTablero * this.tamanioCasilla) - 17, x + this.tamanioCasilla, y);
        g2d.drawLine(x + this.tamanioCasilla, y + (this.numTablero * this.tamanioCasilla) + 57, x + this.tamanioCasilla, y);
    }

    private void dibujarTriangulos(Graphics2D g2d) {
        this.dibujarTriangulosIzquierda(g2d);
        this.dibujarTriangulosDerecha(g2d);
        this.dibujarTrianguloSuperior(g2d);
        this.dibujarTriangulosInferior(g2d);
    }

    /**
     * Dibuja los triangulos del lado izquierdo
     *
     * @param g2d variable de los graficos 2d
     */
    private void dibujarTriangulosIzquierda(Graphics2D g2d) {
        //primer triangulo izquierda
        int[] x = {(this.centro - (tamanioCasilla * this.numTablero)) + (tamanioCasilla),
            this.centro - (tamanioCasilla * this.numTablero) + tamanioCasilla + tamanioCasilla / 2,
            this.centro - (tamanioCasilla * this.numTablero) + tamanioCasilla / 2};
        int[] y = {this.centro + tamanioCasilla,
            this.centro, this.centro};
        Polygon p = new Polygon(x, y, 3);
        g2d.fillPolygon(p);
        g2d.drawPolygon(p);
        //segundo triangulo izquierda
        x = new int[]{(this.centro - (tamanioCasilla * this.numTablero)) + (tamanioCasilla),
            this.centro - (tamanioCasilla * this.numTablero) + tamanioCasilla + tamanioCasilla / 2,
            this.centro - (tamanioCasilla * this.numTablero) + tamanioCasilla / 2};
        y = new int[]{this.centro + tamanioCasilla,
            this.centro + (this.tamanioCasilla * 2), this.centro + (this.tamanioCasilla * 2)};
        p = new Polygon(x, y, 3);
        g2d.fill(p);
        g2d.drawPolygon(p);
    }

    /**
     * Dibuja los triangulos del lado derecho
     *
     * @param g2d variable de los graficos 2d
     */
    private void dibujarTriangulosDerecha(Graphics2D g2d) {
        //primer triangulo derecha 
        int[] x = new int[]{(this.centro + (tamanioCasilla * this.numTablero)) + ((tamanioCasilla * 2) - tamanioCasilla),
            this.centro + (tamanioCasilla * this.numTablero) + tamanioCasilla + tamanioCasilla / 2,
            this.centro + (tamanioCasilla * this.numTablero) + tamanioCasilla / 2};
        int[] y = new int[]{this.centro + tamanioCasilla,
            this.centro + (this.tamanioCasilla * 2), this.centro + (this.tamanioCasilla * 2)};
        Polygon p = new Polygon(x, y, 3);
        g2d.fill(p);
        g2d.drawPolygon(p);
        //segundo triangulo derecha
        x = new int[]{(this.centro + (tamanioCasilla * this.numTablero)) + ((tamanioCasilla * 2) - tamanioCasilla),
            this.centro + (tamanioCasilla * this.numTablero) + tamanioCasilla + tamanioCasilla / 2,
            this.centro + (tamanioCasilla * this.numTablero) + tamanioCasilla / 2};
        y = new int[]{this.centro + tamanioCasilla,
            this.centro, this.centro};
        p = new Polygon(x, y, 3);
        g2d.fillPolygon(p);
        g2d.drawPolygon(p);
    }

    /**
     * Dibuja los triangulos de arriba
     *
     * @param g2d variable de los graficos 2d
     */
    private void dibujarTrianguloSuperior(Graphics2D g2d) {
        //primer triangulo superior
        int[] x = new int[]{(this.centro),
            this.centro,
            this.centro + (tamanioCasilla)};
        int[] y = new int[]{this.centro - (this.tamanioCasilla * this.numTablero) + tamanioCasilla / 2,
            this.centro - ((tamanioCasilla * this.numTablero) - tamanioCasilla - this.tamanioCasilla / 2),
            this.centro - (tamanioCasilla * this.numTablero) + this.tamanioCasilla};
        Polygon p = new Polygon(x, y, 3);
        g2d.fillPolygon(p);
        g2d.drawPolygon(p);
        //segundo triangulo superior 
        x = new int[]{(this.centro + tamanioCasilla * 2),
            this.centro + tamanioCasilla * 2,
            this.centro + (tamanioCasilla)};
        y = new int[]{this.centro - (this.tamanioCasilla * this.numTablero) + tamanioCasilla / 2,
            this.centro - ((tamanioCasilla * this.numTablero) - this.tamanioCasilla - this.tamanioCasilla / 2),
            this.centro - (tamanioCasilla * this.numTablero) + this.tamanioCasilla};
        p = new Polygon(x, y, 3);
        g2d.fillPolygon(p);
        g2d.drawPolygon(p);
    }

    /**
     * Dibuja los triangulos de abajo
     *
     * @param g2d variable de los graficos 2d
     */
    private void dibujarTriangulosInferior(Graphics2D g2d) {
        //primer triangulo inferior 
        int[] x = new int[]{(this.centro),
            this.centro,
            this.centro + (tamanioCasilla)};
        int[] y = new int[]{this.centro + (this.tamanioCasilla * this.numTablero) + tamanioCasilla / 2,
            this.centro + ((tamanioCasilla * this.numTablero) + this.tamanioCasilla) + tamanioCasilla / 2,
            this.centro + (tamanioCasilla * this.numTablero) + this.tamanioCasilla * 2 - (tamanioCasilla)};
        Polygon p = new Polygon(x, y, 3);
        g2d.fillPolygon(p);
        g2d.drawPolygon(p);
        //segundo triangulo inferior
        x = new int[]{(this.centro + this.tamanioCasilla * 2),
            this.centro + this.tamanioCasilla * 2,
            this.centro + (tamanioCasilla)};
        y = new int[]{this.centro + (this.tamanioCasilla * this.numTablero) + tamanioCasilla / 2,
            this.centro + ((tamanioCasilla * this.numTablero) + this.tamanioCasilla) + tamanioCasilla / 2,
            this.centro + (tamanioCasilla * this.numTablero) + this.tamanioCasilla * 2 - (tamanioCasilla)};
        p = new Polygon(x, y, 3);
        g2d.fillPolygon(p);
        g2d.drawPolygon(p);
    }
}
