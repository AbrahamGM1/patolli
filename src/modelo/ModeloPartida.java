/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import entidades.Jugador;
import entidades.Partida;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 *
 * @author luisg
 */
public class ModeloPartida extends Observable {

    private Partida partida;
    private List<Jugador> jugadores;
    private static ModeloPartida modeloPartida;
    private String estado;

    public ModeloPartida() {
        this.partida = new Partida();
        this.jugadores = new ArrayList<>();
    }

    public static ModeloPartida getInstancia() {
        if (modeloPartida == null) {
            return modeloPartida = new ModeloPartida();
        }
        return modeloPartida;
    }

    public boolean partidaCreada() {
        return partida == null;
    }

    public void agregarJugador(Jugador jugador) {
        if (this.partidaCreada()) {
            jugadores.add(jugador);
            super.setChanged();
            super.notifyObservers("Jugador agregado");
        } else {
            super.notifyObservers("Partida no existente");
        }
    }

    public void sacarJugador(Jugador jugador) {
        if (this.partidaCreada()) {
            jugadores.remove(jugador);
            super.setChanged();
            super.notifyObservers("Jugador sacado");
        } else {
            super.notifyObservers("Partida no existente");
        }
    }

    public void crearPartida(Partida partida) {
        if (this.partidaCreada()) {
            this.partida = partida;
            this.estado = "listo";
            super.setChanged();
            super.notifyObservers("Partida creada");
            System.out.println("Partida creada con éxito");
        } else {
            super.notifyObservers("Ya hay una partida creada");
        }
    }

    public void iniciarPartida() {
        if (!this.partidaCreada() && this.partida.getNumJugadores() == this.jugadores.size()) {
            this.estado = "Iniciando";
            super.setChanged();
            super.notifyObservers("Partida iniciada");
        } else {
            super.notifyObservers("Ya hay una partida creada");
        }
    }
}
