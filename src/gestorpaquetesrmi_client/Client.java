/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestorpaquetesrmi_client;

import co.edu.autonoma.gui.VentanaRegistro;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author nikof
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("CLIENTE => Especificando el nombre de la politica de seguridad.");
        
        System.setProperty("java.security.policy", "client.policy");
        
        final String HOST = "127.0.0.1";

        System.out.println("CLIENTE => Estableciendo el manejador de seguridad.");
        
        if (System.getSecurityManager() == null)
           // System.setSecurityManager(new RMISecurityManager());
           System.setSecurityManager(new SecurityManager());

                  
        VentanaRegistro vr = new VentanaRegistro();
        vr.setVisible(true);
    }
    
}
