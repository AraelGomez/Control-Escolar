


package Aplicacion;

import Database.OracleBD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class Calificaciones extends javax.swing.JFrame {
    String usuario;
    public String matricula, nombre;
    boolean flag_habilitar = false;
    public DefaultTableModel modelo = new DefaultTableModel(){

    @Override
    public boolean isCellEditable(int row, int column) {
       //all cells false
       return false;
    }
};;
    
    
    public Calificaciones(String tipoUsuario, String matriculaAL){
        this.matricula=matriculaAL;
        modelo.addColumn("ID");
        modelo.addColumn("Semestre");
        modelo.addColumn("Materia");
        modelo.addColumn("Parcial 1");
        modelo.addColumn("Parcial 1");
        modelo.addColumn("Parcial 1");
        modelo.addColumn("Promedio");
        this.usuario = tipoUsuario; 
        System.out.println(matriculaAL);
        System.out.println(usuario);
        initComponents();
        if(usuario.equals("ALUMNO")){
            ocultarCampos();
            ocultarBotones();
            //Conexcion de solo materias que este cursando el morro
            
        }else{
            habilitarBotones(flag_habilitar);
            habilitarCampos(flag_habilitar);
            OracleBD OracleConnection = new OracleBD();
            try {
                OracleConnection.conectar();
                Connection conn = OracleConnection.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rset0 = stmt.executeQuery("select nombre, apellidoPaterno, apellidoMaterno from Alumno where matriculaAL='"+matriculaAL+"'");
                while(rset0.next()){
                    //this.nombre=rset0.getString(0);
                    jLabelMatriculaYNombre.setText(matriculaAL +" "+rset0.getString(1)+rset0.getString(2)+rset0.getString(3));
                }
                ResultSet rset = stmt.executeQuery(
                    "select idmateria,semestre, M.nombre, parcial1,parcial2,parcial3,promedio,status "
                    + "from alumno\n" +
                    "join kardex K using(matriculaAL)\n" +
                    "join calificaciones C using(idkardex)\n" +
                    "join materia M using(idMateria)\n" +
                    "where matriculaAL='"+matriculaAL+"'" );  
                while(rset.next()){
                    Object[] fila = new Object[7];
                           for (int i = 0; i <= 6; i++){
                               fila[i]=rset.getObject(i+1);
                           }
                           modelo.addRow(fila);
                }
                jTableCalificaciones.setModel(modelo);
                stmt.close();
                OracleConnection.cerrar();
            } catch (SQLException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
        
    }
    public Calificaciones() {
        initComponents(); 
        habilitarBotones(flag_habilitar);
        habilitarCampos(flag_habilitar);
        
    }
       

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCalificaciones = new javax.swing.JTable();
        btnguardar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        jComboBoxCalificacion = new javax.swing.JComboBox();
        lblPunto = new javax.swing.JLabel();
        jComboBoxDecimal = new javax.swing.JComboBox();
        jComboBoxParcial = new javax.swing.JComboBox();
        btnEditar = new javax.swing.JButton();
        lbParcial = new javax.swing.JLabel();
        lblCalif = new javax.swing.JLabel();
        btnConfirmarCalif = new javax.swing.JButton();
        componenteAyuda1 = new Aplicacion.ComponenteAyuda();
        jButton1 = new javax.swing.JButton();
        jLabelMatriculaYNombre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Calificaciones");
        setResizable(false);

        jTableCalificaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Semestre", "Materia", "Parcial 1", "Parcial 2", "Parcial 3", "Promedio"
            }
        ));
        jTableCalificaciones.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableCalificaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCalificacionesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCalificaciones);
        if (jTableCalificaciones.getColumnModel().getColumnCount() > 0) {
            jTableCalificaciones.getColumnModel().getColumn(3).setCellEditor(new javax.swing.DefaultCellEditor(jComboBoxCalificacion));
        }

        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        jComboBoxCalificacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jComboBoxCalificacion.setPreferredSize(new java.awt.Dimension(42, 20));
        jComboBoxCalificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCalificacionActionPerformed(evt);
            }
        });

        lblPunto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPunto.setText(".");

        jComboBoxDecimal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        jComboBoxDecimal.setPreferredSize(new java.awt.Dimension(47, 20));
        jComboBoxDecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDecimalActionPerformed(evt);
            }
        });

        jComboBoxParcial.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PARCIAL1", "PARCIAL2", "PARCIAL3" }));

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        lbParcial.setText("Parcial: ");

        lblCalif.setText("Calificacion:");

        btnConfirmarCalif.setText("Confirmar Calificacion");
        btnConfirmarCalif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarCalifActionPerformed(evt);
            }
        });

        jButton1.setText("Cerrar Sesion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabelMatriculaYNombre.setText("Matricula y Nombre del Alumno");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMatriculaYNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnConfirmarCalif, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btncancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnguardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbParcial)
                                    .addComponent(lblCalif))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jComboBoxParcial, 0, 137, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jComboBoxCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(9, 9, 9)))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEditar)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(componenteAyuda1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(jLabelMatriculaYNombre)
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBoxParcial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbParcial))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBoxCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPunto)
                                    .addComponent(jComboBoxDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lblCalif, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGap(14, 14, 14)
                            .addComponent(btnguardar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btncancelar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnConfirmarCalif)))
                    .addComponent(componenteAyuda1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        String calificacion = ((String) jComboBoxCalificacion.getSelectedItem() +"."+(String) jComboBoxDecimal.getSelectedItem());
        String parcial = (String) jComboBoxParcial.getSelectedItem();
        String matriculaAL= this.matricula;
        int row = jTableCalificaciones.getSelectedRow();
        String materia = jTableCalificaciones.getValueAt(row, 0).toString();
        System.out.println("Mat: "+materia+" Parcial: "+parcial+" Calif: "+calificacion);
        while(modelo.getRowCount()>0)modelo.removeRow(0);
        OracleBD OracleConnection = new OracleBD();
        try {
                OracleConnection.conectar();
                Connection conn = OracleConnection.getConnection();
                Statement stmt = conn.createStatement();
                stmt.executeQuery("UPDATE  (select idmateria,semestre, M.nombre, parcial1,parcial2,parcial3,promedio,status from alumno " +
                    "join kardex K using(matriculaAL) " +
                    "join calificaciones C using(idkardex) " +
                    "join materia M using(idMateria) " +
                    "where matriculaAL='"+matriculaAL+"' AND "
                    + "idMateria ='"+materia
                    + "') set "+parcial+" = "+calificacion);
                ResultSet rset = stmt.executeQuery(
                    "select idmateria,semestre, M.nombre, parcial1,parcial2,parcial3,promedio,status "
                    + "from alumno\n" +
                    "join kardex K using(matriculaAL)\n" +
                    "join calificaciones C using(idkardex)\n" +
                    "join materia M using(idMateria)\n" +
                    "where matriculaAL='"+matriculaAL+"'" );  
                while(rset.next()){
                    System.out.println(rset.getString(2));
                    Object[] fila = new Object[7];
                           for (int i = 0; i <= 6; i++){
                               fila[i]=rset.getObject(i+1);
                           }
                           modelo.addRow(fila);
                }
                jTableCalificaciones.setModel(modelo);
                stmt.close();
                OracleConnection.cerrar();
            } catch (SQLException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        
        
        
        flag_habilitar = false;
        habilitarCampos(flag_habilitar);
        habilitarBotones(flag_habilitar);
    }//GEN-LAST:event_btnguardarActionPerformed

    private void jTableCalificacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCalificacionesMouseClicked
        btnEditar.setEnabled(true);
    }//GEN-LAST:event_jTableCalificacionesMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        flag_habilitar = true;
        habilitarCampos(flag_habilitar);
        habilitarBotones(flag_habilitar);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void jComboBoxDecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDecimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxDecimalActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        flag_habilitar = false;
        habilitarCampos(flag_habilitar);
        habilitarBotones(flag_habilitar);
    }//GEN-LAST:event_btncancelarActionPerformed

    private void btnConfirmarCalifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarCalifActionPerformed
        //Pedir contrasenia
        //guardar
        flag_habilitar = false;
        habilitarCampos(flag_habilitar);
        habilitarBotones(flag_habilitar);
    }//GEN-LAST:event_btnConfirmarCalifActionPerformed

    private void jComboBoxCalificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCalificacionActionPerformed
        //si es un 10 la calificacion, bloquear los decimales
        if ("10".equals(jComboBoxCalificacion.getSelectedItem())){
            jComboBoxDecimal.setSelectedIndex(0);
            jComboBoxDecimal.setEnabled(false);
        }
        else{
            jComboBoxDecimal.setEnabled(true);
        }
    }//GEN-LAST:event_jComboBoxCalificacionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Calificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calificaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmarCalif;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnguardar;
    private Aplicacion.ComponenteAyuda componenteAyuda1;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBoxCalificacion;
    private javax.swing.JComboBox jComboBoxDecimal;
    private javax.swing.JComboBox jComboBoxParcial;
    private javax.swing.JLabel jLabelMatriculaYNombre;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCalificaciones;
    private javax.swing.JLabel lbParcial;
    private javax.swing.JLabel lblCalif;
    private javax.swing.JLabel lblPunto;
    // End of variables declaration//GEN-END:variables

    private void ocultarCampos() {
        jComboBoxParcial.setVisible(false);
        jComboBoxCalificacion.setVisible(false);
        jComboBoxDecimal.setVisible(false);
        lbParcial.setVisible(false);
        lblCalif.setVisible(false);
        lblPunto.setVisible(false);
    }

    private void ocultarBotones() {
        btnEditar.setVisible(false);
        btnguardar.setVisible(false);
        btncancelar.setVisible(false);
        btnConfirmarCalif.setVisible(false);
    }

    private void habilitarCampos(boolean b) {
        jComboBoxParcial.setEnabled(b);
        jComboBoxCalificacion.setEnabled(b);
        jComboBoxDecimal.setEnabled(b);
        lbParcial.setEnabled(b);
        lblCalif.setEnabled(b);
        lblPunto.setEnabled(b);
    }

    private void habilitarBotones(boolean b) {
        btnEditar.setEnabled(b);
        btnguardar.setEnabled(b);
        btncancelar.setEnabled(b);
        btnConfirmarCalif.setEnabled(b);
    }
}
