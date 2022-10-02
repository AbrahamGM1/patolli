/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Random;

/**
 *
 * @author luisg
 */
public class Dado {

    private int numDado;
    private boolean lado;

    public Dado(int numDado) {
        this();
        this.numDado = numDado;
        this.GenerarLado();
    }

    public Dado() {

    }

    public int getNumDado() {
        return numDado;
    }

    public void setNumDado(int numDado) {
        this.numDado = numDado;
    }

    public boolean getLado() {
        return lado;
    }

    public void setLado(boolean lado) {
        this.lado = lado;
    }

    public void GenerarLado() {
        Random rd = new Random();
        int numAl = rd.nextInt(3);
        if (numAl == 0) {
            GenerarLado();
        }
        for (int i = 0; i < numAl; i++) {
            if (numAl % 2 == 0) {
                this.lado = true;
                System.out.println("El número es par" + numAl);
            } else {
                this.lado = false;
                System.out.println("El número es no par" + numAl);
            }
        }
    }
}
