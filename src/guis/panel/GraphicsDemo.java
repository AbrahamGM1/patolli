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
 * @author 
 * Luis Gonzalo Cervantes Rivera 00000228549 
 * Gabriel Francisco Piñuelas Ramos 00000230626 
 * Ricardo Pacheco Urias 00000229178 
 * Abraham Sered Gómez Martínez 00000228796
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
    public void tablero(Graphics g) {

        Graphics2D g2D = (Graphics2D) g;

        g2D.setColor(new Color(145, 91, 63));
        g2D.setStroke(new BasicStroke(50));

        //linea Horizontal
        g2D.drawLine(70, 340, 647, 340);

        //Linea Vertical
        g2D.drawLine(360, 52, 360, 630);

        //LINEAS INTERNAS  \
        //horizontal  
        g2D.setStroke(new BasicStroke(2));
        g2D.setColor(Color.white);
        g2D.drawLine(46, 340, 674, 340);

        //LINEAS INTERNAS  \
        //vertical        
        g2D.setStroke(new BasicStroke(2));
        g2D.setColor(Color.white);
        g2D.drawLine(360, 29, 360, 654);

        //lineas Centro
        //Verticales
        g2D.drawLine(335, 29, 335, 654);
        g2D.drawLine(386, 29, 386, 654);
        //Horizontales
        g2D.drawLine(46, 316, 674, 316);
        g2D.drawLine(46, 366, 674, 366);

        //casillas 
        //Horizontal Ariba
        //ABAJO; 316
        //Arriba; 46
        //total=290
        int Espacio = 290 / casillas;
        int InicioArriba = 316 - Espacio;
        int InicioAbajo = 366 + Espacio;
        int InicioDerecha = 385 + Espacio;
        int InicioIzquierda = 334 - Espacio;

        for (int i = 0; i < casillas; i++) {
   
            int Inicio = 314;
            int inicioIz = 334;
            int inicioAbajo = 367;
            int inicioDer = 387;
            if (i == 0) {

                g2D.setStroke(new BasicStroke(1));
                g2D.setColor(Color.yellow);
                //g2D.drawLine(360, InicioArriba+22, 385, InicioArriba+22); 
                g2D.drawLine(360, Inicio - 0, 385, Inicio - 0);
                for (int j = 0; j < Espacio; j++) {
                    g2D.drawLine(360, Inicio - j, 385, Inicio - j);
                    g2D.drawLine(inicioIz - j, 317, inicioIz - j, 338);
                    g2D.drawLine(inicioDer + j, 340, inicioDer + j, 364);
                    g2D.drawLine(335, inicioAbajo + j, 358, inicioAbajo + j);
                }
            }
            if (i == casillas - 1) {
                g2D.setStroke(new BasicStroke(5));
            } else {
                g2D.setStroke(new BasicStroke(2));
            }
            //Horizontales
            g2D.setColor(Color.white);
            g2D.drawLine(335, InicioArriba, 386, InicioArriba);
            InicioArriba = InicioArriba - Espacio;

            g2D.drawLine(335, InicioAbajo, 386, InicioAbajo);
            InicioAbajo = InicioAbajo + Espacio;

            //Verticales   
            g2D.drawLine(InicioIzquierda, 316, InicioIzquierda, 366);
            InicioIzquierda = InicioIzquierda - Espacio;

            g2D.drawLine(InicioDerecha, 316, InicioDerecha, 366);
            InicioDerecha = InicioDerecha + Espacio;

            //triangulitos
            if (i == casillas - 4) {
                g2D.setStroke(new BasicStroke(5));
                //Triangulitos de arriba
                g2D.drawLine(335, InicioArriba + Espacio, 386, InicioArriba);
                g2D.drawLine(335, InicioArriba, 386, InicioArriba + Espacio);
                //triangulitos de la Izquierdo
                g2D.drawLine(InicioIzquierda + Espacio, 316, InicioIzquierda, 366);
                g2D.drawLine(InicioIzquierda, 316, InicioIzquierda + Espacio, 366);
                //triangulitos de la Derecha
                g2D.drawLine(InicioDerecha - Espacio, 316, InicioDerecha, 366);
                g2D.drawLine(InicioDerecha, 316, InicioDerecha - Espacio, 366);
                //triangulitos de la Abajo
                g2D.drawLine(335, InicioAbajo - Espacio, 386, InicioAbajo);
                g2D.drawLine(335, InicioAbajo, 386, InicioAbajo - Espacio);
            }
        }
    }

//>>>>>>> 34dc71bf8be41c78dfb73f7772d71ab049224947
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
        int casillaAvance=idCasilla+valorCaña;
        try {
            Casilla casillaDestino = lcasillas.get(casillaAvance);
            //TO DO: DESPLAZAR LA IMAGEN DE LA FICHA
            lbl.setLocation(casillaDestino.getX(), casillaDestino.getY());
            repaint();
            return casillaDestino;
        } catch (Exception e) {
            return null;
        }
    }
    
    public Casilla ingresarFicha(JLabel l){
        JLabel lbl=l;
        Casilla casillaInicial=lcasillas.get(0);
        lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichaUno.png")));
        lbl.setLocation(casillaInicial.getX(),casillaInicial.getY());
        repaint();
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
