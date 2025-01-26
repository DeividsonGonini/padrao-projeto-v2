package br.com.factory.animais;

import br.com.factory.animais.animalfactory.AnimalFactory;
import br.com.factory.animais.animalfactory.BeijaFlorFactory;
import br.com.factory.animais.animalfactory.PitbullFactory;

import static java.util.Objects.nonNull;

public class ClientApp {

    private static AnimalFactory animalFactory;

    public static void main(String[] args) {
        String animal = "Beija_Flor";
//        String animal = "Pitbull";

        tipoAnimal(animal);

        if (nonNull(animalFactory)){
//  metodo da Factory para criar o animal
            animalFactory.fabricarAnimal();
        }
    }

    //Cria o animal com base no tipo selecionado
    private static void tipoAnimal(String animal) {
        switch (animal){
            case "Beija_Flor":
                animalFactory = new BeijaFlorFactory();
                break;
            case "Pitbull":
                animalFactory = new PitbullFactory();
                break;
            default:
                System.out.println("Selecione um tipo de animal");
        }
    }
}
