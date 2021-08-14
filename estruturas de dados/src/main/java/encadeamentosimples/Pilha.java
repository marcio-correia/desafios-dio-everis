package encadeamentosimples;

public class Pilha <T>{
    private No<T> refTopo;

    public Pilha() {
        this.refTopo = null;
    }

    public void push(T object){
        No<T> novoNo =  new No<>(object);
        novoNo.setRefNo(refTopo);
        refTopo = novoNo;

    }

    public T pop (){
        if (!isEmpty()){
            No<T> noRetirado = refTopo;
            refTopo = noRetirado.getRefNo();
            return noRetirado.getObject();
        }
        return null;
    }

    public T top(){
        return refTopo.getObject();
    }

    public boolean isEmpty(){
//        if (this.refTopo == null) {
//            return true;
//        }
//        return false;
        return refTopo == null;
    }

    @Override
    public String toString() {
        String stringRetorno = "-----------------\n";
        stringRetorno += "      Pilha\n";
        stringRetorno +=  "-----------------\n";

        No<T> noAuxiliar = refTopo;

        while (true){
            if (noAuxiliar != null){
                stringRetorno += noAuxiliar.getObject() +"\n";
                noAuxiliar = noAuxiliar.getRefNo();
            }else{
                break;
            }
        }
        stringRetorno += "=================\n";
        return stringRetorno;
    }
}
