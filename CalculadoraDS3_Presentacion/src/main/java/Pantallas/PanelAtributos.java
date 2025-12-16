/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pantallas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author Abraham Coronel
 */
public class PanelAtributos extends JPanel {

    public PanelAtributos() {
        this.configurarPanel();
        this.generarAtributos();
        this.configurarTitulo();
    }

    private void configurarPanel() {
        this.setLayout(new GridLayout(11, 3));
    }

    private void configurarTitulo() {
        JLabel titulo = new JLabel();
        titulo.setText("DARK SOULS III");
        titulo.setFont(Font.decode("Arial"));
        titulo.setForeground(Color.WHITE);
        this.add(titulo, BorderLayout.NORTH);
    }

    private void generarAtributos() {
        String[] stats = {"Vigor", "Attunement", "Endurance", "Vitality", "Strength", "Dexterity", "Intelligence", "Faith", "Luck", "Hollowing"};
        for (String stat : stats) {
            JLabel lblNombre = new JLabel(stat);
            lblNombre.setForeground(Color.WHITE);
            this.add(lblNombre);

            //Nivel base
            SpinnerNumberModel modeloBase = new SpinnerNumberModel(10, 1, 99, 1);
            JSpinner spinnerBase = new JSpinner(modeloBase);
            this.add(spinnerBase);

            //Nivel real
            SpinnerNumberModel modeloReal = new SpinnerNumberModel(10, 1, 99, 1);
            JSpinner spinnerReal = new JSpinner(modeloReal);
            this.add(spinnerReal);
        }
    }

}
