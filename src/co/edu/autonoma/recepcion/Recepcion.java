/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.autonoma.recepcion;

import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author nikof
 */
public interface Recepcion extends Remote{
    
    Paquete registrar() throws RemoteException;
    
    boolean haySolicitud() throws RemoteException;
    
    String obtenerDepartamentos() throws RemoteException;
    
    String obtenerCiudades(String departamento) throws RemoteException;
}
