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
public class Administrativos extends EmpleadoConInfonavit{
    private double vacaciones;
    private double gratific;
    
    //Costructores

    public Administrativos(String clave,String nombre, String apellido, int dias, double sueldoBase, double prestamo, double tasaDescInfona, double vacaciones, double gratific) {
        super(clave,nombre, apellido, dias, sueldoBase, prestamo, tasaDescInfona);
        this.vacaciones = vacaciones;
        this.gratific = gratific;
    }
    public Administrativos(){
        
    }
    
    //Métodos get

    public double getVacaciones() {
        return vacaciones;
    }

    public double getGratific() {
        return gratific;
    }
    //Métodos set

    public void setVacaciones(double vacaciones) {
        this.vacaciones = vacaciones;
    }

    public void setGratific(double gratific) {
        this.gratific = gratific;
    }
    public double sueldoAcumulado(double sueldoBase, double vacaciones, double gratific){
        double acumulado= sueldoBase+vacaciones+gratific;
        return acumulado;
    }
    
    public double calcDescISR(){
        double desc=(sueldoAcumulado(super.getSueldoBase(), getVacaciones(), getGratific())*5.25);
        return desc;
    }
    public double calcDescIMSS(){
        double desc=(sueldoAcumulado(super.getSueldoBase(), getVacaciones(), getGratific())*1.22);
        return desc;
    }
    public double calcDescInfona(){
        double desc=(sueldoAcumulado(super.getSueldoBase(), getVacaciones(), getGratific())*super.getTasaDescInfona());
        return desc;
    }
    
    @Override 
    public double cantPagar(){
        double total=(sueldoAcumulado(super.getSueldoBase(), getVacaciones(), getGratific())-calcDescISR()-calcDescIMSS()-calcDescInfona()-super.getPrestamo());
        return total;
    }
    @Override
    public String toString(){
        return super.toString()+" "+getVacaciones()+" "+ getGratific()+" "+cantPagar();
    }
}
