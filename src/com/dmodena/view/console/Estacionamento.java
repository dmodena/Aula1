/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmodena.view.console;

import com.dmodena.model.Carro;
import com.dmodena.model.Vaga;

/**
 *
 * @author dmodena
 */
public class Estacionamento {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        Vaga vaga1 = new Vaga();
        Vaga vaga2 = new Vaga();
        
        carro1.setDescricao("Gol Branco");
        carro1.setPlaca("JTR-4818");
        vaga1.setCarro(carro1);
        vaga1.setHoraEntrada(6);
        vaga1.setHoraSaida(11);
        vaga1.setPrimeiraHora(9.00);        
        
        carro2.setDescricao("Impreza Azul");
        carro2.setPlaca("KHP-8234");
        vaga2.setCarro(carro2);
        vaga2.setHoraEntrada(11);
        vaga2.setHoraSaida(21);
        vaga2.setPrimeiraHora(9.00);
        
        System.out.println("Carro: " + vaga1.getCarro().getDescricao());
        System.out.println("Placa: " + vaga1.getCarro().getPlaca());
        System.out.println("Hora Entrada: " + vaga1.getHoraEntrada());
        System.out.println("Hora Saída: " + vaga1.getHoraSaida());
        System.out.println("Valor Pago: " + vaga1.valorLiquido());
        
        System.out.println();
        
        System.out.println("Carro: " + vaga2.getCarro().getDescricao());
        System.out.println("Placa: " + vaga2.getCarro().getPlaca());
        System.out.println("Hora Entrada: " + vaga2.getHoraEntrada());
        System.out.println("Hora Saída: " + vaga2.getHoraSaida());
        System.out.println("Valor Pago: " + vaga2.valorLiquido());
    }
}
