package br.com.criacionais.abstractfactory.factories;

import br.com.criacionais.abstractfactory.veiculosaquaticos.Cruzeiro;
import br.com.criacionais.abstractfactory.veiculosaquaticos.IVeiculoAquatico;

public class MSCCruzeiroTransporte implements ITransporteAquaticoFactory{
    @Override
    public IVeiculoAquatico criarTransporteAquatico() {
        return new Cruzeiro();
    }
}
