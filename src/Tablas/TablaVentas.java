/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablas;

import Modelo.Ventas;
import java.util.ArrayList;

/**
 *
 * @author carlo
 */
public class TablaVentas {
    public static ArrayList<Ventas> ListaVentas = new ArrayList<Ventas>();
    
public boolean validarClave(String clave){
    boolean bandera = true;
    for(int i=0; i < ListaVentas.size();i++){
        Ventas V = ListaVentas.get(i);
        if(V.getClave().equals(clave)){
            bandera = false;
            break;
        }
    }
    return bandera;
}
}
