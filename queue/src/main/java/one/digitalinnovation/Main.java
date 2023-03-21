package one.digitalinnovation;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        //Nada precisou ser adicionado na classe Carro
        
        Queue<Carro> queueCarros = new LinkedList<>();

        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Chevrolet"));
        queueCarros.add(new Carro("Fiat"));

        System.out.println(queueCarros.add(new Carro("Peugeot"))); //retorna true se conseguir executar
        System.out.println(queueCarros);

        System.out.println(queueCarros.offer(new Carro("Renault")));
        System.out.println(queueCarros);

        System.out.println(queueCarros.peek()); //vai pegar o primeiro elemento
        System.out.println(queueCarros);

        System.out.println(queueCarros.poll()); //pega o primeiro e remove
        System.out.println(queueCarros);

        System.out.println(queueCarros.size()); //saber o tamanho da fila

    }
}
