/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista07;

/**
 *
 * @author GABRIEL
 */
public class Lista07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ordenacao o = new Ordenacao();
        int[] v = new int[]{15,20,0,9,541,169,221,122,5,3,80};
        o.ShellSort(v);
        o.MergeSort(v);
        o.QuickSort(v);
    }
    
}
