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
public class Mantenimiento extends ManteYVigi{
    private int hrsExt;
    
    //Constructores

    public Mantenimiento(String clave, String nombre, String apellido, int dias, double sueldoBase, double prestamo, double gratific,int hrsExt) {
        super(clave,nombre, apellido, dias, sueldoBase, prestamo, gratific);
        this.hrsExt = hrsExt;
    }
    public Mantenimiento(){
        
    }
    
    //Métodos get

    public int getHrsExt() {
        return hrsExt;
    }
    
    //Métodos set

    public void setHrsExt(int hrsExt) {
        this.hrsExt = hrsExt;
    }
    
    public double sueldoAcumulado(double sueldoBase, double gratific, int hrsExt){
        double acumulado= sueldoBase+gratific+(hrsExt*80);
        return acumulado;
    }
    
    public double calcDescISR(){
        double desc=(sueldoAcumulado(super.getSueldoBase(),getGratific(), getHrsExt())*1.1);
        return desc;
    }
    public double calcDescIMSS(){
        double desc=(sueldoAcumulado(super.getSueldoBase(), getGratific(), getHrsExt())*1.7);
        return desc;
    }
    
    @Override
    public double cantPagar(){
        double total=(sueldoAcumulado(super.getSueldoBase(), super.getGratific(),getHrsExt())-calcDescISR()-calcDescIMSS()-super.getPrestamo());
        return total;
    }
    
    @Override
    public String toString(){
        return super.toString()+" "+ getHrsExt()+" "+cantPagar();
    }
}
