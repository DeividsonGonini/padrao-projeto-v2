package br.com.criacional.abstractfactory.factories;

import br.com.criacional.abstractfactory.aeronaves.IAeronave;
import br.com.criacional.abstractfactory.aeronaves.IHelicoptero;
import br.com.criacional.abstractfactory.veiculosterrestres.IVeiculoTerrestre;
import br.com.criacional.abstractfactory.veiculosterrestres.Motocicleta;

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
