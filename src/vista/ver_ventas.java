/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Modelo.Ventas;
import Tablas.TablaVentas;
import Utilidades.ColoresCarro;
import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author asha2
 */
public class ver_ventas extends javax.swing.JFrame {

    DefaultTableModel modelo;

    public ver_ventas() {
        initComponents();
        setLocationRelativeTo(null);//Para que al ejecutarse se presente en medio de la pantalla
        modelo = (DefaultTableModel) tblTablaVentas.getModel();
        llenarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btInicio = new javax.swing.JButton();
        btModelos = new javax.swing.JButton();
        btVentas = new javax.swing.JButton();
        btEmpleados = new javax.swing.JButton();
        btFacServicios = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTablaVentas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        btInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Diseño sin título (33).png"))); // NOI18N
        btInicio.setText("jButton3");
        btInicio.setFocusable(false);
        btInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInicioActionPerformed(evt);
            }
        });

        btModelos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Copia de Copia de Copia de Sin título (2).png"))); // NOI18N
        btModelos.setText("jButton5");
        btModelos.setFocusable(false);
        btModelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModelosActionPerformed(evt);
            }
        });

        btVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Copia de Copia de Copia de Sin título (3).png"))); // NOI18N
        btVentas.setText("jButton5");
        btVentas.setFocusable(false);
        btVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVentasActionPerformed(evt);
            }
        });

        btEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Copia de Copia de Copia de Sin título (4).png"))); // NOI18N
        btEmpleados.setText("jButton5");
        btEmpleados.setFocusable(false);
        btEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEmpleadosActionPerformed(evt);
            }
        });

        btFacServicios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Copia de Copia de Copia de Sin título (5).png"))); // NOI18N
        btFacServicios.setText("jButton5");
        btFacServicios.setFocusable(false);
        btFacServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFacServiciosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(btModelos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(btVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(btFacServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btModelos, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btFacServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));

        tblTablaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Clave", "Nombre cliente", "Nombre vendedor", "Modelo del carro", "Precio", "Color"
            }
        ));
        tblTablaVentas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblTablaVentasKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblTablaVentas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1234, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 497, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(157, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInicioActionPerformed
        VistaPrincipal ventana = new VistaPrincipal();
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_btInicioActionPerformed

    private void btModelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModelosActionPerformed
        ventana2_modelos Ventana_modelos = new ventana2_modelos();
        this.dispose();
        Ventana_modelos.setVisible(true);
    }//GEN-LAST:event_btModelosActionPerformed

    private void btVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVentasActionPerformed
        ventana_ventas Ventana1 = new ventana_ventas();
        this.dispose();
        Ventana1.setVisible(true);
    }//GEN-LAST:event_btVentasActionPerformed

    private void btEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEmpleadosActionPerformed
        ventana_empleados Ventana_empleados = new ventana_empleados();
        this.dispose();
        Ventana_empleados.setVisible(true);
    }//GEN-LAST:event_btEmpleadosActionPerformed

    private void btFacServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFacServiciosActionPerformed
        ventana_servicios Ventana_servicios = new ventana_servicios();
        this.dispose();
        Ventana_servicios.setVisible(true);
    }//GEN-LAST:event_btFacServiciosActionPerformed

    private void tblTablaVentasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblTablaVentasKeyReleased
        //System.out.println(""+evt.getKeyCode());
        int fila = tblTablaVentas.getSelectedRow();
        ColoresCarro objColoresCarro = new ColoresCarro();
        Ventas nuevo = TablaVentas.ListaVentas.get(fila);
        if (evt.getKeyCode() == 10) {
            String Carromodelo = modelo.getValueAt(fila, 3).toString();
            int posicion = objColoresCarro.modelosCarro.indexOf(Carromodelo);
            String[] colores = objColoresCarro.arreglocolores[posicion];
            ArrayList<String> coloresList = new ArrayList<>();
            Collections.addAll(coloresList, colores);
            String color = modelo.getValueAt(fila, 5).toString();
            if (objColoresCarro.modelosCarro.contains(Carromodelo)) {
                int posicionColor = JOptionPane.showOptionDialog(null, "Escoge un color", "Color", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, colores, colores[0]);
                color = colores[posicionColor];
                if (coloresList.contains(color)) {
                    nuevo.setClave(modelo.getValueAt(fila, 0).toString());
                    nuevo.setNombreComprador(modelo.getValueAt(fila, 1).toString());
                    nuevo.setNombreVendedor(modelo.getValueAt(fila, 2).toString());
                    nuevo.setPrecioAuto(modelo.getValueAt(fila, 4).toString());
                    nuevo.setModeloCarro(Carromodelo);
                    nuevo.setColorAuto(color);
                    llenarTabla();
                    JOptionPane.showMessageDialog(null, "Se ha modificado con exito ", "Exito", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null, "El color ingresado no es valido", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }

                
            } else {
                JOptionPane.showMessageDialog(null, "El modelo ingresado no es valido", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }

        }
    }//GEN-LAST:event_tblTablaVentasKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ver_ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ver_ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ver_ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ver_ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ver_ventas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEmpleados;
    private javax.swing.JButton btFacServicios;
    private javax.swing.JButton btInicio;
    private javax.swing.JButton btModelos;
    private javax.swing.JButton btVentas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTablaVentas;
    // End of variables declaration//GEN-END:variables
private void llenarTabla() {
        //TablaVentas.ListaVentas.add(Pedidos); 
        for(int i=0;i < modelo.getRowCount();i++){
            modelo.removeRow(0);
        }
        for (int i = 0; i < TablaVentas.ListaVentas.size(); i++) {
            Object[] arreglo = new Object[6];
            Ventas nuevo = TablaVentas.ListaVentas.get(i);
            arreglo[0] = nuevo.getClave();
            arreglo[1] = nuevo.getNombreComprador();
            arreglo[2] = nuevo.getNombreVendedor();
            arreglo[3] = nuevo.getModeloCarro();
            arreglo[4] = nuevo.getPrecioAuto();
            arreglo[5] = nuevo.getColorAuto();
            modelo.addRow(arreglo);
        }
    }
}
