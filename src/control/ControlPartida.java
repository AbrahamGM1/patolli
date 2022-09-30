/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import entidades.Partida;
import modelo.ModeloPartida;

/**
 *
 * @author luisg
 */
public class ControlPartida {

    private static ControlPartida controlPartida;
    private ModeloPartida modeloPartida;

    public ControlPartida() {
        this.modeloPartida = ModeloPartida.getInstancia();
    }

    public static ControlPartida getInstancia() {
        if (controlPartida == null) {
            return controlPartida = new ControlPartida();
        }
        return controlPartida;
    }

    public void crearPartida(Partida partida) {
        this.modeloPartida.crearPartida(partida);
    }

    public void iniciarPartida() {
        this.modeloPartida.iniciarPartida();
    }

    public void terminarPartida() {

    }
}
