package br.com.abstractfactory.factories;

import br.com.abstractfactory.veiculosaquaticos.IVeiculoAquatico;

public interface ITransporteAquaticoFactory {
    IVeiculoAquatico criarTransporteAquatico();
}
