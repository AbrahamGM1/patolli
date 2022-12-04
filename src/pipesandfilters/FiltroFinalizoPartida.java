/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pipesandfilters;

import java.io.DataOutputStream;
import java.io.IOException;

/**
 *
 * @author luisg
 */
public class FiltroFinalizoPartida {
    
    public static void accion(DataOutputStream out, int id) throws IOException {
        out.writeUTF("1;" + id + ";");
    }
}
