package br.com.criacionais.abstractfactory;

import br.com.criacionais.abstractfactory.app.Application;
import br.com.criacionais.abstractfactory.factories.*;

import javax.swing.*;

public class Client {

    public static Application configureApplication() {
        Application app = new Application();
        ITransporteFactory factory;
        ITransporteAquaticoFactory transporteAquaticoFactory;

        String empresa = JOptionPane.showInputDialog(""
                + "Digite uma das opções abaixo:\n"
                + "- Uber\n" + "- 99\n" + "- MSC\n" + "- Boat");

        switch (empresa) {
            case "uber": {
                factory = new UberTransporte();
                String tipoVeiculo = JOptionPane.showInputDialog(""
                        + "Digite uma das opções abaixo:\n"
                        + "terrestre\n" + "aereo\n");

                if (tipoVeiculo.equals("terrestre")) {
                    app.veiculoTerrestre(factory);
                    break;
                } else if (tipoVeiculo.equals("aereo")) {
                    app.aeronave(factory);
                    break;
                } else {
                    throw new IllegalArgumentException("Veículo inválido! " + tipoVeiculo);
                }
            }
            case "99": {
                factory = new NoveNoveTransporte();
                String tipoVeiculo = JOptionPane.showInputDialog(""
                        + "Digite uma das opções abaixo:\n"
                        + "terrestre\n" + "aereo\n");

                if (tipoVeiculo.equals("terrestre")) {
                    app.veiculoTerrestre(factory);
                    break;
                } else if (tipoVeiculo.equals("aereo")) {
                    app.aeronave(factory);
                    break;
                } else {
                    throw new IllegalArgumentException("Veículo inválido! " + tipoVeiculo);
                }
            }
            case "boat": {
                transporteAquaticoFactory = new BoatTransporte();
                app.veiculoAquatico(transporteAquaticoFactory);
                break;
            }
            case "msc": {
                transporteAquaticoFactory = new MSCCruzeiroTransporte();
                app.veiculoAquatico(transporteAquaticoFactory);
                break;
            }
            default:
                throw new IllegalArgumentException("Empresa inválida: " + empresa);
        }
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.iniciaRota();
    }
}

