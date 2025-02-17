package br.com.criacionais.abstractfactory.veiculosterrestres;

public class Motocicleta implements IVeiculoTerrestre {
    @Override
    public void inicioRota() {
        pegarCarga();
        System.out.println("Iniciando a entrega");
    }

    @Override
    public void pegarCarga() {
        System.out.println("Já pegamos a encomenda");
    }
}
