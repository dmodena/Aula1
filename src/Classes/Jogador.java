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
public class Jogador {
    private String nome;
    private int palpite;
    private int acertos = 0;
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getPalpite() {
        return palpite;
    }
    
    public void setPalpite(int palpite) {
        int palpiteMin = 1;
        int palpiteMax = 6;
        
        if ((palpite >= palpiteMin) && (palpite <= palpiteMax)) {
            this.palpite = palpite;
        }        
    }
    
    public int getAcertos() {
        return acertos;
    }
    
    public void acertou() {
        acertos++;
    }
}
