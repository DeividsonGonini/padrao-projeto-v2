package br.com.criacionais.abstractfactory.factories;

import br.com.criacionais.abstractfactory.veiculosaquaticos.IVeiculoAquatico;

public interface ITransporteAquaticoFactory {
    IVeiculoAquatico criarTransporteAquatico();
}
