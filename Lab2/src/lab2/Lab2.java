/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author Estudiante
 */
public class Lab2 extends JFrame implements FocusListener {

    JTextField nombre, telefono;
    String cadena = "";
    JTextArea texto;
    String[] genero = {"  Masculino", "   Femenino"};
    JComboBox generoComboBox = new JComboBox(genero);

    public Lab2() {
        super("Formulario"); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
        setSize(300, 350);
        FlowLayout lm = new FlowLayout(FlowLayout.CENTER);
        setLayout(lm);
        JPanel panel = new JPanel();
        panel.setName("Form");
        JLabel nombreLabel = new JLabel("Nombre:   ");
        nombreLabel.setName("lblName");
        JLabel numeroDeTelefonoLabel = new JLabel("Número de Teléfono: ");
        numeroDeTelefonoLabel.setName("lblPhone");
        JLabel generoLabel = new JLabel("Género:                          ");
        generoLabel.setName("lblGender");
        nombre = new JTextField(15);
        nombre.setName("txtName");
        nombre.addFocusListener(this);
        telefono = new JTextField(10);
        telefono.setName("txtPhone");
        telefono.addFocusListener(this);
        JButton clearButton = new JButton("Clear");
        clearButton.setName("clean");
        JButton aceptarButton = new JButton("Aceptar");
        aceptarButton.setName("ok");
        texto = new JTextArea(4, 22);
        texto.setName("lblResult");
        texto.addFocusListener(this);
        texto.setEditable(false);
        
        add(nombreLabel);
        add(nombre);
        add(numeroDeTelefonoLabel);
        add(telefono);
        add(generoLabel);
        add(generoComboBox);
        add(clearButton);
        add(aceptarButton);
        add(texto);

        add(panel);
        setVisible(true);
    }
    
    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception exc) {
            System.err.println("Couldn't use the system "
                    + "look and feel: " + exc);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lab2 lab2 = new Lab2();
        
        
                
        // TODO code application logic here
    }

    @Override
    public void focusGained(FocusEvent fe) {
        try {
            cadena = "Nombre: " + nombre.getText() +"\n" 
            + "Teléfono: " + telefono.getText();
            texto.setText(cadena);
        } catch (NumberFormatException nfe) {
            nombre.setText("");
            telefono.setText("");
            texto.setText(cadena);
        }
    }

    @Override
    public void focusLost(FocusEvent fe) {
        focusGained(fe);
    }

}