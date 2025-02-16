package br.com.criacional.factory.transporte;

import br.com.criacional.factory.transporte.vehicles.IVeiculo;
import br.com.criacional.factory.transporte.vehicles.Moto;
//Classe concreta da Factory
public class MotoTransporte extends TransporteFactory {

    @Override
    protected IVeiculo criaTransporte() {
        return new Moto();
    }
}
