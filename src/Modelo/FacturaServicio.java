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
public class FacturaServicio implements PorPagar{
    private String nombreServicio;
    private double montoPago;
    private double porcentajeExtra;
    
    //Constructores

    public FacturaServicio(String nombreServicio, double montoPago, double porcentajeExtra) {
        this.nombreServicio = nombreServicio;
        this.montoPago = montoPago;
        this.porcentajeExtra = porcentajeExtra;
    }
    public FacturaServicio(){
        
    }
    
    //Métodos get

    public String getNombreServicio() {
        return nombreServicio;
    }

    public double getMontoPago() {
        return montoPago;
    }

    public double getPorcentajeExtra() {
        return porcentajeExtra;
    }
    
    //Métodos set

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    public void setMontoPago(double montoPago) {
        this.montoPago = montoPago;
    }

    public void setPorcentajeExtra(double porcentajeExtra) {
        this.porcentajeExtra = porcentajeExtra;
    }
    
    @Override
    public double cantPagar(){
        double total= getMontoPago()+(getMontoPago()*getPorcentajeExtra());
        return total;
    }
        
    @Override
    public String toString(){
        return getNombreServicio()+" "+getMontoPago()+" "+getPorcentajeExtra();
    }
}
