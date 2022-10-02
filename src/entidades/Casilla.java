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
public class Casilla {

    private int id;
    private Ficha[] listaFicha;

    public Casilla() {
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
