/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer01lista01;

import java.util.Scanner;

/**
 *
 * @author GABRIEL
 */
public class Exer01Lista01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vetorDeInt[] = new int[10];        
        int vetorDeIntB[] = new int[10];        
        int i = 0;
        int aux = 0;
        
        for(i = 0; i < 10; i++){
            System.out.println("Digite o " + (i + 1) + " número");
            vetorDeInt[i] = Integer.parseInt(sc.nextLine());
        }
        
        for(i = 9; i >= 0; i--){
            vetorDeIntB[i] = vetorDeInt[aux];
            aux++;
        }
        
        System.out.println("A  B");
        for(i = 0; i < 10; i++){
            System.out.println(vetorDeInt[i] + "  " + vetorDeIntB[i]);
        }
    }
    
}
