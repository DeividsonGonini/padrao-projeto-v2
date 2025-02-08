package br.com.abstractfactory.factories;

import br.com.abstractfactory.aeronaves.IAeronave;
import br.com.abstractfactory.veiculosterrestres.IVeiculoTerrestre;

public interface ITransporteFactory {
    IVeiculoTerrestre criarTransporteTerrestre();
    IAeronave criarTransporteAereo();
}
