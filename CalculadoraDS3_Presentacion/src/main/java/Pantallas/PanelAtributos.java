/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pantallas;

import java.awt.GridLayout;
import javax.swing.JPanel;

/**
 *
 * @author Abraham Coronel
 */
public class PanelAtributos extends JPanel {

    public PanelAtributos() {
        this.configurarPanel();
    }

    private void configurarPanel() {
        this.setLayout(new GridLayout(11, 3));
    }
    
    private void generarAtributos() {
        String[] stats = {"Vigor", "Attunement", "Endurance", "Vitality", "Strength", "Dexterity", "Intelligence", "Faith", "Luck", "Hollowing"};
        for (String stat : stats) {
            
        }
    }

}
