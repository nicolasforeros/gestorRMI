/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.autonoma.recepcion;

import java.io.Serializable;
import java.util.Calendar;

/**
 *
 * @author nikof
 */
public class Paquete implements Serializable{
    
    public final static int ESTADO_PENDIENTE = 0;
    public final static int ESTADO_ENVIADO = 1;
    
    private String nombreEmisor;
    private String ciudadEmisor;
    private String nombreReceptor;
    private String ciudadReceptor;
    private String departamentoReceptor;
    private String latitudReceptor;
    private String longitudReceptor;
    private Calendar fechaRecibido;
    private Calendar fechaEnvio;
    private int estado;
    private double peso;

    public Paquete(String nombreEmisor, String ciudadEmisor, 
            String nombreReceptor, String ciudadReceptor, 
            String departamentoReceptor, Calendar fechaRecibido, double peso) {
        
        this.nombreEmisor = nombreEmisor;
        this.ciudadEmisor = ciudadEmisor;
        this.nombreReceptor = nombreReceptor;
        this.ciudadReceptor = ciudadReceptor;
        this.departamentoReceptor = departamentoReceptor;
        this.fechaRecibido = fechaRecibido;
        this.peso = peso;
        this.estado = ESTADO_PENDIENTE;
    }

    public String getNombreEmisor() {
        return nombreEmisor;
    }

    public void setNombreEmisor(String nombreEmisor) {
        this.nombreEmisor = nombreEmisor;
    }

    public String getCiudadEmisor() {
        return ciudadEmisor;
    }

    public void setCiudadEmisor(String ciudadEmisor) {
        this.ciudadEmisor = ciudadEmisor;
    }

    public String getNombreReceptor() {
        return nombreReceptor;
    }

    public void setNombreReceptor(String nombreReceptor) {
        this.nombreReceptor = nombreReceptor;
    }

    public String getCiudadReceptor() {
        return ciudadReceptor;
    }

    public void setCiudadReceptor(String ciudadReceptor) {
        this.ciudadReceptor = ciudadReceptor;
    }

    public String getDepartamentoReceptor() {
        return departamentoReceptor;
    }

    public void setDepartamentoReceptor(String departamentoReceptor) {
        this.departamentoReceptor = departamentoReceptor;
    }

    public String getLatitudReceptor() {
        return latitudReceptor;
    }

    public void setLatitudReceptor(String latitudReceptor) {
        this.latitudReceptor = latitudReceptor;
    }

    public String getLongitudReceptor() {
        return longitudReceptor;
    }

    public void setLongitudReceptor(String longitudReceptor) {
        this.longitudReceptor = longitudReceptor;
    }

    public Calendar getFechaRecibido() {
        return fechaRecibido;
    }

    public void setFechaRecibido(Calendar fechaRecibido) {
        this.fechaRecibido = fechaRecibido;
    }

    public Calendar getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(Calendar fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }    
}
