package com.proyecto.concesionaria.igu;

import com.proyecto.concesionaria.logica.Auto;
import com.proyecto.concesionaria.logica.ControladorLogica;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.eclipse.persistence.internal.libraries.asm.commons.StaticInitMerger;

public class ViewData extends javax.swing.JFrame {
    
    ControladorLogica controladorLogica = null;
    
    public ViewData() {
        initComponents();
        this.controladorLogica = new ControladorLogica();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaInterfaz = new javax.swing.JTable();
        btnEdit = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 36)); // NOI18N
        jLabel1.setText("Consesionario");

        TablaInterfaz.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaInterfaz);

        btnEdit.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnRemove.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(15, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEdit)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemove)
                        .addGap(48, 48, 48))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemove)
                    .addComponent(btnEdit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        
        
        if (TablaInterfaz.getRowCount()> 0) {
            if (TablaInterfaz.getSelectedRow() != -1) {
                int idAuto = Integer.parseInt(String.valueOf(TablaInterfaz.getValueAt(TablaInterfaz.getSelectedRow(), 0)));
                controladorLogica.verificarOpcion("Estas seguro de Hacer la edicion", 
                        ()->{
                            EditData editData = new EditData(idAuto);
                            editData.setVisible(true);
                            editData.setLocationRelativeTo(null);
                            this.dispose();
                        }
                );
            }else{
                controladorLogica.MensajeFlotante("No a seleccionado ningun registro","warning" , "Advertencia");
            }
        }else{
            controladorLogica.MensajeFlotante("No hay registros en la tabla", "warning", "Sin registros");
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        if(TablaInterfaz.getRowCount()> 0){
            if (TablaInterfaz.getSelectedRow() != -1) {
                int idAuto = Integer.parseInt(String.valueOf(TablaInterfaz.getValueAt(TablaInterfaz.getSelectedRow(), 0)));
                
                controladorLogica.verificarOpcion("Estas seguro de que deseas hacer la elimina",
                        () -> {
                            controladorLogica.deleteAuto(idAuto);
                            controladorLogica.MensajeFlotante("Elemento eliminado", "warning", "Eliminacion");
                            cargarTablaDatos();
                        }
                );
            }else{
                controladorLogica.MensajeFlotante("Por favor, selecciona un registro", "warning", "Sin selección");
            }
        }else{
            controladorLogica.MensajeFlotante("No hay registros en la tabla", "warning", "Sin registros");
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // metodo de cargar datos a la tabla
        cargarTablaDatos();
    }//GEN-LAST:event_formWindowOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaInterfaz;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnRemove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void cargarTablaDatos() {
        
        DefaultTableModel tablaRegistros = new DefaultTableModel(){
            
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        // establecemos los nombres en la tabla
        String titulos[] = {"id","Model","Brand", "Motor", "Color", "Numero Door"};
        tablaRegistros.setColumnIdentifiers(titulos);
        
        // cargamos los datos de la base de datos
        List<Auto> listaAuto = controladorLogica.traerAutos();
        
        if(listaAuto != null){
            for(Auto auto: listaAuto){
                Object[] object ={auto.getId(), auto.getModel(), auto.getBrand(), 
                     auto.getMotor(), auto.getColor(),auto.getNumDoor()};
                
                tablaRegistros.addRow(object);
            }
        }
        TablaInterfaz.setModel(tablaRegistros);
                
    }
}
