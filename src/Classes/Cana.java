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
public class Cana {
    private double qtdEstimada;
    private double qtdProcessada;
    private double custoProducao;
    private double precoVenda;
    
    public double getQtdEstimada() {
        return qtdEstimada;
    }
    
    public void setQtdEstimada(double qtdEstimada) {
        this.qtdEstimada = qtdEstimada;
    }
    
    public double getQtdProcessada() {
        return qtdProcessada;
    }
    
    public void setQtdProcessada(double qtdProcessada) {
        this.qtdProcessada = qtdProcessada;
    }
    
    public double getCustoProducao() {
        return custoProducao;
    }
    
    public void setCustoProducao(double custoProducao) {
        this.custoProducao = custoProducao;
    }
    
    public double getPrecoVenda() {
        return precoVenda;
    }
    
    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }
    
    public double getLucro() {
        // Usando método próprio para arredondar para duas casas decimais
        return Helper.arredondar(((precoVenda - custoProducao) * qtdProcessada), 2);
    }
    
    public double getCapacidadeUtilizada() {
        // Usando método próprio para arredondar para duas casas decimais
        return Helper.arredondar(((qtdProcessada / qtdEstimada) * 100), 2);
    }            
}
