/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author luisg
 */
public class Casilla {

    private int id;
    private Ficha[] listaFicha;

    public Casilla() {
    }

    public Casilla(int id, Ficha[] listaFicha) {
        this.id = id;
        this.listaFicha = listaFicha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Ficha[] getListaFicha() {
        return listaFicha;
    }

    public void setListaFicha(Ficha[] listaFicha) {
        this.listaFicha = listaFicha;
    }

    public void agregarFicha(Ficha ficha) {
        for (int i = 0; i < listaFicha.length; i++) {
            if (this.listaFicha[i] == null) {
                this.listaFicha[i] = ficha;
            }
        }
    }
}
