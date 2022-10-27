package entidades;

/**
 *
 * @author 
 * Luis Gonzalo Cervantes Rivera 00000228549
 * Gabriel Francisco Piñuelas Ramos 00000230626
 * Ricardo Pacheco Urias 00000229178
 * Abraham Sered Gómez Martínez 00000228796
 * 
 * Clase que contiene los atributos de la entidad 
 * de Casilla, donde cada casilla tiene asignado 
 * un id con sus coordenadas correspondientes.
 * 
 */
public class Casilla {

    private int id;
    private int x, y;


    private Ficha[] listaFicha;

    public Casilla() {
    }
    
    public Casilla(int id, int x, int y){
        this.id=id;
        this.x=x;
        this.y=y;
    }
    
    public Casilla(int id, Ficha[] listaFicha) {
        this.id = id;
        this.listaFicha = listaFicha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

        public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public Ficha[] getListaFicha() {
        return listaFicha;
    }

    public void setListaFicha(Ficha[] listaFicha) {
        this.listaFicha = listaFicha;
    }

    public void agregarFicha(Ficha ficha) {
        for (int i = 0; i < listaFicha.length; i++) {
            if (this.listaFicha[i] == null) {
                this.listaFicha[i] = ficha;
            }
        }
    }
}
