package encadeamentosimples;

public class Fila<T> {
    private No<T> refFim;

    public Fila() {
        this.refFim = null;
    }

    public Fila(No refFim) {
        this.refFim = refFim;
    }

    public void enqueue(T object){
        No<T> novoNo = new No(object);
        novoNo.setRefNo(refFim);
        refFim = novoNo;
    }

    public T dequeue(){
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
            return (T) primeiroNo.getObject();
        }else{return null;}
    }

    public T first(){
        No<T> noAuxiliar = refFim;
        if (!isEmpty()){
            while (true){
                if (noAuxiliar.getRefNo()!=null){
                    noAuxiliar = noAuxiliar.getRefNo();
                }else{
                    return (T) noAuxiliar.getObject();
                }
            }
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
