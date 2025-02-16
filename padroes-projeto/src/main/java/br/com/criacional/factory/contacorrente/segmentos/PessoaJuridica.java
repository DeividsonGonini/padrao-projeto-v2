package br.com.criacional.factory.contacorrente.segmentos;

public class PessoaJuridica implements ISegmentos{

    @Override
    public void criarContaCorrente() {
        System.out.println("Abertura de conta para Pessoa Juridica");
        documentosNecessarios();
    }

    @Override
    public void documentosNecessarios() {
        System.out.println("Documentos para abertura de conta Pessoa Juridica");
    }
}
