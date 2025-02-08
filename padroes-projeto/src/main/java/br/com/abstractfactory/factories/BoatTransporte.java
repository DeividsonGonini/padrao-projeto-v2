package br.com.abstractfactory.factories;

import br.com.abstractfactory.veiculosaquaticos.IVeiculoAquatico;
import br.com.abstractfactory.veiculosaquaticos.NavioContainer;

public class BoatTransporte implements ITransporteAquaticoFactory {


    @Override
    public IVeiculoAquatico criarTransporteAquatico() {
        return new NavioContainer();
    }
}
