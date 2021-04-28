/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.util.Date;

/**
 *
 * @author gabri
 */
public class EX2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date d1 = new Date();
        Date d2 = new Date();
        
        Cartao c1 = new Cartao("Cartao 01", 123123, d1);
        Cartao c2 = new Cartao("Cartao 02", 123122, d1);
        Cartao c3 = new Cartao("Cartao 03", 123125, d2);
        
        Cartao[] cartoes = {c1, c2, c3};
        Cartao aux;
        
        for (int i = 0; i <= cartoes.length; i++) {            
            for (int x = 0; x < cartoes.length - 1; x++) {
                if (cartoes[x + 1].dataExpiracao.equals(cartoes[x].dataExpiracao)) {
                    if (cartoes[x + 1].numeroCartao < cartoes[x].numeroCartao) {
                        aux = cartoes[x];
                    
                        cartoes[x] = cartoes[x + 1];
                        cartoes[x + 1] = aux;
                        continue;
                    }
                }
                
                if (cartoes[x + 1].dataExpiracao.before(cartoes[x].dataExpiracao)) {
                    aux = cartoes[x];
                    
                    cartoes[x] = cartoes[x + 1];
                    cartoes[x + 1] = aux;
                }
            }
        }
        
        for (Cartao c : cartoes) {
            System.out.println(c.nomeCartao);
        }
    }
}
