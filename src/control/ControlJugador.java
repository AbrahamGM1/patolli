/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import entidades.Jugador;
import modelo.ModeloPartida;

/**
 *
 * @author luisg
 */
public class ControlJugador {

    private static ControlJugador controlJugador;
    private ModeloPartida modeloPartida;

    public ControlJugador() {
        this.modeloPartida = ModeloPartida.getInstancia();
    }

    public static ControlJugador getInstancia() {
        if (controlJugador == null) {
            return controlJugador = new ControlJugador();
        }
        return controlJugador;
    }

    public void agregarJugador(Jugador jugador) {
        this.modeloPartida.agregarJugador(jugador);
    }

    public void sacarJugador(Jugador jugador) {
        this.modeloPartida.sacarJugador(jugador);
    }
}
