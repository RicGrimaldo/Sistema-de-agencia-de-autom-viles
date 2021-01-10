/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author carlo
 */
public class Validador {
     public boolean validarCampoTexto(String texto) {
        boolean bandera = false;

        if (!texto.isEmpty()) {
            bandera = true;
        }
        return bandera;
    }

    public boolean validarNumero(String texto) {
        boolean bandera = false;
       /* try {
            
       } catch (Exception e) {
            bandera = false;
        }*/
       double x = Double.parseDouble(texto);
            if (x > 0) {
                bandera = true;
            } else {
                bandera = false;
            }
        return bandera;
    }

    public double convertirNumero(JTextField campo) {
        double salida = 0.0;

       /* try {
            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Número no valido");
        }*/
       double x = Double.parseDouble(campo.getText());
            salida = x;
        return salida;
    }
}
