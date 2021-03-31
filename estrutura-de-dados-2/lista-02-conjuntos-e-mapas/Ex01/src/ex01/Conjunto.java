/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author gabriel
 */
public class Conjunto {
    private ArrayList<LinkedList<String>> tabela = new ArrayList<LinkedList<String>>();
    private int tamanho = 0;
    
    public Conjunto() {
        for(int i = 0; i < 26; i++) {
            this.tabela.add(new LinkedList());
        }
    }
    
    private int calcularPosicao(String palavra){
        int ascii = palavra.toLowerCase().charAt(0);
        
        return ascii % 26;
    }
    
    public void adicionar(String palavra) { 
        if (!contem(palavra)) {
            int codigo = calcularPosicao(palavra);
            
            LinkedList lista = this.tabela.get(codigo);
            lista.add(palavra);
            this.tamanho++;
        };
    }
    
    public void remover(String palavra) { 
        if (contem(palavra)) {
            int codigo = calcularPosicao(palavra);
        
            LinkedList lista = this.tabela.get(codigo);
            lista.remove(palavra);
            this.tamanho--;
        }
    }
    
    public boolean contem(String palavra) {
        int codigo = this.calcularPosicao(palavra);
        
        LinkedList lista = this.tabela.get(codigo);
        
        return lista.contains(palavra);
    }
    
    public boolean estaVazio() { 
        return this.tamanho == 0; 
    }

    public LinkedList<String> todos() {
        LinkedList<String> lista = new LinkedList();
        
        for(int i = 0; i < this.tabela.size(); i++) {
            lista.addAll(this.tabela.get(i) );
        }
        
        return lista;
    }
    
    public int tamanho() { 
        return this.tamanho; 
    }
}
