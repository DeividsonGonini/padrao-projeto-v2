package br.com.criacional.factory.transporte.vehicles;

public class Moto implements IVeiculo {

    @Override
    public void inicioRota() {
        pegarCarga();
        System.out.println("Iniciando a entrega");
    }

    @Override
    public void pegarCarga() {
        System.out.println("Já pegamos a encomenda.");
    }
}
