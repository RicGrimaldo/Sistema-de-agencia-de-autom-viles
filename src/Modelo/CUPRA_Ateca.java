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
public class CUPRA_Ateca extends GamaCUPRA{

    public CUPRA_Ateca(String color, double caballos_Fuerza, double velocidad_Max, double peso) {
        super(color, caballos_Fuerza, velocidad_Max, peso);
    }

    public CUPRA_Ateca() {
    }
    
    @Override
    public String toString(){
        return super.getColor()+" "+super.getCaballos_Fuerza()+" "+super.getVelocidad_Max()+" "+super.getPeso();
    }
}
