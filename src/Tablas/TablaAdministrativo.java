/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablas;

import Modelo.Administrativos;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import interfaz_proyectofinal.*;
import java.text.DecimalFormat;

/**
 *
 * @author Ricardo Grimaldo
 */
public class TablaAdministrativo {
    //El método recibe una tabla del tipo JTable
    public void iniciarTabla(JTable tabla){
        //Creamos un objeto "modelo" del tipo DefaultTableModel
        DefaultTableModel modelo = new DefaultTableModel();  
        //Necesario para imprimir los números con un límite de decimales
        DecimalFormat df = new DecimalFormat("#.0000");
        
        //Se agregan primero las columnas
        modelo.addColumn("Clave");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Dias que labora");
        modelo.addColumn("Sueldo Base");
        modelo.addColumn("Préstamo");
        modelo.addColumn("Tasa de descuento");
        modelo.addColumn("Vacaciones");
        modelo.addColumn("Gratificaciones");
        modelo.addColumn("Sueldo final");
        
        //Se recorre el ArrayList de empleados
        for(int i= 0; i< Interfaz_Proyectofinal.listaEmpleados.size(); i++){
            //Se crea el vector, es decir, la fila a agregar
            Vector<Object> row = new Vector<Object>();
            if(Interfaz_Proyectofinal.listaEmpleados.get(i)instanceof Administrativos){
                //Únicamente se agregarán los administrativos guardados
                row.add(((Administrativos)Interfaz_Proyectofinal.listaEmpleados.get(i)).getClave());
                row.add(((Administrativos)Interfaz_Proyectofinal.listaEmpleados.get(i)).getNombre());
                row.add(((Administrativos)Interfaz_Proyectofinal.listaEmpleados.get(i)).getApellido());
                row.add(((Administrativos)Interfaz_Proyectofinal.listaEmpleados.get(i)).getDias());
                row.add(((Administrativos)Interfaz_Proyectofinal.listaEmpleados.get(i)).getSueldoBase());
                row.add(((Administrativos)Interfaz_Proyectofinal.listaEmpleados.get(i)).getPrestamo());
                row.add(((Administrativos)Interfaz_Proyectofinal.listaEmpleados.get(i)).getTasaDescInfona());
                row.add(((Administrativos)Interfaz_Proyectofinal.listaEmpleados.get(i)).getVacaciones());
                row.add(((Administrativos)Interfaz_Proyectofinal.listaEmpleados.get(i)).getGratific());
                row.add(df.format(((Administrativos)Interfaz_Proyectofinal.listaEmpleados.get(i)).cantPagar()));
                modelo.addRow(row); // Aquí se va armando la tabla de datos,agregándose el nuevo renglón creado
            }                        
        }      
        tabla.setModel(modelo);//La función retorna el modelo creado a la tabla recibida
    }
}
