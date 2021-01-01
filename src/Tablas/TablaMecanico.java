/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablas;

import Modelo.Mecanico;
import Modelo.Vendedor;
import interfaz_proyectofinal.Interfaz_Proyectofinal;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ricardo Grimaldo
 */
public class TablaMecanico {
     public void iniciarTabla(JTable tabla){
        Vector< Vector<Object> > data = new Vector< Vector<Object> >();
        DefaultTableModel modelo = new DefaultTableModel();  
        
        modelo.addColumn("Clave");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Dias que labora");
        modelo.addColumn("Sueldo Base");
        modelo.addColumn("Préstamo");
        modelo.addColumn("Tasa de descuento");
        modelo.addColumn("Vacaciones");
        modelo.addColumn("Gratificaciones");
        modelo.addColumn("Horas extra");
        
        for(int i= 0; i< Interfaz_Proyectofinal.listaEmpleados.size(); i++){
            Vector<Object> row = new Vector<Object>();
            if(Interfaz_Proyectofinal.listaEmpleados.get(i)instanceof Mecanico){
                row.add(((Mecanico)Interfaz_Proyectofinal.listaEmpleados.get(i)).getClave());
                row.add(((Mecanico)Interfaz_Proyectofinal.listaEmpleados.get(i)).getNombre());
                row.add(((Mecanico)Interfaz_Proyectofinal.listaEmpleados.get(i)).getApellido());
                row.add(((Mecanico)Interfaz_Proyectofinal.listaEmpleados.get(i)).getDias());
                row.add(((Mecanico)Interfaz_Proyectofinal.listaEmpleados.get(i)).getSueldoBase());
                row.add(((Mecanico)Interfaz_Proyectofinal.listaEmpleados.get(i)).getPrestamo());
                row.add(((Mecanico)Interfaz_Proyectofinal.listaEmpleados.get(i)).getTasaDescInfona());
                row.add(((Mecanico)Interfaz_Proyectofinal.listaEmpleados.get(i)).getVacaciones());
                row.add(((Mecanico)Interfaz_Proyectofinal.listaEmpleados.get(i)).getGratific());
                row.add(((Mecanico)Interfaz_Proyectofinal.listaEmpleados.get(i)).getHrsExt());
                modelo.addRow(row); // Aquí se va armando la matriz de datos
            }                        
        }      
        tabla.setModel(modelo);
    }
}