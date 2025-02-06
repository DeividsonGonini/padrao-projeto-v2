package br.com.factory.transporte;

import br.com.factory.transporte.vehicles.Bicicleta;
import br.com.factory.transporte.vehicles.IVeiculo;

//Classe concreta da Factory
public class BicicletaTransporte extends TransporteFactory{
    @Override
    protected IVeiculo criaTransporte() {
        return new Bicicleta();
    }
}
