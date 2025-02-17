package br.com.criacionais.abstractfactory.factories;

import br.com.criacionais.abstractfactory.aeronaves.IAeronave;
import br.com.criacionais.abstractfactory.aeronaves.IHelicoptero;
import br.com.criacionais.abstractfactory.veiculosterrestres.IVeiculoTerrestre;
import br.com.criacionais.abstractfactory.veiculosterrestres.Motocicleta;

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
