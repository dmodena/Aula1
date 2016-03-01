/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmodena.view.console;

import com.dmodena.model.Cana;

/**
 *
 * @author dmodena
 */
public class Producao {
    public static void main(String[] args) {
        Cana cana = new Cana();
        
        cana.setQtdEstimada(12.34);
        cana.setQtdProcessada(10.13);
        cana.setCustoProducao(15700.00);
        cana.setPrecoVenda(23095.71);
        
        System.out.println("Quantidade processada: " + cana.getQtdProcessada() + " toneladas.");
        System.out.println("Valor da tonelada: R$" + cana.getPrecoVenda());
        System.out.println("Lucro da usina: R$" + cana.getLucro());
        System.out.println("Capacidade utilizada: " + cana.getCapacidadeUtilizada() + "%");
    }
}
