package one.digitalinnovation;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //Nada precisou ser adicionado na classe Carro
        
        List<Carro> listCarros = new ArrayList<>();

        listCarros.add(new Carro("Ford"));
        listCarros.add(new Carro("Chevrolet"));
        listCarros.add(new Carro("Fiat"));
        listCarros.add(new Carro("Peugeot"));

        System.out.println(listCarros.contains(new Carro("Ford"))); //aqui vai dar true

        System.out.println(listCarros.get(2)); //pega o que está na índice/posição 2

        System.out.println(listCarros.indexOf(new Carro("Fiat"))); //em qual índice está esse carro?

        System.out.println(listCarros.remove(2)); //excluir carro do índice 2
        System.out.println(listCarros);


    }
}
