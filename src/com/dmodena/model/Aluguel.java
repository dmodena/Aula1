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
public class Aluguel {
    private double valor;
    private double desconto; // Porcentagem
    
    public double getValor() {
        return valor;
    }
    
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public double getDesconto() {
        return desconto;
    }
    
    // Desconto em porcentagem
    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    
    public double calcularDesconto() {
        // Usando método próprio para arredondar para duas casas decimais
        return Helper.arredondar((valor * (desconto / 100)), 2);
    }
    
    public double calcularAluguel() {
        // Usando método próprio para arredondar para duas casas decimais
        return Helper.arredondar((valor - calcularDesconto()), 2);
    }
}
