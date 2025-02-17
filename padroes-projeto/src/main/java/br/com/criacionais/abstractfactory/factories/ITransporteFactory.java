package br.com.criacionais.abstractfactory.factories;

import br.com.criacionais.abstractfactory.aeronaves.IAeronave;
import br.com.criacionais.abstractfactory.veiculosterrestres.IVeiculoTerrestre;

public interface ITransporteFactory {
    IVeiculoTerrestre criarTransporteTerrestre();
    IAeronave criarTransporteAereo();
}
