/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.awt.Color;
import static java.awt.Color.red;
import static java.awt.SystemColor.text;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

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
        lbSegundoApellido = new javax.swing.JLabel();
        tmasculino = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lbSexo = new javax.swing.JLabel();
        txtCalle = new javax.swing.JTextField();
        lbSegundoNombre = new javax.swing.JLabel();
        txtPnombre = new javax.swing.JTextField();
        lbPrimerNombre = new javax.swing.JLabel();
        tOtro = new javax.swing.JRadioButton();
        tfemenino = new javax.swing.JRadioButton();
        txtYear = new javax.swing.JTextField();
        lbDireccion = new javax.swing.JLabel();
        lbPrimerApellido = new javax.swing.JLabel();
        txtSapellido = new javax.swing.JTextField();
        cmbLetra = new javax.swing.JComboBox();
        txtDia = new javax.swing.JTextField();
        txtSnombre = new javax.swing.JTextField();
        txtnum1 = new javax.swing.JTextField();
        lbDate = new javax.swing.JLabel();
        cmbCalle = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        txtnum2 = new javax.swing.JTextField();
        txtMes = new javax.swing.JTextField();
        lbEmail = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        lbCodigo = new javax.swing.JLabel();
        checkJueves = new javax.swing.JCheckBox();
        checkViernes = new javax.swing.JCheckBox();
        checkSabado = new javax.swing.JCheckBox();
        checkMiercoles = new javax.swing.JCheckBox();
        checkMartes = new javax.swing.JCheckBox();
        checkLunes = new javax.swing.JCheckBox();
        sliIngles = new javax.swing.JSlider();
        lbIngles = new javax.swing.JLabel();
        lbSemestre = new javax.swing.JLabel();
        spiSemestre = new javax.swing.JSpinner();
        cmbCarrera = new javax.swing.JComboBox();
        lbCarrera = new javax.swing.JLabel();
        cmdAlmacenar = new javax.swing.JButton();
        cmdCancelar = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        lbARchivo = new javax.swing.JLabel();
        txtArchivo = new javax.swing.JTextField();
        cmbTipo = new javax.swing.JComboBox();
        lbTipo = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        cmbColorLetras = new javax.swing.JComboBox();
        lbColorLetra = new javax.swing.JLabel();
        cmbColorCampo = new javax.swing.JComboBox();
        lbColorCamp = new javax.swing.JLabel();
        cmbIdioma = new javax.swing.JComboBox();
        lbIdoma = new javax.swing.JLabel();
        cmdEStablecer = new javax.swing.JButton();
        lbHorario = new javax.swing.JLabel();
        lbDatosP = new javax.swing.JLabel();
        lbDatosA = new javax.swing.JLabel();
        lbParametros = new javax.swing.JLabel();
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
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 93, -1));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 790, -1, -1));

        lbSegundoApellido.setText("Segundo Apellido");
        jPanel1.add(lbSegundoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        tmasculino.setBackground(new java.awt.Color(255, 255, 255));
        tmasculino.setText("Masculino");
        jPanel1.add(tmasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, -1, -1));

        jLabel10.setText("/");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, -1, -1));
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 93, -1));

        lbSexo.setText("Sexo");
        jPanel1.add(lbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, -1));

        txtCalle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCalleKeyTyped(evt);
            }
        });
        jPanel1.add(txtCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 27, -1));

        lbSegundoNombre.setText("Segundo Nombre");
        jPanel1.add(lbSegundoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        txtPnombre.setToolTipText("Primer nombre");
        txtPnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPnombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtPnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 93, -1));

        lbPrimerNombre.setText("Primer Nombre");
        jPanel1.add(lbPrimerNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        tOtro.setBackground(new java.awt.Color(255, 255, 255));
        tOtro.setText("Otro");
        jPanel1.add(tOtro, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, -1, -1));

        tfemenino.setBackground(new java.awt.Color(255, 255, 255));
        tfemenino.setText("Femenino");
        jPanel1.add(tfemenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, -1, -1));

        txtYear.setText("aaa");
        txtYear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtYearKeyTyped(evt);
            }
        });
        jPanel1.add(txtYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 53, -1));

        lbDireccion.setText("Dirección");
        jPanel1.add(lbDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        lbPrimerApellido.setText("Primer Apellido");
        jPanel1.add(lbPrimerApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        txtSapellido.setToolTipText("Segundo apellido");
        txtSapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSapellidoKeyTyped(evt);
            }
        });
        jPanel1.add(txtSapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 93, -1));

        cmbLetra.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L" }));
        jPanel1.add(cmbLetra, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, -1, -1));

        txtDia.setText("dd");
        txtDia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDiaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDiaKeyTyped(evt);
            }
        });
        jPanel1.add(txtDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 34, -1));

        txtSnombre.setToolTipText("Segundo nombre");
        txtSnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSnombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtSnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 93, -1));

        txtnum1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnum1KeyTyped(evt);
            }
        });
        jPanel1.add(txtnum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 27, -1));

        lbDate.setText("Fecha de nacimiento");
        jPanel1.add(lbDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        cmbCalle.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "KR", "CL", "TV" }));
        jPanel1.add(cmbCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, -1, -1));

        jLabel13.setText("-");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, -1, -1));

        txtnum2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnum2KeyTyped(evt);
            }
        });
        jPanel1.add(txtnum2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 27, -1));

        txtMes.setText("mm");
        txtMes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMesKeyTyped(evt);
            }
        });
        jPanel1.add(txtMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 31, -1));

        lbEmail.setText("Email");
        jPanel1.add(lbEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        txtApellido.setToolTipText("Primer apellido");
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 93, -1));

        lbCodigo.setText("Codigo");
        jPanel1.add(lbCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        checkJueves.setBackground(new java.awt.Color(255, 255, 255));
        checkJueves.setText("Jueves");
        jPanel1.add(checkJueves, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, -1, -1));

        checkViernes.setBackground(new java.awt.Color(255, 255, 255));
        checkViernes.setText("Viernes");
        jPanel1.add(checkViernes, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, -1, -1));

        checkSabado.setBackground(new java.awt.Color(255, 255, 255));
        checkSabado.setText("Sabado");
        jPanel1.add(checkSabado, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 340, -1, -1));

        checkMiercoles.setBackground(new java.awt.Color(255, 255, 255));
        checkMiercoles.setText("Miercoles");
        jPanel1.add(checkMiercoles, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 300, -1, -1));

        checkMartes.setBackground(new java.awt.Color(255, 255, 255));
        checkMartes.setText("Martes");
        jPanel1.add(checkMartes, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, -1, -1));

        checkLunes.setBackground(new java.awt.Color(255, 255, 255));
        checkLunes.setText("Lunes");
        checkLunes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkLunesActionPerformed(evt);
            }
        });
        jPanel1.add(checkLunes, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, -1, -1));

        sliIngles.setBackground(new java.awt.Color(255, 255, 255));
        sliIngles.setMajorTickSpacing(100);
        sliIngles.setMinorTickSpacing(10);
        sliIngles.setPaintLabels(true);
        sliIngles.setPaintTicks(true);
        sliIngles.setToolTipText("");
        jPanel1.add(sliIngles, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 221, -1));

        lbIngles.setText("Nivel de ingles");
        jPanel1.add(lbIngles, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, -1, -1));

        lbSemestre.setText("Semestre");
        jPanel1.add(lbSemestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, -1, -1));

        spiSemestre.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        spiSemestre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        spiSemestre.setRequestFocusEnabled(false);
        spiSemestre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                spiSemestreKeyTyped(evt);
            }
        });
        jPanel1.add(spiSemestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, 56, -1));

        cmbCarrera.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ingeniería Industrial", "Ingeniería Civil", "Ingeniería de Sistemas", "Ingeniería Ambiental", "Ingeniería Electronica", "Ingeniería Electrica", "Derecho", "Psciología ", "Administracíon de Empresa" }));
        jPanel1.add(cmbCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, -1, -1));

        lbCarrera.setText("Carrera");
        jPanel1.add(lbCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, -1, -1));

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
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 400, -1, -1));

        lbARchivo.setText("Archivo");
        jPanel1.add(lbARchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 120, -1, -1));
        jPanel1.add(txtArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 120, 102, -1));

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Secuencial", "Aleatorio", "Relacional" }));
        jPanel1.add(cmbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 160, 105, -1));

        lbTipo.setText("Tipo de Acceso ");
        jPanel1.add(lbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 160, -1, -1));

        jLabel21.setText("Look and Feel");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 220, -1, -1));

        cmbColorLetras.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Prederterminado", "Rojo", "Verde", "Azul", "Amarrillo", "Blanco" }));
        jPanel1.add(cmbColorLetras, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 250, -1, -1));

        lbColorLetra.setText("Color letra");
        jPanel1.add(lbColorLetra, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 250, -1, -1));

        cmbColorCampo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Prederterminado", "Rojo", "Verde", "Azul", "Amarrillo", "Negro" }));
        jPanel1.add(cmbColorCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 280, -1, -1));

        lbColorCamp.setText("Color campo");
        jPanel1.add(lbColorCamp, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 280, -1, -1));

        cmbIdioma.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Español", "Ingles", "Portugues", "Frances", "Italiano" }));
        jPanel1.add(cmbIdioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 330, -1, -1));

        lbIdoma.setText("Idioma");
        jPanel1.add(lbIdoma, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 330, -1, -1));

        cmdEStablecer.setText("Establecer");
        cmdEStablecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEStablecerActionPerformed(evt);
            }
        });
        jPanel1.add(cmdEStablecer, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 390, -1, -1));

        lbHorario.setFont(new java.awt.Font("Swis721 Ex BT", 0, 14)); // NOI18N
        lbHorario.setText("Horario");
        jPanel1.add(lbHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, -1, -1));

        lbDatosP.setFont(new java.awt.Font("Swis721 Ex BT", 0, 18)); // NOI18N
        lbDatosP.setText("Datos Personales");
        jPanel1.add(lbDatosP, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        lbDatosA.setFont(new java.awt.Font("Swis721 Ex BT", 0, 18)); // NOI18N
        lbDatosA.setText("Datos Academicos");
        jPanel1.add(lbDatosA, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, -1, -1));

        lbParametros.setFont(new java.awt.Font("Swis721 Ex BT", 0, 18)); // NOI18N
        lbParametros.setText("Parametros");
        jPanel1.add(lbParametros, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 80, -1, -1));

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
        int letra, fondo, idioma;
        letra = cmbColorLetras.getSelectedIndex();
        fondo = cmbColorCampo.getSelectedIndex();
        idioma = cmbIdioma.getSelectedIndex();
        JLabel label[] = {lbDatosP, lbCodigo, lbPrimerNombre, lbSegundoNombre, lbPrimerApellido,
            lbSegundoApellido, lbEmail, lbDireccion, lbDate, lbSexo, lbDatosA, lbCarrera, lbSemestre,
            lbIngles, lbHorario, lbParametros, lbARchivo, lbTipo, lbColorLetra, lbColorCamp, lbIdoma};
        JTextField text[] = {txtCodigo, txtPnombre, txtSnombre, txtApellido, txtSapellido, txtEmail, txtDia,
            txtMes, txtYear, txtCalle, txtnum1, txtnum2, txtArchivo};
        JComboBox combo[] = {cmbCalle, cmbCarrera, cmbColorCampo, cmbColorLetras, cmbIdioma, cmbLetra, cmbTipo};
        JButton boton[] = {cmdAlmacenar, cmdCancelar, cmdEStablecer, cmdLimpiar};
        JRadioButton radio[] = {tmasculino, tfemenino, tOtro};
        JCheckBox check[] = {checkLunes, checkMartes, checkMiercoles, checkJueves, checkViernes, checkSabado};

        switch (letra) {
            case 0:
                Helper.cambiarColorLetra(label, text, combo, boton, Color.black,check,radio);
                break;
            case 1:
                Helper.cambiarColorLetra(label, text, combo, boton, Color.red,check,radio);
                break;
            case 2:
                Helper.cambiarColorLetra(label, text, combo, boton, Color.green,check,radio);
                break;
            case 3:
                Helper.cambiarColorLetra(label, text, combo, boton, Color.blue,check,radio);
                break;
            case 4:
                Helper.cambiarColorLetra(label, text, combo, boton, Color.yellow,check,radio);
                break;
            case 5:
                Helper.cambiarColorLetra(label, text, combo, boton, Color.white,check,radio);
                break;
        }
        switch (idioma) {
            case 0:
                Helper.cambioiomaEspañol(label, boton, combo, check, radio);
                break;
            case 1:
                Helper.cambioiomaIngles(label, boton, combo, check, radio);
                break;
            case 2:
                Helper.cambioiomaPortugues(label, boton, combo, check, radio);
                break;
            case 3:
                Helper.cambioiomaFrances(label, boton, combo, check, radio);
                break;
            case 4:
                Helper.cambioiomaItaliano(label, boton, combo, check, radio);
                break;
        }
        switch (fondo) {
            case 0:
                Helper.cambioFondo(text, Color.white);
                break;
            case 1:
                Helper.cambioFondo(text, Color.red);
                break;
            case 2:
                Helper.cambioFondo(text, Color.green);
                break;
            case 3:
                Helper.cambioFondo(text, Color.blue);
                break;
            case 4:
                Helper.cambioFondo(text, Color.yellow);
                break;
            case 5:
                Helper.cambioFondo(text, Color.black);
                break;
        }

    }//GEN-LAST:event_cmdEStablecerActionPerformed

    private void cmdAlmacenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAlmacenarActionPerformed

    }//GEN-LAST:event_cmdAlmacenarActionPerformed

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar() != '.') {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtCodigoKeyTyped

    private void txtPnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPnombreKeyTyped
       char c = evt.getKeyChar();
        if (Character.isDigit(evt.getKeyChar())|| Character.isSpaceChar(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtPnombreKeyTyped

    private void txtSnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSnombreKeyTyped
       char c = evt.getKeyChar();
        if (Character.isDigit(evt.getKeyChar())|| Character.isSpaceChar(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtSnombreKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
char c = evt.getKeyChar();
        if (Character.isDigit(evt.getKeyChar())|| Character.isSpaceChar(c)) {
            getToolkit().beep();
            evt.consume();
        }        
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtSapellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSapellidoKeyTyped
char c = evt.getKeyChar();
        if (Character.isDigit(evt.getKeyChar())|| Character.isSpaceChar(c)) {
            getToolkit().beep();
            evt.consume();
        }        
    }//GEN-LAST:event_txtSapellidoKeyTyped

    private void txtCalleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCalleKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(evt.getKeyChar())) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtCalleKeyTyped

    private void txtnum1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnum1KeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(evt.getKeyChar())) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtnum1KeyTyped

    private void txtnum2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnum2KeyTyped
 char c = evt.getKeyChar();
        if (!Character.isDigit(evt.getKeyChar())) {
            getToolkit().beep();
            evt.consume();
        }        
    }//GEN-LAST:event_txtnum2KeyTyped

    private void txtDiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiaKeyTyped
         char c = evt.getKeyChar();
        if (!Character.isDigit(evt.getKeyChar())) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtDiaKeyTyped

    private void txtMesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMesKeyTyped
         char c = evt.getKeyChar();
        if (!Character.isDigit(evt.getKeyChar())) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtMesKeyTyped

    private void txtYearKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtYearKeyTyped
     char c = evt.getKeyChar();
        if (!Character.isDigit(evt.getKeyChar())) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtYearKeyTyped

    private void spiSemestreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spiSemestreKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(evt.getKeyChar())) {
            getToolkit().beep();
            evt.consume();
        }
       
    }//GEN-LAST:event_spiSemestreKeyTyped

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
     JLabel label[] = {lbDatosP, lbCodigo, lbPrimerNombre, lbSegundoNombre, lbPrimerApellido,
            lbSegundoApellido, lbEmail, lbDireccion, lbDate, lbSexo, lbDatosA, lbCarrera, lbSemestre,
            lbIngles, lbHorario, lbParametros, lbARchivo, lbTipo, lbColorLetra, lbColorCamp, lbIdoma};
        JTextField text[] = {txtCodigo, txtPnombre, txtSnombre, txtApellido, txtSapellido, txtEmail, txtDia,
            txtMes, txtYear, txtCalle, txtnum1, txtnum2, txtArchivo};
        JComboBox combo[] = {cmbCalle, cmbCarrera, cmbColorCampo, cmbColorLetras, cmbIdioma, cmbLetra, cmbTipo};
        JButton boton[] = {cmdAlmacenar, cmdCancelar, cmdEStablecer, cmdLimpiar};
        JRadioButton radio[] = {tmasculino, tfemenino, tOtro};
        JCheckBox check[] = {checkLunes, checkMartes, checkMiercoles, checkJueves, checkViernes, checkSabado};
        Helper.borrar(text,combo);
        sliIngles.setValue(50);
        spiSemestre.setValue(0);
        Helper.cambiarColorLetra(label, text, combo, boton, Color.black,check,radio);
        Helper.cambioFondo(text, Color.white);
        Helper.cambioiomaEspañol(label, boton, combo, check, radio);
        
    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void checkLunesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkLunesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkLunesActionPerformed

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
    private javax.swing.JLabel lbARchivo;
    private javax.swing.JLabel lbCarrera;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbColorCamp;
    private javax.swing.JLabel lbColorLetra;
    private javax.swing.JLabel lbDate;
    private javax.swing.JLabel lbDatosA;
    private javax.swing.JLabel lbDatosP;
    private javax.swing.JLabel lbDireccion;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbHorario;
    private javax.swing.JLabel lbIdoma;
    private javax.swing.JLabel lbIngles;
    private javax.swing.JLabel lbParametros;
    private javax.swing.JLabel lbPrimerApellido;
    private javax.swing.JLabel lbPrimerNombre;
    private javax.swing.JLabel lbSegundoApellido;
    private javax.swing.JLabel lbSegundoNombre;
    private javax.swing.JLabel lbSemestre;
    private javax.swing.JLabel lbSexo;
    private javax.swing.JLabel lbTipo;
    private javax.swing.JSlider sliIngles;
    private javax.swing.JSpinner spiSemestre;
    private javax.swing.JRadioButton tOtro;
    private javax.swing.JRadioButton tfemenino;
    private javax.swing.JRadioButton tmasculino;
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
