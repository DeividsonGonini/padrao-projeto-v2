package br.com.factory.transporte;

import br.com.factory.transporte.vehicles.Carro;
import br.com.factory.transporte.vehicles.IVeiculo;
//Classe concreta da Factory
public class CarroTransporte extends TransporteFactory {
    @Override
    protected IVeiculo criaTransporte() {
        return new Carro();
    }
}
