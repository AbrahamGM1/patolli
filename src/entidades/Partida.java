/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luisg
 */
public class Partida implements Serializable {
    
    private final List<Dado> dados;
    private int numJugadores;
    private int numFichas;
    private int fondoApuestas;
    private int montoPorApuesta;
    private Tablero tablero;
    
    public Partida(){
        dados = new ArrayList<>(5);
    }

    public int getNumJugadores() {
        return numJugadores;
    }

    public void setNumJugadores(int numJugadores) {
        this.numJugadores = numJugadores;
    }

    public int getNumFichas() {
        return numFichas;
    }

    public void setNumFichas(int numFichas) {
        this.numFichas = numFichas;
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

    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    public List<Dado> getDados() {
        return dados;
    }
}
