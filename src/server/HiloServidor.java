/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.LinkedList;

/**
 *
 * @author Luis Gonzalo Cervantes Rivera 00000228549 Gabriel Francisco Piñuelas
 * Ramos 00000230626 Ricardo Pacheco Urias 00000229178 Abraham Sered Gómez
 * Martínez 00000228796
 */
public class HiloServidor implements Runnable {

    //Declaramos las variables que utiliza el hilo para estar recibiendo y mandando mensajes
    private Socket socket;
    private DataOutputStream out;
    private DataInputStream in;
    private boolean conectado = true;

    //id del jugador
    private int id;

    //Lista de los usuarios conectados al servidor
    private LinkedList<Socket> usuarios = new LinkedList<>();

    /**
     * Constructor que recibe el socket que atenderá el hilo y la lista de
     * jugadores
     *
     * @param socket socket que atenderá el hilo
     * @param usuarios lista de jugadores
     * @param id id del jugador
     */
    public HiloServidor(Socket socket, LinkedList<Socket> usuarios, int id) {
        this.socket = socket;
        this.usuarios = usuarios;
        this.id = id;
    }
    
    @Override
    public void run() {
        try {
            //Inicializamos los canales de comunicación y mandamos el turno a cada jugador
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
            String msg = "" + id;
            out.writeUTF(msg);
            
            //Ciclo infinito que estará escuchando por los movimientos de cada jugador
            while (true) {
                String recibidos = in.readUTF();
                
                for (Socket u : usuarios) {
                    out = new DataOutputStream(u.getOutputStream());
                    out.writeUTF(recibidos);
                }
            }
        } catch (Exception e) {
            
        }
    }
}
