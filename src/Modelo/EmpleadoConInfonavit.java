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
public class EmpleadoConInfonavit extends Empleado{
    private double tasaDescInfona;
    //Constructores

    public EmpleadoConInfonavit(String nombre, String apellido, int dias, double sueldoBase, double prestamo,double tasaDescInfona) {
        super(nombre, apellido, dias, sueldoBase, prestamo);
        this.tasaDescInfona = tasaDescInfona;
    }

    public EmpleadoConInfonavit(){
    }
    
    //Metodos get

    public double getTasaDescInfona() {
        return tasaDescInfona;
    }
    
    //Métodos set

    public void setTasaDescInfona(double tasaDescInfona) {
        this.tasaDescInfona = tasaDescInfona;
    }
    
    @Override 
    public double cantPagar(){
        double total;
        total = super.getSueldoBase()-(super.getPrestamo() + (getTasaDescInfona()*super.getSueldoBase()));
        return total;
    }
    
    @Override
    public String toString(){
        return super.toString()+" "+getTasaDescInfona();
    }
    
    
    
    
    
    
}
