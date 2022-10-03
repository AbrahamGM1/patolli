package entidades;

import java.util.Random;

/**
 *
 * @author 
 * Luis Gonzalo Cervantes Rivera 00000228549
 * Gabriel Francisco Piñuelas Ramos 00000230626
 * Ricardo Pacheco Urias 00000229178
 * Abraham Sered Gómez Martínez 00000228796
 * 
 */
public class Dado {

    private int numDado;
    private boolean lado;

    public Dado(int numDado) {
        this();
        this.numDado = numDado;
        this.generarLado();
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

    public void generarLado() {
        Random rd = new Random();
        int numAl = rd.nextInt(3);
        if (numAl == 0) {
            generarLado();
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
