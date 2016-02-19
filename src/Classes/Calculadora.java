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
public class Calculadora {    
    public double adicionar(double parcela1, double parcela2) {
        return parcela1 + parcela2;
    }
    
    public double subtrair(double minuendo, double subtraendo) {
        return minuendo - subtraendo;
    }
    
    public double dividir(double dividendo, double divisor) {
        return dividendo / divisor;
    }
    
    public double multiplicar(double fator1, double fator2) {
        return fator1 * fator2;
    }            
}
