package br.com.criacional.factory.contacorrente;

import br.com.criacional.factory.contacorrente.factory.AberturaContaFactory;
import br.com.criacional.factory.contacorrente.factory.PessoaFisicaAberturaConta;
import br.com.criacional.factory.contacorrente.factory.PessoaJuridicaAberturaConta;

import static java.util.Objects.nonNull;

public class ClientApp {
    private static AberturaContaFactory aberturaContaFactory;

    public static void main(String[] args) {
//        var tipoPessoa = "PessoaFisica";
        var tipoPessoa = "PessoaJuridica";

        tipoConta(tipoPessoa);

        if (nonNull(aberturaContaFactory)) {
            abrirConta();
        }
    }

    private static void abrirConta() {
    aberturaContaFactory.abrirConta();
    }

    private static void tipoConta(String tipoConta){
        switch (tipoConta){
            case "PessoaFisica":
                aberturaContaFactory = new PessoaFisicaAberturaConta();
                break;
            case "PessoaJuridica":
                aberturaContaFactory = new PessoaJuridicaAberturaConta();
                break;
            default:
                System.out.println("Selecione o tipo de pessoa");
        }
    }


}
