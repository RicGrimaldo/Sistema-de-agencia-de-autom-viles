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
public class Vendedor extends EmpleadoConInfonavit{
    private double tarifaComision;
    private double ventasDelVendedor;
    private int autosVendidos;
    
    //Constructores 

    public Vendedor(String nombre, String apellido, int dias, double sueldoBase, double prestamo, double tasaDescInfona, double tarifaComision, double ventasDelVendedor, int autosVendidos) {
        super(nombre, apellido, dias, sueldoBase, prestamo, tasaDescInfona);
        this.tarifaComision = tarifaComision;
        this.ventasDelVendedor = ventasDelVendedor;
        this.autosVendidos = autosVendidos;
    }
    public Vendedor(){
        
    }
    
    //Métodos get

    public double getTarifaComision() {
        return tarifaComision;
    }

    public double getVentasDelVendedor() {
        return ventasDelVendedor;
    }

    public int getAutosVendidos() {
        return autosVendidos;
    }
    
    //Métodos set

    public void setTarifaComision(double tarifaComision) {
        this.tarifaComision = tarifaComision;
    }

    public void setVentasDelVendedor(double ventasDelVendedor) {
        this.ventasDelVendedor = ventasDelVendedor;
    }

    public void setAutosVendidos(int autosVendidos) {
        this.autosVendidos = autosVendidos;
    }
    
     public double sueldoAcumulado(double sueldoBase, double tarifaComision, double ventasDelVendedor){
        double acumulado= sueldoBase+(tarifaComision*ventasDelVendedor);
        return acumulado;
    }
    
    public double calcDescISR(){
        double desc=(sueldoAcumulado(super.getSueldoBase(), getTarifaComision(), getVentasDelVendedor())*4.27);
        return desc;
    }
    public double calcDescIMSS(){
        double desc=(sueldoAcumulado(super.getSueldoBase(), getTarifaComision(), getVentasDelVendedor())*1.7);
        return desc;
    }
    public double calcDescInfona(){
        double desc=(sueldoAcumulado(super.getSueldoBase(), getTarifaComision(), getVentasDelVendedor())*super.getTasaDescInfona());
        return desc;
    }
    @Override 
    public double cantPagar(){
        double total=(sueldoAcumulado(super.getSueldoBase(), getTarifaComision(), getVentasDelVendedor())-calcDescISR()-calcDescIMSS()-calcDescInfona()-super.getPrestamo());
        return total;
    }
    @Override
    public String toString(){
        return super.toString()+" "+getTarifaComision()+" "+getVentasDelVendedor()+" "+cantPagar();
    }
    
}
