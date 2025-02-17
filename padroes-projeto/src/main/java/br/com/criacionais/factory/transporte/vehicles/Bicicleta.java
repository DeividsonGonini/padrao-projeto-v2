package br.com.criacionais.factory.transporte.vehicles;

public class Bicicleta implements IVeiculo{
    @Override
    public void inicioRota() {
        System.out.println("Iniciando o Delivery");
    }

    @Override
    public void pegarCarga() {
        System.out.println("Já pegamos a comida");
    }
}
