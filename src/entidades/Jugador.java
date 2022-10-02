/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author luisg
 */
public class Jugador {

    private Apuestas apuesta;
    private Ficha[] fichas;

    public Jugador() {

    }

    public Jugador(Apuestas apuesta) {
        this.apuesta = apuesta;
    }

    public Jugador(Apuestas apuesta, Ficha[] fichas) {
        this.apuesta = apuesta;
        this.fichas = fichas;
    }

    public Apuestas getApuesta() {
        return apuesta;
    }

    public void setApuesta(Apuestas apuesta) {
        this.apuesta = apuesta;
    }

    public Ficha[] getFichas() {
        return fichas;
    }

    public void setFichas(Ficha[] fichas) {
        this.fichas = fichas;
    }
}
