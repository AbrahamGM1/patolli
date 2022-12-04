/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pipesandfilters;

import java.io.DataOutputStream;
import java.io.IOException;

/**
 *
 * @author Luis Gonzalo Cervantes Rivera 00000228549 Gabriel Francisco Piñuelas
 * Ramos 00000230626 Ricardo Pacheco Urias 00000229178 Abraham Sered Gómez
 * Martínez 00000228796
 */
public class TuberiaMensajes {

    public Filtro filtro;
    
    public TuberiaMensajes() {
        filtro = new Filtro();
    }
    
    private void mostrarMensajeFiltro(DataOutputStream out, int id, int posicion) throws IOException {
        filtro.accion(out, id, posicion);
    }
    
    public void ejecutarTuberia(DataOutputStream out, int id, int posicion) throws IOException {
        this.mostrarMensajeFiltro(out, id, posicion);
    }
}
