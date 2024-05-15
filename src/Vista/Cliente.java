/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
//hola
package Vista;
import Modelo.Clientes;
import Modelo. DAOClientes;
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


/**
 *
 * @author Jeremy
 */
public class Cliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form Cliente
     */
    public Cliente() throws SQLException {
        initComponents();
        jTextIDcliente.setEnabled(false);
        obtenerDatos();
        
    }
    public void obtenerDatos() throws SQLException{
        List<Clientes> Clientes = new DAOClientes().ObtenerDatos();
        DefaultTableModel modelo = new DefaultTableModel();
        String[] columnas = {"IDcliente","Nombre","Apellidos","Direccion","Cedula", 
        "Telefono"};
        modelo.setColumnIdentifiers(columnas);
        for (Clientes auto : Clientes){
            String[] renglon = {Integer.toString(auto.getIDcliente()), auto.getNombre(),
                    auto.getApellido(),auto.getDireccion(),auto.getCedula(),
                    auto.getTelefono()};

            modelo.addRow(renglon);
        }
        jTableClientes.setModel(modelo);
        
        
    }
    public void actualizar() throws SQLException{
        int id = Integer.parseInt(this.jTextIDcliente.getText());
        String nom = this.jTextNombre.getText();
        String ape = this.jTextApellido.getText();
        String dir = this.jTextDireccion.getText();
        String ced = this.jTextCedula.getText();
        String tel = this.jTextTelefono.getText();

        
        Clientes auto = new Clientes (id, nom, ape, dir, 
                ced, tel);
        
        DAOClientes dao = new DAOClientes();
        int res = dao.Actualizar(auto);
        if (res == 0){
            JOptionPane.showMessageDialog(rootPane, 
                    "¡El Autor esta actualizado mi jefe!");
        }else{
            JOptionPane.showMessageDialog(rootPane, 
                    "¡Mira eso que ocurrio un error!");
        }
    
    }
    public void limpiarCampos(){
        jTextIDcliente.setText("");
        jTextNombre.setText("");
        jTextApellido.setText("");
        jTextDireccion.setText("");
        jTextCedula.setText("");
        jTextTelefono.setText("");
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
        jTextDireccion = new javax.swing.JTextField();
        jTextApellido = new javax.swing.JTextField();
        jTextNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextIDcliente = new javax.swing.JTextField();
        jButtonAgregar = new javax.swing.JButton();
        jTextCedula = new javax.swing.JFormattedTextField();
        jTextTelefono = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jButtonBuscar = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jTextFieldBuscar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Agregar Clientes");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido");

        jLabel4.setText("Telefono");

        jLabel5.setText("Cédula");

        jLabel6.setText("Dirección");

        jTextApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextApellidoKeyTyped(evt);
            }
        });

        jTextNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextNombreKeyTyped(evt);
            }
        });

        jLabel7.setText("IDCliente");

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

        try {
            jTextTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addComponent(jTextApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextIDcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTextNombre))))
                .addGap(85, 85, 85))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jButtonAgregar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextCedula, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                            .addComponent(jTextTelefono))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextIDcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jTextCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTextTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jButtonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

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

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Registros de clientes");

        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellido", "Direccion", "Cedula", "Telefono"
            }
        ));
        jScrollPane2.setViewportView(jTableClientes);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonActualizar)
                        .addGap(37, 37, 37)
                        .addComponent(jButtonEditar)
                        .addGap(75, 75, 75)
                        .addComponent(jButtonBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(jLabel8)))
                .addContainerGap(183, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonActualizar)
                            .addComponent(jButtonEditar))
                        .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        try {
           
           String nom = jTextNombre.getText();
           String ape = jTextApellido.getText();
           String dir = jTextDireccion.getText();
           String ced = jTextCedula.getText();
           String tel = jTextTelefono.getText();
           
           if ( 
                   nom.contentEquals("")
                   || ape.contentEquals("")
                   || dir.contentEquals("")
                   || ced.contentEquals("")
                   || tel.contentEquals("")){
               JOptionPane.showMessageDialog(rootPane, 
                       "perro te falta");
               
           }else {
               try {
                  
                   
                   Clientes auto = new Clientes(nom, ape, 
                           dir, ced, tel);
                   DAOClientes dao = new DAOClientes();
                   if (dao.Insertar(auto) == 0) { 
                       JOptionPane.showMessageDialog(rootPane,
                               "Listo agregado papá");
                   }
                   
               } catch (HeadlessException | SQLException e) {
                   JOptionPane.showMessageDialog(rootPane, 
                           "No se agrego el registro nada revisa el codigo");
               }
           }
           obtenerDatos();
           
           limpiarCampos();
       } catch (SQLException ex) {
          Logger.getLogger(Cliente.class.getName()).
                   log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        try{
            actualizar();
        }catch (SQLException ex){
        Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        try{
            obtenerDatos();
        }catch (SQLException ex){
            Logger.getLogger(Cliente.class.getName()).
                    log(Level.SEVERE,null,ex);
        }
        limpiarCampos();
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        int fila = this.jTableClientes.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(rootPane, 
                    "Selecione el registro de la tabla");
        }else{
            try{
                int id = Integer.parseInt((String) this.jTableClientes.
                        getValueAt(fila, 0).toString());
                String nom = (String) this.jTableClientes.getValueAt(fila, 1);
                String ape = (String) this.jTableClientes.getValueAt(fila, 2);
                String dir = (String) this.jTableClientes.getValueAt(fila, 3);
                String ced = (String) this.jTableClientes.getValueAt(fila, 4);
                String tel = (String) this.jTableClientes.getValueAt(fila, 5);
                
                jTextIDcliente.setText(""+id);
                jTextNombre.setText(nom);
                jTextApellido.setText(ape);
                jTextDireccion.setText(dir);
                jTextCedula.setText(ced);
                jTextTelefono.setText(tel);
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(rootPane, 
                        "¡ocurrio un problema!"+e.getMessage());
            }
        }
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonBuscarKeyTyped

    }//GEN-LAST:event_jButtonBuscarKeyTyped

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
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JTextField jTextApellido;
    private javax.swing.JFormattedTextField jTextCedula;
    private javax.swing.JTextField jTextDireccion;
    private javax.swing.JTextField jTextFieldBuscar;
    private javax.swing.JTextField jTextIDcliente;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JFormattedTextField jTextTelefono;
    // End of variables declaration//GEN-END:variables

   
}
