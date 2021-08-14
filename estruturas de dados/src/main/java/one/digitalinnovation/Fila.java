package one.digitalinnovation;

public class Fila {
    private No refFim;

    public Fila() {
        this.refFim = null;
    }

    public Fila(No refFim) {
        this.refFim = refFim;
    }

    public void enqueue(No novoNo){
        novoNo.setRefNo(refFim);
        refFim = novoNo;
    }

    public No dequeue(){
        if (!isEmpty()){
            No primeiroNo = refFim;
            No noAuxiliar = refFim;
            while (true){
                if (primeiroNo.getRefNo() == null){
                    if (noAuxiliar == refFim){
                        refFim = null;
                    }else{
                        noAuxiliar.setRefNo(null);
                    }
                    break;
                }else{
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();}
            }
            return primeiroNo;
        }else{return null;}
    }

    public boolean isEmpty(){
        return refFim == null ? true:false;
    }

    @Override
    public String toString() {
        String stringRetorno = "------------------\n";
        stringRetorno += "       FILA        \n";
        stringRetorno += "------------------\n";
        No noAuxiliar = refFim;
        while (true){
            if (noAuxiliar!=null) {
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
            }else{break;}
            noAuxiliar = noAuxiliar.getRefNo();
        }
        return stringRetorno;
    }
}
