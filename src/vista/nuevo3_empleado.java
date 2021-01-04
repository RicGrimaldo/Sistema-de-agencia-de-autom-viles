/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Modelo.Empleado;
import Modelo.Mecanico;
import interfaz_proyectofinal.Interfaz_Proyectofinal;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author asha2
 */
public class nuevo3_empleado extends javax.swing.JFrame {

    /**
     * Creates new form nuevo3_empleado
     */
    public int posicion = 0;
    public boolean bandera = false;
    public ver3_empleados ventana = new ver3_empleados();
    public nuevo3_empleado() {
        initComponents();
        setLocationRelativeTo(null);//Para que al ejecutarse se presente en medio de la pantalla
        inicializarDatos();   
    }
    
    public void inicializarDatos(){  
        try{           
            while(posicion<Interfaz_Proyectofinal.listaEmpleados.size()){
                if(Interfaz_Proyectofinal.listaEmpleados.get(posicion)instanceof Mecanico){
                    if(ventana.Clave_modificacion.equals(Interfaz_Proyectofinal.listaEmpleados.get(posicion).getClave()) == true){
                    this.txtNombre.setText(((Mecanico)Interfaz_Proyectofinal.listaEmpleados.get(posicion)).getNombre());
                    this.txtApellido.setText(((Mecanico)Interfaz_Proyectofinal.listaEmpleados.get(posicion)).getApellido());
                    this.txtDias.setText(String.valueOf(((Mecanico)Interfaz_Proyectofinal.listaEmpleados.get(posicion)).getDias()));
                    this.txtClave.setText(ventana.Clave_modificacion);
                    this.txtSueldoBase.setText(String.valueOf(((Mecanico)Interfaz_Proyectofinal.listaEmpleados.get(posicion)).getSueldoBase()));
                    this.txtPrestamo.setText(String.valueOf(((Mecanico)Interfaz_Proyectofinal.listaEmpleados.get(posicion)).getPrestamo()));
                    this.txtTasaDescuento.setText(String.valueOf(((Mecanico)Interfaz_Proyectofinal.listaEmpleados.get(posicion)).getTasaDescInfona()));                
                    this.txtVacaciones.setText(String.valueOf(((Mecanico)Interfaz_Proyectofinal.listaEmpleados.get(posicion)).getVacaciones()));
                    this.txtGratificaciones.setText(String.valueOf(((Mecanico)Interfaz_Proyectofinal.listaEmpleados.get(posicion)).getGratific()));
                    this.txtHrsExtra.setText(String.valueOf(((Mecanico)Interfaz_Proyectofinal.listaEmpleados.get(posicion)).getHrsExt()));                
                    bandera = true;                                
                    Interfaz_Proyectofinal.listaEmpleados.remove(posicion);                
                    break;
                }            
            }
            posicion++;
        }
        ventana.Clave_modificacion = "";
    }catch(ClassCastException e1){
        JOptionPane.showMessageDialog(this, "Ha ocurrido un error.");
    }
    }
    
    private boolean Clave_repetida(String clave){
        boolean repetido = false;
        
        for(int i = 0; i<Interfaz_Proyectofinal.listaEmpleados.size();i++){
            if(Interfaz_Proyectofinal.listaEmpleados.get(i)instanceof Mecanico){
                if(((Mecanico)Interfaz_Proyectofinal.listaEmpleados.get(i)).getClave().equals(clave)){
                   repetido = true;
                }
            }   
        }        
        return repetido;
    }
    
