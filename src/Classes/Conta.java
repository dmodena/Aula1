/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Helpers.Helper;

/**
 *
 * @author dmodena
 */
public class Conta {
    private String nomeCliente;
    private int tipoConta;
    private double saldo;
    private boolean bonusUtilizado = false;
    
    public String getNomeCliente() {
        return nomeCliente;
    }
    
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    
    public int getTipoConta() {
        return tipoConta;
    }
    
    public void setTipoConta(int tipoConta) {
        if((tipoConta == 1) || (tipoConta == 2)) {
            this.tipoConta = tipoConta;
        }
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public void saque(double valor) {
        if((saldo >= valor) && (valor > 0)) {
            saldo -= valor;
        }
    }
    
    public void deposito(double valor) {
        if(valor > 0) {
            saldo += valor;
        }
    }
    
    public double bonus() {
        double bonus = 0.00;
        
        if(!bonusUtilizado) {
            if(saldo <= 1000.00) {
                bonus = saldo * 0.05;
            }
            else {
                bonus = saldo * 0.1;
            }
            
            bonusUtilizado = true;
        }
        
        // Usando método próprio para arredondar para duas casas decimais
        return Helper.arredondar(bonus, 2);
    }
            
    public double calcularTarifa() {
        double tarifa = 0.00;
        
        if(tipoConta == 1) {
            tarifa = 8.00;
        }
        else {
            tarifa = 14.00;
        }
        
        return tarifa;
    }
}
