/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex;

/**
 *
 * @author gabri
 */
public class EX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {                
        int[] v = {1, 5, 9, 2, 4, 6, 8, 0};
        int[] sortedArray;
        String result = "";
        
        Sort sort = new Sort(v);
        
        sortedArray = sort.bubbleSort();
        
        result = "";
        for (int value : sortedArray) {
            result += value + " ";
        };
        
        System.out.println("Bubble sort: ");
        System.out.println(result);

        
        sortedArray = sort.selectionSort();
        
        result = "";
        for (int value : sortedArray) {
            result += value + " ";
        };
        
        System.out.println("Selection sort: ");
        System.out.println(result);
        

        sortedArray = sort.insertionSort();
        
        result = "";
        for (int value : sortedArray) {
            result += value + " ";
        };
        
        System.out.println("Insertion sort: ");
        System.out.println(result);
    }  
}
