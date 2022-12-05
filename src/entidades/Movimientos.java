package entidades;

import java.io.Serializable;

/**
 * Clase que contiene los atributos de la entidad de Movimientos.
 *
 * @author Luis Gonzalo Cervantes Rivera 00000228549 Gabriel Francisco Piñuelas
 * Ramos 00000230626 Ricardo Pacheco Urias 00000229178 Abraham Sered Gómez
 * Martínez 00000228796
 */
public class Movimientos implements Serializable {

    private int id;

    public Movimientos() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    private List<Dado> dados;
//
//    public Movimientos(List<Dado> dados) {
//        this.dados = dados;
//    }
//
//    public List<Dado> getDados() {
//        return dados;
//    }
//
//    public void setDados(List<Dado> dados) {
//        this.dados = dados;
//    }
//
//    public int obtenerMovimiento() {
//        int numeroCasillas = 0;
//
//        for (Dado d : dados) {
//            if (!d.isLiso()) {
//                numeroCasillas++;
//            }
//        }
//
//        return numeroCasillas;
//    }
}
