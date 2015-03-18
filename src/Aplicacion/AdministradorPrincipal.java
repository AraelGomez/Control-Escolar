package Aplicacion;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JOptionPane;
public final class AdministradorPrincipal extends javax.swing.JFrame {
    String nombre, apPaterno, apMaterno, calle, colonia, telCasa, telMovil, corrInst, corrPers,
           contrasena;
    int numero;
    int cont = 0; //contador para validar caracteres ingresados 
    
    
    public void guardarTextFildVar(){
        nombre = jTextFieldNombre.getText();
        apPaterno = jTextFieldApellidoPaterno.getText();
        apMaterno = jTextFieldApellidoMaterno.getText();
        calle = jTextFieldCalle.getText();
        colonia = jTextFieldColonia.getText();
        telCasa = jTextFieldTelCasa.getText();
        telMovil = jTextFieldTelMovill.getText();
        corrInst = jTextFieldCorreoInstitucional.getText();
        corrPers = jTextFieldCorreoPersonal.getText();
        contrasena = jTextFieldContrasena.getText();
        numero = Integer.parseInt(jTextFieldNumero.getText());        
    }
    
    public void disableBusqueda(){
        jTextFieldPorMatricula.setEnabled(false);
        jTextFieldPorApellido.setEnabled(false);
        jTextFieldPorNombre.setEnabled(false);
        /*jLabelPorMatriula.setEnabled(false);
        jLabelPorNombre.setEditable(false);
        jLabelPorApellido.setVisible(false);*/
    }
    public void enableBusqueda(){
        jTextFieldPorMatricula.setEnabled(true);
        jTextFieldPorApellido.setEnabled(true);
        jTextFieldPorNombre.setEnabled(true);
        /*LabelPorMatriula.setVisible(true);
        jLabelPorNombre.setVisible(true);
        jLabelPorApellido.setVisible(true);*/
    }
    
    //Funcion para deshabilitar jTextField
    public void Deshabilitar(){
        jComboBoxUsuarioNuevo.setEnabled(false);
        jTextFieldMatricula.setEnabled(false);
        jTextFieldNombre.setEnabled(false);
        jTextFieldApellidoPaterno.setEnabled(false);
        jTextFieldApellidoMaterno.setEnabled(false);
        jTextFieldCalle.setEnabled(false);
        jTextFieldColonia.setEnabled(false);
        jTextFieldNumero.setEnabled(false);
        jTextFieldTelCasa.setEnabled(false);
        jTextFieldTelMovill.setEnabled(false);
        jTextFieldCorreoInstitucional.setEnabled(false);
        jTextFieldCorreoPersonal.setEnabled(false);
        jTextFieldContrasena.setEnabled(false);
        jComboBoxsemestre.setEnabled(false);
        jComboBoxgrupo.setEnabled(false);
        
    }
    public void Habilitar(){
            jComboBoxUsuarioNuevo.setEnabled(true);
            jTextFieldMatricula.setEnabled(true);
            jTextFieldNombre.setEnabled(true);
            jTextFieldApellidoPaterno.setEnabled(true);
            jTextFieldApellidoMaterno.setEnabled(true);
            jTextFieldCalle.setEnabled(true);
            jTextFieldColonia.setEnabled(true);
            jTextFieldNumero.setEnabled(true);
            jTextFieldTelCasa.setEnabled(true);
            jTextFieldTelMovill.setEnabled(true);
            jTextFieldCorreoInstitucional.setEnabled(true);
            jTextFieldCorreoPersonal.setEnabled(true);
            jTextFieldContrasena.setEnabled(true);
            jComboBoxsemestre.setEnabled(true);
            jComboBoxgrupo.setEnabled(true);        
    }
    public void Limpiar(){
        jTextFieldMatricula.setText("");
        jTextFieldNombre.setText("");
        jTextFieldApellidoPaterno.setText("");
        jTextFieldApellidoMaterno.setText("");
        jTextFieldCalle.setText("");
        jTextFieldColonia.setText("");
        jTextFieldNumero.setText("");
        jTextFieldTelCasa.setText("");
        jTextFieldTelMovill.setText("");
        jTextFieldCorreoInstitucional.setText("");
        jTextFieldCorreoPersonal.setText("");
        jTextFieldContrasena.setText("");
        /*jComboBoxsemestre.(true);
        jComboBoxgrupo.setEnabled(true);*/        
    }
    
