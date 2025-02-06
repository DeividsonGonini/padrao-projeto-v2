package br.com.factory.contacorrente.factory;

import br.com.factory.contacorrente.segmentos.ISegmentos;
import br.com.factory.contacorrente.segmentos.PessoaFisica;

public class PessoaFisicaAberturaConta extends AberturaContaFactory{
    @Override
    protected ISegmentos criarContaCorrente() {
        return new PessoaFisica();
    }
}
