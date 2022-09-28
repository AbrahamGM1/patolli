/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author luisg
 */
public class Apuestas {

    private int fondoApuestas;
    private int montoPorApuesta;

    public Apuestas(int fondoApuestas, int montoPorApuesta) {
        this.fondoApuestas = fondoApuestas;
        this.montoPorApuesta = montoPorApuesta;
    }

    public int getFondoApuestas() {
        return fondoApuestas;
    }

    public void setFondoApuestas(int fondoApuestas) {
        this.fondoApuestas = fondoApuestas;
    }

    public int getMontoPorApuesta() {
        return montoPorApuesta;
    }

    public void setMontoPorApuesta(int montoPorApuesta) {
        this.montoPorApuesta = montoPorApuesta;
    }
}
