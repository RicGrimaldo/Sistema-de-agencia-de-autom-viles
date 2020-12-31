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
public class Carro {
    private String color;
    private double caballos_Fuerza;
    private double velocidad_Max;
    private double peso;
    
    //Constructores

    public Carro(String color, double caballos_Fuerza, double velocidad_Max, double peso) {
        this.color = color;
        this.caballos_Fuerza = caballos_Fuerza;
        this.velocidad_Max = velocidad_Max;
        this.peso = peso;
    }
    
    public Carro(){
        
    }
    
    //Métodos get

    public String getColor() {
        return color;
    }

    public double getCaballos_Fuerza() {
        return caballos_Fuerza;
    }

    public double getVelocidad_Max() {
        return velocidad_Max;
    }

    public double getPeso() {
        return peso;
    }
    
    //Métodos set

    public void setColor(String color) {
        this.color = color;
    }

    public void setCaballos_Fuerza(double caballos_Fuerza) {
        this.caballos_Fuerza = caballos_Fuerza;
    }

    public void setVelocidad_Max(double velocidad_Max) {
        this.velocidad_Max = velocidad_Max;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
    
}
