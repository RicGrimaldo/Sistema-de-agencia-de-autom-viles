/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author asha2
 */
public class ver4_empleados extends javax.swing.JFrame {

    /**
     * Creates new form ver4_empleados
     */
    public ver4_empleados() {
        initComponents();
        setLocationRelativeTo(null);//Para que al ejecutarse se presente en medio de la pantalla
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
        btEliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaLimpieza = new javax.swing.JTable();
        btModificar = new javax.swing.JButton();

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

        btEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Copia de Copia de Copia de Copia de Sin título (3).png"))); // NOI18N
        btEliminar.setText("jButton5");
        btEliminar.setFocusable(false);

        jScrollPane2.setBackground(new java.awt.Color(0, 0, 0));

        TablaLimpieza.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Clave", "Nombre", "Apellido", "Días que labora", "Sueldo base", "Préstamo", "Horas extra", "Gratificaciones"
            }
        ));
        jScrollPane2.setViewportView(TablaLimpieza);

        btModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Copia de Copia de Copia de Copia de Sin título (2).png"))); // NOI18N
        btModificar.setText("jButton5");
        btModificar.setFocusable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 817, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        ventana_ventas Ventana_ventas = new ventana_ventas();
        this.dispose();
        Ventana_ventas.setVisible(true);
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
            java.util.logging.Logger.getLogger(ver4_empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ver4_empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ver4_empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ver4_empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ver4_empleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaLimpieza;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btEmpleados;
    private javax.swing.JButton btFacServicios;
    private javax.swing.JButton btInicio;
    private javax.swing.JButton btModelos;
    private javax.swing.JButton btModificar;
    private javax.swing.JButton btVentas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
