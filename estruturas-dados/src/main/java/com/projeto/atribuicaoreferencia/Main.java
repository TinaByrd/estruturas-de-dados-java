package com.projeto.atribuicaoreferencia;

//Apresentando a diferença de atribuição de primitivos e objetos

public class Main {
    public static void main(String[] args) {

        int intA = 1;
        int intB = intA;

        System.out.println("IntA = " + intA + "intB = " + intB);
        intA = 2;
        System.out.println("IntA = " + intA + "intB = " + intB); // com os objetos não funciona dessa forma:

        MeuObj objA = new MeuObj(1);
        MeuObj objB = objA;

        System.out.println("objA = " + objA + "objB = " + objB);
        objA.setNum(2);
        System.out.println("objA = " + objA + "objB = " + objB);// ambos objetos acabam mudando de valor; diferente dos primitivos


    }
}
