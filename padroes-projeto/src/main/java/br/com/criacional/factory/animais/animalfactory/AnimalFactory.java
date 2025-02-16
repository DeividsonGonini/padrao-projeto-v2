package br.com.criacional.factory.animais.animalfactory;

import br.com.criacional.factory.animais.animal.IAnimais;

//Factory para criar os animais
public abstract class AnimalFactory {

    //Cria genericamente um animal
    public void fabricaAnimal(){
        IAnimais animal = animalCriado();
        //metodo da Interface para criar animais
        animal.criarAnimal();
    }

    //método utilizado pela factory do animal para criar o animal especifico
    protected abstract IAnimais animalCriado();


}
