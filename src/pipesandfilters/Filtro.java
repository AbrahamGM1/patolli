/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pipesandfilters;

/**
 *
 * @author Luis Gonzalo Cervantes Rivera 00000228549 Gabriel Francisco Piñuelas
 * Ramos 00000230626 Ricardo Pacheco Urias 00000229178 Abraham Sered Gómez
 * Martínez 00000228796
 * @param <T>
 */
public class Filtro<T> {

    private final T filtro;
    
    public Filtro(Class<T> tipoFiltro) {
        filtro = (T) tipoFiltro;
    }
    
    public void accion() {
        if (filtro.getClass().equals(FiltroCasillaRoja.class)) {
            ((FiltroCasillaRoja) filtro).accion();
        } else if (filtro.getClass().equals(FiltroFinalizoPartida.class)){
            ((FiltroFinalizoPartida) filtro).accion();
        } else if (filtro.getClass().equals(FiltroJugadorAbandonoPartida.class)) {
            ((FiltroJugadorAbandonoPartida) filtro).accion();
        } else if (filtro.getClass().equals(FiltroJugadorAvanza10.class)) {
            ((FiltroJugadorAvanza10) filtro).accion();
        } else if (filtro.getClass().equals(FiltroJugadorGanoPartida.class)) {
            ((FiltroJugadorGanoPartida) filtro).accion();
        } else if (filtro.getClass().equals(FiltroJugadorPerdio.class)) {
            ((FiltroJugadorPerdio) filtro).accion();
        } else if (filtro.getClass().equals(FiltroJugadorSeUnio.class)) {
            ((FiltroJugadorSeUnio) filtro).accion();
        } else if (filtro.getClass().equals(FiltroPartidaInicio.class)) {
            ((FiltroPartidaInicio) filtro).accion();
        }
    }
}
