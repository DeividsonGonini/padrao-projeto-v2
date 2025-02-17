package br.com.criacionais.abstractfactory.factories;

import br.com.criacionais.abstractfactory.aeronaves.Aviao;
import br.com.criacionais.abstractfactory.aeronaves.IAeronave;
import br.com.criacionais.abstractfactory.veiculosterrestres.Carro;
import br.com.criacionais.abstractfactory.veiculosterrestres.IVeiculoTerrestre;

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
