/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author carlo
 */
public class ColoresCarro {

    public String[][] arreglocolores = {
        {"Rojo", "Negro", "Gris"},
        {"Gris", "Rojo", "Blanco"},
        {"Blanco"},
        {"Gris", "Rojo", "Blanco"}
    };

    public String[] arregloAutos = {
        "CUPRA Ateca", "León CUPRA", "CUPRA E-Racer", "CUPRA TCR"
    };
    public ArrayList<String> modelosCarro = new ArrayList<String>();

    //
    public ColoresCarro() {
        modelosCarro.add("CUPRA Ateca");
        modelosCarro.add("Leon CUPRA");
        modelosCarro.add("CUPRA E-Race");
        modelosCarro.add("CUPRA TCR");
    }
}
