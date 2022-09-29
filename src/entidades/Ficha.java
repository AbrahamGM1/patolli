/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author luisg
 */
public class Ficha {

    private String color;
    private Jugador jugador;
    private int ordenSalida;

    public Ficha(int ordenSalida) {
        this.ordenSalida = ordenSalida;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public int getOrdenSalida() {
        return ordenSalida;
    }

    public void setOrdenSalida(int ordenSalida) {
        this.ordenSalida = ordenSalida;
    }
}
