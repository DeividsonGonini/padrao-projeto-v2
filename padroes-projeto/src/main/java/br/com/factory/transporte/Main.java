package br.com.factory.transporte;

import static java.util.Objects.nonNull;

public class Main {
    private static TransporteFactory transporteFactory;

    public static void main(String[] args) {
        configure(args[0]);
        if (nonNull(transporteFactory)){
            runTransporte();
        };
    }

    private static void runTransporte() {
    transporteFactory.inicioTransporte();
    }

    private static void configure(String type) {
        switch (type) {
            case "uber":
                transporteFactory = new CarroTransporte();
                break;
            case "log":
                transporteFactory = new MotoTransporte();
                break;
            case "eats":
                transporteFactory = new BicicletaTransporte();
                break;
            default:
                System.out.println("Selecione o tipo de entrega");
        }
    }
}