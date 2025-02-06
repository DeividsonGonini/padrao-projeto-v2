package br.com.factory.transporte.vehicles;

public class Carro implements IVeiculo {
    @Override
    public void inicioRota() {
        pegarCarga();
        System.out.println("iniciando o trajeto");
    }

    @Override
    public void pegarCarga() {
        System.out.println("Pegamos os passageiros, estamos prontos");
    }
}
