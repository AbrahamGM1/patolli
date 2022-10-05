package guis.panel;

import entidades.Casilla;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Luis Gonzalo Cervantes Rivera 00000228549 Gabriel Francisco Piñuelas
 * Ramos 00000230626 Ricardo Pacheco Urias 00000229178 Abraham Sered Gómez
 * Martínez 00000228796
 *
 */
public class GraphicsDemo extends JPanel {

    private int casillas;
    private int casillastotales;
    int x = 340;
    int y = 325;
    CasillaPartida c = new CasillaPartida();
    List<Casilla> lcasillas = c.inicializarCasilla10();

    public GraphicsDemo(int casillas) {
        this.casillas = casillas;
        this.casillastotales = casillas * 2 * 4 + 4;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.Panel();
        Graphics2D g2D = (Graphics2D) g;
//        tablero(g);
        g2D.fillOval(x, y, 10, 10);
    }

    public void Panel() {
        this.setBackground(new Color(240, 223, 197));
        this.setSize(720, 720);
    }

    
    int ident = 0;

    public void meterFichaCentral(Graphics g, int numJugador) {

        Graphics2D g2D = (Graphics2D) g;
        int espacio2 = 0;
        if (numJugador == 1) {
            g2D.setStroke(new BasicStroke(5));
            //fichas jugador 1
            g2D.setColor(Color.CYAN);

            int InicioArriba = 325;
            ident = 1;
            g2D.fillOval(340, InicioArriba - espacio2, 10, 10);

            repaint();
        }
    }

    public void AvanzarFicha(JLabel l, int casillasAvanzadas, int numJugador) {

        JLabel lbl = l;
        int espacio2 = 0;

        if (numJugador == 1) {
            
            //fichas jugador 1

            int InicioArriba = 432;
            if (casillasAvanzadas <= casillastotales / 8.5 || casillas == casillasAvanzadas) {
                for (int i = 0; i < casillasAvanzadas; i++) {
                    espacio2 = espacio2 + this.DeterminarEspacioAvanzar();
                }
                x = InicioArriba - espacio2;
                y = 449;
                this.repaint();
                lbl.setLocation(InicioArriba, y);

            } else if (casillasAvanzadas >= casillastotales / 7.55555555555555555 && casillasAvanzadas <= casillastotales / 4) {
                int inicio = 20;
                for (int i = 0; i < casillasAvanzadas - casillas; i++) {
                    espacio2 = espacio2 + this.DeterminarEspacioAvanzar();
                }

                lbl.setLocation(InicioArriba + espacio2, 350);

            } else if (casillasAvanzadas >= casillastotales / 4 && casillasAvanzadas < casillastotales / 2.61111111111111 && casillasAvanzadas != casillas * 3 + 2) {
                int inicio = 340;
                for (int i = 0; i < casillasAvanzadas - casillas * 2 - 1; i++) {
                    espacio2 = espacio2 + this.DeterminarEspacioAvanzar();
                }

                lbl.setLocation(344, InicioArriba + espacio2);

            } else if (casillasAvanzadas <= 33) {
                int inicio = 663;
                for (int i = 0; i < casillasAvanzadas - casillas * 3 - 1; i++) {
                    espacio2 = espacio2 + this.DeterminarEspacioAvanzar();
                }

                lbl.setLocation(344, InicioArriba + espacio2);

            } else if (casillasAvanzadas <= 42) {
                int inicio = 332;
                for (int i = 0; i < casillasAvanzadas - casillas * 4 - 1; i++) {
                    espacio2 = espacio2 + this.DeterminarEspacioAvanzar();
                }
                lbl.setLocation(344, InicioArriba + espacio2);

            } else if (casillasAvanzadas <= 51) {
                int inicio = 322;
                for (int i = 0; i < casillasAvanzadas - casillas * 5 - 1; i++) {
                    espacio2 = espacio2 + this.DeterminarEspacioAvanzar();
                }
                lbl.setLocation(344, InicioArriba + espacio2);

            } else if (casillasAvanzadas >= 52) {
                int inicio = 295;
                for (int i = 0; i < casillasAvanzadas - casillas * 5 - 1; i++) {
                    espacio2 = espacio2 + this.DeterminarEspacioAvanzar();
                }
                lbl.setLocation(344, InicioArriba + espacio2);
                JOptionPane.showMessageDialog(null, "¡¡¡¡GANASTE!!!!");
            }
        }
    }

    public Casilla moverFicha(int idCasilla, int valorCaña, JLabel ficha) {
        JLabel lbl=ficha;
        try {
            Casilla casillaDestino = lcasillas.get(idCasilla + valorCaña);
            //TO DO: DESPLAZAR LA IMAGEN DE LA FICHA
            lbl.setLocation(casillaDestino.getX(), casillaDestino.getY());
            return casillaDestino;
        } catch (Exception e) {
            return null;
        }
    }
    
    public Casilla ingresarFicha(JLabel l){
        JLabel lbl=l;
        Casilla casillaInicial=lcasillas.get(0);
        lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichaUno.png")));
//        lbl.setLocation(casillaInicial.getX(),casillaInicial.getY());

        return casillaInicial;
    }
    
    public boolean seIngresoFicha(Casilla casilla){
        if (casilla.getId()!=0) {
            return false;
        }else{
            return true;
        }
    }

    public void setx(int x) {
        this.x = x;
    }

    public void sety(int y) {
        this.y = y;
    }

    public int getx() {
        return this.x;
    }

    public int gety() {
        return this.y;
    }

    public int DeterminarEspacioAvanzar() {
        int Espacio = 290 / casillas;

        return Espacio;
    }
}
