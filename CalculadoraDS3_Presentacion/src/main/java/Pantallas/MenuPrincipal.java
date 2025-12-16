/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pantallas;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author Abraham Coronel
 */
public class MenuPrincipal extends JFrame {

    public MenuPrincipal() {
        configurarFrame();
        configurarPanelCentral();
    }

    private void configurarFrame() {
        this.setTitle("Calculadora DS3");
        this.setSize(1280, 720);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout(10, 10));
    }

    private void configurarPanelCentral() {
        PanelCentral central = new PanelCentral();
        this.add(central, BorderLayout.CENTER);
    }

}
