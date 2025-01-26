package br.com.factory.transporte;

import br.com.factory.transporte.vehicles.IVeiculo;
import br.com.factory.transporte.vehicles.Moto;
//Classe concreta da Factory
public class MotoTransporte extends TransporteFactory {

    @Override
    protected IVeiculo criaTransporte() {
        return new Moto();
    }
}
