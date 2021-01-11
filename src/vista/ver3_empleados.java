/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Modelo.Mecanico;
import Tablas.TablaMecanico;
import interfaz_proyectofinal.Interfaz_Proyectofinal;
import javax.swing.JOptionPane;

/**
 *
 * @author asha2
 */
public class ver3_empleados extends javax.swing.JFrame {

    /**
     * Creates new form ver3_empleados
     */
    //Se crea un objeto "modelo" de la clase TablaMecanico
    public TablaMecanico modelo = new TablaMecanico();
    public ver3_empleados() {
        initComponents();
        setLocationRelativeTo(null);//Para que al ejecutarse se presente en medio de la pantalla
        inicializarTabla();//Método para inicializar la tabla con los empleados mecánicos registrados
    }
    
    public void inicializarTabla(){
        //Se llama al método de la clase para llenar la clase TablaMecánico para llenar la tabla
        modelo.iniciarTabla(this.TablaMecanico);
    }
    //Cadena pública necesaria para pasarla como parámetro a la ventana "nuevo3_empleado"
    //y saber qué clave será la del empleado a modificar
    public static String Clave_modificacion = "";
    
    //Método para saber si no hay empleados mecánicos registrados
    private boolean Tabla_Vacia(){
        boolean bandera = true;
        for(int i=0;i<Interfaz_Proyectofinal.listaEmpleados.size();i++){
            if(Interfaz_Proyectofinal.listaEmpleados.get(i) instanceof Mecanico){
                bandera = false;//Devuelve false en caso que haya mínimo un empleado mecánico registrado
                break;
            }
        }
        return bandera;
    }        
    
    //Método para saber si hay otro mecánico con la misma clave
    private boolean Clave_repetida(String clave){
        boolean repetido = false;
        
        for(int i = 0; i<Interfaz_Proyectofinal.listaEmpleados.size();i++){
            if(Interfaz_Proyectofinal.listaEmpleados.get(i)instanceof Mecanico){
                if(((Mecanico)Interfaz_Proyectofinal.listaEmpleados.get(i)).getClave().equals(clave)){
                   repetido = true;
                }
            }   
        }          
        //Devolverá true si ya existe un empleado con dicha clave, false en caso contrario
        return repetido;
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
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaMecanico = new javax.swing.JTable();
        btEliminar = new javax.swing.JButton();
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
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

        jScrollPane2.setBackground(new java.awt.Color(0, 0, 0));

        TablaMecanico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Clave", "Nombre", "Apellido", "Días que labora", "Sueldo base", "Préstamo", "Tasa de descuento", "Vacaciones", "Gratificaciones", "Horas extra"
            }
        ));
        jScrollPane2.setViewportView(TablaMecanico);

        btEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Copia de Copia de Copia de Copia de Sin título (3).png"))); // NOI18N
        btEliminar.setText("jButton5");
        btEliminar.setFocusable(false);
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });

        btModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Copia de Copia de Copia de Copia de Sin título (2).png"))); // NOI18N
        btModificar.setText("jButton5");
        btModificar.setFocusable(false);
        btModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1233, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                .addGap(8, 8, 8)
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
        //Bandera que determina si el empleado ha sido eliminado
        boolean bandera = false;
        //Variable que guarda la elección del usuario para asegurarse si realmente desea eliminar el empleado
        int opcion = 2; 
        //Variable para saber la posición del empleado a eliminar
        int posicion = 0;
        try{//Primero se verifica si la tabla de mecánicos está vacía
            if(Tabla_Vacia() == true){
                JOptionPane.showMessageDialog(this, "No hay ningún empleado registrado.","Aviso.",JOptionPane.WARNING_MESSAGE);
            }
            else{//Se almacena la clave del empleado a eliminar
                String Clave = JOptionPane.showInputDialog("Ingrese clave del empleado a eliminar: ");
                if(Clave_repetida(Clave) == true){//Primero, se verifica si hay un empleado con esa clave
                    //Se recorre el arraylist de empleados
                    while(posicion<Interfaz_Proyectofinal.listaEmpleados.size()){
                        //Si se encuentra una clave que coincida con la clave que se guardó, se ha encontrado al empleado
                        if(Clave.equals(Interfaz_Proyectofinal.listaEmpleados.get(posicion).getClave()) == true){
                            //Se verifica que sea de tipo mecánico
                            if(Interfaz_Proyectofinal.listaEmpleados.get(posicion) instanceof Mecanico){
                                //Se pregunta al usuario si realmente desea eliminar dicho empleado
                                opcion = JOptionPane.showConfirmDialog(this, "¿Está seguro de querer eliminar al empleado "+
                                        Interfaz_Proyectofinal.listaEmpleados.get(posicion).getNombre() +"?","Aviso",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);        
                                if(opcion == JOptionPane.YES_OPTION){
                                    //En caso de que la respuesta sea sí, el empleado se elimina del arrraylist
                                    Interfaz_Proyectofinal.listaEmpleados.remove(posicion);
                                    //El empleado ha sido eliminado
                                    bandera = true;
                                }
                                else {//Significa que no se ha querido eliminar al empleado
                                    bandera = false;
                                    break;
                                }  
                            }                                
                        }
                        //Contador para recorrer la lista
                        posicion++;
                }
                if(bandera == true){
                    JOptionPane.showMessageDialog(this, "Se ha eliminado al empleado con éxito.");
                    modelo.iniciarTabla(this.TablaMecanico);
                }
                else{//En el caso de que se haya puesto una clave inexistente
                    if(bandera == false && opcion == JOptionPane.YES_OPTION){
                    JOptionPane.showMessageDialog(this, "No se ha encontrado el empleado.");
                }
                }
                }
                else{//En el caso que no se haya encontrado el empleado
                    JOptionPane.showMessageDialog(this, "No se encontró el empleado.","Aviso.",JOptionPane.WARNING_MESSAGE);
                }
                    
            }
            
        }catch(NullPointerException e1){
            JOptionPane.showMessageDialog(this, "No hay ningún empleado registrado.","Aviso.",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btEliminarActionPerformed

    private void btModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarActionPerformed
        try{
            if(Tabla_Vacia() == true){
                //Primero, se verifica si la tabla está vacía
                JOptionPane.showMessageDialog(this, "No hay ningún empleado registrado.","Aviso.",JOptionPane.WARNING_MESSAGE);
            }
            else{//Al atributo público se le almacena la clave del emplado a modificar
                Clave_modificacion = JOptionPane.showInputDialog("Ingrese clave del empleado a modificar: ");                 
                //Primero, se verifica si existe un mecánico con dicha clave
                if(Clave_repetida(Clave_modificacion) == true){
                    //En caso de que se encuentre, se abre la ventana para crear un nuevo 
                    //empleado mecánico, pero para modificar el empleado seleccionado
                    nuevo3_empleado ventana = new nuevo3_empleado();
                    ventana.setVisible(true);
                    this.dispose();
                }
                else {//En caso contrario, no se ha registrado ningún empleado con la clave almacenada
                    JOptionPane.showMessageDialog(this, "No se encontró el empleado.","Aviso.",JOptionPane.WARNING_MESSAGE);
                    //Se vacía la cadena para la próxima vez que se desee modificar otro empleado
                    Clave_modificacion = "";                    
                }
                
            }
            
        }catch(NullPointerException e1){
            JOptionPane.showMessageDialog(this, "Se ha encontrado un error.");
        }
    }//GEN-LAST:event_btModificarActionPerformed

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
            java.util.logging.Logger.getLogger(ver3_empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ver3_empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ver3_empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ver3_empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ver3_empleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaMecanico;
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
