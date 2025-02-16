package br.com.criacional.factory.transporte;

import br.com.criacional.factory.transporte.vehicles.Bicicleta;
import br.com.criacional.factory.transporte.vehicles.IVeiculo;

//Classe concreta da Factory
public class BicicletaTransporte extends TransporteFactory{
    @Override
    protected IVeiculo criaTransporte() {
        return new Bicicleta();
    }
}
