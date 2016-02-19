/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author dmodena
 */
public class SmartPhone {
    private String marca;
    private String modelo;
    private String descricao;
    private double preco;
    
    public String getMarca(){
        return marca;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public double getPreco(){
        return preco;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
}
