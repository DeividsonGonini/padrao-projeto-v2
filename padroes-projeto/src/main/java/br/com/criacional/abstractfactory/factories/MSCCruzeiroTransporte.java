package br.com.criacional.abstractfactory.factories;

import br.com.criacional.abstractfactory.veiculosaquaticos.Cruzeiro;
import br.com.criacional.abstractfactory.veiculosaquaticos.IVeiculoAquatico;

public class MSCCruzeiroTransporte implements ITransporteAquaticoFactory{
    @Override
    public IVeiculoAquatico criarTransporteAquatico() {
        return new Cruzeiro();
    }
}
