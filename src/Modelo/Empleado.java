/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author jorge
 */
public abstract class Empleado implements PorPagar{
    private String nombre;
    private String apellido;
    private int dias;
    private double sueldoBase;
    private double prestamo;
    
//Constructores 
    public Empleado(String nombre, String apellido, int dias, double sueldoBase, double prestamo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dias = dias;
        this.sueldoBase = sueldoBase;
        this.prestamo = prestamo;
    }
    public Empleado(){
        
    }
 //Métodos get   

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDias() {
        return dias;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public double getPrestamo() {
        return prestamo;
    }
 //Métodos set 

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public void setPrestamo(double prestamo) {
        this.prestamo = prestamo;
    }
   

    @Override
    public String toString() {
        return getNombre() + " " + getApellido() + " " + getDias() + " " + getSueldoBase() + " " + getPrestamo();
    }
    
    
}
