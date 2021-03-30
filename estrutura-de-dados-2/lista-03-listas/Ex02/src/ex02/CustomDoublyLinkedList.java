/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex02;

import java.util.ArrayList;

/**
 *
 * @author gabriel
 */
public class CustomDoublyLinkedList {
    private Node firstNode;
    private int totalItems = 0;
    
    public Node insertValue(int value) {
        Node newNode = new Node(value);
        
        if (firstNode == null) {
            this.firstNode = newNode;
            this.totalItems++;
            return newNode;
        }
        
        Node temp = this.firstNode;

        while (temp != null) {
            if (temp.getNextNode() == null) {
                temp.setNextNode(newNode);
                newNode.setPreviousNode(temp);
                break;
            }
            
            temp = temp.getNextNode();
        }
        
        this.totalItems++;
        
        return newNode;
    }
    
    public int removeValue(int value) {
        Node temp = this.firstNode;
        Node aux;
        int cont = 0;
        
        while (temp != null) {
            if (temp.getValue() == value) {
                if (temp.getPreviousNode() == null && temp.getNextNode() == null) {
                    this.firstNode = null;
                    break;
                }
                
                if (temp.getPreviousNode() == null) {
                    this.firstNode = temp.getNextNode();
                    break;
                }
                
                if (temp.getNextNode() == null) {
                    temp.getPreviousNode().setNextNode(null);
                    break;
                }
                
                aux = temp;
                
                aux.getPreviousNode().setNextNode(aux.getNextNode());
                temp.getNextNode().setPreviousNode(aux);
            
                return cont;
            }
            
            temp = temp.getNextNode();
            cont++;
        }
       
        this.totalItems--;
        
        return -1;
    }
    
    public int searchItem(int value) {
        Node temp = this.firstNode;
        int count = 0;

        while (temp != null) {
            if (temp.getValue() == value) {
                return count;
            }
            
            temp = temp.getNextNode();
            count++;
        }
        
        return -1;
    }
    
    public void getAllItems() {
        Node temp = this.firstNode;

        while (temp != null) {
            System.out.println(temp.getValue());
            
            temp = temp.getNextNode();
        }
    }
    
    public int getQuantity() {
        return this.totalItems;
    }
}
