package one.digitalinnovation;

public class Pilha {
    private No refNoEntradaPilha;

    public Pilha() {

        this.refNoEntradaPilha = null;
    }
    public void push(No novoNo) { //acrescenta novo nó no topo da pilha
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }
    public No pop() {
        if(this.isEmpity()) {
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
        }
        return null;
    }
    public No top() {
        return refNoEntradaPilha;
    }

    public boolean isEmpity() {
        if(refNoEntradaPilha == null) {
            return true;
        }
        return  false;
    }
}
