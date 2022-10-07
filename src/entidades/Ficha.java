package entidades;

/**
 *
 * @author Luis Gonzalo Cervantes Rivera 00000228549 Gabriel Francisco Piñuelas
 * Ramos 00000230626 Ricardo Pacheco Urias 00000229178 Abraham Sered Gómez
 * Martínez 00000228796
 *
 */
public class Ficha {

    private int posicion;
    private int id;
    private boolean enJuego;

    public Ficha() {
    }
    
    public Ficha(int posicion, int id, boolean enJuego) {
        this.posicion = posicion;
        this.id = id;
        this.enJuego = enJuego;
    }
        
    public Ficha(int id, int posicion) {
        this.id = id;
        this.posicion = posicion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public boolean isEnJuego() {
        return enJuego;
    }

    public void setEnJuego(boolean enJuego) {
        this.enJuego = enJuego;
    }


}
