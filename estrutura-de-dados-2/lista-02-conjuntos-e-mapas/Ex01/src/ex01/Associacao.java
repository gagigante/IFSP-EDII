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
public class Associacao {
    private String placa;
    private Carro carro;
    
    public Associacao(String placa, Carro carro) {
        this.placa = placa;
        this.carro = carro;
    }
    
    public String getPlaca() {
        return this.placa;
    }
    
    public Carro getCarro() {
        return this.carro;
    }
}
