/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.autonoma.geo;

import java.io.Serializable;

/**
 *
 * @author nikof
 */
public class Ubicacion implements Serializable{
    
    private String latitud;
    private String longitud;

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }
    
    public String getLatitud() {
        return latitud;
    }

    public String getLongitud() {
        return longitud;
    }    
}
