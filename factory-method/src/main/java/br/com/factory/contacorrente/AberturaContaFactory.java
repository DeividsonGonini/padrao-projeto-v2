package br.com.factory.contacorrente;

import br.com.factory.contacorrente.segmentos.ISegmentos;

public abstract class AberturaContaFactory {

    void abrirConta(){
        ISegmentos segmento = criarContaCorrente();
        segmento.criarContaCorrente();
    }

    protected abstract ISegmentos criarContaCorrente();
}
