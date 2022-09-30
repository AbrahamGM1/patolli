/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import entidades.Apuestas;
import entidades.Ficha;
import entidades.Jugador;
import entidades.Movimientos;
import entidades.Partida;

/**
 *
 * @author luisg
 */
public class Fachada implements IControl {

    private final ControlMovimiento controlMovimiento;
    private final ControlJugador controlJugador;
    private final ControlPartida controlPartida;

    public Fachada() {
        this.controlMovimiento = ControlMovimiento.getInstancia();
        this.controlJugador = ControlJugador.getInstancia();
        this.controlPartida = ControlPartida.getInstancia();
    }

    @Override
    public void moverFichas(Movimientos movimiento) {
        this.controlMovimiento.moverFicha(movimiento);
    }

    @Override
    public void tirarDados(int resultado) {
        this.controlMovimiento.tirarDados(resultado);
    }

    @Override
    public void sacarFicha(Ficha ficha) {
        this.controlMovimiento.sacarFicha(ficha);
    }

    @Override
    public void realizarApuesta(Apuestas apuesta) {
        this.controlMovimiento.realizarApuesta(apuesta);
    }

    @Override
    public void agregarJugador(Jugador jugador) {
        this.controlJugador.agregarJugador(jugador);
    }

    @Override
    public void sacarJugador(Jugador jugador) {
        this.controlJugador.sacarJugador(jugador);
    }

    @Override
    public void crearPartida(Partida partida) {
        this.controlPartida.crearPartida(partida);
    }

    @Override
    public void iniciarPartida() {
        this.controlPartida.iniciarPartida();
    }

    @Override
    public void terminarPartida() {
        this.controlPartida.terminarPartida();
    }
}
