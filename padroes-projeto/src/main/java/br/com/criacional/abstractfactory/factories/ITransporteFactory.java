package br.com.criacional.abstractfactory.factories;

import br.com.criacional.abstractfactory.aeronaves.IAeronave;
import br.com.criacional.abstractfactory.veiculosterrestres.IVeiculoTerrestre;

public interface ITransporteFactory {
    IVeiculoTerrestre criarTransporteTerrestre();
    IAeronave criarTransporteAereo();
}
