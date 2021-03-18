package Ex01;

import java.util.Scanner;

public class Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arrayA[] = new int[10];        
        int arrayB[] = new int[10];        
        int i = 0;
        int aux = 0;
        
        for(i = 0; i < 10; i++){
            System.out.println("Digite o " + (i + 1) + "° número");
            arrayA[i] = Integer.parseInt(scanner.nextLine());
        }
        
        for(i = 9; i >= 0; i--){
            arrayB[i] = arrayA[aux];
            aux++;
        }
        
        System.out.println("A  B");
        
        for(i = 0; i < 10; i++){
            System.out.println(arrayA[i] + "  " + arrayB[i]);
        }
    }
    
}
