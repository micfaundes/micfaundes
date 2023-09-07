/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author natal
 */
public class CONDUCTOR {
    
    private int edad , rut;
    private String tipolicencia , nombre;
    private AUTO AUTO;
    

    public CONDUCTOR(int edad, int rut, String tipolicencia, String nombre) {
        this.edad = edad;
        this.rut = rut;
        this.tipolicencia = tipolicencia;
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getTipolicencia() {
        return tipolicencia;
    }

    public void setTipolicencia(String tipolicencia) {
        this.tipolicencia = tipolicencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString(){
        return "Conductor{" + "tipoLicencia=" + tipolicencia + ", nombre=" + nombre + ", edad=" + edad + ", rut=" + rut + '}';
        
    }
    
    
}
