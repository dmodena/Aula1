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
public class Contador {
    private int numero;
    
    public int getNumero() {
        return numero;
    }
    
    public void incrementar(int valor) {
        numero += valor;
    }
    
    public void decrementar(int valor) {
        numero -= valor;
    }
}
