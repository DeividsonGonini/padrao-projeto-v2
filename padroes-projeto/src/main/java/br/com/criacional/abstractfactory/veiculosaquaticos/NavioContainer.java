package br.com.criacional.abstractfactory.veiculosaquaticos;

public class NavioContainer implements IVeiculoAquatico{
    @Override
    public void inicioRota() {
        pegarCarga();

        System.out.println("Iniciando viagem pelo oceano");
    }

    @Override
    public void pegarCarga() {
        System.out.println("Containers carregados, podemos seguir.");
    }
}
