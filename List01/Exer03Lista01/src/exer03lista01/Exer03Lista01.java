/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer03lista01;

/**
 *
 * @author GABRIEL
 */
public class Exer03Lista01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PilhaPessoal obj = new PilhaPessoal();

        obj.adicionar(10);
        obj.adicionar(20);
        obj.adicionar(30);
        obj.adicionar(40);
 
        obj.todosValores();
 
        obj.buscaValores(20);
        
        obj.imprimeQuantidade();
        
        obj.remover();
        
        obj.todosValores();
    }
    
}
