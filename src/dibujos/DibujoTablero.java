/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dibujos;

import entidades.Casilla;
import entidades.Tablero;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luisg
 */
public class DibujoTablero {
    
    private Tablero tablero;
    private final String movimientos[] = {"R", "U", "R", "D", "R", "D", "L", "D", "L", "U", "L", "U", "R"};
    //variable x y: son para la posición dentro del tablero  
    // if L x-=20 
    // if R x+=20 
    // if U y-=20 
    // if D y+=20 
    private int x = 210;
    private int y = 230;
    private int contador = 0;
    private String movimiento = null;
    private List<DibujoCasilla> casillas;

    public DibujoTablero(Tablero tablero) {
        this.tablero = tablero;
        this.casillas = new ArrayList<>();
    }

    public List<DibujoCasilla> getCasillas() {
        return casillas;
    }

    public void setCasillas(List<DibujoCasilla> casillas) {
        this.casillas = casillas;
    }

    public void crearTablero() {

    }

    private void crearCoordenadasCasillas(int size) {

        for (Casilla c : tablero.getCasillas()) {
            
            DibujoCasilla dibujoCasilla = new DibujoCasilla(c, x, y);
            casillas.add(dibujoCasilla);
            movimiento = movimientos[contador];
            this.calcularXY(movimiento);
            contador++;
            
        }
    }

//    private void guardarNormal(String movimiento, int size, int i) {
//        for (int j = 0; j < size - i; j++) {
//            movimiento = movimientos[contador];
//            this.calcularXY(movimiento);
//            this.guardarC(x, y, "Normal");
//        }
//    }
//
//    private void guardarTriangular(String movimiento) {
//        for (int k = 0; k < 2; k++) {
//            //movimiento = movimientos[contador];
//            this.calcularXY(movimiento);
//            this.guardarC(x, y, "Triangular");
//        }
//    }
    private void calcularXY(String movimiento) {
        if (movimiento.equals("L")) {
            this.x -= 20;
        } else if (movimiento.equals("R")) {
            this.x += 20;
        } else if (movimiento.equals("U")) {
            this.y -= 20;
        } else if (movimiento.equals("D")) {
            this.y += 20;
        }
    }


    public void agregarFichas() {

    }

    public void eliminarFicha() {

    }

    public void moverFicha() {

    }

}
