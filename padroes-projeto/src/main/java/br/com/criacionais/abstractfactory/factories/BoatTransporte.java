package br.com.criacionais.abstractfactory.factories;

import br.com.criacionais.abstractfactory.veiculosaquaticos.IVeiculoAquatico;
import br.com.criacionais.abstractfactory.veiculosaquaticos.NavioContainer;

public class BoatTransporte implements ITransporteAquaticoFactory {


    @Override
    public IVeiculoAquatico criarTransporteAquatico() {
        return new NavioContainer();
    }
}
