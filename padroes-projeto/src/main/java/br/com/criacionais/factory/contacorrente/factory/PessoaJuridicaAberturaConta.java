package br.com.criacionais.factory.contacorrente.factory;

import br.com.criacionais.factory.contacorrente.segmentos.ISegmentos;
import br.com.criacionais.factory.contacorrente.segmentos.PessoaJuridica;

public class PessoaJuridicaAberturaConta extends AberturaContaFactory{
    @Override
    protected ISegmentos criarContaCorrente() {
        return new PessoaJuridica();
    }
}
