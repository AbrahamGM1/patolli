package entidades;

import javax.swing.JLabel;

/**
 * Clase que contiene los atributos de la entidad de Ficha. La posicion en la
 * que esta se encuentra en relacion al id de la casilla y el estado en el que
 * se encuentra, jugando o no.
 *
 * @author Luis Gonzalo Cervantes Rivera 00000228549 Gabriel Francisco Piñuelas
 * Ramos 00000230626 Ricardo Pacheco Urias 00000229178 Abraham Sered Gómez
 * Martínez 00000228796
 */
public class Ficha {

    private Casilla casilla;
    private int posicion;
    private int id;
    private JLabel label;
    private boolean enJuego;

    public Ficha() {
    }

    public Ficha(Casilla casilla, int id, JLabel label, boolean enJuego) {
        this.casilla = casilla;
        this.id = id;
        this.label = label;
        this.enJuego = enJuego;
    }

    public Ficha(int id, JLabel label, boolean enJuego) {
        this.id = id;
        this.label = label;
        this.enJuego = enJuego;
    }

    public Ficha(int posicion, int id, boolean enJuego) {
        this.posicion = posicion;
        this.id = id;
        this.enJuego = enJuego;
    }

    public Ficha(int id, int posicion) {
        this.id = id;
        this.posicion = posicion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Casilla getCasilla() {
        return casilla;
    }

    public void setCasilla(Casilla casilla) {
        this.casilla = casilla;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public boolean isEnJuego() {
        return enJuego;
    }

    public void setEnJuego(boolean enJuego) {
        this.enJuego = enJuego;
    }

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }
}
