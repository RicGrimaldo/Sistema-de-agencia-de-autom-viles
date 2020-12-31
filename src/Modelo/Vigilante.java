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
public class Vigilante extends ManteYVigi{
    private double vacaciones;
    
    //Constructores

    public Vigilante(String clave,String nombre, String apellido, int dias, double sueldoBase, double prestamo, double gratific,double vacaciones) {
        super(clave,nombre, apellido, dias, sueldoBase, prestamo, gratific);
        this.vacaciones = vacaciones;
    }
    
    public Vigilante(){
        
    }
    
    //Métodos get

    public double getVacaciones() {
        return vacaciones;
    }
    
    //Métodos set

    public void setVacaciones(double vacaciones) {
        this.vacaciones = vacaciones;
    }
    
    public double sueldoAcumulado(double sueldoBase, double gratific, double vacaciones){
        double acumulado= sueldoBase+gratific+vacaciones;
        return acumulado;
    }
    
    public double calcDescISR(){
        double desc=(sueldoAcumulado(super.getSueldoBase(),getGratific(), getVacaciones())*1.34);
        return desc;
    }
    public double calcDescIMSS(){
        double desc=(sueldoAcumulado(super.getSueldoBase(), getGratific(), getVacaciones())*1.7);
        return desc;
    }
    
    @Override
    public double cantPagar(){
        double total=(sueldoAcumulado(super.getSueldoBase(), super.getGratific(),getVacaciones())-calcDescISR()-calcDescIMSS()-super.getPrestamo());
        return total;
    }
    
    @Override
    public String toString(){
        return super.toString()+" "+ getVacaciones()+" "+cantPagar();
    }
}
