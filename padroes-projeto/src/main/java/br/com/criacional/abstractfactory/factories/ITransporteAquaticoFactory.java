package br.com.criacional.abstractfactory.factories;

import br.com.criacional.abstractfactory.veiculosaquaticos.IVeiculoAquatico;

public interface ITransporteAquaticoFactory {
    IVeiculoAquatico criarTransporteAquatico();
}
