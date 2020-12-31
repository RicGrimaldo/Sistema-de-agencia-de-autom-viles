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
public class CUPRA_TCR extends AutosRacing{
    private String traccion;
    
    //Constructores

    public CUPRA_TCR(String traccion, String color, double caballos_Fuerza, double velocidad_Max, double peso) {
        super(color, caballos_Fuerza, velocidad_Max, peso);
        this.traccion = traccion;
    }
    
    public CUPRA_TCR(){
        
    }
    
    //Métodos get

    public String getTraccion() {
        return traccion;
    }
    
    //Métodos set

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }
    
    @Override 
    public String toString(){
        return super.getColor()+" "+super.getCaballos_Fuerza()+" "+super.getVelocidad_Max()+" "+super.getPeso()+" "+getTraccion();

    }
    
    
}
