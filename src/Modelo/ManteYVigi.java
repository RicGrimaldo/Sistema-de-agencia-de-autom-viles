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
public class ManteYVigi extends Empleado{
    private double gratific;
    
    //Constructores

    public ManteYVigi(String clave, String nombre, String apellido, int dias, double sueldoBase, double prestamo,double gratific) {
        super(clave, nombre, apellido, dias, sueldoBase, prestamo);
        this.gratific = gratific;
    }
    public ManteYVigi(){
        
    }
    
    //Métodos get

    public double getGratific() {
        return gratific;
    }
    
    //Métodos set

    public void setGratific(double gratific) {
        this.gratific = gratific;
    }
    
    @Override
    public double cantPagar(){
        double total;
        total= (super.getSueldoBase()+getGratific())-(super.getPrestamo());
        return total;
    }
    
    @Override
    public String toString(){
        return super.toString()+" "+getGratific();
    }

    
}
