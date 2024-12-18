package com.proyecto.gestorderoles.igu;

import com.proyecto.gestorderoles.logica.ControlLogica;
import com.proyecto.gestorderoles.logica.User;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class IndexAdmin extends javax.swing.JFrame {
    
    ControlLogica controlLogica;
    User user;
    
    public IndexAdmin(ControlLogica controlLogica, User user) {
        initComponents();
        this.controlLogica = new ControlLogica();
        this.user = new User();
    }
    
    public IndexAdmin() {
        initComponents();        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDeAdminInterf = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnEditUser = new javax.swing.JButton();
        btnDeleteUser = new javax.swing.JButton();
        btnRecarTablaAdmi = new javax.swing.JButton();
        btnExitUs = new javax.swing.JButton();
        btnCreateUsers = new javax.swing.JButton();
        txtNombreAdmi = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tablaDeAdminInterf.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaDeAdminInterf);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setText("Sistema administrador de usuariosss");

        btnEditUser.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditUser.setText("Editar Usuario");
        btnEditUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditUserActionPerformed(evt);
            }
        });

        btnDeleteUser.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDeleteUser.setText("Eliminar Usuario");
        btnDeleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteUserActionPerformed(evt);
            }
        });

        btnRecarTablaAdmi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRecarTablaAdmi.setText("Recargar Tabla");

        btnExitUs.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnExitUs.setText("Salir");
        btnExitUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitUsActionPerformed(evt);
            }
        });

        btnCreateUsers.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCreateUsers.setText("Create User");
        btnCreateUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateUsersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDeleteUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRecarTablaAdmi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnExitUs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnCreateUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCreateUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEditUser, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDeleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRecarTablaAdmi, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExitUs, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        txtNombreAdmi.setEditable(false);
        txtNombreAdmi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNombreAdmi.setText("jTextField1");
        txtNombreAdmi.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNombreAdmi))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtNombreAdmi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteUserActionPerformed
        
        // validar que la tabla tenga elemantos
        if(tablaDeAdminInterf.getRowCount() != 0){
            if(tablaDeAdminInterf.getSelectedRow() != -1){
                //obtener el id de la fila seleccionada
                
                            // convertimos el String a entero
                int id = Integer.parseInt(
                        // convertimos el objeto a String
                        String.valueOf(
                                // obtenemos el objeto
                                tablaDeAdminInterf.getValueAt(
                                        tablaDeAdminInterf.getSelectedRow(), 0)));
                
                // lamamos al metodo borra user
                controlLogica.borraUser(id);
                
                // mostrar mensaje
                controlLogica.mostrarMensaje("Eliminado Correctamente", "ok", "Eliminacion");
                
                
                // cargar tabla
                mostrarTablaAdmin(); 
            }else{
                // mostrar mensaje
                controlLogica.mostrarMensaje("No selecciono ningun registro", "warning", "no seleccionado");
            }
        }else{
            // mostrar mensaje
            controlLogica.mostrarMensaje("Tabla Vacia", "error", "Sin Registros");
        }
    }//GEN-LAST:event_btnDeleteUserActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.txtNombreAdmi.setText(user.getUserName());
        
        mostrarTablaAdmin();
    }//GEN-LAST:event_formWindowOpened

    private void btnExitUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitUsActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnExitUsActionPerformed

    private void btnEditUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditUserActionPerformed
        
        if (tablaDeAdminInterf.getRowCount() == 0) {
            if (tablaDeAdminInterf.getSelectedRow() != -1) {
                int idUser = Integer.parseInt(
                        String.valueOf(
                                tablaDeAdminInterf.getValueAt(
                                        tablaDeAdminInterf.getSelectedRow(), 0)));
                EditUser editUser = new EditUser(idUser, controlLogica);
                editUser.setVisible(true);
                editUser.setLocationRelativeTo(null);
            }else{
                // mostrar mensaje
                controlLogica.mostrarMensaje("No selecciono ningun registro", "warning", "no seleccionado");
            }
        }else{
            // mostrar mensaje
            controlLogica.mostrarMensaje("Tabla Vacia", "error", "Sin Registros");
    }//GEN-LAST:event_btnEditUserActionPerformed

    private void btnCreateUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateUsersActionPerformed
        NewUser newUser = new NewUser(controlLogica);
        newUser.setVisible(true);
        newUser.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnCreateUsersActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCreateUsers;
    private javax.swing.JButton btnDeleteUser;
    private javax.swing.JButton btnEditUser;
    private javax.swing.JButton btnExitUs;
    private javax.swing.JButton btnRecarTablaAdmi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaDeAdminInterf;
    private javax.swing.JTextField txtNombreAdmi;
    // End of variables declaration//GEN-END:variables

    private void mostrarTablaAdmin() {
        DefaultTableModel tablaModel = new DefaultTableModel(){
        
        @Override
        public boolean isCellEditable(int row, int column){
            return false;
        }
        };
        
        
        String[] titulos = {"Id", "Nombre", "Rol"};
        tablaModel.setColumnIdentifiers(titulos);
        
        List<User> listaUsuarios = controlLogica.traerUsers();
        
        if (listaUsuarios != null) {
            for(User user: listaUsuarios){
                Object[] object = {user.getId(), user.getUserName(), user.getRol().getNombreRol()};
                
                tablaModel.addRow(object);
            } 
        }
        
        tablaDeAdminInterf.setModel(tablaModel);
        
    
    }
}
