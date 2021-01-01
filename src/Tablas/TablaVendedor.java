/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablas;

import Modelo.Vendedor;
import interfaz_proyectofinal.Interfaz_Proyectofinal;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ricardo Grimaldo
 */
public class TablaVendedor {
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
        modelo.addColumn("Tarifa de comisión");
        modelo.addColumn("$ Ventas");
        modelo.addColumn("# Coches vendidos");
        modelo.addColumn("Sueldo final");
        
        for(int i= 0; i< Interfaz_Proyectofinal.listaEmpleados.size(); i++){
            Vector<Object> row = new Vector<Object>();
            if(Interfaz_Proyectofinal.listaEmpleados.get(i)instanceof Vendedor){
                row.add(((Vendedor)Interfaz_Proyectofinal.listaEmpleados.get(i)).getClave());
                row.add(((Vendedor)Interfaz_Proyectofinal.listaEmpleados.get(i)).getNombre());
                row.add(((Vendedor)Interfaz_Proyectofinal.listaEmpleados.get(i)).getApellido());
                row.add(((Vendedor)Interfaz_Proyectofinal.listaEmpleados.get(i)).getDias());
                row.add(((Vendedor)Interfaz_Proyectofinal.listaEmpleados.get(i)).getSueldoBase());
                row.add(((Vendedor)Interfaz_Proyectofinal.listaEmpleados.get(i)).getPrestamo());
                row.add(((Vendedor)Interfaz_Proyectofinal.listaEmpleados.get(i)).getTasaDescInfona());
                row.add(((Vendedor)Interfaz_Proyectofinal.listaEmpleados.get(i)).getTarifaComision());
                row.add(((Vendedor)Interfaz_Proyectofinal.listaEmpleados.get(i)).getVentasDelVendedor());
                row.add(((Vendedor)Interfaz_Proyectofinal.listaEmpleados.get(i)).getAutosVendidos());
                row.add(((Vendedor)Interfaz_Proyectofinal.listaEmpleados.get(i)).cantPagar());
                modelo.addRow(row); // Aquí se va armando la matriz de datos
            }                        
        }      
        tabla.setModel(modelo);
    }
}
