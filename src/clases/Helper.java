/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import static com.sun.javafx.tk.Toolkit.getToolkit;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.util.regex.Matcher;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;

/**
 *
 * @author Jesus
 */
public class Helper {
 private static RandomAccessFile flujo;
    private static int numeroRegistros;
    private static int tamañoRegistro = 400;
    
    

    public static void cambiarColorLetra(JLabel label[], JTextField text[], JComboBox combo[], JButton boton[], Color color, JCheckBox check[], JRadioButton radio[]) {
        if (color == Color.black) {
            for (int i = 0; i < label.length; i++) {
                for (int j = 0; j < text.length; j++) {

                    for (int k = 0; k < combo.length; k++) {

                        for (int l = 0; l < boton.length; l++) {
                            for (int m = 0; m < check.length; m++) {
                                for (int n = 0; n < radio.length; n++) {
                                    label[i].setForeground(color);
                                    text[j].setForeground(color);
                                    combo[k].setForeground(color);
                                    boton[l].setForeground(color);
                                    check[m].setForeground(color);
                                    radio[n].setForeground(color);
                                }
                            }
                        }
                    }
                }
            }
        } else if (color == Color.red) {
            for (int i = 0; i < label.length; i++) {
                for (int j = 0; j < text.length; j++) {

                    for (int k = 0; k < combo.length; k++) {

                        for (int l = 0; l < boton.length; l++) {
                            for (int m = 0; m < check.length; m++) {
                                for (int n = 0; n < radio.length; n++) {
                                    label[i].setForeground(color);
                                    text[j].setForeground(color);
                                    combo[k].setForeground(color);
                                    boton[l].setForeground(color);
                                    check[m].setForeground(color);
                                    radio[n].setForeground(color);
                                }
                            }
                        }
                    }
                }
            }
        } else if (color == Color.green) {
            for (int i = 0; i < label.length; i++) {
                for (int j = 0; j < text.length; j++) {

                    for (int k = 0; k < combo.length; k++) {

                        for (int l = 0; l < boton.length; l++) {
                            for (int m = 0; m < check.length; m++) {
                                for (int n = 0; n < radio.length; n++) {
                                    label[i].setForeground(color);
                                    text[j].setForeground(color);
                                    combo[k].setForeground(color);
                                    boton[l].setForeground(color);
                                    check[m].setForeground(color);
                                    radio[n].setForeground(color);
                                }
                            }
                        }
                    }
                }
            }
        } else if (color == Color.blue) {
            for (int i = 0; i < label.length; i++) {
                for (int j = 0; j < text.length; j++) {

                    for (int k = 0; k < combo.length; k++) {

                        for (int l = 0; l < boton.length; l++) {
                            for (int m = 0; m < check.length; m++) {
                                for (int n = 0; n < radio.length; n++) {
                                    label[i].setForeground(color);
                                    text[j].setForeground(color);
                                    combo[k].setForeground(color);
                                    boton[l].setForeground(color);
                                    check[m].setForeground(color);
                                    radio[n].setForeground(color);
                                }
                            }
                        }
                    }
                }
            }
        } else if (color == Color.yellow) {
            for (int i = 0; i < label.length; i++) {
                for (int j = 0; j < text.length; j++) {

                    for (int k = 0; k < combo.length; k++) {

                        for (int l = 0; l < boton.length; l++) {
                            for (int m = 0; m < check.length; m++) {
                                for (int n = 0; n < radio.length; n++) {
                                    label[i].setForeground(color);
                                    text[j].setForeground(color);
                                    combo[k].setForeground(color);
                                    boton[l].setForeground(color);
                                    check[m].setForeground(color);
                                    radio[n].setForeground(color);
                                }
                            }
                        }
                    }
                }
            }
        } else if (color == Color.white) {
            for (int i = 0; i < label.length; i++) {
                for (int j = 0; j < text.length; j++) {

                    for (int k = 0; k < combo.length; k++) {

                        for (int l = 0; l < boton.length; l++) {
                            for (int m = 0; m < check.length; m++) {
                                for (int n = 0; n < radio.length; n++) {
                                    label[i].setForeground(color);
                                    text[j].setForeground(color);
                                    combo[k].setForeground(color);
                                    boton[l].setForeground(color);
                                    check[m].setForeground(color);
                                    radio[n].setForeground(color);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void cambioiomaIngles(JLabel label[], JButton boton[], JComboBox combo[], JCheckBox check[], JRadioButton radio[]) {
        String lIngles[] = {"Personal information", "Code", "First Name", "Second Name", "First Surname", "Second Surname", "Email", "Address", "Birthdate", "Gender", "Academic data",
            "Career", "Semester", "English level", "Schedule", "Settings", "Files", "Access Type", "ColorText", "Background", "Language", "Look and feels", "Options"};
        String bIngles[] = {"Save", "Cancel", "Accept", "Clean"};
        String checkIngles[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        String radioI[] = {"Male", "Female", "Other"};
        String cmb1I[] = {"Sequential", "Ramdom", "Relational"};
        String cmb2[] = {"Predetermined", "Red", "Green", "Blue", "Yellow", "White"};
        String cmb3[] = {"Predetermined", "Red", "Green", "Blue", "Yellow", "Black"};
        String cmb4[] = {"Industrial engineering", "Civil  engineering", "Systems engineering", "Environmental engineering", "Law", "Psychology"};
        String cmb5[] = {"Spanish", "English", "Portugues", "French", "Italian"};
        for (int i = 0; i < label.length; i++) {
            for (int j = 0; j < lIngles.length; j++) {
                label[i].setText(lIngles[i]);
            }
        }
        for (int i = 0; i < boton.length; i++) {
            for (int j = 0; j < bIngles.length; j++) {
                boton[i].setText(bIngles[i]);
            }

        }
        for (int i = 0; i < check.length; i++) {
            for (int j = 0; j < checkIngles.length; j++) {
                check[i].setText(checkIngles[i]);
            }

        }
        for (int i = 0; i < radio.length; i++) {
            for (int j = 0; j < radioI.length; j++) {
                radio[i].setText(radioI[i]);
            }

        }
        for (int i = 0; i < combo.length; i++) {
            Helper.crearCombo(cmb1I, combo[6]);
            Helper.crearCombo(cmb2, combo[3]);
            Helper.crearCombo(cmb3, combo[2]);
            Helper.crearCombo(cmb4, combo[1]);
            Helper.crearCombo(cmb5, combo[4]);

        }
    }

    public static void cambioiomaEspañol(JLabel label[], JButton boton[], JComboBox combo[], JCheckBox check[], JRadioButton radio[]) {
        String l[] = {"Informacion personal", "Codigo", "Primer nombre", "Segundo nombre", "Primer Apellido", "Segundo apellido", "Correo Electronico", "Direccion", "Fecha de nacimineto",
            "Sexo", "Informacion Academica", "Carrera", "Semestre", "Nivel Ingles", "Horario", "Parametros", "Archivos", "Tipo de acceso", "Color de texto", "Color de fondo", "Idioma", "Aspecto", "Opciones"};
        String b[] = {"Guardar", "Cancelar", "Aceptar", "Limpiar"};
        String c[] = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};
        String r[] = {"Masculino", "Femenino", "Otro"};
        String cmb1I[] = {"Sequential", "Aleatorio", "Relacional"};
        String cmb2[] = {"Predeterminado", "Rojo", "Verde", "Azul", "Amarillo", "Blanco"};
        String cmb3[] = {"Predeterminado", "Rojo", "Verde", "Azul", "Amarillo", "Negro"};
        String cmb4[] = {"Ingeniería industrial", "Ingeniería civil", "Ingeniería de sistemas", "Ingeniería ambiental", "Derecho", "Psicología"};
        String cmb5[] = {"Español", "Ingles", "Portugues", "Frances", "Italiano"};
        for (int i = 0; i < label.length; i++) {
            for (int j = 0; j < l.length; j++) {
                label[i].setText(l[i]);
            }
        }
        for (int i = 0; i < boton.length; i++) {
            for (int j = 0; j < b.length; j++) {
                boton[i].setText(b[i]);
            }

        }
        for (int i = 0; i < check.length; i++) {
            for (int j = 0; j < c.length; j++) {
                check[i].setText(c[i]);
            }

        }
        for (int i = 0; i < radio.length; i++) {
            for (int j = 0; j < r.length; j++) {
                radio[i].setText(r[i]);
            }

        }
        for (int i = 0; i < combo.length; i++) {
            Helper.crearCombo(cmb1I, combo[6]);
            Helper.crearCombo(cmb2, combo[3]);
            Helper.crearCombo(cmb3, combo[2]);
            Helper.crearCombo(cmb4, combo[1]);
            Helper.crearCombo(cmb5, combo[4]);

        }
    }

    public static void cambioiomaPortugues(JLabel label[], JButton boton[], JComboBox combo[], JCheckBox check[], JRadioButton radio[]) {
        String l[] = {"Informação pessoal", "Código", "Primeiro nome", "Segundo nome", "Primeiro sobrenome", "Segundo Sobrenome", "O email", "Endereço", "Data de nascimento",
            "Gênero", "Dados acadêmicos", "Carreira", "Semestre", "Nível de inglês", "Cronograma", "Configurações", "Arquivos", "Tipo de Acesso", "Texto em cores", "fundo", "Língua", "aparência", "Opções"};
        String b[] = {"Salve", "Cancelar", "Aceitar", "Limpar"};
        String c[] = {"Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado"};
        String r[] = {"Masculino", "Fêmea", "De outros"};
        String cmb1I[] = {"Seqüencial", "Aleatória", "Relacional"};
        String cmb2[] = {"Predeterminado", "Vermelho", "Verde", "Azul", "Amarelo", "Branco"};
        String cmb3[] = {"Predeterminado", "Vermelho", "Verde", "Azul", "Amarelo", "Preto"};
        String cmb4[] = {"Engenharia industrial", "Engenharia civil", "Engenharia de sistemas", "Engenharia ambiental", "Direito", "Psicologia"};
        String cmb5[] = {"Espanhol", "Inglês", "Portugues", "Francês", "Italiano"};

        for (int i = 0; i < label.length; i++) {
            for (int j = 0; j < l.length; j++) {
                label[i].setText(l[i]);
            }
        }
        for (int i = 0; i < boton.length; i++) {
            for (int j = 0; j < b.length; j++) {
                boton[i].setText(b[i]);
            }

        }
        for (int i = 0; i < check.length; i++) {
            for (int j = 0; j < c.length; j++) {
                check[i].setText(c[i]);
            }

        }
        for (int i = 0; i < radio.length; i++) {
            for (int j = 0; j < r.length; j++) {
                radio[i].setText(r[i]);
            }

        }
        for (int i = 0; i < combo.length; i++) {
            Helper.crearCombo(cmb1I, combo[6]);
            Helper.crearCombo(cmb2, combo[3]);
            Helper.crearCombo(cmb3, combo[2]);
            Helper.crearCombo(cmb4, combo[1]);
            Helper.crearCombo(cmb5, combo[4]);

        }
    }

    public static void cambioiomaFrances(JLabel label[], JButton boton[], JComboBox combo[], JCheckBox check[], JRadioButton radio[]) {
        String l[] = {"Informations personnelles", "Code", "Prénom", "Nom de famille", "Premier nom de famille", "Deuxième nom de famille", "Email", "Address", "Date de naissance",
            "Le genre", "Données académiques", "Carrière", "Semester", "niveau d'anglais", "Programme", "Paramètres", "Des dossiers", "Type d'accès", "Texte en couleur", "Contexte", "La langue", "Apparence", "Options"};
        String b[] = {"Sauvegarder", "Annuler", "Acceptez", "Nettoyer"};
        String c[] = {"Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi"};
        String r[] = {"Mâle", "Femelle", "Autre"};
        String cmb1I[] = {"Séquentielle", "Aléatoire", "Relationnel"};
        String cmb2[] = {"Par défaut", "Rouge", "Vert", "Bleu", "Jaune", "Blanc"};
        String cmb3[] = {"Par défaut", "Rouge", "Vert", "Bleu", "Jaune", "Noir"};
        String cmb4[] = {"Génie industriel", "Génie Civil", "Ingénierie des systèmes", "Génie de l'environnement", "Droit", "Psychologie"};
        String cmb5[] = {"Espagnol", "Anglais", "Portugais", "Français", "Italien"};

        for (int i = 0; i < label.length; i++) {
            for (int j = 0; j < l.length; j++) {
                label[i].setText(l[i]);
            }
        }
        for (int i = 0; i < boton.length; i++) {
            for (int j = 0; j < b.length; j++) {
                boton[i].setText(b[i]);
            }

        }
        for (int i = 0; i < check.length; i++) {
            for (int j = 0; j < c.length; j++) {
                check[i].setText(c[i]);
            }

        }
        for (int i = 0; i < radio.length; i++) {
            for (int j = 0; j < r.length; j++) {
                radio[i].setText(r[i]);
            }

        }
        for (int i = 0; i < combo.length; i++) {
            Helper.crearCombo(cmb1I, combo[6]);
            Helper.crearCombo(cmb2, combo[3]);
            Helper.crearCombo(cmb3, combo[2]);
            Helper.crearCombo(cmb4, combo[1]);
            Helper.crearCombo(cmb5, combo[4]);

        }
    }

    public static void cambioiomaItaliano(JLabel label[], JButton boton[], JComboBox combo[], JCheckBox check[], JRadioButton radio[]) {
        String l[] = {"Informazione personale", "Codice", "Nome di battesimo", "Secondo nome", "Primo cognome", "Secondo cognome", "E-mail", "Indirizzo", "Data di nascita",
            "Genere", "Dati accademici", "Carriera", "Semestre", "Livello d'inglese", "Programma", "Impostazioni", "File", "Tipo di accesso", "Testo a colori", "Sfondo", "Lingua", "Aspetto", "Opzioni"};
        String b[] = {"Salvare", "Annulla", "Accettare", "Pulito"};
        String c[] = {"Lunedi", "Martedì", "Mercoledì", "Giovedi", "Venerdì", "Sabato"};
        String r[] = {"Maschio", "Femmina", "Altro"};
        String cmb1I[] = {"Sequenziale", "Casuale", "Relazionale"};
        String cmb2[] = {"Default", "Rosso", "Verde", "Blue", "Giallo", "White"};
        String cmb3[] = {"Default", "Rosso", "Verde", "Blue", "Giallo", "Nero"};
        String cmb4[] = {"Ingegneria industriale", "Ingegneria Civile", "Ingegneria dei Sistemi", "Ingegneria Ambientale", "destra", "Psicologia"};
        String cmb5[] = {"Spagnolo", "Inglese", "Portoghese", "Francese", "Italiano"};

        for (int i = 0; i < label.length; i++) {
            for (int j = 0; j < l.length; j++) {
                label[i].setText(l[i]);
            }
        }
        for (int i = 0; i < boton.length; i++) {
            for (int j = 0; j < b.length; j++) {
                boton[i].setText(b[i]);
            }

        }
        for (int i = 0; i < check.length; i++) {
            for (int j = 0; j < c.length; j++) {
                check[i].setText(c[i]);
            }

        }
        for (int i = 0; i < radio.length; i++) {
            for (int j = 0; j < r.length; j++) {
                radio[i].setText(r[i]);
            }

        }
    }

    public static void cambioFondo(JTextField fondo[], Color color) {
        if (color == color.black) {
            for (int i = 0; i < fondo.length; i++) {
                fondo[i].setBackground(color);
            }
        } else if (color == color.red) {
            for (int i = 0; i < fondo.length; i++) {
                fondo[i].setBackground(color);
            }
        } else if (color == color.green) {
            for (int i = 0; i < fondo.length; i++) {
                fondo[i].setBackground(color);
            }
        } else if (color == color.blue) {
            for (int i = 0; i < fondo.length; i++) {
                fondo[i].setBackground(color);
            }
        } else if (color == color.yellow) {
            for (int i = 0; i < fondo.length; i++) {
                fondo[i].setBackground(color);
            }
        } else if (color == color.white) {
            for (int i = 0; i < fondo.length; i++) {
                fondo[i].setBackground(color);
            }
        }
    }

    public static void borrar(JTextField text[], JComboBox combo[]) {
        for (int i = 0; i < text.length; i++) {
            text[i].setText("");
        }
        for (int i = 0; i < combo.length; i++) {
            combo[i].setSelectedIndex(0);
        }

    }

    public static void errores(Component ventana, String mensaje) {
        JOptionPane.showMessageDialog(ventana, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public static boolean validarCorreor(String correo) {
        // Patrón para validar el email
        Pattern pattern = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        // El email a validar
        String email = "info@programacionextrema.com";

        Matcher mather = pattern.matcher(email);

        return true;
    }

    public static void crearCombo(String Cmb[], JComboBox cmb) {
        DefaultComboBoxModel value1;
        int aux = cmb.getSelectedIndex();
        value1 = new DefaultComboBoxModel();
        cmb.setModel(value1);
        for (int i = 0; i < Cmb.length; i++) {
            value1.addElement(Cmb[i]);

        }
        cmb.setSelectedIndex(aux);

    }

     public static boolean verificarExistencia(String nombreArchivo){
       
        File archivo = new File(nombreArchivo);
        if(archivo.exists())
            return true;
        else
            return false;
    }

    public static void crearSecuencial(Esudiantes es, String ess, String nombre) {
        FileWriter archivo;
        if(verificarExistencia(nombre)==true){
           int reply = JOptionPane.showConfirmDialog(null, "El archivo ya existe, ¿desea remplazarlo?");
            if (reply == JOptionPane.NO_OPTION)       
    {
      System.exit(0);
        }else{
                
            
        
        try {
            archivo = new FileWriter("" + nombre);
            archivo.write(ess);
            archivo.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        }
    }
    }

    public static void leerSecuencial(String nombre, JTextArea espacio) {
        String ess = "";
        try {
            FileReader lectro = new FileReader("" + nombre);
            BufferedReader br = new BufferedReader(lectro);
            ess = br.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        espacio.setText("" + ess);
    }
    
    public static void crearFileAlumno(File archivo) throws IOException {
        if (archivo.exists() && !archivo.isFile()) {
            throw new IOException(archivo.getName() + " no es un archivo");
        }
        flujo = new RandomAccessFile(archivo, "rw");
        numeroRegistros = (int) Math.ceil(
                (double) flujo.length() / (double) tamañoRegistro);
    }

    public static void cerrar() throws IOException {
        flujo.close();
    }

    public static boolean setPersona(int i, Esudiantes persona) throws IOException {
        if (i >= 0 && i <= getNumeroRegistros()) {
            if (persona.getTamaño() > tamañoRegistro) {
                System.out.println("\nTamaño de registro excedido.");
            } else {
                flujo.seek(i * tamañoRegistro);
                flujo.writeUTF(persona.getCodigo());
                flujo.writeUTF(persona.getpNombre());
                flujo.writeUTF(persona.getsNombre());
                flujo.writeUTF(persona.getpApellido());
                flujo.writeUTF(persona.getsApellido());
                flujo.writeUTF(persona.getEmail());
                flujo.writeUTF(persona.getDireccion());
                flujo.writeUTF(persona.getNacimiento());
                flujo.writeUTF(persona.getSexo().toString());
                flujo.writeUTF(persona.getCarrera().toString());
                flujo.writeUTF(persona.getSemestre().toString());
                flujo.writeUTF(persona.getNivel().toString());
                flujo.writeUTF(persona.getHorario());
                flujo.writeBoolean(persona.isActivo());
                return true;
            }
        } else {
            System.out.println("\nNúmero de registro fuera de límites.");
        }
        return false;
    }

   private static int buscarRegistroInactivo() throws IOException {
        String nombre;
        for (int i = 0; i < getNumeroRegistros(); i++) {
            flujo.seek(i * tamañoRegistro);
            if (!getPersona(i).isActivo()) {
                return i;
            }
        }
        return -1;
    }

    public static void compactarArchivo(File archivo) throws IOException {
        crearFileAlumno(archivo); 
        Esudiantes[] listado = new Esudiantes[numeroRegistros];
        for (int i = 0; i < numeroRegistros; ++i) 
            listado[i] = getPersona(i);
        cerrar(); 
        archivo.delete(); 

        File tempo = new File("temporal.dat");
        crearFileAlumno(tempo); 
        for (Esudiantes p : listado) 
            añadirPersona(p);
        cerrar();
        tempo.renameTo(archivo); 
    }

    public static void añadirPersona(Esudiantes persona) throws IOException {
        int inactivo = buscarRegistroInactivo();
        if (setPersona(inactivo == -1 ? numeroRegistros : inactivo, persona)) {
            numeroRegistros++;
        }
    }

    public static int getNumeroRegistros() {
        return numeroRegistros;
    }

    public static Esudiantes getPersona(int i) throws IOException {
        if (i >= 0 && i <= getNumeroRegistros()) {
            flujo.seek(i * tamañoRegistro);
            return new Esudiantes(flujo.readUTF(),flujo.readUTF(),flujo.readUTF(),flujo.readUTF(),flujo.readUTF(),flujo.readUTF(),flujo.readUTF(),flujo.readUTF(),flujo.readUTF(),flujo.readUTF(),flujo.readUTF(),flujo.readUTF(),flujo.readUTF(),flujo.readBoolean());
        } else {
            System.out.println("\nNúmero de registro fuera de límites.");
            return null;
        }
    }

    public static int buscarRegistro(String buscado) throws IOException {
        Esudiantes p;
        if (buscado == null) {
            return -1;
        }
        for (int i = 0; i < getNumeroRegistros(); i++) {
            flujo.seek(i * tamañoRegistro);
            p = getPersona(i);
            if (p.getpNombre().equals(buscado)&& p.isActivo()) {
                return i;
            }
        }
        return -1;
    }
    public static void agregarRelacional (Esudiantes es){
       Connection cn= null;
        PreparedStatement prepareStmt = null;
        try{
            cn = new Conexion().obtenerConexion();
            String sql;
            sql="Insert into tala1(Codigo,pNombre,Snombre,pApellido,sApellido,email,direccion,nacimiento,sexo,carrera,semestre,nivel,horario) values"
                    + "(?,?,?,?,?,?,?,?,?,?,?,?,?)";
            prepareStmt.setString(1,es.getCodigo());
            prepareStmt.setString(2,es.getpNombre());
            prepareStmt.setString(3,es.getsNombre());
            prepareStmt.setString(4,es.getpApellido());
            prepareStmt.setString(5,es.getsApellido());
            prepareStmt.setString(6,es.getEmail());
            prepareStmt.setString(7,es.getDireccion());
            prepareStmt.setString(8,es.getNacimiento());
            prepareStmt.setString(9,es.getSexo().toString());
            prepareStmt.setString(10,es.getCarrera().toString());
            prepareStmt.setString(11,es.getSemestre().toString());
            prepareStmt.setString(12,es.getNivel().toString());
            prepareStmt.setString(13,es.getHorario().toString());
        } catch (ClassNotFoundException ex) {
         Logger.getLogger(Helper.class.getName()).log(Level.SEVERE, null, ex);
     } catch (SQLException ex) {
         Logger.getLogger(Helper.class.getName()).log(Level.SEVERE, null, ex);
     }
        System.out.println("Agregado");
    }
}