    // Desabilitar botones debajo de tabla
    
    public void disableButtons(){
        
        btncalificaciones.setEnabled(false);
        btnhorario.setEnabled(false);
        btnfaltas.setEnabled(false);
        btnmaterias.setEnabled(false);
        
    }
    public void enableButtons(){
        
        btncalificaciones.setEnabled(true);
        btnhorario.setEnabled(true);
        btnfaltas.setEnabled(true);
        btnmaterias.setEnabled(true);
        
    }

    public AdministradorPrincipal() {
        initComponents();
        btnLimpiar.setEnabled(false);
        jTextFieldMatricula.requestFocusInWindow();
        jTableBusquedaUser.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnhecho.setEnabled(false);
        Deshabilitar();     
        disableBusqueda();
        disableButtons();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labuser = new javax.swing.JLabel();
        btncerrar = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jPanelBusqueda = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jComboBoxTipoUser = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldPorMatricula = new javax.swing.JTextField();
        jTextFieldPorNombre = new javax.swing.JTextField();
        jTextFieldPorApellido = new javax.swing.JTextField();
        jLabelPorMatriula = new javax.swing.JLabel();
        jLabelPorNombre = new javax.swing.JLabel();
        jLabelPorApellido = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableBusquedaUser = new javax.swing.JTable();
        btnfaltas = new javax.swing.JButton();
        btncalificaciones = new javax.swing.JButton();
        btnhorario = new javax.swing.JButton();
        btnmaterias = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jTextFieldMatricula = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldApellidoPaterno = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldApellidoMaterno = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldCalle = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldColonia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldTelCasa = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldTelMovill = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldCorreoInstitucional = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextFieldCorreoPersonal = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldContrasena = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jComboBoxsemestre = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        jComboBoxgrupo = new javax.swing.JComboBox();
        btnhecho = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxUsuarioNuevo = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrador Principal");
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });

        labuser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labuser.setText("Nombre de usuario ");

        btncerrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btncerrar.setText("Cerrar Sesion");
        btncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Empleado");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setText("Usuario:");

        jComboBoxTipoUser.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Administrador", "Profesor", "Alumno" }));
        jComboBoxTipoUser.setMinimumSize(new java.awt.Dimension(90, 20));
        jComboBoxTipoUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoUserActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Busqueda Usuario");

        jTextFieldPorMatricula.setText(" ");
        jTextFieldPorMatricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldPorMatriculaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPorMatriculaKeyTyped(evt);
            }
        });

        jTextFieldPorNombre.setText(" ");
        jTextFieldPorNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldPorNombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPorNombreKeyTyped(evt);
            }
        });

        jTextFieldPorApellido.setText(" ");
        jTextFieldPorApellido.setNextFocusableComponent(jTextFieldPorMatricula);
        jTextFieldPorApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPorApellidoActionPerformed(evt);
            }
        });
        jTextFieldPorApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldPorApellidoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPorApellidoKeyTyped(evt);
            }
        });

        jLabelPorMatriula.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelPorMatriula.setText("Matricula:");

        jLabelPorNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelPorNombre.setText("Nombre:");

        jLabelPorApellido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelPorApellido.setText("Apellido:");

        jTableBusquedaUser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTableBusquedaUser.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableBusquedaUser);

        btnfaltas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnfaltas.setText("Faltas");

        btncalificaciones.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btncalificaciones.setText("Calificaiones");

        btnhorario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnhorario.setText("Horario");

        btnmaterias.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnmaterias.setText("Materias");

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBusquedaLayout = new javax.swing.GroupLayout(jPanelBusqueda);
        jPanelBusqueda.setLayout(jPanelBusquedaLayout);
        jPanelBusquedaLayout.setHorizontalGroup(
            jPanelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBusquedaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBusquedaLayout.createSequentialGroup()
                        .addGroup(jPanelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelPorNombre)
                            .addComponent(jLabelPorMatriula)
                            .addComponent(jLabelPorApellido)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBusquedaLayout.createSequentialGroup()
                                .addGroup(jPanelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBoxTipoUser, 0, 130, Short.MAX_VALUE)
                                    .addComponent(jTextFieldPorMatricula))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTextFieldPorApellido)
                            .addComponent(jTextFieldPorNombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBusquedaLayout.createSequentialGroup()
                        .addGap(0, 49, Short.MAX_VALUE)
                        .addGroup(jPanelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBusquedaLayout.createSequentialGroup()
                                .addComponent(btncalificaciones)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnhorario, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnfaltas, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnmaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBusquedaLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(154, 154, 154)))))
                .addContainerGap())
        );
        jPanelBusquedaLayout.setVerticalGroup(
            jPanelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBusquedaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jComboBoxTipoUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPorMatriula)
                    .addComponent(jTextFieldPorMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPorNombre)
                    .addComponent(jTextFieldPorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPorApellido)
                    .addComponent(jTextFieldPorApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncalificaciones)
                    .addComponent(btnhorario)
                    .addComponent(btnfaltas)
                    .addComponent(btnmaterias))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("Matricula:");

        jTextFieldMatricula.setNextFocusableComponent(jTextFieldNombre);
        jTextFieldMatricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldMatriculaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldMatriculaKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Nombre:");

        jTextFieldNombre.setText(" ");
        jTextFieldNombre.setNextFocusableComponent(jTextFieldApellidoPaterno);
        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });
        jTextFieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldNombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNombreKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Apellido paterno:");

        jTextFieldApellidoPaterno.setNextFocusableComponent(jTextFieldApellidoMaterno);
        jTextFieldApellidoPaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldApellidoPaternoActionPerformed(evt);
            }
        });
        jTextFieldApellidoPaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldApellidoPaternoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldApellidoPaternoKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Apellido materno:");

        jTextFieldApellidoMaterno.setText(" ");
        jTextFieldApellidoMaterno.setNextFocusableComponent(jTextFieldCalle);
        jTextFieldApellidoMaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldApellidoMaternoActionPerformed(evt);
            }
        });
        jTextFieldApellidoMaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldApellidoMaternoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldApellidoMaternoKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Calle:");

        jTextFieldCalle.setText(" ");
        jTextFieldCalle.setNextFocusableComponent(jTextFieldColonia);
        jTextFieldCalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCalleActionPerformed(evt);
            }
        });
        jTextFieldCalle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCalleKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCalleKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Colonia:");

        jTextFieldColonia.setNextFocusableComponent(jTextFieldNumero);
        jTextFieldColonia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldColoniaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldColoniaKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Numero:");

        jTextFieldNumero.setNextFocusableComponent(jTextFieldTelCasa);
        jTextFieldNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldNumeroKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNumeroKeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Telefono casa:");

        jTextFieldTelCasa.setText(" ");
        jTextFieldTelCasa.setNextFocusableComponent(jTextFieldTelMovill);
        jTextFieldTelCasa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldTelCasaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldTelCasaKeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Telefono celular:");

        jTextFieldTelMovill.setText(" ");
        jTextFieldTelMovill.setNextFocusableComponent(jTextFieldCorreoInstitucional);
        jTextFieldTelMovill.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldTelMovillKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldTelMovillKeyTyped(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Correo Institucional:");

        jTextFieldCorreoInstitucional.setText(" ");
        jTextFieldCorreoInstitucional.setNextFocusableComponent(jTextFieldCorreoPersonal);
        jTextFieldCorreoInstitucional.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCorreoInstitucionalKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCorreoInstitucionalKeyTyped(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Correo Personal:");

        jTextFieldCorreoPersonal.setNextFocusableComponent(jTextFieldContrasena);
        jTextFieldCorreoPersonal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCorreoPersonalKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCorreoPersonalKeyTyped(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Contraseña:");

        jTextFieldContrasena.setText(" ");
        jTextFieldContrasena.setNextFocusableComponent(jComboBoxsemestre);
        jTextFieldContrasena.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldContrasenaFocusGained(evt);
            }
        });
        jTextFieldContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldContrasenaActionPerformed(evt);
            }
        });
        jTextFieldContrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldContrasenaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldContrasenaKeyTyped(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Semestre:");

        jComboBoxsemestre.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7" }));
        jComboBoxsemestre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBoxsemestreKeyPressed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Grupo:");

        jComboBoxgrupo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "GRUP000", "GRUP001" }));
        jComboBoxgrupo.setNextFocusableComponent(jComboBoxgrupo);
        jComboBoxgrupo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBoxgrupoKeyPressed(evt);
            }
        });

        btnhecho.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnhecho.setText("Listo");
        btnhecho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhechoActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnNuevo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btneditar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btneditar.setText("Editar");

        btneliminar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btneliminar.setText("Eliminar");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Usuario:");

        jComboBoxUsuarioNuevo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Administrador", "Profesor", "Alumno" }));
        jComboBoxUsuarioNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxUsuarioNuevoActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel14)
                                                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                                                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNombre)
                            .addComponent(jTextFieldApellidoPaterno)
                            .addComponent(jTextFieldApellidoMaterno)
                            .addComponent(jTextFieldCalle)
                            .addComponent(jTextFieldColonia)
                            .addComponent(jTextFieldTelCasa)
                            .addComponent(jTextFieldTelMovill)
                            .addComponent(jTextFieldCorreoInstitucional)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxUsuarioNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jComboBoxgrupo, javax.swing.GroupLayout.Alignment.LEADING, 0, 130, Short.MAX_VALUE)
                                            .addComponent(jComboBoxsemestre, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnhecho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)))
                                    .addComponent(jTextFieldCorreoPersonal)
                                    .addComponent(jTextFieldContrasena))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btneditar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btneditar)
                    .addComponent(btneliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxUsuarioNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldColonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldTelCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextFieldTelMovill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextFieldCorreoInstitucional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTextFieldCorreoPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextFieldContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jComboBoxsemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnhecho))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jComboBoxgrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar))
                .addGap(59, 59, 59))
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aplicacion/image/ayuda.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Carrera");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labuser, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btncerrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanelBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(btncerrar, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labuser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(1, 1, 1)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("ghf");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldPorApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPorApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPorApellidoActionPerformed

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
         //jTextFieldNombre.transferFocus();
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jTextFieldNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreKeyPressed

        if(evt.getKeyCode() == 10){
            jTextFieldApellidoPaterno.requestFocusInWindow();
            
        }
        
    }//GEN-LAST:event_jTextFieldNombreKeyPressed

    private void jTextFieldApellidoPaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldApellidoPaternoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextFieldApellidoPaternoActionPerformed

    private void jTextFieldApellidoMaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldApellidoMaternoActionPerformed
        // TODO add your handling code here:
        //jTextFielCalle.transferFocus();
    }//GEN-LAST:event_jTextFieldApellidoMaternoActionPerformed

    private void jTextFieldCalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCalleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCalleActionPerformed

    private void jTextFieldApellidoPaternoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldApellidoPaternoKeyPressed
        if(evt.getKeyCode()==10){
            jTextFieldApellidoMaterno.requestFocusInWindow();
        }
    }//GEN-LAST:event_jTextFieldApellidoPaternoKeyPressed

    private void jTextFieldCalleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCalleKeyTyped
        // TODO add your handling code here:
        if(jTextFieldCalle.getText().length() == 50){
            evt.consume();
        }
        
    }//GEN-LAST:event_jTextFieldCalleKeyTyped

    private void jTextFieldCalleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCalleKeyPressed
        if(evt.getKeyCode()==10){
            jTextFieldColonia.requestFocusInWindow();
        }
    }//GEN-LAST:event_jTextFieldCalleKeyPressed

    private void jTextFieldApellidoMaternoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldApellidoMaternoKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==10){
            jTextFieldCalle.requestFocusInWindow();
        }
    }//GEN-LAST:event_jTextFieldApellidoMaternoKeyPressed

    private void jTextFieldPorMatriculaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPorMatriculaKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==10){
            jTextFieldPorNombre.requestFocusInWindow();
        }
    }//GEN-LAST:event_jTextFieldPorMatriculaKeyPressed

    private void jTextFieldPorNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPorNombreKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==10){
            jTextFieldPorApellido.requestFocusInWindow();
        }
    }//GEN-LAST:event_jTextFieldPorNombreKeyPressed

    private void jTextFieldPorApellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPorApellidoKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==10){
            jTextFieldPorMatricula.requestFocusInWindow();
        }
    }//GEN-LAST:event_jTextFieldPorApellidoKeyPressed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        Habilitar();
        btnCancelar.setEnabled(true);        
        jComboBoxUsuarioNuevo.requestFocusInWindow();
        //btnhecho.setEnabled(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        int mensajeConfirmacion;
        mensajeConfirmacion = JOptionPane.showConfirmDialog(null, "¿Esta seguro de cancelar?", "Confirmación", 
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        /*Limpiar();
        Deshabilitar();*/
        if (mensajeConfirmacion == JOptionPane.NO_OPTION) {
            System.out.println("No button clicked");
        } else if (mensajeConfirmacion == JOptionPane.YES_OPTION) {
            System.out.println("Yes button clicked");
            Limpiar();
            Deshabilitar();
            btnCancelar.setEnabled(false);
            btnhecho.setEnabled(false);
            jTextFieldPorMatricula.requestFocusInWindow();
        } else if (mensajeConfirmacion == JOptionPane.CLOSED_OPTION) {
            System.out.println("JOptionPane closed");
        }        
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarActionPerformed
        // TODO add your handling code here:
           
        int mensajeConfirmacion;
        mensajeConfirmacion = JOptionPane.showConfirmDialog(null, "¿Esta seguro de cerrar sesión?", "Confirmación", 
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        /*Limpiar();
        Deshabilitar();*/
        if (mensajeConfirmacion == JOptionPane.NO_OPTION) {
            System.out.println("No button clicked");
        } else if (mensajeConfirmacion == JOptionPane.YES_OPTION) {
            this.dispose();
            Login login = new Login();       
            login.setVisible(true);
        } else if (mensajeConfirmacion == JOptionPane.CLOSED_OPTION) {
            System.out.println("JOptionPane closed");
        }
    }//GEN-LAST:event_btncerrarActionPerformed

    private void btnhechoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhechoActionPerformed
        // TODO add your handling code here:
        guardarTextFildVar();   
    }//GEN-LAST:event_btnhechoActionPerformed

    private void jTextFieldContrasenaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldContrasenaFocusGained
        // TODO add your handling code here:
        btnhecho.setEnabled(true);
    }//GEN-LAST:event_jTextFieldContrasenaFocusGained

    private void jTextFieldNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNumeroKeyTyped
        // TODO add your handling code here:
        //System.out.println("Key: " + evt.getKeyChar());
        char caracter = evt.getKeyChar();
            if(((caracter < '0') || (caracter > '9')) &&(caracter != KeyEvent.VK_BACK_SPACE) || jTextFieldNumero.getText().length() == 4){
                evt.consume();
            }               
    }//GEN-LAST:event_jTextFieldNumeroKeyTyped

    private void jTextFieldColoniaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldColoniaKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==10 || evt.getKeyCode()==9){
            jTextFieldNumero.requestFocusInWindow();
        }
    }//GEN-LAST:event_jTextFieldColoniaKeyPressed

    private void jTextFieldNumeroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNumeroKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==10 || evt.getKeyCode()==9){
            jTextFieldTelCasa.requestFocusInWindow();
        }
    }//GEN-LAST:event_jTextFieldNumeroKeyPressed

    private void jTextFieldTelCasaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTelCasaKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==10 || evt.getKeyCode()==9){
            jTextFieldTelMovill.requestFocusInWindow();
        }
    }//GEN-LAST:event_jTextFieldTelCasaKeyPressed

    private void jTextFieldTelMovillKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTelMovillKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==10 || evt.getKeyCode()==9){
            jTextFieldCorreoInstitucional.requestFocusInWindow();
        }
    }//GEN-LAST:event_jTextFieldTelMovillKeyPressed

    private void jTextFieldCorreoInstitucionalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCorreoInstitucionalKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==10 || evt.getKeyCode()==9){
            jTextFieldCorreoPersonal.requestFocusInWindow();
        }
    }//GEN-LAST:event_jTextFieldCorreoInstitucionalKeyPressed

    private void jTextFieldCorreoPersonalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCorreoPersonalKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==10 || evt.getKeyCode()==9){
            jTextFieldContrasena.requestFocusInWindow();
        }
    }//GEN-LAST:event_jTextFieldCorreoPersonalKeyPressed

    private void jTextFieldContrasenaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldContrasenaKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==10 || evt.getKeyCode()==9){
            jComboBoxsemestre.requestFocusInWindow();
        }
    }//GEN-LAST:event_jTextFieldContrasenaKeyPressed

    private void jTextFieldContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldContrasenaActionPerformed

    private void jComboBoxsemestreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBoxsemestreKeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode()==10 || evt.getKeyCode()==9){
            jComboBoxgrupo.requestFocusInWindow();
        }
    }//GEN-LAST:event_jComboBoxsemestreKeyPressed

    private void jComboBoxgrupoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBoxgrupoKeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode()==10 || evt.getKeyCode()==9){
            btnhecho.requestFocusInWindow();
        }
    }//GEN-LAST:event_jComboBoxgrupoKeyPressed

    private void jTextFieldNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreKeyTyped
        // TODO add your handling code here:
        if(jTextFieldNombre.getText().length() == 50){
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldNombreKeyTyped

    private void jTextFieldMatriculaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMatriculaKeyTyped
        // TODO add your handling code here:
        if(jTextFieldMatricula.getText().length() == 7){
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldMatriculaKeyTyped

    private void jTextFieldApellidoPaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldApellidoPaternoKeyTyped
        // TODO add your handling code here:
        if(jTextFieldApellidoPaterno.getText().length() == 50){
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldApellidoPaternoKeyTyped

    private void jTextFieldApellidoMaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldApellidoMaternoKeyTyped
        // TODO add your handling code here:
        if(jTextFieldApellidoMaterno.getText().length() == 50){
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldApellidoMaternoKeyTyped

    private void jTextFieldColoniaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldColoniaKeyTyped
        // TODO add your handling code here:
        if(jTextFieldColonia.getText().length() == 50){
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldColoniaKeyTyped

    private void jTextFieldTelCasaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTelCasaKeyTyped
        // TODO add your handling code here:
        if(jTextFieldTelCasa.getText().length() == 15){
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldTelCasaKeyTyped

    private void jTextFieldTelMovillKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTelMovillKeyTyped
        // TODO add your handling code here:
        if(jTextFieldTelMovill.getText().length() == 15){
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldTelMovillKeyTyped

    private void jTextFieldCorreoInstitucionalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCorreoInstitucionalKeyTyped
        // TODO add your handling code here:
        if(jTextFieldCorreoInstitucional.getText().length() == 50){
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldCorreoInstitucionalKeyTyped

    private void jTextFieldCorreoPersonalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCorreoPersonalKeyTyped
        // TODO add your handling code here:
        if(jTextFieldCorreoPersonal.getText().length() == 50){
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldCorreoPersonalKeyTyped

    private void jTextFieldContrasenaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldContrasenaKeyTyped
        // TODO add your handling code here:
        if(jTextFieldContrasena.getText().length() == 30){
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldContrasenaKeyTyped

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
        // TODO add your handling code here:
          if(jTextFieldMatricula.getText().length() == 50){
            evt.consume();
        }
    }//GEN-LAST:event_formKeyTyped

    private void jTextFieldMatriculaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMatriculaKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == 10){
            jTextFieldNombre.requestFocusInWindow();
            
        }
    }//GEN-LAST:event_jTextFieldMatriculaKeyPressed

    private void jComboBoxTipoUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoUserActionPerformed
        // TODO add your handling code here:
        jTextFieldPorMatricula.requestFocusInWindow();
        btnLimpiar.setEnabled(true);
        String tipoUser;
        tipoUser = (String) jComboBoxTipoUser.getSelectedItem();
        if(tipoUser.equals("Administrador")){
            jLabelPorMatriula.setText("Empleado");
            jTextFieldPorMatricula.setText("ADM");
            enableBusqueda();
            disableButtons();
        }else if(tipoUser.equals("Profesor")){
            jTextFieldPorMatricula.setText("PR");
            jLabelPorMatriula.setText("Empleado");
            enableBusqueda();
            disableButtons();
            btnhorario.setEnabled(true);
            btnmaterias.setEnabled(true);
        }else if(tipoUser.equals("Alumno")){
            jTextFieldPorMatricula.setText("AL");
            enableBusqueda();
            jLabelPorMatriula.setText("Matricula");
            enableButtons();
        }
    }//GEN-LAST:event_jComboBoxTipoUserActionPerformed

    private void jComboBoxUsuarioNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxUsuarioNuevoActionPerformed
        // TODO add your handling code here:
        jTextFieldMatricula.requestFocusInWindow();
    }//GEN-LAST:event_jComboBoxUsuarioNuevoActionPerformed

    private void jTextFieldPorMatriculaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPorMatriculaKeyTyped
        // TODO add your handling code here:
        jTextFieldPorNombre.setText("");
        jTextFieldPorApellido.setText("");
        if(jTextFieldPorMatricula.getText().length() == 7){
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldPorMatriculaKeyTyped

    private void jTextFieldPorNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPorNombreKeyTyped
        // TODO add your handling code here:
        jTextFieldPorMatricula.setText("");
        jTextFieldPorApellido.setText("");
        if(jTextFieldPorNombre.getText().length() == 50){
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldPorNombreKeyTyped

    private void jTextFieldPorApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPorApellidoKeyTyped
        // TODO add your handling code here:
        jTextFieldPorNombre.setText("");
        jTextFieldPorMatricula.setText("");
        if(jTextFieldPorApellido.getText().length() == 50){
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldPorApellidoKeyTyped

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        // TODO add your handling code here:
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        // TODO add your handling code here:
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        String url = "http://soportecontrolescolar.esy.es/"; //Ingresar la url de ayuda
            try {
                Desktop.getDesktop().browse(new URI(url));
            } catch (URISyntaxException ex) {
                System.out.println("Error: " + ex.getMessage());
            } catch (IOException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        jTextFieldPorMatricula.setText("");
        jTextFieldPorNombre.setText("");
        jTextFieldPorApellido.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(AdministradorPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministradorPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministradorPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministradorPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AdministradorPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btncalificaciones;
    private javax.swing.JButton btncerrar;
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnfaltas;
    private javax.swing.JButton btnhecho;
    private javax.swing.JButton btnhorario;
    private javax.swing.JButton btnmaterias;
    private javax.swing.JComboBox jComboBoxTipoUser;
    private javax.swing.JComboBox jComboBoxUsuarioNuevo;
    private javax.swing.JComboBox jComboBoxgrupo;
    private javax.swing.JComboBox jComboBoxsemestre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelPorApellido;
    private javax.swing.JLabel jLabelPorMatriula;
    private javax.swing.JLabel jLabelPorNombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelBusqueda;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableBusquedaUser;
    private javax.swing.JTextField jTextFieldApellidoMaterno;
    private javax.swing.JTextField jTextFieldApellidoPaterno;
    private javax.swing.JTextField jTextFieldCalle;
    private javax.swing.JTextField jTextFieldColonia;
    private javax.swing.JTextField jTextFieldContrasena;
    private javax.swing.JTextField jTextFieldCorreoInstitucional;
    private javax.swing.JTextField jTextFieldCorreoPersonal;
    private javax.swing.JTextField jTextFieldMatricula;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldPorApellido;
    private javax.swing.JTextField jTextFieldPorMatricula;
    private javax.swing.JTextField jTextFieldPorNombre;
    private javax.swing.JTextField jTextFieldTelCasa;
    private javax.swing.JTextField jTextFieldTelMovill;
    private javax.swing.JLabel labuser;
    // End of variables declaration//GEN-END:variables
}
