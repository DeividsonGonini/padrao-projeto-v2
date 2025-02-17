package br.com.criacionais.factory.animais.animalfactory;

import br.com.criacionais.factory.animais.animal.BeijaFlor;
import br.com.criacionais.factory.animais.animal.IAnimais;

//Factory para criação de animais
public class BeijaFlorFactory extends AnimalFactory{

    // método implementado da factory para criar o animal especifico
    @Override
    protected IAnimais animalCriado() {
        return new BeijaFlor();
    }
}
