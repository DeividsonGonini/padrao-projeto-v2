package br.com.criacionais.factory.animais.animalfactory;

import br.com.criacionais.factory.animais.animal.IAnimais;
import br.com.criacionais.factory.animais.animal.Pitbull;

public class PitbullFactory extends AnimalFactory{

    //método implementado da factory para criar o animal especifico
    @Override
    protected IAnimais animalCriado() {
        return new Pitbull();
    }
}
