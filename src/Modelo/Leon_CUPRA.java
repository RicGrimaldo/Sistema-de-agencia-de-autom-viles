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
public class Leon_CUPRA extends GamaCUPRA{
    private int numPuertas;
    
    //Constructores

    public Leon_CUPRA(String color, double caballos_Fuerza, double velocidad_Max, double peso,int numPuertas) {
        super(color, caballos_Fuerza, velocidad_Max, peso);
        this.numPuertas = numPuertas;
    }

    public Leon_CUPRA() {
 
    }
    
    //Métodos get

    public int getNumPuertas() {
        return numPuertas;
    }
    
    //Métodos set

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
    
    @Override
    public String toString(){
        return super.getColor()+" "+super.getCaballos_Fuerza()+" "+super.getVelocidad_Max()+" "+super.getPeso()+" "+getNumPuertas();
    }
    
    
    
}
