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
public class Livro {
    private String titulo;
    private String autor;
    private String editora;
    private int paginas;
    private boolean emprestado;
    
    public String getTitulo() {
        return titulo;
    }    
    
    /*
    * Criei métodos para retornar ou autor
    * e o número de páginas também pois,
    * caso contrário, estes atributos
    * não poderiam ser acessados de
    * nenhuma maneira.
    */
    public String getAutor() {
        return autor;
    }
    
    public String getEditora() {
        return editora;
    }
    
    public int getPaginas() {
        return paginas;
    }
    
    public boolean getEmprestado() {
        return emprestado;
    }            
}
