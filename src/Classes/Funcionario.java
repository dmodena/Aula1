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
public class Funcionario {
    private String nome;
    private int anoContratacao;
    private double salario;
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getAnoContratacao() {
        return anoContratacao;
    }
    
    public void setAnoContratacao(int anoContratacao) {
        this.anoContratacao = anoContratacao;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double calcularAumento() {
        double aumento = 0;
        
        if(salario <= 1900.00) {
            aumento = (salario * 0.2);
        }
        else if ((salario > 1900.00) && (salario <= 4000.00)) {
            aumento = (salario * 0.1);
        }
        else {
            aumento = (salario * 0.05);
        }
        
        // Usando método próprio para arredondar para duas casas decimais
        return Helper.arredondar(aumento, 2);
    }
}
