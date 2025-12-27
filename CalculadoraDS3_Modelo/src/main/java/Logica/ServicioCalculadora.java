/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Entidades.Arma;
import Entidades.JugadorBuild;
import Enums.StatOfensivos;

/**
 *
 * @author Abraham Coronel
 */
public class ServicioCalculadora implements IServicio {

    @Override
    public double calcularAR(Arma arma, JugadorBuild build) {
        double totalAR = arma.getDanioBase(); //Aqui se va calculando el danio final del arma

        for (StatOfensivos stat : StatOfensivos.values()) {
            double escalado = arma.getEscalado(stat);

            if (escalado <= 0) {
                continue;
            }

            int statJugadorValor = build.getValorStat(stat);

            double bonus = calcularBonus(arma.getDanioBase(), escalado, statJugadorValor);
            totalAR += bonus;
        }

        return totalAR;
    }

    private double calcularBonus(double base, double escalado, int valorStat) {
        return base * escalado * (valorStat / 100);
    }

}
