/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import entidades.Apuestas;
import entidades.Ficha;
import entidades.Movimientos;

/**
 *
 * @author luisg
 */
public class ControlMovimiento {

    private static ControlMovimiento controlMovimiento;

    public ControlMovimiento() {

    }

    public static ControlMovimiento getInstancia() {
        if (controlMovimiento == null) {
            return controlMovimiento = new ControlMovimiento();
        }
        return controlMovimiento;
    }

    public void moverFicha(Movimientos movimientos) {

    }

    public void tirarDados(int resultado) {

    }

    public void sacarFicha(Ficha ficha) {

    }

    public void realizarApuesta(Apuestas apuesta) {

    }
}
