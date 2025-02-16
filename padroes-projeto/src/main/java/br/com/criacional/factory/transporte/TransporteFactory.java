package br.com.criacional.factory.transporte;

import br.com.criacional.factory.transporte.vehicles.IVeiculo;
//Factory
public abstract class TransporteFactory {
    //Cria o veiculoe inicia o transporte
    void inicioTransporte() {
        IVeiculo veiculo = criaTransporte();
        veiculo.inicioRota();
    }

    protected abstract IVeiculo criaTransporte();
}
