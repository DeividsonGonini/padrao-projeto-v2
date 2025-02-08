package br.com.abstractfactory.veiculosterrestres;

public class Carro implements IVeiculoTerrestre {

    @Override
    public void inicioRota() {
        pegarCarga();
        System.out.println("Iniciando o trajeto");
    }

    @Override
    public void pegarCarga() {
        System.out.println("Pegamos os passageiros, estamos prontos");

    }
}
