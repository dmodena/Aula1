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
public class Aluno {
    private String nome;
    private String sobrenome;
    private int prontuario;
    private double media;    
    
    public String getNome() {
        return nome;
    }
    
    public String getSobrenome() {
        return sobrenome;       
    }
    
    public int getProntuario() {
        return prontuario;
    }
    
    public void setProntuario(int prontuario) {
        this.prontuario = prontuario;
    }    
    
    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
    
    @Override
    public String toString() {
        
        return (nome + " " + sobrenome + "\nProntuario: " + prontuario + "\nMedia: " + media);        
    }
}
