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
    private boolean enTablero;

    public Ficha(String color, boolean enTablero) {
        this.color = color;
        this.enTablero = enTablero;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean etsaEnTablero() {
        return enTablero;
    }

    public void setEnTablero(boolean enTablero) {
        this.enTablero = enTablero;
    }
}
