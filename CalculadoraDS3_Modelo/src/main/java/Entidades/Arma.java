/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Enums.StatOfensivos;
import java.util.Map;

/**
 *
 * @author Abraham Coronel
 */
public class Arma {

    private final String nombre;
    private final double danioBase;
    private final Map<StatOfensivos, Double> escalado;

    public Arma(String nombre, double danioBase, Map<StatOfensivos, Double> escalado) {
        this.nombre = nombre;
        this.danioBase = danioBase;
        this.escalado = Map.copyOf(escalado);
    }

    public String getNombre() {
        return nombre;
    }

    public double getDanioBase() {
        return danioBase;
    }

    public Double getEscalado(StatOfensivos stat) {
        return escalado.getOrDefault(stat, 0.0);
    }

}
