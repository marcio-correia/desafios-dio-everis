package encadeamentoduplo;

import encadeamentosimples.No;

public class ListaDuplaEncadeada<T> {
    private NoDuplo<T> refInicio;
    private NoDuplo<T> refFinal;
    private int tamanhoLista;

    public ListaDuplaEncadeada() {
        this.refInicio = null;
        this.refFinal = null;
        this.tamanhoLista = 0;
    }

    public NoDuplo<T> getRefInicio() {
        return refInicio;
    }

    public void setRefInicio(NoDuplo<T> refInicio) {
        this.refInicio = refInicio;
    }

    public NoDuplo<T> getRefFinal() {
        return refFinal;
    }

    public void setRefFinal(NoDuplo<T> refFinal) {
        this.refFinal = refFinal;
    }

    public int getTamanhoLista() {
        return tamanhoLista;
    }

    public void setTamanhoLista(int tamanhoLista) {
        this.tamanhoLista = tamanhoLista;
    }

    public boolean isEmpty(){
        return refInicio == null;
    }

    public int size(){
//        NoDuplo<T> noAuxiliar = refInicio;
//        int size = 0;
//
//        if (!isEmpty()){
//            size++;
//            while (noAuxiliar.getProximoNo() != null){
//                size++;
//                noAuxiliar = noAuxiliar.getProximoNo();
//            }
//            return size;
//        }else{return size;}
        return tamanhoLista;
    }

    private void validaIndex(int index){
        if (index >= size()){
            throw new IndexOutOfBoundsException("Não existe o índice "+index+" nesta lista. " +
                    "Ela vai até o índice "+(size()-1)+".");
        }else if (index < 0){
            throw new IndexOutOfBoundsException("Não existe índices negativos nesta lista, ela começa no 0");
        }
    }
    private NoDuplo<T> getNo(int index){
        validaIndex(index);
        NoDuplo<T> noRetorno;
        NoDuplo<T> noAuxiliar = refInicio;
        if (index>=0){
            for (int i=0; i<index;i++){
                noAuxiliar = noAuxiliar.getProximoNo();
            }
            noRetorno = noAuxiliar;
            return noRetorno;
        }else{return null;}
    }

    public T get(int index){
        return getNo(index).getObject();
    }

    public void add(T object){
        NoDuplo<T> novoNo = new NoDuplo<>(object);
        if (!isEmpty()){
            refFinal.setProximoNo(novoNo);
            novoNo.setNoAnterior(refFinal);
        }else{
            refInicio = novoNo;
        }
        refFinal = novoNo;
        tamanhoLista++;
    }

    public void add(int index,T object){
        NoDuplo<T> novoNo = new NoDuplo<>(object);
        if (!isEmpty()){
            if (index==0){
                novoNo.setProximoNo(refInicio);
                refInicio.setNoAnterior(novoNo);
                refInicio = novoNo;
            }else if (index ==size()){
                refFinal.setProximoNo(novoNo);
                novoNo.setNoAnterior(refFinal);
                refFinal = novoNo;
            }
            else {
                NoDuplo<T> noPosicao = getNo(index);
                novoNo.setProximoNo(noPosicao);
                novoNo.setNoAnterior(noPosicao.getNoAnterior());
                noPosicao.getNoAnterior().setProximoNo(novoNo);
                noPosicao.setNoAnterior(novoNo);

            }
            tamanhoLista++;
        }else{
            add(object);
        }
    }

    public void remove(int index){
        NoDuplo<T> noRetirado = getNo(index);
        if (noRetirado.getProximoNo() != null){
            if(index == 0){
                noRetirado.getProximoNo().setNoAnterior(null);
                refInicio = noRetirado.getProximoNo();
            }else{
                noRetirado.getNoAnterior().setProximoNo(noRetirado.getProximoNo());
                noRetirado.getProximoNo().setNoAnterior(noRetirado.getNoAnterior());
            }
        }else{
            if(index == 0){
                refInicio = null;
                refFinal = null;
            }else{
                noRetirado.getNoAnterior().setProximoNo(null);
                refFinal = noRetirado.getNoAnterior();
            }
        }
        tamanhoLista--;
    }

    @Override
    public String toString() {
        String str = "-----------\n";
        str += "    LISTA    \n";
        str += "-----------\n";
        NoDuplo<T> noAuxiliar = refInicio;

        while(noAuxiliar != null){
            str += noAuxiliar.getObject() + "<->";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        str += "null";
        return str;
    }
}
