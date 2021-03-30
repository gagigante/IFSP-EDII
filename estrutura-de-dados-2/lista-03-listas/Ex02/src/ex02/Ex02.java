/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex02;

/**
 *
 * @author gabriel
 */
public class Ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CustomDoublyLinkedList list = new CustomDoublyLinkedList();
        
        list.insertValue(10);
        list.insertValue(20);
        list.insertValue(30);
        list.insertValue(40);
        
        list.removeValue(40);
        
        System.out.println("Lista");
        list.getAllItems();
        
        System.out.println("\nO número 30 está na posição: " + list.searchItem(30));
        System.out.println("O número 40 não foi encontrado: " + list.searchItem(40));
        System.out.println("Quantidade de itens na lista: " + list.getQuantity());
        
    }
    
}
