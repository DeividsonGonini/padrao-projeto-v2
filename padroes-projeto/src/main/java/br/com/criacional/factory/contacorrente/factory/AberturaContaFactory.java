package br.com.criacional.factory.contacorrente.factory;

import br.com.criacional.factory.contacorrente.segmentos.ISegmentos;

public abstract class AberturaContaFactory {

    public void abrirConta() {
        ISegmentos segmento = criarContaCorrente();
        segmento.criarContaCorrente();
    }

    protected abstract ISegmentos criarContaCorrente();
}
