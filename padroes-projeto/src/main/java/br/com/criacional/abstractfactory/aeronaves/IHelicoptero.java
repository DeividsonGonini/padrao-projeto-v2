package br.com.criacional.abstractfactory.aeronaves;

public class IHelicoptero implements IAeronave {
    @Override
    public void inicioRota() {
        informacaoVento();
        pegarCarga();
        System.out.println("Iniciando a decolagem");
    }

    @Override
    public void pegarCarga() {
        System.out.println("Passageiros a bordo. ligando hélices!");
    }

    @Override
    public void informacaoVento() {
        System.out.println("Ventos a 35km/h, ventos ok.");
    }
}
