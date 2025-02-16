package br.com.criacional.factory.contacorrente.factory;

import br.com.criacional.factory.contacorrente.segmentos.ISegmentos;
import br.com.criacional.factory.contacorrente.segmentos.PessoaJuridica;

public class PessoaJuridicaAberturaConta extends AberturaContaFactory{
    @Override
    protected ISegmentos criarContaCorrente() {
        return new PessoaJuridica();
    }
}
