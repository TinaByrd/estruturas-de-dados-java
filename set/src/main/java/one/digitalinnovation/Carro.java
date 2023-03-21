package one.digitalinnovation;

import java.util.Objects;

public class Carro implements Comparable<Carro> { //precisou ser adicionado com o set pq é árvore
        String marca;

        public Carro(String marca) {
            this.marca = marca;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false; //existem objeto que não podem ser comparados com o ==. Por isso utilizamos o equals
            one.digitalinnovation.Carro carro = (one.digitalinnovation.Carro) o;
            return Objects.equals(marca, carro.marca);
        }

        @Override
        public int hashCode() {
            return Objects.hash(marca); //retorna hash gerado a partir do atributo marca
        }

        @Override
        public String toString() {
            return "Carro{" +
                    "marca='" + marca + '\'' +
                    '}';
        }

    /*@Override
    public int compareTo(Carro o) {
        if(this.marca.length() < o.marca.length()) { //dizer se um carro deve ficar na frente d outro a partir da string
            return -1;
        } else if(this.marca.length() > o.marca.length()) {
            return 1;
        }
        return 0;
    }
    */
    @Override
    public int compareTo(Carro o) {
        return this.getMarca().compareTo(o.getMarca()); //pra deixar alfabético
    }
}


