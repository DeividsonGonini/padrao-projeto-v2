package br.com.abstractfactory.aeronaves;

public class Aviao implements IAeronave {

    @Override
    public void inicioRota() {
        informacaoVento();
        pegarCarga();
        System.out.println("Iniciando a decolagem");
    }

    @Override
    public void pegarCarga() {
        System.out.println("Passageiros a bordo. Vôo autorizado");
    }

    @Override
    public void informacaoVento() {
        System.out.println("Ventos a 25km/h, ventos ok!");
    }
}
