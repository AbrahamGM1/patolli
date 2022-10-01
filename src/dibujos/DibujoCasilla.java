/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dibujos;

import entidades.Casilla;
import java.awt.Point;

/**
 *
 * @author luisg
 */
public class DibujoCasilla {

    private Casilla casilla;
    private Point coordenadas;

    public DibujoCasilla(Casilla casilla, int x, int y) {
        this.casilla = casilla;
        this.coordenadas = new Point(x, y);
    }

    public DibujoCasilla(Casilla casilla) {
        this.casilla = casilla;
    }

    public Casilla getCasilla() {
        return casilla;
    }

    public void setCasilla(Casilla casilla) {
        this.casilla = casilla;
    }

    public Point getPoint() {
        return coordenadas;
    }

    public void setPoint(Point point) {
        this.coordenadas = point;
    }

    public int getX() {
        return (int) coordenadas.getX();
    }

    public int getY() {
        return (int) coordenadas.getY();
    }

    @Override
    public String toString() {
        return "DibujoCasilla{" + "casilla=" + casilla + ", coordenadas=" + coordenadas + '}';
    }
}
