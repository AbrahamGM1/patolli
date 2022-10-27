package guis.panel;

import entidades.Casilla;
import entidades.Ficha;
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

//>>>>>>> 34dc71bf8be41c78dfb73f7772d71ab049224947
    public void Panel() {
        this.setBackground(new Color(240, 223, 197));
        this.setSize(720, 720);
    }

    int ident = 0;

    public Casilla moverFicha(int idCasilla, int valorCaña, Ficha ficha) {
        JLabel lbl = ficha.getLabel();
        Casilla casillaDestino = lcasillas.get(idCasilla);
        int casillaAvance = idCasilla + valorCaña;
        System.out.println("id casilla " + idCasilla);

        if (valorCaña == 5) {
            casillaAvance = idCasilla + valorCaña + 5;
        }

        if (valorCaña == 0) {
            lbl.setLocation(casillaDestino.getX(), casillaDestino.getY());
            System.out.println("Jugador permanece en la casilla " + casillaDestino.getId());
            return casillaDestino;
        }
        try {

            if (casillaAvance <= 44) {
                casillaDestino = lcasillas.get(casillaAvance);
                if (casillaDestino.getId() >= lcasillas.get(43).getId()) {
                    JOptionPane.showMessageDialog(null, "Ficha recorrió el tablero");
                    lbl.setIcon(null);
                    lbl.setEnabled(false);
                    
                    return null;
                }

                if (casillaDestino.equals(lcasillas.get(43))) {
                    JOptionPane.showMessageDialog(null, "Ficha recorrió el tablero");
                    lbl.setIcon(null);
                    lbl.setEnabled(false);

                    return null;
                }

                lbl.setLocation(casillaDestino.getX(), casillaDestino.getY());
                System.out.println(casillaAvance);
                repaint();
                return casillaDestino;
            } else {
                JOptionPane.showMessageDialog(null, "Ficha recorrió el tablero");
                lbl.setIcon(null);
                lbl.setEnabled(false);
                return null;
            }

        } catch (Exception e) {
            return null;
        }
    }

    public Casilla ingresarFicha(Ficha ficha, JLabel l, int idCasilla) {
        JLabel lbl = l;
        Casilla casillaInicial = lcasillas.get(idCasilla);

        System.out.println(casillaInicial.getX() + "," + casillaInicial.getY());
        lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichaUno.png")));
        lbl.setLocation(casillaInicial.getX(), casillaInicial.getY());

        repaint();
        return casillaInicial;
    }

    public boolean seIngresoFicha(Casilla casilla) {
        if (casilla.getId() != 0) {
            return false;
        } else {
            return true;
        }
    }

    public void sacarFicha(JLabel lbl) {
        lbl = null;
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
