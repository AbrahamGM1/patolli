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

    //Se asignan el total de casillas que tendrá el tablero seleccionado a la hora de configurar la partida
    public GraphicsDemo(int casillas) {
        this.casillas = casillas;
        this.casillastotales = casillas * 2 * 4 + 4;
    }

    /**
     * EXPLICACIÓN DE LA CASILLA DESTINO Y "LCASILLAS" Método que hará el
     * traslado de las fichas, hace una casilla "casillaDestino" que va a valer
     * exactamente lo mismo que la casilla de la lísta de casillas del tablero
     * con la que coincida el id. EJEMPLO: Si el id de la casilla enviada es 4,
     * entonces la "casillaDestino" valdrá lo mismo que lo que vale la casilla
     * con el id 4 dentro de la lista "lcasillas" La lista "lcasillas" es una
     * lista que almacena todas las casillas (con su id, posición x, posición y)
     * que se encuentran dentro del tablero.
     *
     * EXPLICACIÓN DE LA CASILLA AVANCE CasillaAvance es un número entero que se
     * usa como el nuevo id de la casilla al cual se le suma el valor obtenido
     * de las cañas al ser arrojadas para de esa manera poder saber en que id de
     * las casillas va a caer la ficha una vez se realice el traslado
     *
     * EXPLICACIÓN DE LAS CONDICIONES La primer condición: si salieron 5 cañas
     * con punto, se avanzaran las 5 casillas, mas otras 5 para poder avanzar
     * las 10 casillas como lo dicta el reglamento del juego
     *
     * La segunda condición: Si no sacó ningun punto el jugador pues no se mueve
     *
     * La tercera condición: Si aún no se ha recorrido todo el tablero entonces
     * a la "casillaDestino" se le será asignada el valor que tiene la casilla
     * de la lista de casillas "lcasillas" correspondiente al número almacenado
     * dentro de la variable "casillaAvance", a partrír de aqui ocurren otra
     * serie de condiciones en las cuales: si el tablero supera las 43 casillas
     * con su siguiente movimiento se le avisa que recorrió todo el tablero y
     * desactiva la ficha, en caso de que no las haya superado, al label de la
     * casilla se le da la posición correspondiente a la casilla destino, y el
     * método devuelve la nueva casilla en la que se encontrará la ficha
     *
     *
     *
     * @param idCasilla - el id de la casilla en la que se encuentra la ficha
     * que se va a mover
     * @param valorCaña - El valor que dieron las cañas al ser arrojadas
     * @param ficha - La ficha que se va a mover
     * @return
     */
    public Casilla moverFicha(int idCasilla, int valorCaña, JLabel ficha) {
        JLabel lbl = ficha;
        Casilla casillaDestino = lcasillas.get(idCasilla);
        int casillaAvance = idCasilla + valorCaña;
        System.out.println("id casilla " + idCasilla);

        if (valorCaña == 5) {
            casillaAvance += 5;
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
                    JOptionPane.showMessageDialog(null, "Ficha recorrio el tablero");
                    lbl.setIcon(null);
                    lbl.setEnabled(false);

                    return null;
                }

                if (casillaDestino.equals(lcasillas.get(43))) {
                    JOptionPane.showMessageDialog(null, "Ficha recorrio el tablero");
                    lbl.setIcon(null);
                    lbl.setEnabled(false);

                    return null;
                }

                lbl.setLocation(casillaDestino.getX(), casillaDestino.getY());
                System.out.println(casillaAvance);
                repaint();
                return casillaDestino;
            } else {
                JOptionPane.showMessageDialog(null, "Ficha recorrio el tablero");
                lbl.setIcon(null);
                lbl.setEnabled(false);
                return null;
            }

        } catch (Exception e) {
            return null;
        }
    }

    /**
     * Ingresa una ficha en el tablero, su funcionamiento es el siguiente:
     *
     * Hace un nuevo label al cual le asigna de valor el label enviado de
     * parámetro, hace una casilla la cual tendrá de valores exactamente los
     * mismos que tenga la casilla de la lista "lcasillas" con la que su id
     * coincida, se le asigna un ícono al label de la ficha y se le asigna una
     * posición a este label, aunque por motivos desconocidos por ahora,
     * extrañamente lo pone en la posición x0,y0.
     *
     * @param idCasilla - el id de la casilla
     * @return la ficha
     */
    public Casilla ingresarFicha(JLabel l, int idCasilla, int jugador) {
        JLabel lbl = l;
        Casilla casillaInicial = lcasillas.get(idCasilla);

        System.out.println(casillaInicial.getX() + "," + casillaInicial.getY());

        if (jugador == 1) {
            lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichaUno.png")));
            lbl.setLocation(casillaInicial.getX(), casillaInicial.getY());
        }
        if (jugador == 2) {
            lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichaDos.png")));
            lbl.setLocation(casillaInicial.getX(), casillaInicial.getY());
        }
        if (jugador == 3) {
            lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichaTres.png")));
            lbl.setLocation(casillaInicial.getX(), casillaInicial.getY());
        }
        if (jugador == 4) {
            lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fichaCuatro.png")));
            lbl.setLocation(casillaInicial.getX(), casillaInicial.getY());
        }

        repaint();
        return casillaInicial;
    }

    /**
     * *
     * Comprueba si se ha ingresado la ficha dentro de la casilla, probablemente
     * deberia de pedir una ficha en lugar de una casilla, pero ahi veremos por
     * ahora
     *
     * @param casilla
     * @return
     */
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
