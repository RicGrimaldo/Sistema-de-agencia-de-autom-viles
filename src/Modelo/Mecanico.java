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
public class Mecanico extends EmpleadoConInfonavit{
    private double vacaciones;
    private double gratific;
    private int hrsExt;
    
    //Constructores

    public Mecanico(String clave, String nombre, String apellido, int dias, double sueldoBase, double prestamo, double tasaDescInfona,double vacaciones, double gratific, int hrsExt) {
        super(clave,nombre, apellido, dias, sueldoBase, prestamo, tasaDescInfona);
        this.vacaciones = vacaciones;
        this.gratific = gratific;
        this.hrsExt = hrsExt;
    }
    
    public Mecanico(){
        
    }
    
    //Métodos get

    public double getVacaciones() {
        return vacaciones;
    }

    public double getGratific() {
        return gratific;
    }

    public int getHrsExt() {
        return hrsExt;
    }
    
    //Métodos set

    public void setVacaciones(double vacaciones) {
        this.vacaciones = vacaciones;
    }

    public void setGratific(double gratific) {
        this.gratific = gratific;
    }

    public void setHrsExt(int hrsExt) {
        this.hrsExt = hrsExt;
    }
    
    public double sueldoAcumulado(double sueldoBase, double vacaciones, double gratific, int hrsExt){
        double acumulado= sueldoBase+vacaciones+gratific+(hrsExt*150);
        return acumulado;
    }
    
    public double calcDescISR(){
        double desc=(sueldoAcumulado(super.getSueldoBase(), getVacaciones(), getGratific(),getHrsExt())*1.27);
        return desc;
    }
    public double calcDescIMSS(){
        double desc=(sueldoAcumulado(super.getSueldoBase(), getVacaciones(), getGratific(),getHrsExt())*1.45);
        return desc;
    }
    public double calcDescInfona(){
        double desc=(sueldoAcumulado(super.getSueldoBase(), getVacaciones(), getGratific(),getHrsExt())*super.getTasaDescInfona());
        return desc; 
    }
    public double calcDescCona(){
        double desc=(sueldoAcumulado(super.getSueldoBase(), getVacaciones(), getGratific(),getHrsExt())*1.20);
        return desc;
    }
    @Override 
    public double cantPagar(){
        double total=(sueldoAcumulado(super.getSueldoBase(), getVacaciones(), getGratific(),getHrsExt())-calcDescISR()-calcDescIMSS()-calcDescInfona()-calcDescCona()-super.getPrestamo());
        return total;
    }
    @Override
    public String toString(){
        return super.toString()+" "+getVacaciones()+" "+ getGratific()+" "+getHrsExt()+" "+cantPagar();
    }
}
