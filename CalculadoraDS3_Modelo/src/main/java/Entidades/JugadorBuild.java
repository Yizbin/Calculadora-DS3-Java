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
public record JugadorBuild(Map<StatOfensivos, Integer> stats) {
    
    public int getValorStat(StatOfensivos stat) {
        return stats.getOrDefault(stat, 10);
    }

}
