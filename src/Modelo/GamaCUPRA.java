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
public class GamaCUPRA extends Carro{

    public GamaCUPRA(String color, double caballos_Fuerza, double velocidad_Max, double peso) {
        super(color, caballos_Fuerza, velocidad_Max, peso);
    }

    public GamaCUPRA() {
    }
    public String Seleccion_Colores(int eleccion_color){//Falta modificarse de la forma en que se manejará
        String colorElctd="Azul";
        return colorElctd;
    }
}
