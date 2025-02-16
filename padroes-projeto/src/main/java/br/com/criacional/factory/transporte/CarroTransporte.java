package br.com.criacional.factory.transporte;

import br.com.criacional.factory.transporte.vehicles.Carro;
import br.com.criacional.factory.transporte.vehicles.IVeiculo;
//Classe concreta da Factory
public class CarroTransporte extends TransporteFactory {
    @Override
    protected IVeiculo criaTransporte() {
        return new Carro();
    }
}
