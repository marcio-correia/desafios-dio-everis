package encadeamentosimples;

public class ListaEncadeada<T> {
    private No<T> refFila;

    public ListaEncadeada() {
        this.refFila= null;
    }

    public No<T> getRefFila() {
        return refFila;
    }

    public void setRefFila(No<T> refFila) {
        this.refFila = refFila;
    }

    public boolean isEmpty(){
        return refFila == null;
    }

    public int size(){
        int size = 0;
        No<T> noAuxiliar = refFila;
        if (!isEmpty()) {
            size++;
            while (noAuxiliar.getRefNo() != null){
                size++;
                noAuxiliar = noAuxiliar.getRefNo();
            }
        }else{return size;}
        return size;
    }

    public void add(T object){
        No<T> novoNo = new No<>(object);
        if (!isEmpty()){
            No<T> noAuxiliar = refFila;
            for (int i = 0; i<size()-1;i++){
                noAuxiliar = noAuxiliar.getRefNo();
            }
//            while (noAuxiliar.getRefNo()!=null){
//                noAuxiliar = noAuxiliar.getRefNo();
//            }
            noAuxiliar.setRefNo(novoNo);
        }else{refFila = novoNo;}
    }

    private void validaIndice(int index){
        if (index>=size()){
            throw new IndexOutOfBoundsException("Não existe o índice " + index + " neste lista. " +
                    "Esta lista só vai até o índice " + (size()-1) + ".");
        }
    }

    private No<T> getNo(int index){
        validaIndice(index);
        No<T> noAuxiliar = refFila;
        No<T> noRetorno = null;
        for (int i=0; i<index; i++){
            noAuxiliar = noAuxiliar.getRefNo();
        }
        noRetorno = noAuxiliar;
        return noRetorno;
    }

    public T get(int index){
        return getNo(index).getObject();
    }

    public T remove(int index){
        No<T> noRetirado = getNo(index);
        if (index == 0){
            refFila = noRetirado.getRefNo();
            return noRetirado.getObject();
        }else{
            No<T> noAnterior = getNo(index -1);
            noAnterior.setRefNo(noRetirado.getRefNo());
            return noRetirado.getObject();
        }
    }

    @Override
    public String toString() {
        No<T> noAuxiliar = refFila;
        String str = "------------\n";
        str += "   LISTA   \n";
        str += "------------\n";

        if(!isEmpty()){
            for (int i = 0; i<size();i++){
                str += noAuxiliar.getObject() + "->";
                noAuxiliar = noAuxiliar.getRefNo();
            }
//            while (noAuxiliar != null){
//
//            }
        }
        str += "null";
        return str;
    }
}
