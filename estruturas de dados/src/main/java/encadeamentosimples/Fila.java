package encadeamentosimples;

public class Fila<T> {
    private No<T> refFim;

    public Fila() {
        this.refFim = null;
    }

    public Fila(No<T> refFim) {
        this.refFim = refFim;
    }

    public void enqueue(T object){
        No<T> novoNo = new No<>(object);
        novoNo.setRefNo(refFim);
        refFim = novoNo;
    }

    public T dequeue(){
        if (!isEmpty()){
            No<T> primeiroNo = refFim;
            No<T> noAuxiliar = refFim;
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
            return primeiroNo.getObject();
        }else{return null;}
    }

    public T first(){
        No<T> noAuxiliar = refFim;
        if (!isEmpty()){
            while (true){
                if (noAuxiliar.getRefNo()!=null){
                    noAuxiliar = noAuxiliar.getRefNo();
                }else{
                    return noAuxiliar.getObject();
                }
            }
        }else{return null;}
    }

    public boolean isEmpty(){
        return refFim == null;
    }

    @Override
    public String toString() {
        String stringRetorno = "------------------\n";
        stringRetorno += "       FILA        \n";
        stringRetorno += "------------------\n";
        No<T> noAuxiliar = refFim;
        while (true){
            if (noAuxiliar!=null) {
                stringRetorno += noAuxiliar.getObject() + "-->";
            }else{
                stringRetorno += "null";
                break;
            }
            noAuxiliar = noAuxiliar.getRefNo();
        }
        return stringRetorno;
    }
}
