package br.com.factory.contacorrente.segmentos;

public class PessoaFisica implements ISegmentos{
    @Override
    public void criarContaCorrente() {
        System.out.println("Abertura de conta para Pessoa Fisica");
        documentosNecessarios();
    }

    @Override
    public void documentosNecessarios() {
        System.out.println("Documentos para abertura de conta Pessoa Fisica");
    }
}
