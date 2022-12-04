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
public class Filtro {

    public void accion(DataOutputStream out, int id, int posicion) throws IOException {
        switch (posicion) {
            case 0:
                FiltroCasillaRoja.accion(out, id);
                break;
            case 1:
                FiltroFinalizoPartida.accion(out, id);
                break;
            case 2:
                FiltroJugadorAbandonoPartida.accion(out, id);
                break;
            case 3:
                FiltroJugadorAvanza10.accion(out, id);
                break;
            case 4:
                FiltroJugadorGanoPartida.accion(out, id);
                break;
            case 5:
                FiltroJugadorPerdio.accion(out, id);
                break;
            case 6:
                FiltroJugadorSeUnio.accion(out, id);
                break;
            case 7:
                FiltroPartidaInicio.accion(out, id);
                break;
            default:
                break;
        }
    }
}
