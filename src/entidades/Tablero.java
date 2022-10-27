package entidades;

/**
 *
 * @author 
 * Luis Gonzalo Cervantes Rivera 00000228549
 * Gabriel Francisco Piñuelas Ramos 00000230626
 * Ricardo Pacheco Urias 00000229178
 * Abraham Sered Gómez Martínez 00000228796
 * 
 * Clase que contiene los atributos para la entidad
 * de Tablero. Este se compone del nuemro de casilla 
 * que contendra segun la configuración de la partida.
 * 
 */
public class Tablero {

    private Casilla[] casillas;

    public Tablero() {

    }

    public Tablero(Casilla[] casillas) {
        this.casillas = casillas;
    }

    public Casilla[] getCasillas() {
        return casillas;
    }

    public void setCasillas(Casilla[] casillas) {
        this.casillas = casillas;
    }
}
