// Conceito de encadeamento de nó
package com.projetono;

public class Main {
    public static void main(String[] args) {
        No<String> no1 = new No<>("Conteudo no1");

        No<String> no2 = new No<>("Conteudo no2");
        no1.setProximoNo(no2);

        No<String> no3 = new No<>("Conteudo no3");
        no2.setProximoNo(no3);

        No<String> no4 = new No<>("Conteudo no4");
        no3.setProximoNo(no4);

        //no1 aponta para no2 e assim por diante

        System.out.println(no1);
        System.out.println(no1.getProximoNo()); //pega o conteudo do proximo nó
        System.out.println(no2);


    }
}
