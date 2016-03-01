/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmodena.view.console;

import com.dmodena.model.Rota;

/**
 *
 * @author dmodena
 */
public class Voo {
    public static void main(String[] args) {
        Rota rota1 = new Rota();
        Rota rota2 = new Rota();
        
        rota1.setOrigem("São Paulo");
        rota1.setDestino("Rio de Janeiro");
        rota1.setTipoAeronave("Boeing 747");
        rota1.setAssentosDisponiveis(90);
        rota1.setAssentosOcupados(285);
        rota1.setTarifa(298.8);
        
        rota2.setOrigem("São Paulo");
        rota2.setDestino("Salvador");
        rota2.setTipoAeronave("Airbus A320");
        rota2.setAssentosDisponiveis(35);
        rota2.setAssentosOcupados(70);
        rota2.setTarifa(707.8);
        
        System.out.println("Tipo de aeronave: " + rota1.getTipoAeronave());
        System.out.println("Origem: " + rota1.getOrigem());
        System.out.println("Destino: " + rota1.getDestino());
        System.out.println("Percentual ocupado: " + rota1.ocupacao() + "%");
        System.out.println("Valor tarifa: R$" + rota1.getTarifa());
        System.out.println("Faturamento: R$" + rota1.faturamento());
        
        System.out.println();
        
        System.out.println("Tipo de aeronave: " + rota2.getTipoAeronave());
        System.out.println("Origem: " + rota2.getOrigem());
        System.out.println("Destino: " + rota2.getDestino());
        System.out.println("Percentual ocupado: " + rota2.ocupacao() + "%");
        System.out.println("Valor tarifa: R$" + rota2.getTarifa());
        System.out.println("Faturamento: R$" + rota2.faturamento());
    }
}
