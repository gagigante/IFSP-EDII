/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gabriel
 */
public class MapaLista {
    // lista de associações
    private List<Associacao> associacoes = new ArrayList<Associacao>();
    
    // métodos
    public void adicionar(String placa, Carro carro) {
        if (this.contemChave(placa)) { 
            this.remover(placa);
        }
        
        this.associacoes.add(new Associacao(placa, carro) );
    }
    
    public void remover(String placa){
        if (this.contemChave(placa)) {
            for(int i = 0; i < this.associacoes.size(); i++) {
                Associacao associacao = this.associacoes.get(i);
                
                if (placa.equals(associacao.getPlaca())) {
                    this.associacoes.remove(i);
                    break;
                }
            }
        } else {
            System.err.println("Placa não encontrada no mapa");
        }
    }
    
    public boolean contemChave(String placa){ 
        for(Associacao associacao : this.associacoes) {
            if (placa.equals(associacao.getPlaca())) {
                return true;
            }
        }
        
        return false;
    }
    
    public Carro pegar(String placa){ 
        if (this.contemChave(placa)) {
            for(Associacao associacao : this.associacoes) {
                if (placa.equals(associacao.getPlaca())) {
                    return associacao.getCarro();
                }
            }
        }
        
        return null;
    }
    
    public int tamanho() {
        return this.associacoes.size();
    }
}
