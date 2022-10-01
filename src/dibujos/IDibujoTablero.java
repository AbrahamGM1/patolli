/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dibujos;

import entidades.Ficha;

/**
 *
 * @author luisg
 */
public interface IDibujoTablero {

    public void dibujarTablero();

    public void dibujarFichas();

    public void moverFicha();

    public void sacarFicha(Ficha ficha);
}
