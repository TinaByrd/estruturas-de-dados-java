package one.digitalinnovation;

public class Fila {

    private No refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;
    }

    //metodo enfilerar
    public void enqueue(Object obj) {
        No novoNo = new No(obj);
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo; //referência de entrada apontando para novo nó
    }

    //retorna o primeiro nó da fila
    public Object first() {
        if(!this.isEmpty()) { //sabendo se a fila está vazia
            No primeiroNo = refNoEntradaFila;
            while (true) {
                if(primeiroNo.getRefNo() != null) { //se não for o primeiro...
                    primeiroNo = primeiroNo.getRefNo();
                }else {
                    break;
                }
            }
            return primeiroNo.getObject();
        }
        return null;
    }
    public Object dequeue() {
        if(!this.isEmpty()) {
            No primeiroNo = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila;
            while (true) {
                if(primeiroNo.getRefNo() != null) {
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                }else {
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return primeiroNo.getObject();
        }
        return null;
    }

    public boolean isEmpty() {
        return refNoEntradaFila == null? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No noAuxiliar = refNoEntradaFila;

        if(refNoEntradaFila != null) {
            while(true) {
                stringRetorno += "[No{objeto" + noAuxiliar.getObject() + "}]--->";
                if(noAuxiliar.getRefNo() != null) {
                    noAuxiliar = noAuxiliar.getRefNo();
                }else {
                    stringRetorno += "null";
                    break;
                }
            }
        }else {
            stringRetorno = "null";
        }

        return stringRetorno;
    }
}
