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
public class Pesquisa {  
    public void PesquisaSequencial(int[] v, int p) {
        int i;
        int pos = -1;
        
        for(i = 0; i < v.length; i++){
            if(p == v[i]){
                pos = i;
                break;
            }
        }
        
        if (pos == -1) {
            System.out.println("Item não encontrado");
        } else {
            System.out.println("Item encontrado");
        }
        
        System.out.println("Foram necessárias " + (i + 1) + " comparações para encontrar o item");
    }
    
    public void PesquisaSequencialComOrdenacao(int[] v, int p) {
        int i;
        int pos = -1;
        
        for(i = 0; i < v.length; i++) {
            if(p == v[i]) {
                for(int j = i; j > 0; j--) {
                  v[j] = v[j - 1];
                }
                
                v[0] = p;
                pos = i;
                break;
            }
        }
        
        if(pos == -1) {
            System.out.println("Item não encontrado");
        } else {
            System.out.println("Item encontrado");
        }
        
        System.out.println("Foram necessárias " + (i + 1) + " comparações para encontrar o item");
        
        for(i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
    }
    
    public void PesquisaBinaria(int[] v, int p) {
        int i = 0, j = 0;
        int pos = -1;
        int f = v.length;
        
        while((f-i) > -1) {
            j++;

            int meio = (f + i) / 2;
            
            if(p == v[meio]) {
                pos = meio;
                break;
            } else {
                if(p < v[meio]) {
                    f = meio - 1;
                } else {
                    i = meio + 1;
                }
            }
        }

        if(pos == -1) {
            System.out.println("Item não encontrado");
        } else {
            System.out.println("Item encontrado");
        }
        
        System.out.println("Foram necessárias " + j + " comparações para encontrar o item");        
    }
    
    public void PesquisaBinariaRecursiva(int[] v, int p, int i, int f, int j) {
        int pos = -1;
        
        if(i == f) {
            if(p == v[i]) {
                pos = i;
                System.out.println("Item encontrado");
            } else {
                pos = -1;
                System.out.println("Item não encontrado");
            }
            
            System.out.println("Foram necessárias " + (j + 1) + " comparações para encontrar o item");      
            return;
        }
        
        int meio = (f + i) / 2;
        
        if(p == v[meio]) {
            pos = meio;
            System.out.println("Item encontrado");
            System.out.println("Foram necessárias " + (j + 1) + " comparações para encontrar o item");      
            return;
        }
        
        if(p > v[meio]) {
            PesquisaBinariaRecursiva(v, p, meio + 1, f, j+1);
        } else {
            PesquisaBinariaRecursiva(v, p, i, meio - 1, j+1);
        }
    }
}
