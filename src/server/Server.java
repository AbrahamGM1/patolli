/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package server;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;

/**
 *
 * @author luisg
 */
public class Server {

    //inicialización de puerto
    private final int puerto = 4444;

    //número máximo de conexiones
    private final int noConexiones = 4;

    //Lista de sockets para guardar el socket de cada jugador
    private LinkedList<Socket> usuarios = new LinkedList<>();

    public static int id = 0;

    /**
     * Fución para que el servidor empiece a recibir conexiones de clientes
     */
    public void escuchar() {
        try {
            //Creamos el socket servidor
            ServerSocket servidor = new ServerSocket(puerto, noConexiones);

            //Ciclo infinito para estar escuchando por nuevos jugadores
            System.out.println("Esperando jugadores...");
            while (true) {
                //Cuando un jugador se conecte guardamos el socket en esta línea
                Socket cliente = servidor.accept();
                System.out.println("Nuevo jugador aceptado");

                //Se agrega el socket a la lista
                usuarios.add(cliente);

                Runnable run = new HiloServidor(cliente, usuarios, id);
                Thread hilo = new Thread(run);
                hilo.start();
                id++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Método main para correr el servidor
     *
     * @param args
     */
    public static void main(String[] args) {
        Server server = new Server();
        server.escuchar();
    }
}
