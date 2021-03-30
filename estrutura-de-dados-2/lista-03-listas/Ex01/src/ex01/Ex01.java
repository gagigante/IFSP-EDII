/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01;

/**
 *
 * @author gabriel
 */
public class Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CustomArrayList array = new CustomArrayList();
        
        System.out.println("\nLista: ");
        for (String item : array.getList()) {
            System.out.println(item);
        }
        System.out.println("\nQuantidade de posições:" + array.getListSize());
        System.out.println("---------------\n");
        
        array.insert("10");
        array.insert("20");
        array.insert("30");
        array.insert("40");
        array.insert("50");
        
        System.out.println("\nLista: ");
        for (String item : array.getList()) {
            System.out.println(item);
        }
        System.out.println("\nQuantidade de posições:" + array.getListSize());
        System.out.println("---------------\n");
        
        array.remove(4);
        array.remove(3);
        array.remove(2);
        array.remove(1);
        array.remove(0);
        
        System.out.println("\nLista: ");
        for (String item : array.getList()) {
            System.out.println(item);
        }
        System.out.println("Quantidade de posições:" + array.getListSize());
        System.out.println("---------------\n");
        
        array.insert("10");
        array.insert("20");
        array.insert("30");
        array.insert("40");
        array.insert("50");
        
        System.out.println("\nLista: ");
        for (String item : array.getList()) {
            System.out.println(item);
        }
        System.out.println("\nQuantidade de posições:" + array.getListSize());
        System.out.println("---------------\n");
    }
    
}
