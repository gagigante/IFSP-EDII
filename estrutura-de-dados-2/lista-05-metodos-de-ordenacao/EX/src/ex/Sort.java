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
public class Sort {
    private final int[] values;
    
    public Sort(int[] values) {
        this.values = values;
    }
    
    public int[] bubbleSort() {
        int[] sortedArray = this.values;
        int aux;
        
        for (int i = 0; i <= sortedArray.length; i++) {            
            for (int x = 0; x < sortedArray.length - 1; x++) {
                if (sortedArray[x + 1] < sortedArray[x]) {
                    aux = sortedArray[x];
                    
                    sortedArray[x] = sortedArray[x + 1];
                    sortedArray[x + 1] = aux;
                }
            }
        }
        
        return sortedArray;
    }
    
    public int[] selectionSort() {
        int[] sortedArray = this.values;
        int index;
        int smallerNumber;
        
        for (int i = 0; i < sortedArray.length - 1; i++) {  
            index = i;
            
            for (int x = i + 1; x < sortedArray.length; x++) {  
                if (sortedArray[x] < sortedArray[index]){  
                    index = x;
                }
            }
            
            smallerNumber = sortedArray[index];
            
            sortedArray[index] = sortedArray[i];  
            sortedArray[i] = smallerNumber;  
        }
        
        return sortedArray;
    }
    
    public int[] insertionSort() {
        int[] sortedArray = this.values;
        
        for (int j = 1; j < sortedArray.length; j++) {  
            int key = sortedArray[j];  
            int i = j-1;  
            
            while ((i > -1) && (sortedArray[i] > key)) {  
                sortedArray[i+1] = sortedArray[i];  
                i--;  
            } 
            
            sortedArray[i+1] = key;  
        }
        
        return sortedArray;
    }
}
