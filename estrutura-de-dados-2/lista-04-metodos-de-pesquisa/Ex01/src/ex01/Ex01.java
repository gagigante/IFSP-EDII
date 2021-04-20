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
        int[] v = {2,5,3,1,4,6};
        int[] vo = {1,2,3,4,5,6};
        
        Pesquisa p = new Pesquisa();

        p.PesquisaSequencial(v, 1);
        p.PesquisaSequencial(vo, 1);
        p.PesquisaSequencialComOrdenacao(v, 4);
        p.PesquisaBinaria(v, 4);
        p.PesquisaBinariaRecursiva(v, 5, 0, 5, 0);
    }
    
}
