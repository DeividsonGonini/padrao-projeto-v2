package br.com.factory.contacorrente;

import br.com.factory.contacorrente.segmentos.ISegmentos;
import br.com.factory.contacorrente.segmentos.PessoaJuridica;

public class PessoaJuridicaAberturaConta extends AberturaContaFactory{
    @Override
    protected ISegmentos criarContaCorrente() {
        return new PessoaJuridica();
    }
}
