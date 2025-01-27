/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

import Modelo.Beneficiario;

import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.border. EmptyBorder;
import javax.swing.table. DefaultTableModel;
import javax.swing.table. JTableHeader;
import java.awt.event.KeyEvent;

import Modelo.DAOBeneficiario;
/**
 *
 * @author Jeremy
 */
public class Beneficiarios extends javax.swing.JInternalFrame {

    /**
     * Creates new form Beneficiarios
     */
    public Beneficiarios() throws SQLException {
        initComponents();
        jTextdIDBeneficiarios.setEnabled(false);
        obtenerDatos();
    }
    public void obtenerDatos() throws SQLException{
        List<Beneficiario> Beneficiario = new DAOBeneficiario().ObtenerDatos();
        DefaultTableModel modelo = new DefaultTableModel();
        String[] columnas = {"IDBeneficiario","Nombre","Apellido","Cedula", 
        "Telefono","IDContrato"};
        modelo.setColumnIdentifiers(columnas);
        for (Beneficiario ben : Beneficiario){
            String[] renglon = {Integer.toString(ben.getIDBeneficiarios()), ben.getNombre(),
                    ben.getApellido(),ben.getCedula(),ben.getApellido(),
                    Integer.toString(ben.getIDContratos())};

            modelo.addRow(renglon);
        }
        
        jTableBeneficiarios.setModel(modelo);
    }
    public void actualizar() throws SQLException{
        int ID = Integer.parseInt(this.jTextdIDBeneficiarios.getText());
        String nom = this.jTextNombre.getText();
        String apell = this.jTextApellido.getText();
        String ced = this.jTextCedula.getText();
        String tel = this.jTextTeleno.getText();
        int con = Integer.parseInt( this.jTextIDContrato.getText());
        
        
        Beneficiario auto = new Beneficiario (ID, nom, apell, ced, tel, con);
        
        DAOBeneficiario dao = new DAOBeneficiario();
        int res = dao.Actualizar(auto);
        if (res == 0){
            JOptionPane.showMessageDialog(rootPane, 
                    "¡El Aotor esta actualizado mi jefe!");
        }else{
            JOptionPane.showConfirmDialog(rootPane, 
                    "¡Mira eso que ocurrio un error!");
        }
    }
    public void limpiarCampos(){
        jTextdIDBeneficiarios.setText("");
        jTextNombre.setText("");
        jTextApellido.setText("");
        jTextCedula.setText("");
        jTextTeleno.setText("");
        jTextIDContrato.setText("");
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
        jLabel7 = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextdIDBeneficiarios = new javax.swing.JTextField();
        jTextIDContrato = new javax.swing.JTextField();
        jTextApellido = new javax.swing.JTextField();
        jButtonAgregar = new javax.swing.JButton();
        jTextCedula = new javax.swing.JFormattedTextField();
        Telefono = new javax.swing.JLabel();
        jTextTeleno = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableBeneficiarios = new javax.swing.JTable();
        jButtonActualizar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jTextFieldBuscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Beneficiarios ");

        jLabel7.setText("Nombre");

        jTextNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreActionPerformed(evt);
            }
        });
        jTextNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextNombreKeyTyped(evt);
            }
        });

        jLabel8.setText("IDBeneficiarios");

        jLabel9.setText("Cedula");

        jLabel10.setText("IDContrato");

        jLabel11.setText("Apellido");

        jTextApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextApellidoKeyTyped(evt);
            }
        });

        jButtonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagen/agregar-usuario.png"))); // NOI18N
        jButtonAgregar.setText("Agregar");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });

        try {
            jTextCedula.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-######-####U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextCedulaKeyTyped(evt);
            }
        });

        Telefono.setText("Telefono");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextdIDBeneficiarios))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel11)
                                .addComponent(jLabel9)
                                .addComponent(Telefono))
                            .addGap(40, 40, 40)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButtonAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextCedula, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                .addComponent(jTextApellido)
                                .addComponent(jTextNombre)
                                .addComponent(jTextTeleno)
                                .addComponent(jTextIDContrato)))))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextdIDBeneficiarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTextIDContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jTextApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jTextCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Telefono)
                    .addComponent(jTextTeleno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jButtonAgregar)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        jTableBeneficiarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "IDBeneficiarios", "IDContrato", "IDModelo", "Nombre", "Apellido", "Cedula"
            }
        ));
        jScrollPane1.setViewportView(jTableBeneficiarios);

        jButtonActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagen/usuario.png"))); // NOI18N
        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });

        jButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagen/editar.png"))); // NOI18N
        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagen/personas.png"))); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        jButtonBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jButtonBuscarKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Registro de Beneficiarios ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jButtonActualizar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEditar)
                        .addGap(83, 83, 83)
                        .addComponent(jButtonBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonActualizar)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonBuscar)
                    .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        try{
            
             String nom = jTextNombre.getText();
             String apell = jTextApellido.getText();
             String ced = jTextCedula.getText();
             String tel = jTextTeleno.getText();
             String con = jTextIDContrato.getText();
            
            if(
                    nom.contentEquals("")
                    || apell.contentEquals("")
                    || ced.contentEquals("")
                    || tel.contentEquals("")
                    || con.contentEquals("")){
                JOptionPane.showConfirmDialog(rootPane, 
                        "perro te falta");
            }else{
                try{
                    
                    Beneficiario Ben = new Beneficiario (nom, 
                            apell, ced, tel, Integer.parseInt(con));
                           DAOBeneficiario dao =  new DAOBeneficiario();
                           if (dao.Insertar(Ben) == 0){
                               JOptionPane.showMessageDialog(rootPane, 
                                       "Listo agregado papá");
                           }          
                }catch (HeadlessException | SQLException e){
                    JOptionPane.showMessageDialog(rootPane, 
                            "No se agrego el registro nada revisa el codigo");
                }
               
            }
                    
        obtenerDatos();
        limpiarCampos();
        } catch (SQLException ex) {
            Logger.getLogger(Beneficiario.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        try{
            actualizar();
        }catch (SQLException ex){
        Logger.getLogger(Beneficiarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        try{
            obtenerDatos();
        }catch (SQLException ex){
            Logger.getLogger(Beneficiarios.class.getName()).
                    log(Level.SEVERE,null,ex);
        }
        limpiarCampos();
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        int fila = this.jTableBeneficiarios.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(rootPane, 
                    "Selecione el registro de la tabla");
        }else{
            try{
                int id = Integer.parseInt((String) this.jTableBeneficiarios.
                        getValueAt(fila, 0).toString());
                String nom = (String) this.jTableBeneficiarios.getValueAt(fila, 1);
                String apell = (String) this.jTableBeneficiarios.getValueAt(fila, 2);
                String ced = (String) this.jTableBeneficiarios.getValueAt(fila, 3);
                String tel = (String) this.jTableBeneficiarios.getValueAt(fila, 4);
                int con = Integer.parseInt ((String) this.jTableBeneficiarios.getValueAt(fila, 5));
                
                jTextdIDBeneficiarios.setText(""+id);
                jTextNombre.setText(nom);
                jTextApellido.setText(apell);
                jTextCedula.setText(ced);
                jTextTeleno.setText(tel);
                jTextIDContrato.setText(""+con);
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(rootPane, 
                        "¡ocurrio un problema!"+e.getMessage());
            }
        }
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonBuscarKeyTyped

    }//GEN-LAST:event_jButtonBuscarKeyTyped

    private void jTextCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextCedulaKeyTyped
        char car = evt.getKeyChar();
        if (jTextCedula.getText().length()<1) evt.consume();
        if ((car<'0' || car>'9')) evt.consume();
    }//GEN-LAST:event_jTextCedulaKeyTyped

    private void jTextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreActionPerformed

    private void jTextNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextNombreKeyTyped
             char car = evt.getKeyChar();
if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z')
&& car != 'á' //Minúsculas
&& car != 'é'
&& car != 'í'
&& car != 'ó'
&& car != 'ú'
&& car != 'Á' //Mayúsculas
&& car != 'E'
&& car != 'I'
&& car != 'Ó'
&& car != 'Ú'
&& car != 'ü'
&& car != 'ü'
&& car != 'Ñ'
&& car != 'ñ'
&& (car != (char) KeyEvent. VK_SPACE)) {
  evt.consume();
}
    }//GEN-LAST:event_jTextNombreKeyTyped

    private void jTextApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextApellidoKeyTyped
            char car = evt.getKeyChar();
if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z')
&& car != 'á' //Minúsculas
&& car != 'é'
&& car != 'í'
&& car != 'ó'
&& car != 'ú'
&& car != 'Á' //Mayúsculas
&& car != 'E'
&& car != 'I'
&& car != 'Ó'
&& car != 'Ú'
&& car != 'ü'
&& car != 'ü'
&& car != 'Ñ'
&& car != 'ñ'
&& (car != (char) KeyEvent. VK_SPACE)) {
  evt.consume();
}
    }//GEN-LAST:event_jTextApellidoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Telefono;
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableBeneficiarios;
    private javax.swing.JTextField jTextApellido;
    private javax.swing.JFormattedTextField jTextCedula;
    private javax.swing.JTextField jTextFieldBuscar;
    private javax.swing.JTextField jTextIDContrato;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextTeleno;
    private javax.swing.JTextField jTextdIDBeneficiarios;
    // End of variables declaration//GEN-END:variables


   
}
