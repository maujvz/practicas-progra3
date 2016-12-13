/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author Estudiante
 */
public class Lab1 extends JFrame {

    String[] genero = {"  Masculino", "   Femenino"};
    JComboBox generoComboBox = new JComboBox(genero);

    public Lab1() {
        super("Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
        setSize(300, 400);
        FlowLayout lm = new FlowLayout(FlowLayout.CENTER);
        setLayout(lm);
        JPanel panel = new JPanel();
        JLabel nombreLabel = new JLabel("Nombre:   ");
        nombreLabel.setName("lblName");
        JLabel numeroDeTelefonoLabel = new JLabel("Número de Teléfono: ");
        JLabel generoLabel = new JLabel("Género:                          ");
        JTextField nombreTextField = new JTextField(15);
        JTextField numeroDeTelefonoTextField = new JTextField(10);
        JButton clearButton = new JButton("Clear");
        JButton aceptarButton = new JButton("Aceptar");

        add(nombreLabel);
        add(nombreTextField);
        add(numeroDeTelefonoLabel);
        add(numeroDeTelefonoTextField);
        add(generoLabel);
        add(generoComboBox);
        add(clearButton);
        add(aceptarButton);

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
        Lab1 lab2 = new Lab1();
        // TODO code application logic here
    }

}