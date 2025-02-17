package br.com.criacionais.factory.transporte;

import br.com.criacionais.factory.transporte.vehicles.IVeiculo;
import br.com.criacionais.factory.transporte.vehicles.Moto;
//Classe concreta da Factory
public class MotoTransporte extends TransporteFactory {

    @Override
    protected IVeiculo criaTransporte() {
        return new Moto();
    }
}
