/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author luisg
 */
public class Jugador implements Serializable {

    private String usuario;
    private String colorFichas;
    private List<Ficha> fichas;

    public Jugador(String usuario, String colorFichas, List<Ficha> fichas) {
        this.usuario = usuario;
        this.colorFichas = colorFichas;
        this.fichas = fichas;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getColorFichas() {
        return colorFichas;
    }

    public void setColorFichas(String colorFichas) {
        this.colorFichas = colorFichas;
    }

    public List<Ficha> getFichas() {
        return fichas;
    }

    public void setFichas(List<Ficha> fichas) {
        this.fichas = fichas;
    }
}
