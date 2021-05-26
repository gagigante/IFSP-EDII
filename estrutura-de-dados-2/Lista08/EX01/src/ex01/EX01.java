/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01;

/**
 *
 * @author gabri
 */
public class EX01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        
        System.out.println("Árvore está vazia? " + tree.isEmpty());
        
        tree.add(new Node(5));
        tree.add(new Node(6));
        tree.add(new Node(2));
        tree.add(new Node(3));
        tree.add(new Node(1));
        tree.add(new Node(4));
        tree.add(new Node(7));
        
        System.out.println("Árvore está vazia? " + tree.isEmpty());
        System.out.println();
        
        System.out.println("Número de nós: " + tree.getNumberOfNodes());
        System.out.println();
        
        System.out.println("inOrder:");
        System.out.println(tree.inFixedOrder()); 
        
        System.out.println("posOrder:");
        System.out.println(tree.posFixedOrder()); 
        
        tree.printTree();
    }
    
}
