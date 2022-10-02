package entidades;

/**
 *
 * @author 
 * Luis Gonzalo Cervantes Rivera 00000228549
 * Gabriel Francisco Piñuelas Ramos 00000230626
 * Ricardo Pacheco Urias 00000229178
 * Abraham Sered Gómez Martínez 00000228796
 * 
 */
public class Partida {

    private int numCasillas;
    private Tablero tablero;
    private Jugador[] listaJugadores;
    private Dado[] dados;
    private int Codigo;

    public Partida() {

    }

    public Partida(int numCasillas, Tablero tablero, Jugador[] listaJugadores, Dado[] dados, int Codigo) {
        this.numCasillas = numCasillas;
        this.tablero = tablero;
        this.listaJugadores = listaJugadores;
        this.dados = dados;
        this.Codigo = Codigo;
    }

    public Partida(Tablero tablero, Jugador[] listaJugadores, Dado[] dados) {
        this.tablero = tablero;
        this.listaJugadores = listaJugadores;
        this.dados = dados;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    public Jugador[] getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(Jugador[] listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    public Dado[] getDados() {
        return dados;
    }

    public void setDados(Dado[] dados) {
        this.dados = dados;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public int getNumCasillas() {
        return numCasillas;
    }

    public void setNumCasillas(int numCasillas) {
        this.numCasillas = numCasillas;
    }
}
