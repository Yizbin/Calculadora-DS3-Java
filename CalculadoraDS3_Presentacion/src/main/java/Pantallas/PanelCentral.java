/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pantallas;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JPanel;

/**
 *
 * @author Abraham Coronel
 */
public class PanelCentral extends JPanel {

    public PanelCentral() {
        this.configurarPanel();
        this.configurarPaneles();
    }

    private void configurarPanel() {
        this.setLayout(new GridLayout(3, 11));
        this.setBackground(Color.DARK_GRAY);
        this.setVisible(true);
    }

    private void configurarPaneles() {
        PanelAtributos atributos = new PanelAtributos();
        PanelEquipamiento equipamiento = new PanelEquipamiento();
        PanelEstadisticas estadisticas = new PanelEstadisticas();

        atributos.setOpaque(false);
        equipamiento.setOpaque(false);
        estadisticas.setOpaque(false);

        this.add(atributos);
        this.add(equipamiento);
        this.add(estadisticas);
    }
}
