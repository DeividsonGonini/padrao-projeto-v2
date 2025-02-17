package br.com.criacionais.factory.transporte;

import br.com.criacionais.factory.transporte.vehicles.Carro;
import br.com.criacionais.factory.transporte.vehicles.IVeiculo;
//Classe concreta da Factory
public class CarroTransporte extends TransporteFactory {
    @Override
    protected IVeiculo criaTransporte() {
        return new Carro();
    }
}
