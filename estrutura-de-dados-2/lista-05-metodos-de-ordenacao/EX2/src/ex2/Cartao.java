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
public class Cartao {
    public final String nomeCartao;
    public final int numeroCartao;
    public final Date dataExpiracao;
    
    public Cartao(String nomeCartao, int numeroCartao, Date dataExpiracao) {
        this.nomeCartao = nomeCartao;
        this.numeroCartao = numeroCartao;
        this.dataExpiracao = dataExpiracao;
    }
}
