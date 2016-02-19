/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programas;

import Classes.Funcionario;

/**
 *
 * @author dmodena
 */
public class Pagamento {    
    public static void main(String[] args) {        
        Funcionario jose = new Funcionario();        
        Funcionario maria = new Funcionario();
        Funcionario fulano = new Funcionario();
        
        jose.setNome("José Maria");
        jose.setAnoContratacao(2013);
        jose.setSalario(1800.00);
        
        maria.setNome("Maria José");
        maria.setAnoContratacao(2014);
        maria.setSalario(2400.00);
        
        fulano.setNome("Fu Lano");
        fulano.setAnoContratacao(2015);
        fulano.setSalario(4451.67);

        System.out.println(jose.getNome() + 
                "\nAno contratacao: " + jose.getAnoContratacao() + 
                "\nSalario: R$" + jose.getSalario() + 
                "\nValor aumento: R$" + jose.calcularAumento());       
        
        System.out.println();        
        
        System.out.println(maria.getNome() + 
                "\nAno contratacao: " + maria.getAnoContratacao() + 
                "\nSalario: R$" + maria.getSalario() + 
                "\nValor aumento: R$" + maria.calcularAumento());   
        
        System.out.println();        
        
        System.out.println(fulano.getNome() + 
                "\nAno contratacao: " + fulano.getAnoContratacao() + 
                "\nSalario: R$" + fulano.getSalario() + 
                "\nValor aumento: R$" + fulano.calcularAumento());   
    }
}
