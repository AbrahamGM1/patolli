package entidades;

/**
 * Clase que contienen los atributos de la entidad Jugador. El fondo de apuestas
 * que este posee y el numero de fichas con las que jugara.
 *
 * @author Luis Gonzalo Cervantes Rivera 00000228549 Gabriel Francisco Piñuelas
 * Ramos 00000230626 Ricardo Pacheco Urias 00000229178 Abraham Sered Gómez
 * Martínez 00000228796
 */
public class Jugador {

    private Apuestas apuesta;
    private Ficha[] fichas;
    private int fondoJugador;

    public Jugador() {

    }

    public Jugador(Apuestas apuesta) {
        this.apuesta = apuesta;
    }

    public Jugador(Apuestas apuesta, Ficha[] fichas) {
        this.apuesta = apuesta;
        this.fichas = fichas;
    }

    public Apuestas getApuesta() {
        return apuesta;
    }

    public void setApuesta(Apuestas apuesta) {
        this.apuesta = apuesta;
    }

    public Ficha[] getFichas() {
        return fichas;
    }

    public void setFichas(Ficha[] fichas) {
        this.fichas = fichas;
    }

    public int getFondoJugador() {
        return fondoJugador;
    }

    public void setFondoJugador(int fondoJugador) {
        this.fondoJugador = fondoJugador;
    }
}
