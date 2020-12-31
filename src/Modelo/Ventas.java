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
public class Ventas {
    private String nombreComprador;
    private String nombreVendedor;
    private String modeloCarro;
    private String colorAuto;
    private String precioAuto;
    
    //Constructores

    public Ventas(String nombreComprador, String nombreVendedor, String modeloCarro, String colorAuto, String precioAuto) {
        this.nombreComprador = nombreComprador;
        this.nombreVendedor = nombreVendedor;
        this.modeloCarro = modeloCarro;
        this.colorAuto = colorAuto;
        this.precioAuto = precioAuto;
    }
    
    public Ventas(){
        
    }
    
    //Métodos get

    public String getNombreComprador() {
        return nombreComprador;
    }

    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public String getModeloCarro() {
        return modeloCarro;
    }

    public String getColorAuto() {
        return colorAuto;
    }

    public String getPrecioAuto() {
        return precioAuto;
    }
    
    //Métodos set

    public void setNombreComprador(String nombreComprador) {
        this.nombreComprador = nombreComprador;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }

    public void setModeloCarro(String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }

    public void setColorAuto(String colorAuto) {
        this.colorAuto = colorAuto;
    }

    public void setPrecioAuto(String precioAuto) {
        this.precioAuto = precioAuto;
    }
    
    @Override
    public String toString(){
        return getNombreComprador()+" "+getNombreVendedor()+" "+getModeloCarro()+" "+getColorAuto()+" "+getPrecioAuto();
    }
    
}
