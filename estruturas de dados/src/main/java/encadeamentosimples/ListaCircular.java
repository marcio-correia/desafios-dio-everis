package encadeamentosimples;

public class ListaCircular<T> {
    private No<T>  refCauda;
    private No<T> refCabeca;
    private int tamanhoLista;

    public ListaCircular() {
        this.refCauda = null;
        this.refCabeca = null;
        this.tamanhoLista = 0;
    }

    public No<T> getRefCauda() {
        return refCauda;
    }

    public void setRefCauda(No<T> refCauda) {
        this.refCauda = refCauda;
    }

    public No<T> getRefCabeca() {
        return refCabeca;
    }

    public void setRefCabeca(No<T> refCabeca) {
        this.refCabeca = refCabeca;
    }

    public int getTamanhoLista() {
        return tamanhoLista;
    }

    public void setTamanhoLista(int tamanhoLista) {
        this.tamanhoLista = tamanhoLista;
    }

    public boolean isEmpty(){
        return refCauda == null;
    }

    public int size(){
        return tamanhoLista;
    }


    private No<T> getNo(int index){
        if (!isEmpty()){
            No<T> noRetirado = null;
            No<T> noAuxiliar = refCauda;
            for (int i=0;i<=index;i++){
                noRetirado = noAuxiliar;
                noAuxiliar = noAuxiliar.getRefNo();
            }
            return noRetirado;
        }else{return null;}
    }

    public T get(int index){
        return getNo(index).getObject();
    }

    public void add(T object){
        No<T> novoNo = new No<>(object);
        if (!isEmpty()){
            novoNo.setRefNo(refCauda);
            refCauda = novoNo;
            refCabeca.setRefNo(refCauda);
        }else{
            refCauda = novoNo;
            refCabeca = novoNo;
            refCabeca.setRefNo(refCauda);
        }
        tamanhoLista++;
    }

    public T remove(int index){
        if (index>size()-1){
            throw new IndexOutOfBoundsException("Não existe o índice "+index+" nesta lista. " +
                    "Esta lista vai até o [indice "+(size()-1));
        }

        No<T> noRetirado = getNo(index);
        if(!isEmpty()){
            if (noRetirado.getRefNo() != refCauda){
                if(index == 0){
                    refCauda = noRetirado.getRefNo();
                    refCabeca.setRefNo(refCauda);
                }else{
                    getNo(index-1).setRefNo(noRetirado.getRefNo());
                }

            }else{
                if(index == 0){
                    refCauda = null;
                    refCabeca = null;
                }else{
                    refCabeca = getNo(index-1);
                    refCabeca.setRefNo(refCauda);
                }
            }
            tamanhoLista--;
        }else {
            throw new IndexOutOfBoundsException("Esta lista esta vazia");
        }
        return noRetirado.getObject();
    }

    @Override
    public String toString() {
        String str = "--------------\n";
        str += "LISTA CIRCULAR\n";
        str += "--------------\n";
        No<T> noAuxiliar = refCauda;
        for (int i = 0; i<size();i++){
            str += noAuxiliar + "\n";
            noAuxiliar = noAuxiliar.getRefNo();
        }
        str += size() != 0? "Retorna ao início\n": "[]\n";
        str += "==============";
        return str;
    }
}
