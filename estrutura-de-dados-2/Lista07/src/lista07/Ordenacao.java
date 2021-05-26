/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista07;

import java.util.Arrays;
import static java.util.Arrays.sort;

/**
 *
 * @author GABRIEL
 */
public class Ordenacao {
    public void ShellSort(int[] vetor) {
        int intervalo = vetor.length / 2;
        while(intervalo > 0) {
            for(int proximaPos = intervalo; proximaPos < vetor.length; proximaPos++) {
                insert(vetor, proximaPos, intervalo);
            }
            intervalo = (int) (intervalo / 2);
        }
        imprime(vetor);
    }
    
    private void insert(int[] vetor, int proximaPos, int intervalo) {
        int proximoVal = vetor[proximaPos];
        while((proximaPos > intervalo - 1) && (proximoVal < vetor[proximaPos - intervalo])) {
            vetor[proximaPos] = vetor[proximaPos - intervalo];
            proximaPos -= intervalo;
        }
        vetor[proximaPos] = proximoVal;
    }
    
    public void MergeSort(int[] vetor) {
        if(vetor.length > 1) {
            int intervalo = vetor.length / 2;
            int[] vetorEsq = new int[intervalo];
            int[] vetorDir = new int[intervalo];
            System.arraycopy(vetor, 0, vetorEsq, 0, intervalo);
            System.arraycopy(vetor, intervalo, vetorDir, 0, (vetor.length - intervalo - 1));
            sort(vetorEsq);
            sort(vetorDir);
            merge(vetor, vetorEsq, vetorDir);
        }
        imprime(vetor);
    }
    
    private void merge(int[] vetor, int[] vetorEsq, int[] vetorDir) {
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < vetorEsq.length && j < vetorDir.length) {
            if(vetorEsq[i] < vetorDir[j]) {
                vetor[k++] = vetorEsq[i++];
            }else{
                vetor[k++] = vetorDir[j++];
            }
            
            while(i < vetorEsq.length) {
                vetor[k++] = vetorEsq[i++];
            }
            while(j < vetorDir.length) {
                vetor[k++] = vetorDir[j++];
            }
        }
    }
    
    public void QuickSort(int[] vetor) {
        sortQuick(vetor, 0, vetor.length - 1);
        imprime(vetor);
    }
    
    public void sortQuick(int[] vetor, int comeco, int fim) {
        if(comeco < fim) {
            int pivot = partition(vetor, comeco, fim);
            sortQuick(vetor, comeco, pivot - 1);
            sortQuick(vetor, pivot + 1, fim);
        }
    }
    
    private int partition(int[] vetor, int comeco, int fim) {
        bubbleSort(vetor, comeco, fim);
        int pivot = vetor[comeco];
        int i = comeco + 1;
        int f = fim;
        while(i <= f) {
            if(vetor[i] < pivot){
                i++;
            }else{
                if(pivot < vetor[f]) {
                    f--;
                }else{
                    int troca = vetor[i];
                    vetor[i] = vetor[f];
                    vetor[f] = troca;
                    i++;
                    f--;
                }
            }            
        }
        vetor[comeco] = vetor[f];
        vetor[f] = pivot;
        return f;
    }
    
    public void bubbleSort(int[] v, int comeco, int fim) {
        int aux;
        
        for (int i = comeco; i <= fim; i++) {            
            for (int x = comeco; x < fim - 1; x++) {
                if (v[x + 1] < v[x]) {
                    aux = v[x];
                    
                    v[x] = v[x + 1];
                    v[x + 1] = aux;
                }
            }
        }
    }
    
    private void imprime(int[] vetor) {
        for(int v : vetor) {
            System.out.print(v + " ");
        }
        System.out.println("");
    }
}
