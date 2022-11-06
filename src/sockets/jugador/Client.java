/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sockets.jugador;

import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author luisg
 */
public class Client {
    
    public static void main(String[] args){
        Socket cliente = null;
        
        try{
            cliente = new Socket("127.0.0.1", 2027);
            
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
