package br.com.criacional.abstractfactory.app;

import br.com.criacional.abstractfactory.aeronaves.IAeronave;
import br.com.criacional.abstractfactory.factories.ITransporteAquaticoFactory;
import br.com.criacional.abstractfactory.factories.ITransporteFactory;
import br.com.criacional.abstractfactory.veiculosaquaticos.IVeiculoAquatico;
import br.com.criacional.abstractfactory.veiculosterrestres.IVeiculoTerrestre;

import static java.util.Objects.nonNull;

public class Application {
    private IVeiculoTerrestre veiculoTerrestre;
    private IAeronave aeronave;
    private IVeiculoAquatico veiculoAquatico;

    public Application(ITransporteFactory factory) {
    }

    public Application() {
    }

    public Application(IVeiculoAquatico veiculoAquatico) {
        this.veiculoAquatico = veiculoAquatico;
    }


    public IVeiculoTerrestre veiculoTerrestre(ITransporteFactory transporteFactory) {
        veiculoTerrestre = transporteFactory.criarTransporteTerrestre();
        return veiculoTerrestre;
    }

    public IAeronave aeronave(ITransporteFactory transporteFactory) {
        aeronave = transporteFactory.criarTransporteAereo();
        return aeronave;
    }

    public IVeiculoAquatico veiculoAquatico(ITransporteAquaticoFactory transporteFactory) {
        veiculoAquatico = transporteFactory.criarTransporteAquatico();
        return veiculoAquatico;
    }

    public void iniciaRota() {

        if (nonNull(veiculoTerrestre)) {
            veiculoTerrestre.inicioRota();
        } else if (nonNull(aeronave)) {
            aeronave.inicioRota();
        } else {
            veiculoAquatico.inicioRota();
        }
    }
}
