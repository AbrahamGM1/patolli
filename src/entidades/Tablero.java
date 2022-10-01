/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author luisg
 */
public class Tablero implements Serializable {

    private int numCasillas;
    private List<Casilla> casillas;

    public Tablero(int numCasillas, List casillas) {
        this.numCasillas = numCasillas;
        this.casillas = casillas;
    }

    public int getNumCasillas() {
        return numCasillas;
    }

    public void setNumCasillas(int numCasillas) {
        this.numCasillas = numCasillas;
    }

    public void addCasilla(Casilla casilla) {
        this.casillas.add(casilla);
    }

    public List<Casilla> getCasillas() {
        return casillas;
    }
}
