/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01;

import java.io.Serializable;

/**
 *
 * @author gabri
 */
public class Node implements Serializable {
    private int value;
    private Node leftNode;
    private Node rightNode;
    
    public Node() {}
	
    public Node(int value) {
        this.value = value;
    }
        
    public Node getLeftNode() {
        return this.leftNode;
    }
    
    public void setLeftNode(Node node) {
        this.leftNode = node;
    }
    
    public Node getRightNode() {
        return this.rightNode;
    }
    
    public void setRightNode(Node node) {
        this.rightNode = node;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
}
