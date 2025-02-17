package br.com.criacionais.factory.transporte;

import br.com.criacionais.factory.transporte.vehicles.Bicicleta;
import br.com.criacionais.factory.transporte.vehicles.IVeiculo;

//Classe concreta da Factory
public class BicicletaTransporte extends TransporteFactory{
    @Override
    protected IVeiculo criaTransporte() {
        return new Bicicleta();
    }
}
