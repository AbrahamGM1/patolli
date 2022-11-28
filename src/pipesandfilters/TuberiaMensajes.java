/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pipesandfilters;

import java.util.List;

/**
 *
 * @author Luis Gonzalo Cervantes Rivera 00000228549 Gabriel Francisco Piñuelas
 * Ramos 00000230626 Ricardo Pacheco Urias 00000229178 Abraham Sered Gómez
 * Martínez 00000228796
 */
public class TuberiaMensajes {

    public List<Filtro> filtros;
    
    public TuberiaMensajes() {
        Filtro<FiltroCasillaRoja> fCR = new Filtro<>(FiltroCasillaRoja.class);
        Filtro<FiltroFinalizoPartida> fFP = new Filtro<>(FiltroFinalizoPartida.class);
        Filtro<FiltroJugadorAbandonoPartida> fJAP = new Filtro<>(FiltroJugadorAbandonoPartida.class);
        Filtro<FiltroJugadorAvanza10> fJA10 = new Filtro<>(FiltroJugadorAvanza10.class);
        Filtro<FiltroJugadorGanoPartida> fJGP = new Filtro<>(FiltroJugadorGanoPartida.class);
        Filtro<FiltroJugadorPerdio> fJP = new Filtro<>(FiltroJugadorPerdio.class);
        Filtro<FiltroJugadorSeUnio> fJSU = new Filtro<>(FiltroJugadorSeUnio.class);
        Filtro<FiltroPartidaInicio> fPI = new Filtro<>(FiltroPartidaInicio.class);
        
        filtros.add(fCR);
        filtros.add(fFP);
        filtros.add(fJAP);
        filtros.add(fJA10);
        filtros.add(fJGP);
        filtros.add(fJP);
        filtros.add(fJSU);
        filtros.add(fPI);
    }
    
    public void mostrarMensajeFiltro() {

    }
    
    public void ejecutarTuberia() {
        
    }
}
