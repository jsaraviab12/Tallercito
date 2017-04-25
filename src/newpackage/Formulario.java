/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package newpackage;

import java.awt.Color;

/**
 *
 * @author jsaravia1
 */
public class Formulario extends javax.swing.JFrame {

    /**
     * Creates new form Formulario
     */
    public Formulario() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tSegundoApellido = new javax.swing.JLabel();
        tmasculino = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        tsexo = new javax.swing.JLabel();
        txtCalle = new javax.swing.JTextField();
        tSegundoNombre = new javax.swing.JLabel();
        txtPnombre = new javax.swing.JTextField();
        tPrimerNombre = new javax.swing.JLabel();
        tOtro = new javax.swing.JRadioButton();
        tfemenino = new javax.swing.JRadioButton();
        txtYear = new javax.swing.JTextField();
        tDireccion = new javax.swing.JLabel();
        tPrimerApellido = new javax.swing.JLabel();
        txtSapellido = new javax.swing.JTextField();
        cmbLetra = new javax.swing.JComboBox();
        txtDia = new javax.swing.JTextField();
        txtSnombre = new javax.swing.JTextField();
        txtnum1 = new javax.swing.JTextField();
        tdate = new javax.swing.JLabel();
        cmbCalle = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        txtnum2 = new javax.swing.JTextField();
        txtMes = new javax.swing.JTextField();
        tEmail = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        tCodigo = new javax.swing.JLabel();
        checkJueves = new javax.swing.JCheckBox();
        checkViernes = new javax.swing.JCheckBox();
        checkSabado = new javax.swing.JCheckBox();
        checkMiercoles = new javax.swing.JCheckBox();
        checkMartes = new javax.swing.JCheckBox();
        checkLunes = new javax.swing.JCheckBox();
        sliIngles = new javax.swing.JSlider();
        tIngles = new javax.swing.JLabel();
        tSemestre = new javax.swing.JLabel();
        spiSemestre = new javax.swing.JSpinner();
        cmbCarrera = new javax.swing.JComboBox();
        tCarrera = new javax.swing.JLabel();
        cmdAlmacenar = new javax.swing.JButton();
        cmdCancelar = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        tARchivo = new javax.swing.JLabel();
        txtArchivo = new javax.swing.JTextField();
        cmbTipo = new javax.swing.JComboBox();
        tTipo = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        cmbColorLetras = new javax.swing.JComboBox();
        tColorLetra = new javax.swing.JLabel();
        cmbColorCampo = new javax.swing.JComboBox();
        tColorCamp = new javax.swing.JLabel();
        cmbIdioma = new javax.swing.JComboBox();
        tIdoma = new javax.swing.JLabel();
        cmdEStablecer = new javax.swing.JButton();
        tHorario = new javax.swing.JLabel();
        tDatosPer = new javax.swing.JLabel();
        tDatosAca = new javax.swing.JLabel();
        tParametros = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Proceso de Matriculacion");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setEnabled(false);
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 48, 77));
        jLabel1.setText("Proceso de Matriculación");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, -1));

        txtCodigo.setToolTipText("Codigo");
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 93, -1));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 790, -1, -1));

        tSegundoApellido.setText("Segundo Apellido");
        jPanel1.add(tSegundoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        tmasculino.setBackground(new java.awt.Color(255, 255, 255));
        tmasculino.setText("Masculino");
        jPanel1.add(tmasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, -1, -1));

        jLabel10.setText("/");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, -1, -1));
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 93, -1));

        tsexo.setText("Sexo");
        jPanel1.add(tsexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, -1));
        jPanel1.add(txtCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 27, -1));

        tSegundoNombre.setText("Segundo Nombre");
        jPanel1.add(tSegundoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        txtPnombre.setToolTipText("Primer nombre");
        jPanel1.add(txtPnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 93, -1));

        tPrimerNombre.setText("Primer Nombre");
        jPanel1.add(tPrimerNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        tOtro.setBackground(new java.awt.Color(255, 255, 255));
        tOtro.setText("Otro");
        jPanel1.add(tOtro, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, -1, -1));

        tfemenino.setBackground(new java.awt.Color(255, 255, 255));
        tfemenino.setText("Femenino");
        jPanel1.add(tfemenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, -1, -1));

        txtYear.setText("aaa");
        jPanel1.add(txtYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 53, -1));

        tDireccion.setText("Dirección");
        jPanel1.add(tDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        tPrimerApellido.setText("Primer Apellido");
        jPanel1.add(tPrimerApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        txtSapellido.setToolTipText("Segundo apellido");
        jPanel1.add(txtSapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 93, -1));

        cmbLetra.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L" }));
        jPanel1.add(cmbLetra, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, -1, -1));

        txtDia.setText("dd");
        txtDia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDiaKeyPressed(evt);
            }
        });
        jPanel1.add(txtDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 34, -1));

        txtSnombre.setToolTipText("Segundo nombre");
        jPanel1.add(txtSnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 93, -1));
        jPanel1.add(txtnum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 27, -1));

        tdate.setText("Fecha de nacimiento");
        jPanel1.add(tdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        cmbCalle.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "KR", "CL", "TV" }));
        jPanel1.add(cmbCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, -1, -1));

        jLabel13.setText("-");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, -1, -1));
        jPanel1.add(txtnum2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 27, -1));

        txtMes.setText("mm");
        jPanel1.add(txtMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 31, -1));

        tEmail.setText("Email");
        jPanel1.add(tEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        txtApellido.setToolTipText("Primer apellido");
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 93, -1));

        tCodigo.setText("Codigo");
        jPanel1.add(tCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        checkJueves.setBackground(new java.awt.Color(255, 255, 255));
        checkJueves.setText("Jueves");
        jPanel1.add(checkJueves, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, -1, -1));

        checkViernes.setBackground(new java.awt.Color(255, 255, 255));
        checkViernes.setText("Viernes");
        jPanel1.add(checkViernes, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, -1, -1));

        checkSabado.setBackground(new java.awt.Color(255, 255, 255));
        checkSabado.setText("Sabado");
        jPanel1.add(checkSabado, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 340, -1, -1));

        checkMiercoles.setBackground(new java.awt.Color(255, 255, 255));
        checkMiercoles.setText("Miercoles");
        jPanel1.add(checkMiercoles, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 300, -1, -1));

        checkMartes.setBackground(new java.awt.Color(255, 255, 255));
        checkMartes.setText("Martes");
        jPanel1.add(checkMartes, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, -1, -1));

        checkLunes.setBackground(new java.awt.Color(255, 255, 255));
        checkLunes.setText("Lunes");
        jPanel1.add(checkLunes, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, -1, -1));

        sliIngles.setBackground(new java.awt.Color(255, 255, 255));
        sliIngles.setMajorTickSpacing(100);
        sliIngles.setMinorTickSpacing(10);
        sliIngles.setPaintLabels(true);
        sliIngles.setPaintTicks(true);
        sliIngles.setToolTipText("");
        jPanel1.add(sliIngles, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 221, -1));

        tIngles.setText("Nivel de ingles");
        jPanel1.add(tIngles, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, -1, -1));

        tSemestre.setText("Semestre");
        jPanel1.add(tSemestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, -1, -1));

        spiSemestre.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        spiSemestre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        spiSemestre.setRequestFocusEnabled(false);
        jPanel1.add(spiSemestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, 56, -1));

        cmbCarrera.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ingeniería Industrial", "Ingeniería Civil", "Ingeniería de Sistemas", "Ingeniería Ambiental", "Ingeniería Electronica", "Ingeniería Electrica", "Derecho", "Psciología ", "Administracíon de Empresa" }));
        jPanel1.add(cmbCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, -1, -1));

        tCarrera.setText("Carrera");
        jPanel1.add(tCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, -1, -1));

        cmdAlmacenar.setBackground(new java.awt.Color(204, 204, 204));
        cmdAlmacenar.setText("Almacenar");
        cmdAlmacenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAlmacenarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdAlmacenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 400, -1, -1));

        cmdCancelar.setBackground(new java.awt.Color(204, 204, 204));
        cmdCancelar.setText("Cancelar");
        jPanel1.add(cmdCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 400, -1, -1));

        cmdLimpiar.setBackground(new java.awt.Color(204, 204, 204));
        cmdLimpiar.setText("Limpiar");
        jPanel1.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 400, -1, -1));

        tARchivo.setText("Archivo");
        jPanel1.add(tARchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 120, -1, -1));
        jPanel1.add(txtArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 120, 102, -1));

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Secuencial", "Aleatorio", "Relacional" }));
        jPanel1.add(cmbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 160, 105, -1));

        tTipo.setText("Tipo de Acceso ");
        jPanel1.add(tTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 160, -1, -1));

        jLabel21.setText("Look and Feel");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 220, -1, -1));

        cmbColorLetras.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Prederterminado", "Rojo", "Verde", "Azul", "Amarrillo", "Blanco" }));
        jPanel1.add(cmbColorLetras, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 250, -1, -1));

        tColorLetra.setText("Color letra");
        jPanel1.add(tColorLetra, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 250, -1, -1));

        cmbColorCampo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Prederterminado", "Rojo", "Verde", "Azul", "Amarrillo", "Negro" }));
        jPanel1.add(cmbColorCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 280, -1, -1));

        tColorCamp.setText("Color campo");
        jPanel1.add(tColorCamp, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 280, -1, -1));

        cmbIdioma.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Español", "Ingles", "Portugues", "Frances", "Italiano" }));
        jPanel1.add(cmbIdioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 330, -1, -1));

        tIdoma.setText("Idioma");
        jPanel1.add(tIdoma, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 330, -1, -1));

        cmdEStablecer.setText("Establecer");
        cmdEStablecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEStablecerActionPerformed(evt);
            }
        });
        jPanel1.add(cmdEStablecer, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 390, -1, -1));

        tHorario.setFont(new java.awt.Font("Swis721 Ex BT", 0, 14)); // NOI18N
        tHorario.setText("Horario");
        jPanel1.add(tHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, -1, -1));

        tDatosPer.setFont(new java.awt.Font("Swis721 Ex BT", 0, 18)); // NOI18N
        tDatosPer.setText("Datos Personales");
        jPanel1.add(tDatosPer, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        tDatosAca.setFont(new java.awt.Font("Swis721 Ex BT", 0, 18)); // NOI18N
        tDatosAca.setText("Datos Academicos");
        jPanel1.add(tDatosAca, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, -1, -1));

        tParametros.setFont(new java.awt.Font("Swis721 Ex BT", 0, 18)); // NOI18N
        tParametros.setText("Parametros");
        jPanel1.add(tParametros, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 80, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jesus\\Documents\\NetBeansProjects\\Archivos\\src\\imagnes\\logo1-.png")); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 400, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1180, 529));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtDiaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiaKeyPressed

    }//GEN-LAST:event_txtDiaKeyPressed

    private void cmdEStablecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEStablecerActionPerformed
        int letra,fondo,idioma;
        letra = cmbColorLetras.getSelectedIndex();
        fondo = cmbColorCampo.getSelectedIndex();
        idioma = cmbIdioma.getSelectedIndex();
        switch(letra){
            case 0:
            //DAtos Personales
            tCodigo.setForeground(Color.black);
            txtCodigo.setForeground(Color.black);
            tPrimerNombre.setForeground(Color.black);
            txtPnombre.setForeground(Color.black);
            tSegundoNombre.setForeground(Color.black);
            txtSnombre.setForeground(Color.black);
            tPrimerApellido.setForeground(Color.black);
            txtApellido.setForeground(Color.black);
            tSegundoApellido.setForeground(Color.black);
            txtSapellido.setForeground(Color.black);
            tDireccion.setForeground(Color.black);
            cmbCalle.setForeground(Color.black);
            txtCalle.setForeground(Color.black);
            cmbLetra.setForeground(Color.black);
            txtnum1.setForeground(Color.black);
            txtnum2.setForeground(Color.black);
            tEmail.setForeground(Color.black);
            txtEmail.setForeground(Color.black);
            tsexo.setForeground(Color.black);
            tmasculino.setForeground(Color.black);
            tfemenino.setForeground(Color.black);
            tOtro.setForeground(Color.black);
            tdate.setForeground(Color.black);
            txtDia.setForeground(Color.black);
            txtMes.setForeground(Color.black);
            txtYear.setForeground(Color.black);
            // Datos academicos
            tCarrera.setForeground(Color.black);
            cmbCarrera.setForeground(Color.black);
            spiSemestre.setForeground(Color.black);
            tSemestre.setForeground(Color.black);
            tIngles.setForeground(Color.black);
            sliIngles.setForeground(Color.black);
            checkLunes.setForeground(Color.black);
            checkMartes.setForeground(Color.black);
            checkMiercoles.setForeground(Color.black);
            checkJueves.setForeground(Color.black);
            checkViernes.setForeground(Color.black);
            checkSabado.setForeground(Color.black);
            //Parametros
            tARchivo.setForeground(Color.black);
            txtArchivo.setForeground(Color.black);
            tTipo.setForeground(Color.black);
            cmbTipo.setForeground(Color.black);
            tColorLetra.setForeground(Color.black);
            cmbColorLetras.setForeground(Color.black);
            tColorCamp.setForeground(Color.black);
            cmbColorCampo.setForeground(Color.black);
            tIdoma.setForeground(Color.black);
            cmbIdioma.setForeground(Color.black);
            cmdEStablecer.setForeground(Color.black);

            break;
            case 1:
            //DAtos Personales
            tCodigo.setForeground(Color.red);
            txtCodigo.setForeground(Color.red);
            tPrimerNombre.setForeground(Color.red);
            txtPnombre.setForeground(Color.red);
            tSegundoNombre.setForeground(Color.red);
            txtSnombre.setForeground(Color.red);
            tPrimerApellido.setForeground(Color.red);
            txtApellido.setForeground(Color.red);
            tSegundoApellido.setForeground(Color.red);
            txtSapellido.setForeground(Color.red);
            tDireccion.setForeground(Color.red);
            cmbCalle.setForeground(Color.red);
            txtCalle.setForeground(Color.red);
            cmbLetra.setForeground(Color.red);
            txtnum1.setForeground(Color.red);
            txtnum2.setForeground(Color.red);
            tEmail.setForeground(Color.red);
            txtEmail.setForeground(Color.red);
            tsexo.setForeground(Color.red);
            tmasculino.setForeground(Color.red);
            tfemenino.setForeground(Color.red);
            tOtro.setForeground(Color.red);
            tdate.setForeground(Color.red);
            txtDia.setForeground(Color.red);
            txtMes.setForeground(Color.red);
            txtYear.setForeground(Color.red);
            // Datos academicos
            tCarrera.setForeground(Color.red);
            cmbCarrera.setForeground(Color.red);
            spiSemestre.setForeground(Color.red);
            tSemestre.setForeground(Color.red);
            tIngles.setForeground(Color.red);
            sliIngles.setForeground(Color.red);
            checkLunes.setForeground(Color.red);
            checkMartes.setForeground(Color.red);
            checkMiercoles.setForeground(Color.red);
            checkJueves.setForeground(Color.red);
            checkViernes.setForeground(Color.red);
            checkSabado.setForeground(Color.red);
            //Parametros
            tARchivo.setForeground(Color.red);
            txtArchivo.setForeground(Color.red);
            tTipo.setForeground(Color.red);
            cmbTipo.setForeground(Color.red);
            tColorLetra.setForeground(Color.red);
            cmbColorLetras.setForeground(Color.red);
            tColorCamp.setForeground(Color.red);
            cmbColorCampo.setForeground(Color.red);
            tIdoma.setForeground(Color.red);
            cmbIdioma.setForeground(Color.red);
            cmdEStablecer.setForeground(Color.red);
            break;
            case 2:
            //DAtos Personales
            tCodigo.setForeground(Color.green);
            txtCodigo.setForeground(Color.green);
            tPrimerNombre.setForeground(Color.green);
            txtPnombre.setForeground(Color.green);
            tSegundoNombre.setForeground(Color.green);
            txtSnombre.setForeground(Color.green);
            tPrimerApellido.setForeground(Color.green);
            txtApellido.setForeground(Color.green);
            tSegundoApellido.setForeground(Color.green);
            txtSapellido.setForeground(Color.green);
            tDireccion.setForeground(Color.green);
            cmbCalle.setForeground(Color.green);
            txtCalle.setForeground(Color.green);
            cmbLetra.setForeground(Color.green);
            txtnum1.setForeground(Color.green);
            txtnum2.setForeground(Color.green);
            tEmail.setForeground(Color.green);
            txtEmail.setForeground(Color.green);
            tsexo.setForeground(Color.green);
            tmasculino.setForeground(Color.green);
            tfemenino.setForeground(Color.green);
            tOtro.setForeground(Color.green);
            tdate.setForeground(Color.green);
            txtDia.setForeground(Color.green);
            txtMes.setForeground(Color.green);
            txtYear.setForeground(Color.green);
            // Datos academicos
            tCarrera.setForeground(Color.green);
            cmbCarrera.setForeground(Color.green);
            spiSemestre.setForeground(Color.green);
            tSemestre.setForeground(Color.green);
            tIngles.setForeground(Color.green);
            sliIngles.setForeground(Color.green);
            checkLunes.setForeground(Color.green);
            checkMartes.setForeground(Color.green);
            checkMiercoles.setForeground(Color.green);
            checkJueves.setForeground(Color.green);
            checkViernes.setForeground(Color.green);
            checkSabado.setForeground(Color.green);
            //Parametros
            tARchivo.setForeground(Color.green);
            txtArchivo.setForeground(Color.green);
            tTipo.setForeground(Color.green);
            cmbTipo.setForeground(Color.green);
            tColorLetra.setForeground(Color.green);
            cmbColorLetras.setForeground(Color.green);
            tColorCamp.setForeground(Color.green);
            cmbColorCampo.setForeground(Color.green);
            tIdoma.setForeground(Color.green);
            cmbIdioma.setForeground(Color.green);
            cmdEStablecer.setForeground(Color.green);
            break;
            case 3:      //DAtos Personales
            tCodigo.setForeground(Color.BLUE);
            txtCodigo.setForeground(Color.blue);
            tPrimerNombre.setForeground(Color.blue);
            txtPnombre.setForeground(Color.blue);
            tSegundoNombre.setForeground(Color.blue);
            txtSnombre.setForeground(Color.blue);
            tPrimerApellido.setForeground(Color.blue);
            txtApellido.setForeground(Color.blue);
            tSegundoApellido.setForeground(Color.blue);
            txtSapellido.setForeground(Color.blue);
            tDireccion.setForeground(Color.blue);
            cmbCalle.setForeground(Color.blue);
            txtCalle.setForeground(Color.blue);
            cmbLetra.setForeground(Color.blue);
            txtnum1.setForeground(Color.blue);
            txtnum2.setForeground(Color.blue);
            tEmail.setForeground(Color.blue);
            txtEmail.setForeground(Color.blue);
            tsexo.setForeground(Color.blue);
            tmasculino.setForeground(Color.blue);
            tfemenino.setForeground(Color.blue);
            tOtro.setForeground(Color.blue);
            tdate.setForeground(Color.blue);
            txtDia.setForeground(Color.blue);
            txtMes.setForeground(Color.blue);
            txtYear.setForeground(Color.blue);
            // Datos academicos
            tCarrera.setForeground(Color.blue);
            cmbCarrera.setForeground(Color.blue);
            spiSemestre.setForeground(Color.blue);
            tSemestre.setForeground(Color.blue);
            tIngles.setForeground(Color.blue);
            sliIngles.setForeground(Color.blue);
            checkLunes.setForeground(Color.blue);
            checkMartes.setForeground(Color.blue);
            checkMiercoles.setForeground(Color.blue);
            checkJueves.setForeground(Color.blue);
            checkViernes.setForeground(Color.blue);
            checkSabado.setForeground(Color.blue);
            //Parametros
            tARchivo.setForeground(Color.blue);
            txtArchivo.setForeground(Color.blue);
            tTipo.setForeground(Color.blue);
            cmbTipo.setForeground(Color.blue);
            tColorLetra.setForeground(Color.blue);
            cmbColorLetras.setForeground(Color.blue);
            tColorCamp.setForeground(Color.blue);
            cmbColorCampo.setForeground(Color.blue);
            tIdoma.setForeground(Color.blue);
            cmbIdioma.setForeground(Color.blue);
            cmdEStablecer.setForeground(Color.blue);
            break;
            case 4:
            //DAtos Personales
            tCodigo.setForeground(Color.yellow);
            txtCodigo.setForeground(Color.yellow);
            tPrimerNombre.setForeground(Color.yellow);
            txtPnombre.setForeground(Color.yellow);
            tSegundoNombre.setForeground(Color.yellow);
            txtSnombre.setForeground(Color.yellow);
            tPrimerApellido.setForeground(Color.yellow);
            txtApellido.setForeground(Color.yellow);
            tSegundoApellido.setForeground(Color.yellow);
            txtSapellido.setForeground(Color.yellow);
            tDireccion.setForeground(Color.yellow);
            cmbCalle.setForeground(Color.yellow);
            txtCalle.setForeground(Color.yellow);
            cmbLetra.setForeground(Color.yellow);
            txtnum1.setForeground(Color.yellow);
            txtnum2.setForeground(Color.yellow);
            tEmail.setForeground(Color.yellow);
            txtEmail.setForeground(Color.yellow);
            tsexo.setForeground(Color.yellow);
            tmasculino.setForeground(Color.yellow);
            tfemenino.setForeground(Color.yellow);
            tOtro.setForeground(Color.yellow);
            tdate.setForeground(Color.yellow);
            txtDia.setForeground(Color.yellow);
            txtMes.setForeground(Color.yellow);
            txtYear.setForeground(Color.yellow);
            // Datos academicos
            tCarrera.setForeground(Color.yellow);
            cmbCarrera.setForeground(Color.yellow);
            spiSemestre.setForeground(Color.yellow);
            tSemestre.setForeground(Color.yellow);
            tIngles.setForeground(Color.yellow);
            sliIngles.setForeground(Color.yellow);
            checkLunes.setForeground(Color.yellow);
            checkMartes.setForeground(Color.yellow);
            checkMiercoles.setForeground(Color.yellow);
            checkJueves.setForeground(Color.yellow);
            checkViernes.setForeground(Color.yellow);
            checkSabado.setForeground(Color.yellow);
            //Parametros
            tARchivo.setForeground(Color.yellow);
            txtArchivo.setForeground(Color.yellow);
            tTipo.setForeground(Color.yellow);
            cmbTipo.setForeground(Color.yellow);
            tColorLetra.setForeground(Color.yellow);
            cmbColorLetras.setForeground(Color.yellow);
            tColorCamp.setForeground(Color.yellow);
            cmbColorCampo.setForeground(Color.yellow);
            tIdoma.setForeground(Color.yellow);
            cmbIdioma.setForeground(Color.yellow);
            cmdEStablecer.setForeground(Color.yellow);
            break;
            case 5:
            //DAtos Personales
            tCodigo.setForeground(Color.white);
            txtCodigo.setForeground(Color.white);
            tPrimerNombre.setForeground(Color.white);
            txtPnombre.setForeground(Color.white);
            tSegundoNombre.setForeground(Color.white);
            txtSnombre.setForeground(Color.white);
            tPrimerApellido.setForeground(Color.white);
            txtApellido.setForeground(Color.white);
            tSegundoApellido.setForeground(Color.white);
            txtSapellido.setForeground(Color.white);
            tDireccion.setForeground(Color.white);
            cmbCalle.setForeground(Color.white);
            txtCalle.setForeground(Color.white);
            cmbLetra.setForeground(Color.white);
            txtnum1.setForeground(Color.white);
            txtnum2.setForeground(Color.white);
            tEmail.setForeground(Color.white);
            txtEmail.setForeground(Color.white);
            tsexo.setForeground(Color.white);
            tmasculino.setForeground(Color.white);
            tfemenino.setForeground(Color.white);
            tOtro.setForeground(Color.white);
            tdate.setForeground(Color.white);
            txtDia.setForeground(Color.white);
            txtMes.setForeground(Color.white);
            txtYear.setForeground(Color.white);
            // Datos academicos
            tCarrera.setForeground(Color.white);
            cmbCarrera.setForeground(Color.white);
            spiSemestre.setForeground(Color.white);
            tSemestre.setForeground(Color.white);
            tIngles.setForeground(Color.white);
            sliIngles.setForeground(Color.white);
            checkLunes.setForeground(Color.white);
            checkMartes.setForeground(Color.white);
            checkMiercoles.setForeground(Color.white);
            checkJueves.setForeground(Color.white);
            checkViernes.setForeground(Color.white);
            checkSabado.setForeground(Color.white);
            //Parametros
            tARchivo.setForeground(Color.white);
            txtArchivo.setForeground(Color.white);
            tTipo.setForeground(Color.white);
            cmbTipo.setForeground(Color.white);
            tColorLetra.setForeground(Color.white);
            cmbColorLetras.setForeground(Color.white);
            tColorCamp.setForeground(Color.white);
            cmbColorCampo.setForeground(Color.white);
            tIdoma.setForeground(Color.white);
            cmbIdioma.setForeground(Color.white);
            cmdEStablecer.setForeground(Color.white);
        }
        switch(fondo){
            case 0:
            txtCodigo.setBackground(Color.white);
            txtPnombre.setBackground(Color.white);
            txtSnombre.setBackground(Color.white);
            txtApellido.setBackground(Color.white);
            txtSapellido.setBackground(Color.white);
            txtEmail.setBackground(Color.white);
            txtDia.setBackground(Color.white);
            txtMes.setBackground(Color.white);
            txtYear.setBackground(Color.white);
            txtnum1.setBackground(Color.white);
            txtnum2.setBackground(Color.white);
            txtArchivo.setBackground(Color.white);
            break;
            case 1:
            txtCodigo.setBackground(Color.red);
            txtPnombre.setBackground(Color.red);
            txtSnombre.setBackground(Color.red);
            txtApellido.setBackground(Color.red);
            txtSapellido.setBackground(Color.red);
            txtEmail.setBackground(Color.red);
            txtDia.setBackground(Color.red);
            txtMes.setBackground(Color.red);
            txtYear.setBackground(Color.red);
            txtnum1.setBackground(Color.red);
            txtnum2.setBackground(Color.red);
            txtArchivo.setBackground(Color.red);
            break;
            case 2:
            txtCodigo.setBackground(Color.green);
            txtPnombre.setBackground(Color.green);
            txtSnombre.setBackground(Color.green);
            txtApellido.setBackground(Color.green);
            txtSapellido.setBackground(Color.green);
            txtEmail.setBackground(Color.green);
            txtDia.setBackground(Color.green);
            txtMes.setBackground(Color.green);
            txtYear.setBackground(Color.green);
            txtnum1.setBackground(Color.green);
            txtnum2.setBackground(Color.green);
            txtArchivo.setBackground(Color.green);
            case 3:
            txtCodigo.setBackground(Color.blue);
            txtPnombre.setBackground(Color.blue);
            txtSnombre.setBackground(Color.blue);
            txtApellido.setBackground(Color.blue);
            txtSapellido.setBackground(Color.blue);
            txtEmail.setBackground(Color.blue);
            txtDia.setBackground(Color.blue);
            txtMes.setBackground(Color.blue);
            txtYear.setBackground(Color.blue);
            txtnum1.setBackground(Color.blue);
            txtnum2.setBackground(Color.blue);
            txtArchivo.setBackground(Color.blue);
            break;
            case 4:
            txtCodigo.setBackground(Color.yellow);
            txtPnombre.setBackground(Color.yellow);
            txtSnombre.setBackground(Color.yellow);
            txtApellido.setBackground(Color.yellow);
            txtSapellido.setBackground(Color.yellow);
            txtEmail.setBackground(Color.yellow);
            txtDia.setBackground(Color.yellow);
            txtMes.setBackground(Color.yellow);
            txtYear.setBackground(Color.yellow);
            txtnum1.setBackground(Color.yellow);
            txtnum2.setBackground(Color.yellow);
            txtArchivo.setBackground(Color.yellow);
            break;
            case 5:
            txtCodigo.setBackground(Color.black);
            txtPnombre.setBackground(Color.black);
            txtSnombre.setBackground(Color.black);
            txtApellido.setBackground(Color.black);
            txtSapellido.setBackground(Color.black);
            txtEmail.setBackground(Color.black);
            txtDia.setBackground(Color.black);
            txtMes.setBackground(Color.black);
            txtYear.setBackground(Color.black);
            txtnum1.setBackground(Color.black);
            txtnum2.setBackground(Color.black);
            txtArchivo.setBackground(Color.black);
            break;
        }
        switch (idioma){
            case 0:
            tDatosPer.setText("Datos Personales");
            tCodigo.setText("Codigo");
            tPrimerNombre.setText("Primer nombre");
            tSegundoNombre.setText("Segundo nombre");
            tPrimerApellido.setText("Primer Apellido");
            tSegundoApellido.setText("Segundo Apellido");
            tDireccion.setText("Direccion");
            tEmail.setText("Correo Electronico");
            tsexo.setText("Sexo");
            tmasculino.setText("Masculino");
            tfemenino.setText("Femenino");
            tOtro.setText("Otro");
            tdate.setText("Fecha de nacimineto");
            tDatosAca.setText("Datos Academicos");
            tCarrera.setText("Carrera");
            tSemestre.setText("Semestre");
            tIngles.setText("Nivel de ingles");
            tHorario.setText("Horio");
            checkLunes.setText("Lunes");
            checkMartes.setText("Martes");
            checkMiercoles.setText("Miercoles");
            checkJueves.setText("Jueves");
            checkViernes.setText("Viernes");
            checkSabado.setText("Sabados");
            tParametros.setText("Parametros");
            tARchivo.setText("Archivos");
            tTipo.setText("Tipo de Acceso");
            tIdoma.setText("Idioma");
            tColorCamp.setText("Color de campos");
            tColorLetra.setText("Color de letras");
            cmdAlmacenar.setText("Guardar");
            cmdEStablecer.setText("Aceptar");
            cmdCancelar.setText("Cancelar");
            cmdLimpiar.setText("Limpiar");
            break;
            case 1:
             tDatosPer.setText("Personal information");
            tCodigo.setText("Code");
            tPrimerNombre.setText("First Name");
            tSegundoNombre.setText("Second Name");
            tPrimerApellido.setText("First Surname");
            tSegundoApellido.setText("Second Surname");
            tDireccion.setText("Address");
            tEmail.setText("Email");
            tsexo.setText("Gender");
            tmasculino.setText("Male");
            tfemenino.setText("Female");
            tOtro.setText("Other");
            tdate.setText("Birthdate");
            tDatosAca.setText("Academic Data");
            tCarrera.setText("Career");
            tSemestre.setText("Semester");
            tIngles.setText("English level");
            tHorario.setText("Schedule");
            checkLunes.setText("Monday");
            checkMartes.setText("Tuesday");
            checkMiercoles.setText("wednesday");
            checkJueves.setText("Thursday");
            checkViernes.setText("Friday");
            checkSabado.setText("Saturday");
            tParametros.setText("Settings");
            tARchivo.setText("Files");
            tTipo.setText("Access Type");
            tIdoma.setText("Language");
            tColorCamp.setText("Background");
            tColorLetra.setText("Color text"); 
            cmdAlmacenar.setText("Save");
            cmdEStablecer.setText("Accept");
            cmdCancelar.setText("Cancel");
            cmdLimpiar.setText("Clean");
            break;
            case 2:
                 tDatosPer.setText("Informação pessoal");
            tCodigo.setText("Código");
            tPrimerNombre.setText("Primeiro nome");
            tSegundoNombre.setText("Segundo nome");
            tPrimerApellido.setText("Primeiro sobrenome");
            tSegundoApellido.setText("Segundo Sobrenome");
            tDireccion.setText("Endereço");
            tEmail.setText("O email");
            tsexo.setText("Gênero");
            tmasculino.setText("Masculino");
            tfemenino.setText("Fêmea");
            tOtro.setText("De outros");
            tdate.setText("Data de nascimento");
            tDatosAca.setText("Dados acadêmicos");
            tCarrera.setText("Carreira");
            tSemestre.setText("Semestre");
            tIngles.setText("nível de inglês");
            tHorario.setText("Cronograma");
            checkLunes.setText("segunda-feira");
            checkMartes.setText("terça-feira");
            checkMiercoles.setText("quarta-feira");
            checkJueves.setText("quinta-feira");
            checkViernes.setText("sexta-feira");
            checkSabado.setText("sábado");
            tParametros.setText("Configurações");
            tARchivo.setText("Arquivos");
            tTipo.setText("Tipo de Acesso");
            tIdoma.setText("Língua");
            tColorCamp.setText("fundo");
            tColorLetra.setText("Texto em cores");
            cmdAlmacenar.setText("Salve ");
            cmdEStablecer.setText("Aceitar");
            cmdCancelar.setText("Cancelar");
            cmdLimpiar.setText("Limpar");
            break;
            case 3:
            tDatosPer.setText("Informations personnelles");
            tCodigo.setText("Code");
            tPrimerNombre.setText("Prénom");
            tSegundoNombre.setText("Nom de famille");
            tPrimerApellido.setText("Premier nom de famille");
            tSegundoApellido.setText("Deuxième nom de famille");
            tDireccion.setText("Address");
            tEmail.setText("Email");
            tsexo.setText("Le genre");
            tmasculino.setText("Mâle");
            tfemenino.setText("Femelle");
            tOtro.setText("Autre");
            tdate.setText("Date de naissance");
            tDatosAca.setText("Données académiques");
            tCarrera.setText("Carrière");
            tSemestre.setText("Semester");
            tIngles.setText("niveau d'anglais");
            tHorario.setText("Programme");
            checkLunes.setText("Lundi");
            checkMartes.setText("Mardi");
            checkMiercoles.setText("Mercredi");
            checkJueves.setText("Jeudi");
            checkViernes.setText("Vendredi");
            checkSabado.setText("Samedi");
            tParametros.setText("Paramètres");
            tARchivo.setText("Des dossiers");
            tTipo.setText("Type d'accès");
            tIdoma.setText("La langue");
            tColorCamp.setText("Contexte");
            tColorLetra.setText("Texte en couleur"); 
            cmdAlmacenar.setText("Sauvegarder");
            cmdEStablecer.setText("Acceptez");
            cmdCancelar.setText("Annuler");
            cmdLimpiar.setText("Nettoyer");
            break;
            case 4:
                 tDatosPer.setText("Informazione personale");
            tCodigo.setText("Codice");
            tPrimerNombre.setText("Nome di battesimo");
            tSegundoNombre.setText("Secondo nome");
            tPrimerApellido.setText("Primo cognome");
            tSegundoApellido.setText("Secondo cognome");
            tDireccion.setText("Indirizzo");
            tEmail.setText("E-mail");
            tsexo.setText("Genere");
            tmasculino.setText("Maschio");
            tfemenino.setText("Femmina");
            tOtro.setText("Altro");
            tdate.setText("Data di nascita");
            tDatosAca.setText("Dati accademici");
            tCarrera.setText("Carriera");
            tSemestre.setText("Semestre");
            tIngles.setText("livello d'inglese");
            tHorario.setText("Programma");
            checkLunes.setText("Lunedi");
            checkMartes.setText("Martedì");
            checkMiercoles.setText("Mercoledì");
            checkJueves.setText("Giovedi");
            checkViernes.setText("Venerdì");
            checkSabado.setText("Sabato");
            tParametros.setText("Impostazioni");
            tARchivo.setText("File");
            tTipo.setText("Tipo di accesso");
            tIdoma.setText("Lingua");
            tColorCamp.setText("Sfondo");
            tColorLetra.setText("Testo a colori"); 
            cmdAlmacenar.setText("Salvare");
            cmdEStablecer.setText("Accettare");
            cmdCancelar.setText("Annulla");
            cmdLimpiar.setText("Pulito");
            break;
                
        }
    }//GEN-LAST:event_cmdEStablecerActionPerformed

    private void cmdAlmacenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAlmacenarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdAlmacenarActionPerformed

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
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checkJueves;
    private javax.swing.JCheckBox checkLunes;
    private javax.swing.JCheckBox checkMartes;
    private javax.swing.JCheckBox checkMiercoles;
    private javax.swing.JCheckBox checkSabado;
    private javax.swing.JCheckBox checkViernes;
    private javax.swing.JComboBox cmbCalle;
    private javax.swing.JComboBox cmbCarrera;
    private javax.swing.JComboBox cmbColorCampo;
    private javax.swing.JComboBox cmbColorLetras;
    private javax.swing.JComboBox cmbIdioma;
    private javax.swing.JComboBox cmbLetra;
    private javax.swing.JComboBox cmbTipo;
    private javax.swing.JButton cmdAlmacenar;
    private javax.swing.JButton cmdCancelar;
    private javax.swing.JButton cmdEStablecer;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSlider sliIngles;
    private javax.swing.JSpinner spiSemestre;
    private javax.swing.JLabel tARchivo;
    private javax.swing.JLabel tCarrera;
    private javax.swing.JLabel tCodigo;
    private javax.swing.JLabel tColorCamp;
    private javax.swing.JLabel tColorLetra;
    private javax.swing.JLabel tDatosAca;
    private javax.swing.JLabel tDatosPer;
    private javax.swing.JLabel tDireccion;
    private javax.swing.JLabel tEmail;
    private javax.swing.JLabel tHorario;
    private javax.swing.JLabel tIdoma;
    private javax.swing.JLabel tIngles;
    private javax.swing.JRadioButton tOtro;
    private javax.swing.JLabel tParametros;
    private javax.swing.JLabel tPrimerApellido;
    private javax.swing.JLabel tPrimerNombre;
    private javax.swing.JLabel tSegundoApellido;
    private javax.swing.JLabel tSegundoNombre;
    private javax.swing.JLabel tSemestre;
    private javax.swing.JLabel tTipo;
    private javax.swing.JLabel tdate;
    private javax.swing.JRadioButton tfemenino;
    private javax.swing.JRadioButton tmasculino;
    private javax.swing.JLabel tsexo;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtArchivo;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMes;
    private javax.swing.JTextField txtPnombre;
    private javax.swing.JTextField txtSapellido;
    private javax.swing.JTextField txtSnombre;
    private javax.swing.JTextField txtYear;
    private javax.swing.JTextField txtnum1;
    private javax.swing.JTextField txtnum2;
    // End of variables declaration//GEN-END:variables
}
