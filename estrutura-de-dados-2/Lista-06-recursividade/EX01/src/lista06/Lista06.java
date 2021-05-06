package lista06;

public class Lista06 {

    public static void main(String[] args) {
        Recursividade r = new Recursividade();
        
        int[] v = new int[]{2, 1, 98, 4, 26, 99, 74};
        int[] v1 = new int[]{4, 5, 3, 4, 2, 5};
        
        // EXERCÍCIO 1
        System.out.println("Fatorial de 5 é " + r.fatorial(5));
        
        // EXERCÍCIO 2
        System.out.println("Maior é " + r.maior(v, v.length));
        
        // EXERCÍCIO 3
        System.out.println("Produto é " + r.produto(v1, 0));
        
        // EXERCÍCIO 4
        System.out.println("Inversão de array ");
        System.out.println(r.inverte(v1, 0, v1.length - 1));
        
        // EXERCÍCIO 5
        System.out.println("MDC de 120 e 100 é " + r.mdc(120, 100));
        
        // EXERCÍCIO 6
        System.out.println("Módulo de 11 e 5 é " + r.modulo(11, 5));
    }
    
}
