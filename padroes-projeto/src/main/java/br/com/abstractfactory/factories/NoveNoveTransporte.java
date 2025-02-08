package br.com.abstractfactory.factories;

import br.com.abstractfactory.aeronaves.IAeronave;
import br.com.abstractfactory.aeronaves.IHelicoptero;
import br.com.abstractfactory.veiculosterrestres.IVeiculoTerrestre;
import br.com.abstractfactory.veiculosterrestres.Motocicleta;

public class NoveNoveTransporte implements ITransporteFactory {
    @Override
    public IVeiculoTerrestre criarTransporteTerrestre() {
        return new Motocicleta();
    }

    @Override
    public IAeronave criarTransporteAereo() {
        return new IHelicoptero();
    }
}
