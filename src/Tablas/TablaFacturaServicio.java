/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablas;

import Modelo.FacturaServicio;
import Modelo.Ventas;
import static Tablas.TablaVentas.ListaVentas;
import java.util.ArrayList;

/**
 *
 * @author carlo
 */
public class TablaFacturaServicio {

    public static ArrayList<FacturaServicio> ListaFacturas = new ArrayList<FacturaServicio>();

    public boolean validarClave(String clave) {
        boolean bandera = true;
        for (int i = 0; i < ListaFacturas.size(); i++) {
            FacturaServicio F = ListaFacturas.get(i);
            if (F.getClave().equals(clave)) {
                bandera = false;
                break;
            }
        }
        return bandera;
    }
}
