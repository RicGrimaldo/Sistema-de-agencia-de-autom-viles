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

/**
 *
 * @author Ricardo Grimaldo
 */
public class TablaAdministrativo {
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
        
        for(int i= 0; i< Interfaz_Proyectofinal.listaEmpleados.size(); i++){
            Vector<Object> row = new Vector<Object>();
            if(Interfaz_Proyectofinal.listaEmpleados.get(i)instanceof Administrativos){
                row.add(((Administrativos)Interfaz_Proyectofinal.listaEmpleados.get(i)).getClave());
                row.add(((Administrativos)Interfaz_Proyectofinal.listaEmpleados.get(i)).getNombre());
                row.add(((Administrativos)Interfaz_Proyectofinal.listaEmpleados.get(i)).getApellido());
                row.add(((Administrativos)Interfaz_Proyectofinal.listaEmpleados.get(i)).getDias());
                row.add(((Administrativos)Interfaz_Proyectofinal.listaEmpleados.get(i)).getSueldoBase());
                row.add(((Administrativos)Interfaz_Proyectofinal.listaEmpleados.get(i)).getPrestamo());
                row.add(((Administrativos)Interfaz_Proyectofinal.listaEmpleados.get(i)).getTasaDescInfona());
                row.add(((Administrativos)Interfaz_Proyectofinal.listaEmpleados.get(i)).getVacaciones());
                row.add(((Administrativos)Interfaz_Proyectofinal.listaEmpleados.get(i)).getGratific());
                modelo.addRow(row); // Aquí se va armando la matriz de datos
            }                        
        }      
        tabla.setModel(modelo);
    }
}
