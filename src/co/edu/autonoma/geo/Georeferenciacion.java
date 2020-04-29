/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.autonoma.geo;

import java.rmi.*;

/**
 * 
 *
 * @author Nicolas Forero
 * @author Leandra Builes
 */
public interface Georeferenciacion extends Remote{
    
    Ubicacion georeferenciar() throws RemoteException;
    
    boolean haySolicitud() throws RemoteException;
    
    String obtenerDepartamentos() throws RemoteException;
    
    String obtenerCiudades(String departamento) throws RemoteException;
}
