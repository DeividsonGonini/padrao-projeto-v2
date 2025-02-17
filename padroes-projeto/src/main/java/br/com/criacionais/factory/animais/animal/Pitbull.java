package br.com.criacionais.factory.animais.animal;

//Classe para criar o animal desejado
public class Pitbull implements IAnimais{
    @Override
    public void criarAnimal() {
        System.out.println("Criando Pitbull");
        tipoAnimal();
    }

    @Override
    public void tipoAnimal() {
        System.out.println("Animal do tipo cachorro - terrestre");
    }
}
