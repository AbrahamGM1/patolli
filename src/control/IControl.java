/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
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
public interface IControl {
    
    public void moverFichas(Movimientos movimiento);
    
    public void tirarDados(int resultado);
    
    public void sacarFicha(Ficha ficha);
    
    public void realizarApuesta(Apuestas apuesta);
    
    public void agregarJugador(Jugador jugador);
    
    public void sacarJugador(Jugador jugador);
    
    public void crearPartida(Partida partida);
    
    public void iniciarPartida();
    
    public void terminarPartida();
}
