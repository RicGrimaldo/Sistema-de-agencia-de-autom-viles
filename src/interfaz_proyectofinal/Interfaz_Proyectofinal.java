/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz_proyectofinal;

import Modelo.Empleado;
import java.util.ArrayList;
import vista.VistaPrincipal;

/**
 *
 * @author asha2
 */
public class Interfaz_Proyectofinal {

    /**
     * @param args the command line arguments
     */
    //ArrayList necesario para guardar los empleados
    public static ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();        
    
    public static void main(String[] args) {
        VistaPrincipal ventana = new VistaPrincipal();
        
        ventana.setVisible(true);
        
    }
    
}
