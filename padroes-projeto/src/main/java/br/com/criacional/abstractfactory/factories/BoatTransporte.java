package br.com.criacional.abstractfactory.factories;

import br.com.criacional.abstractfactory.veiculosaquaticos.IVeiculoAquatico;
import br.com.criacional.abstractfactory.veiculosaquaticos.NavioContainer;

public class BoatTransporte implements ITransporteAquaticoFactory {


    @Override
    public IVeiculoAquatico criarTransporteAquatico() {
        return new NavioContainer();
    }
}
