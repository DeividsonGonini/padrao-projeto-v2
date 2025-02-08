package br.com.abstractfactory.app;

import br.com.abstractfactory.aeronaves.IAeronave;
import br.com.abstractfactory.factories.ITransporteAquaticoFactory;
import br.com.abstractfactory.factories.ITransporteFactory;
import br.com.abstractfactory.veiculosaquaticos.IVeiculoAquatico;
import br.com.abstractfactory.veiculosterrestres.IVeiculoTerrestre;

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

    //    public Application(ITransporteFactory factory){
//        veiculosTerrestres = factory.criarTransporteTerrestre();
//        aeronaves = factory.criarTransporteAereo();
//        veiculoAquatico = factory
//    }

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
