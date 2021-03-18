/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer02lista01;

/**
 *
 * @author GABRIEL
 */
public class Exer02Lista01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FilaPessoal obj = new FilaPessoal();

        obj.inserir(10);
        obj.inserir(20);
        obj.inserir(30);
        obj.inserir(40);
 
        obj.imprimeTodosValores();
 
        obj.buscarValor(20);
        
        obj.imprimeQuantidade();
        
        obj.remover();
        
        obj.imprimeTodosValores();
    }
    
}
