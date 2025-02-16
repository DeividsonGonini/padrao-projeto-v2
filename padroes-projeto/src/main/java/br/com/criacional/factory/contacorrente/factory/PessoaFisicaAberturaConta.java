package br.com.criacional.factory.contacorrente.factory;

import br.com.criacional.factory.contacorrente.segmentos.ISegmentos;
import br.com.criacional.factory.contacorrente.segmentos.PessoaFisica;

public class PessoaFisicaAberturaConta extends AberturaContaFactory{
    @Override
    protected ISegmentos criarContaCorrente() {
        return new PessoaFisica();
    }
}
