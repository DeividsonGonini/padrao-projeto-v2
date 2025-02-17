package br.com.criacionais.factory.contacorrente.factory;

import br.com.criacionais.factory.contacorrente.segmentos.ISegmentos;
import br.com.criacionais.factory.contacorrente.segmentos.PessoaFisica;

public class PessoaFisicaAberturaConta extends AberturaContaFactory{
    @Override
    protected ISegmentos criarContaCorrente() {
        return new PessoaFisica();
    }
}
