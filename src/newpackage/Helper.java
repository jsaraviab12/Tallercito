/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import static com.sun.javafx.tk.Toolkit.getToolkit;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Jesus
 */
public class Helper {

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
            "Career", "Semester", "English level", "Schedule", "Settings", "Files", "Access Type", "ColorText", "Background", "Language"};
        String bIngles[] = {"Save", "Cancel", "Accept", "Clean"};
        String checkIngles[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        String radioI[] = {"Male", "Female", "Other"};

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

    }

    public static void cambioiomaEspañol(JLabel label[], JButton boton[], JComboBox combo[], JCheckBox check[], JRadioButton radio[]) {
        String l[] = {"Informacion personal", "Codigo", "Primer nombre", "Segundo nombre", "Primer Apellido", "Segundo apellido", "Correo Electronico", "Direccion", "Fecha de nacimineto",
            "Sexo", "Informacion Academica", "Carrera", "Semestre", "Nivel Ingles", "Horario", "Parametros", "Archivos", "Tipo de acceso", "Color de texto", "Color de fondo", "Idioma"};
        String b[] = {"Guardar", "Cancelar", "Aceptar", "Limpiar"};
        String c[] = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};
        String r[] = {"Masculino", "Femenino", "Otro"};

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

    public static void cambioiomaPortugues(JLabel label[], JButton boton[], JComboBox combo[], JCheckBox check[], JRadioButton radio[]) {
        String l[] = {"Informação pessoal", "Código", "Primeiro nome", "Segundo nome", "Primeiro sobrenome", "Segundo Sobrenome", "O email", "Endereço", "Data de nascimento",
            "Gênero", "Dados acadêmicos", "Carreira", "Semestre", "Nível de inglês", "Cronograma", "Configurações", "Arquivos", "Tipo de Acesso", "Texto em cores", "fundo", "Língua"};
        String b[] = {"Salve", "Cancelar", "Aceitar", "Limpar"};
        String c[] = {"Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado"};
        String r[] = {"Masculino", "Fêmea", "De outros"};

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

    public static void cambioiomaFrances(JLabel label[], JButton boton[], JComboBox combo[], JCheckBox check[], JRadioButton radio[]) {
        String l[] = {"Informations personnelles", "Code", "Prénom", "Nom de famille", "Premier nom de famille", "Deuxième nom de famille", "Email", "Address", "Date de naissance",
            "Le genre", "Données académiques", "Carrière", "Semester", "niveau d'anglais", "Programme", "Paramètres", "Des dossiers", "Type d'accès", "Texte en couleur", "Contexte", "La langue"};
        String b[] = {"Sauvegarder", "Annuler", "Acceptez", "Nettoyer"};
        String c[] = {"Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi"};
        String r[] = {"Mâle", "Femelle", "Autre"};

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

    public static void cambioiomaItaliano(JLabel label[], JButton boton[], JComboBox combo[], JCheckBox check[], JRadioButton radio[]) {
        String l[] = {"Informazione personale", "Codice", "Nome di battesimo", "Secondo nome", "Primo cognome", "Secondo cognome", "E-mail", "Indirizzo", "Data di nascita",
            "Genere", "Dati accademici", "Carriera", "Semestre", "Livello d'inglese", "Programma", "Impostazioni", "File", "Tipo di accesso", "Testo a colori", "Sfondo", "Lingua"};
        String b[] = {"Salvare", "Annulla", "Accettare", "Pulito"};
        String c[] = {"Lunedi", "Martedì", "Mercoledì", "Giovedi", "Venerdì", "Sabato"};
        String r[] = {"Maschio", "Femmina", "Altro"};

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

}