    private void LimpiarCampos(){
        this.txtClave.setText("");
        this.txtNombre.setText("");
        this.txtApellido.setText("");
        this.txtDias.setText("");
        this.txtSueldoBase.setText("");
        this.txtPrestamo.setText("");
        this.txtTasaDescuento.setText("");
        this.txtVacaciones.setText("");
        this.txtGratificaciones.setText("");
        this.txtHrsExtra.setText("");               
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDias = new javax.swing.JTextField();
        txtSueldoBase = new javax.swing.JTextField();
        txtPrestamo = new javax.swing.JTextField();
        txtVacaciones = new javax.swing.JTextField();
        txtGratificaciones = new javax.swing.JTextField();
        btGuardar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtHrsExtra = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtClave = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtTasaDescuento = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Seleccione el tipo de empleado (1).png"))); // NOI18N
        jLabel1.setToolTipText("");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nombre.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nombre (1).png"))); // NOI18N
        jLabel3.setText("jLabel2");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nombre (3).png"))); // NOI18N
        jLabel4.setText("jLabel2");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nombre (4).png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nombre (5).png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nombre (6).png"))); // NOI18N
        jLabel7.setText("jLabel7");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nombre (7).png"))); // NOI18N
        jLabel8.setText("jLabel8");

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreKeyPressed(evt);
            }
        });

        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtApellidoKeyPressed(evt);
            }
        });

        txtDias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDiasKeyPressed(evt);
            }
        });

        txtSueldoBase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSueldoBaseKeyPressed(evt);
            }
        });

        txtPrestamo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPrestamoKeyPressed(evt);
            }
        });

        txtVacaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtVacacionesKeyPressed(evt);
            }
        });

        txtGratificaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtGratificacionesKeyPressed(evt);
            }
        });

        btGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Copia de nombre (2).png"))); // NOI18N
        btGuardar.setText("jButton1");
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nombre (11).png"))); // NOI18N
        jLabel9.setText("jLabel9");

        txtHrsExtra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHrsExtraKeyPressed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nombre (18).png"))); // NOI18N

        txtClave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtClaveKeyPressed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nombre (22).png"))); // NOI18N

        txtTasaDescuento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTasaDescuentoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrestamo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTasaDescuento))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre)
                            .addComponent(txtSueldoBase)
                            .addComponent(txtApellido)
                            .addComponent(txtDias))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtGratificaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(txtVacaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(txtHrsExtra)
                            .addComponent(txtClave))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(133, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVacaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGratificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(txtHrsExtra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSueldoBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTasaDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        try{
            String clave = this.txtClave.getText();
            String nombre = this.txtNombre.getText();
            String apellido = this.txtApellido.getText();
            int dias = Integer.parseInt(this.txtDias.getText());
            double sueldoBase = Double.parseDouble(this.txtSueldoBase.getText());
            double prestamo = Double.parseDouble(this.txtPrestamo.getText());
            double tasaDescInfona = Double.parseDouble(this.txtTasaDescuento.getText());
            double vacaciones = Double.parseDouble(this.txtVacaciones.getText());
            double gratific = Double.parseDouble(this.txtGratificaciones.getText());
            int hrsExtra = Integer.parseInt(this.txtHrsExtra.getText());

            if(Clave_repetida(clave) == false){
                JOptionPane.showMessageDialog(this, "Mecánico "+nombre+" guardado con éxito.","Nuevo mecánico registrado.",JOptionPane.INFORMATION_MESSAGE);
                this.LimpiarCampos();

                Empleado empleado = new Mecanico(clave,nombre,apellido,dias,sueldoBase,prestamo,tasaDescInfona,vacaciones,gratific,hrsExtra);
                Interfaz_Proyectofinal.listaEmpleados.add(empleado);      
                int opcion = JOptionPane.showConfirmDialog(this, "¿Desea registrar otro empleado?","Mensaje",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);        
                if(opcion == JOptionPane.NO_OPTION){//En el caso de que se haya seleccionado "Sí", la calculadora se cerrará.
                    ventana_empleados Ventana_empleados = new ventana_empleados();
                    this.dispose();
                    Ventana_empleados.setVisible(true);
                }//Cierra la ventana
            }
            else{
                JOptionPane.showMessageDialog(this, "Ya existe un empleado con la clave " + clave,"Error al intentar registrar empleado.",JOptionPane.WARNING_MESSAGE);                
            }            
        }
        catch(NumberFormatException e1){
            JOptionPane.showMessageDialog(this, "Es necesario llenar los campos correctamente.","Advertencia de error.",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btGuardarActionPerformed

    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyPressed
        switch(evt.getExtendedKeyCode()){
            case KeyEvent.VK_DOWN: 
                this.txtApellido.requestFocus(); break;
            case KeyEvent.VK_RIGHT: 
                this.txtVacaciones.requestFocus(); break;
        }
    }//GEN-LAST:event_txtNombreKeyPressed

    private void txtApellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyPressed
        switch(evt.getExtendedKeyCode()){
            case KeyEvent.VK_DOWN: 
                this.txtDias.requestFocus(); break;
            case KeyEvent.VK_RIGHT: 
                this.txtGratificaciones.requestFocus(); break;
            case KeyEvent.VK_UP:
                this.txtNombre.requestFocus();break;
        }
    }//GEN-LAST:event_txtApellidoKeyPressed

    private void txtDiasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiasKeyPressed
        switch(evt.getExtendedKeyCode()){
            case KeyEvent.VK_DOWN: 
                this.txtSueldoBase.requestFocus(); break;
            case KeyEvent.VK_RIGHT: 
                this.txtHrsExtra.requestFocus(); break;
            case KeyEvent.VK_UP:
                this.txtApellido.requestFocus();break;
        }
    }//GEN-LAST:event_txtDiasKeyPressed

    private void txtSueldoBaseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSueldoBaseKeyPressed
        switch(evt.getExtendedKeyCode()){
            case KeyEvent.VK_DOWN: 
                this.txtPrestamo.requestFocus(); break;
            case KeyEvent.VK_RIGHT: 
                this.txtClave.requestFocus(); break;
            case KeyEvent.VK_UP:
                this.txtDias.requestFocus();break;
        }
    }//GEN-LAST:event_txtSueldoBaseKeyPressed

    private void txtPrestamoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrestamoKeyPressed
        switch(evt.getExtendedKeyCode()){
            case KeyEvent.VK_DOWN: 
                this.txtTasaDescuento.requestFocus(); break;
            case KeyEvent.VK_RIGHT: 
                this.txtClave.requestFocus(); break;
            case KeyEvent.VK_UP:
                this.txtSueldoBase.requestFocus();break;
        }
    }//GEN-LAST:event_txtPrestamoKeyPressed

    private void txtTasaDescuentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTasaDescuentoKeyPressed
        switch(evt.getExtendedKeyCode()){
            case KeyEvent.VK_RIGHT: 
                this.txtClave.requestFocus(); break;
            case KeyEvent.VK_UP:
                this.txtPrestamo.requestFocus();break;
        }
    }//GEN-LAST:event_txtTasaDescuentoKeyPressed

    private void txtVacacionesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVacacionesKeyPressed
        switch(evt.getExtendedKeyCode()){
            case KeyEvent.VK_DOWN: 
                this.txtGratificaciones.requestFocus(); break;
            case KeyEvent.VK_LEFT: 
                this.txtNombre.requestFocus(); break;
        }
    }//GEN-LAST:event_txtVacacionesKeyPressed

    private void txtGratificacionesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGratificacionesKeyPressed
        switch(evt.getExtendedKeyCode()){
            case KeyEvent.VK_DOWN: 
                this.txtHrsExtra.requestFocus(); break;
            case KeyEvent.VK_LEFT: 
                this.txtApellido.requestFocus(); break;
            case KeyEvent.VK_UP:
                this.txtVacaciones.requestFocus();break;
        }
    }//GEN-LAST:event_txtGratificacionesKeyPressed

    private void txtHrsExtraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHrsExtraKeyPressed
        switch(evt.getExtendedKeyCode()){
            case KeyEvent.VK_DOWN: 
                this.txtClave.requestFocus(); break;
            case KeyEvent.VK_LEFT: 
                this.txtDias.requestFocus(); break;
            case KeyEvent.VK_UP:
                this.txtGratificaciones.requestFocus();break;
        }
    }//GEN-LAST:event_txtHrsExtraKeyPressed

    private void txtClaveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClaveKeyPressed
        switch(evt.getExtendedKeyCode()){
            case KeyEvent.VK_LEFT: 
                this.txtSueldoBase.requestFocus(); break;
            case KeyEvent.VK_UP:
                this.txtHrsExtra.requestFocus();break;
        }
    }//GEN-LAST:event_txtClaveKeyPressed

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
            java.util.logging.Logger.getLogger(nuevo3_empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nuevo3_empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nuevo3_empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nuevo3_empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new nuevo3_empleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtDias;
    private javax.swing.JTextField txtGratificaciones;
    private javax.swing.JTextField txtHrsExtra;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrestamo;
    private javax.swing.JTextField txtSueldoBase;
    private javax.swing.JTextField txtTasaDescuento;
    private javax.swing.JTextField txtVacaciones;
    // End of variables declaration//GEN-END:variables
}
