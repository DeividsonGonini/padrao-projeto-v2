package br.com.abstractfactory;

import br.com.abstractfactory.app.Application;
import br.com.abstractfactory.factories.*;

public class Client {

    public static Application configureApplication() {
        Application app = new Application();
        ITransporteFactory factory;
        ITransporteAquaticoFactory transporteAquaticoFactory;

        String empresa = "msc";
//        String tipoVeiculo = "terrestre";
        String tipoVeiculo = "aereo";

        if (empresa.equals("uber")) {
            factory = new UberTransporte();
            if (tipoVeiculo.equals("terrestre")) {
                app.veiculoTerrestre(factory);
                return app;

            } else if (tipoVeiculo.equals("aereo")) {
                app.aeronave(factory);
                return app;
            }
        }
        if (empresa.equals("99")) {
            factory = new NoveNoveTransporte();
            if (tipoVeiculo.equals("terrestre")) {
                app.veiculoTerrestre(factory);
                return app;
            } else if (tipoVeiculo.equals("aereo")) {
                app.aeronave(factory);
                return app;
            }
        } else if (empresa.equals("boat")) {
            transporteAquaticoFactory = new BoatTransporte();
            app.veiculoAquatico(transporteAquaticoFactory);
            return app;
        } else if (empresa.equals("msc")){
            transporteAquaticoFactory = new MSCCruzeiroTransporte();
            app.veiculoAquatico(transporteAquaticoFactory);
            return app;
        }
        return app;
    }


public static void main(String[] args) {
    Application app = configureApplication();
    app.iniciaRota();
}
}

