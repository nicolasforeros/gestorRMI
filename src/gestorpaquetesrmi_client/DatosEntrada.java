/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestorpaquetesrmi_client;

import co.edu.autonoma.geo.Georeferenciacion;
import co.edu.autonoma.geo.Ubicacion;
import java.rmi.RemoteException;

/**
 *
 * @author nikof
 */
public class DatosEntrada extends Thread{
    private Georeferenciacion geo;

    public void setGeoreferenciacion(Georeferenciacion geo) {
        this.geo = geo;
    }
    
    @Override
    public void run(){
        
        try {
            
            while(true){
                
                if(geo.haySolicitud()){
                    Ubicacion ubi = geo.georeferenciar();

                    System.out.println("ENTRADA => Se recibio nueva ubicacion");
                    
                    if(ubi!=null){
                        System.out.println("Latitud: " + ubi.getLatitud());
                        System.out.println("Longitud: " + ubi.getLongitud());
                    }else{
                        System.out.println("Ubicacion erronea");
                    }
                }
                
            }
            
        } catch (RemoteException ex) {
            System.out.println("ENTRADA => error en invocacion remota " + ex.getMessage());
            System.out.println("ENTRADA => Finalizando entrada");
        }
        
    }
}
