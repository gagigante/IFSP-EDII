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
public class BinaryTree {
    private int numberOfNodes;
    private Node rootNode;
    
    public int getNumberOfNodes() {
        return this.numberOfNodes;
    }
    
    public Node getRootNode() {
        return this.rootNode;
    }
    
    public boolean isEmpty() {
        return this.rootNode == null;
    }
    
    private void add(Node root, Node node) {
        if (this.isEmpty()) {
            this.rootNode = node;
            return;
        }
        
        if (node.getValue() < root.getValue()) {
            if (root.getLeftNode() == null) {
                root.setLeftNode(node);
            } else {
                this.add(root.getLeftNode(), node);
            }
        } else {
            if (root.getRightNode()== null) {
                root.setRightNode(node);
            } else {
                this.add(root.getRightNode(), node);
            }
        }
        
        this.numberOfNodes++;
    }
    
    public void add(Node node) {
        add(this.rootNode, node);
    }
        
    private void printTree(Node node, int level) {
        if (node != null) {
            System.out.println("Nível: " + level + "; Valor: " + node.getValue());
            
            this.printTree(node.getLeftNode(), level + 1);
            this.printTree(node.getRightNode(), level + 1);
        }
    }
    
    public void printTree() {
        this.printTree(this.rootNode, 1);
    }

    private void inFixedOrder(Node node, int level, StringBuilder sb) {
        if (node != null) {
            inFixedOrder(node.getLeftNode(), level + 1, sb);
            
            for (int c = 1; c < level; c++) sb.append(" ");
            
            sb.append(node.getValue()).append("\n");
            inFixedOrder(node.getRightNode(), level + 1, sb);
        }
    }
    
    public String inFixedOrder() {
        StringBuilder sb = new StringBuilder();
        
        inFixedOrder(this.rootNode, 1, sb);
        return sb.toString();
    }
    
    public String posFixedOrder() {
        StringBuilder sb = new StringBuilder();
        
        posFixedOrder(this.rootNode, 1, sb);
        return sb.toString();
    }
	
    private void posFixedOrder(Node node, int level, StringBuilder sb) {
        if (node != null) {
            posFixedOrder(node.getLeftNode(), level + 1, sb);
            posFixedOrder(node.getRightNode(), level + 1, sb);
	
            for (int c = 1; c < level; c++) sb.append(" ");
            
            sb.append(node.getValue()).append("\n");
        }
    }
}
