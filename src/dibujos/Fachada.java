/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dibujos;

import entidades.Ficha;
import entidades.Tablero;

/**
 *
 * @author luisg
 */
public class Fachada implements IDibujoTablero {

    private Tablero tablero;
    private CanvasTablero canvas;

    public Fachada(Tablero tablero) {
        this.tablero = tablero;

    }

    @Override
    public void dibujarTablero() {
    }

    @Override
    public void dibujarFichas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void moverFicha() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sacarFicha(Ficha ficha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
