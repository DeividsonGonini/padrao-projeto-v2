package br.com.criacionais.abstractfactory.veiculosaquaticos;

public class Cruzeiro implements IVeiculoAquatico{
    @Override
    public void inicioRota() {
        pegarCarga();

        System.out.println("Iniciando viagem transatlantica.");
    }

    @Override
    public void pegarCarga() {
        System.out.println("Todos os passageiros já embarcaram.");
    }
}
