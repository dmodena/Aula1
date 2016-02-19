/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programas;

import java.util.Scanner;
import Classes.Jogador;
import Helpers.Helper;

/**
 *
 * @author dmodena
 */
public class Azar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                
        int rodadas;
        Jogador jogador1 = new Jogador();
        Jogador jogador2 = new Jogador();        
        
        System.out.print("Informe o nome do Jogador 1: ");
        jogador1.setNome(scanner.nextLine());
        System.out.print("Informe o nome do Jogador 2: ");
        jogador2.setNome(scanner.nextLine());
        
        System.out.println();
        
        System.out.print(jogador1.getNome() + ", informe seu palpite: ");
        jogador1.setPalpite(Integer.parseInt(scanner.nextLine()));
        System.out.print(jogador2.getNome() + ", informe seu palpite: ");
        jogador2.setPalpite(Integer.parseInt(scanner.nextLine()));
        
        System.out.println();
        
        System.out.print("Informe a quantidade de rodadas: ");
        rodadas = Integer.parseInt(scanner.nextLine());
                
        for(int i = 0; i < rodadas; i++) {
            int sorteado = Helper.aleatorio(1, 6);
            
            if(sorteado == jogador1.getPalpite()) {
                jogador1.acertou();
            }
            else if(sorteado == jogador2.getPalpite()) {
                jogador2.acertou();
            }
        }
        
        System.out.println();
        
        System.out.println(jogador1.getNome() + " acertou " + jogador1.getAcertos() + " vezes.");
        System.out.println(jogador2.getNome() + " acertou " + jogador2.getAcertos() + " vezes.");
        
        System.out.println();
        
        System.out.println(resultado(jogador1.getNome(), jogador1.getAcertos(), jogador2.getNome(), jogador2.getAcertos()));
    }
    
    private static String resultado(String nomeJogador1, int acertosJogador1, String nomeJogador2, int acertosJogador2) {
        String resultado;
        
        if(acertosJogador1 > acertosJogador2) {
            resultado = (nomeJogador1 + " venceu!");
        }
        else if(acertosJogador2 > acertosJogador1) {
            resultado = (nomeJogador2 + " venceu!");
        }
        else {
            resultado = "Empate!";
        }
        
        return resultado;
    }
}
