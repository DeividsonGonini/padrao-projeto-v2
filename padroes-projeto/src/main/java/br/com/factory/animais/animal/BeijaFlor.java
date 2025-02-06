package br.com.factory.animais.animal;

//Classe para criar o animal desejado
public class BeijaFlor implements IAnimais{
    @Override
    public void criarAnimal() {
        System.out.println("Criando Beija-Flor");
        tipoAnimal();
    }

    @Override
    public void tipoAnimal() {
        System.out.println("Animal do tipo ave - voador");
    }
}
