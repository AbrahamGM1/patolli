package entidades;

/**
 * Clase que contiene los atributos de la entidad de apuestas, el fondo para
 * apuestas y el monto que se tiene que pagar por cada una.
 *
 * @author Luis Gonzalo Cervantes Rivera 00000228549 Gabriel Francisco Piñuelas
 * Ramos 00000230626 Ricardo Pacheco Urias 00000229178 Abraham Sered Gómez
 * Martínez 00000228796
 */
public class Apuestas {

    private int fondoApuestas;
    private int montoPorApuesta;

    public Apuestas(int fondoApuestas, int montoPorApuesta) {
        this.fondoApuestas = fondoApuestas;
        this.montoPorApuesta = montoPorApuesta;
    }

    public int getFondoApuestas() {
        return fondoApuestas;
    }

    public void setFondoApuestas(int fondoApuestas) {
        this.fondoApuestas = fondoApuestas;
    }

    public int getMontoPorApuesta() {
        return montoPorApuesta;
    }

    public void setMontoPorApuesta(int montoPorApuesta) {
        this.montoPorApuesta = montoPorApuesta;
    }
}
