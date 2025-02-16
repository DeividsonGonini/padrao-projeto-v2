package br.com.criacional.abstractfactory.factories;

import br.com.criacional.abstractfactory.aeronaves.Aviao;
import br.com.criacional.abstractfactory.aeronaves.IAeronave;
import br.com.criacional.abstractfactory.veiculosterrestres.Carro;
import br.com.criacional.abstractfactory.veiculosterrestres.IVeiculoTerrestre;

public class UberTransporte implements ITransporteFactory{
    @Override
    public IVeiculoTerrestre criarTransporteTerrestre() {
        return new Carro();
    }

    @Override
    public IAeronave criarTransporteAereo() {
        return new Aviao();
    }
}
