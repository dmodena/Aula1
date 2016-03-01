/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmodena.model;

import com.dmodena.helper.Helper;

/**
 *
 * @author dmodena
 */
public class Vaga {
    private Carro carro;
    private int horaEntrada;
    private int horaSaida;
    private double primeiraHora;
    
    public Carro getCarro() {
        return carro;
    }
    
    public void setCarro(Carro carro) {
        this.carro = carro;
    }
    
    public int getHoraEntrada() {
        return horaEntrada;
    }
    
    public void setHoraEntrada(int horaEntrada) {
        this.horaEntrada = horaEntrada;
    }
    
    public int getHoraSaida() {
        return horaSaida;
    }
    
    public void setHoraSaida(int horaSaida) {
        this.horaSaida = horaSaida;
    }
    
    public double getPrimeiraHora() {
        return primeiraHora;
    }
    
    public void setPrimeiraHora(double primeiraHora) {
        this.primeiraHora = primeiraHora;
    }

    public double valorBruto() {
        double valorBruto;
        int qtdHoras = horaSaida - horaEntrada;
        
        if(qtdHoras < 1) {
            valorBruto = 0.00;
        }
        else if(qtdHoras == 1) {
            valorBruto = primeiraHora;
        }
        else {
            valorBruto = ((qtdHoras - 1) * (primeiraHora / 3)) + primeiraHora;
        }
        
        // Usando método próprio para arredondar para duas casas decimais
        return Helper.arredondar(valorBruto, 2);
    }
    
    public double valorDesconto() {
        double valorDesconto;
        double valorBruto = valorBruto();
        
        if(valorBruto <= 20) {
            valorDesconto = valorBruto * 0.05;
        } 
        else if (valorBruto <= 50) {
            valorDesconto = valorBruto * 0.1;
        }
        else {
            valorDesconto = valorBruto * 0.2;
        }
        
        // Usando método próprio para arredondar para duas casas decimais
        return Helper.arredondar(valorDesconto, 2);
    }
    
    public double valorLiquido() {
        // Usando método próprio para arredondar para duas casas decimais
        return Helper.arredondar((valorBruto() - valorDesconto()), 2);
    }    
}
