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
public class Rota {
    private String tipoAeronave;
    private String origem;
    private String destino;
    private int assentosDisponiveis;
    private int assentosOcupados;
    private double tarifa;
    
    public String getTipoAeronave() {
        return tipoAeronave;
    }
    
    public void setTipoAeronave(String tipoAeronave) {
        this.tipoAeronave = tipoAeronave;
    }
    
    public String getOrigem() {
        return origem;
    }
    
    public void setOrigem(String origem) {
        this.origem = origem;
    }
    
    public String getDestino() {
        return destino;
    }
    
    public void setDestino(String destino) {
        this.destino = destino;
    }
    
    public int getAssentosDisponiveis() {
        return assentosDisponiveis;
    }
    
    public void setAssentosDisponiveis(int assentosDisponiveis) {
        this.assentosDisponiveis = assentosDisponiveis;
    }
    
    public int getAssentosOcupados() {
        return assentosOcupados;
    }
    
    public void setAssentosOcupados(int assentosOcupados) {
        this.assentosOcupados = assentosOcupados;
    }
    
    public double getTarifa() {
        return tarifa;
    }
    
    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
    
    public double ocupacao() {        
        double assentosTotal = assentosDisponiveis + assentosOcupados;
        
        // Usando método próprio para arredondar para duas casas decimais
        return Helper.arredondar(((assentosOcupados / assentosTotal) * 100), 2);        
    }
    
    public double faturamento() {
        // Usando método próprio para arredondar para duas casas decimais
        return Helper.arredondar((assentosOcupados * tarifa), 2);
    }
}
