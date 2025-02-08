package br.com.abstractfactory.factories;

import br.com.abstractfactory.veiculosaquaticos.Cruzeiro;
import br.com.abstractfactory.veiculosaquaticos.IVeiculoAquatico;

public class MSCCruzeiroTransporte implements ITransporteAquaticoFactory{
    @Override
    public IVeiculoAquatico criarTransporteAquatico() {
        return new Cruzeiro();
    }
}
