package br.com.abstractfactory.factories;

import br.com.abstractfactory.aeronaves.Aviao;
import br.com.abstractfactory.aeronaves.IAeronave;
import br.com.abstractfactory.veiculosterrestres.Carro;
import br.com.abstractfactory.veiculosterrestres.IVeiculoTerrestre;

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
