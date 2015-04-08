/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion;

import Database.OracleBD;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alejandro
 */
public class Faltas extends javax.swing.JDialog{
    
    public String fecha,matricula;
   
    
    
    /**
     * Creates new form Faltas
     */
    public Faltas() {
        initComponents();
        jDateChooser1.getJCalendar().setMaxSelectableDate(new Date());
        jDateChooser1.getDateEditor().setEnabled(false);
        jDateChooser1.setMaxSelectableDate(new Date());
        
        
        
        jDateChooser1.setDate(new Date());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        fecha =  String.valueOf(sdf.format(jDateChooser1.getDate()));
        jDateChooser1.getDateEditor().addPropertyChangeListener(
            new PropertyChangeListener() {
                @Override
                public void propertyChange(PropertyChangeEvent e) {
                    if ("date".equals(e.getPropertyName())) {
                        fecha =  String.valueOf(sdf.format(jDateChooser1.getDate()));
                        System.out.println(fecha);
                    }
                }
            });
        System.out.println(fecha);
    }
    
    public Faltas(String matriculaPR) {
        matricula=matriculaPR;
        initComponents();
        jDateChooser1.getJCalendar().setMaxSelectableDate(new Date());
        jDateChooser1.getDateEditor().setEnabled(false);
        jDateChooser1.setMaxSelectableDate(new Date());
        
        jComboBoxGrupo.removeAllItems();
        OracleBD OracleConnection = new OracleBD();
        try{
                    OracleConnection.conectar();
                    Connection conn = OracleConnection.getConnection();
                    Statement s1 = conn.createStatement();
                    ResultSet rs1 = s1.executeQuery ("SELECT DISTINCT nombre FROM GRUPO JOIN RELPROFESORMATERIA USING(IDGRUPO) "
                            + "WHERE MATRICULAPR='"+matriculaPR+"'");
                    while(rs1.next()){
                        jComboBoxGrupo.addItem(rs1.getString("nombre"));
                    } 
                }catch(Exception ex){
                    System.out.println("Error: " + ex.getMessage());
                }
        
        
        
        
        jDateChooser1.getDateEditor().setEnabled(false);
        jDateChooser1.setDate(new Date());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        fecha =  String.valueOf(sdf.format(jDateChooser1.getDate()));
        jDateChooser1.getDateEditor().addPropertyChangeListener(
            new PropertyChangeListener() {
                @Override
                public void propertyChange(PropertyChangeEvent e) {
                    if ("date".equals(e.getPropertyName())) {
                        fecha =  String.valueOf(sdf.format(jDateChooser1.getDate()));
                        System.out.println(fecha);
                    }
                }
            });
        System.out.println(fecha);
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldfecha = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldmateria = new javax.swing.JTextField();
        btncancelar = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jComboBoxGrupo = new javax.swing.JComboBox();
        jComboBoxMateria = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Faltas");
        setResizable(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Fecha");

        jTextFieldfecha.setText(" ");

        jLabel2.setText("Materia");

        jTextFieldmateria.setText(" ");

        btncancelar.setText("Cancelar");

        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        jDateChooser1.setDateFormatString("dd/MM/yyyy");
        jDateChooser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDateChooser1MouseClicked(evt);
            }
        });
        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });

        jComboBoxGrupo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxGrupoActionPerformed(evt);
            }
        });

        jComboBoxMateria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMateriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btncancelar)
                        .addGap(18, 18, 18)
                        .addComponent(btnguardar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldfecha)
                            .addComponent(jTextFieldmateria, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(306, 306, 306))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(192, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jComboBoxGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(156, 156, 156))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldmateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncancelar)
                    .addComponent(btnguardar))
                .addGap(0, 116, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jDateChooser1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser1MouseClicked

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser1PropertyChange

    private void jComboBoxGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxGrupoActionPerformed
        jComboBoxMateria.removeAllItems();
        OracleBD OracleConnection = new OracleBD();
        try{
                    OracleConnection.conectar();
                    Connection conn = OracleConnection.getConnection();
                    Statement s1 = conn.createStatement();
                    ResultSet rs1 = s1.executeQuery ("SELECT nombre MATERIA FROM MATERIA JOIN RELPROFESORMATERIA USING(IDMATERIA) "
                            + "WHERE MATRICULAPR='"+matricula+"' "
                            + "AND IDGRUPO=(SELECT IDGRUPO FROM GRUPO WHERE NOMBRE='"+(String) jComboBoxGrupo.getSelectedItem()+"')");
                    while(rs1.next()){
                        jComboBoxMateria.addItem(rs1.getString("MATERIA"));
                    } 
                }catch(Exception ex){
                    System.out.println("Error: " + ex.getMessage());
                }
    }//GEN-LAST:event_jComboBoxGrupoActionPerformed

    private void jComboBoxMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMateriaActionPerformed
        DefaultTableModel modelo = new DefaultTableModel(){
        
            
            Class[] types = new Class[]{
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
                };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
            
            @Override
            public boolean isCellEditable(int row, int col) {
                return (col == 4); 
            }
            
        };
        modelo.addColumn("Matricula");
        modelo.addColumn("Nombre");
        modelo.addColumn("Ap. Paterno");
        modelo.addColumn("Ap. Materno");
        modelo.addColumn("Falta");
        jTable1.setModel(modelo);
        
        OracleBD OracleConnection = new OracleBD();
        try{
            OracleConnection.conectar();
            Connection conn = OracleConnection.getConnection();
            Statement s1 = conn.createStatement();
            ResultSet rs1 = s1.executeQuery ("SELECT matriculaAL, nombre, apellidoPaterno, apellidoMaterno "
                    + "FROM ALUMNO JOIN RELPROFESORMATERIA USING(IDGRUPO) "
                    + "WHERE MATRICULAPR='"+matricula+"'");
            while(rs1.next()){
                    System.out.println(rs1.getString(2));
                    Object[] fila = new Object[3];
                       for (int i = 0; i <= 2; i++){
                           fila[i]=rs1.getObject(i+1);
                       }
                       modelo.addRow(fila);
                       modelo.setValueAt(false, modelo.getRowCount()-1, 4);
                }
            rs1.close();
            OracleConnection.cerrar();
        }catch(Exception ex){
            System.out.println("Error: " + ex.getMessage());
        }
        
        //Poner el color de los checkbox
        ((JComponent) jTable1.getDefaultRenderer(Boolean.class)).setOpaque(true);
        
    }//GEN-LAST:event_jComboBoxMateriaActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        String matAlumno;
        int filas = jTable1.getRowCount();
        
        for (int i=0; i < filas; i++){
            if( (Boolean) jTable1.getValueAt(i, 4) ){
                matAlumno = (String) jTable1.getValueAt(i, 0);
                System.out.println(matAlumno);
            }
            
        }
        
    }//GEN-LAST:event_btnguardarActionPerformed

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
            java.util.logging.Logger.getLogger(Faltas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Faltas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Faltas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Faltas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Faltas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JComboBox jComboBoxGrupo;
    private javax.swing.JComboBox jComboBoxMateria;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldfecha;
    private javax.swing.JTextField jTextFieldmateria;
    // End of variables declaration//GEN-END:variables
}
