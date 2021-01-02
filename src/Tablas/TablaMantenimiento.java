/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablas;

import Modelo.Mantenimiento;
import Modelo.Mecanico;
import interfaz_proyectofinal.Interfaz_Proyectofinal;
import java.text.DecimalFormat;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ricardo Grimaldo
 */
public class TablaMantenimiento {
    public void iniciarTabla(JTable tabla){
        Vector< Vector<Object> > data = new Vector< Vector<Object> >();
        DefaultTableModel modelo = new DefaultTableModel(); 
        DecimalFormat df = new DecimalFormat("#.0000");
        
        modelo.addColumn("Clave");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Dias que labora");
        modelo.addColumn("Sueldo Base");
        modelo.addColumn("Préstamo");
        modelo.addColumn("Gratificaciones");
        modelo.addColumn("Horas extra");
        modelo.addColumn("Sueldo final");
        
        
        for(int i= 0; i< Interfaz_Proyectofinal.listaEmpleados.size(); i++){
            Vector<Object> row = new Vector<Object>();
            if(Interfaz_Proyectofinal.listaEmpleados.get(i)instanceof Mantenimiento){
                row.add(((Mantenimiento)Interfaz_Proyectofinal.listaEmpleados.get(i)).getClave());
                row.add(((Mantenimiento)Interfaz_Proyectofinal.listaEmpleados.get(i)).getNombre());
                row.add(((Mantenimiento)Interfaz_Proyectofinal.listaEmpleados.get(i)).getApellido());
                row.add(((Mantenimiento)Interfaz_Proyectofinal.listaEmpleados.get(i)).getDias());
                row.add(((Mantenimiento)Interfaz_Proyectofinal.listaEmpleados.get(i)).getSueldoBase());
                row.add(((Mantenimiento)Interfaz_Proyectofinal.listaEmpleados.get(i)).getPrestamo());
                row.add(((Mantenimiento)Interfaz_Proyectofinal.listaEmpleados.get(i)).getGratific());
                row.add(((Mantenimiento)Interfaz_Proyectofinal.listaEmpleados.get(i)).getHrsExt());
                row.add(df.format(((Mantenimiento)Interfaz_Proyectofinal.listaEmpleados.get(i)).cantPagar()));
                modelo.addRow(row); // Aquí se va armando la matriz de datos
            }                        
        }      
        tabla.setModel(modelo);
    }
    
}
