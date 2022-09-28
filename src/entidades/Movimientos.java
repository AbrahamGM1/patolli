/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.List;

/**
 *
 * @author luisg
 */
public class Movimientos {

    private List<Dado> dados;

    public Movimientos(List<Dado> dados) {
        this.dados = dados;
    }

    public List<Dado> getDados() {
        return dados;
    }

    public void setDados(List<Dado> dados) {
        this.dados = dados;
    }

    public int obtenerMovimiento() {
        int numeroCasillas = 0;

        for (Dado d : dados) {
            if (!d.isLiso()) {
                numeroCasillas++;
            }
        }

        return numeroCasillas;
    }
}
