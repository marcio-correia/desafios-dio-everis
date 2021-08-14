package encadeamentosimples;

public class Pilha <T>{
    private No<T> refTopo;

    public Pilha() {
        this.refTopo = null;
    }

    public void push(T object){
        No<T> novoNo =  new No<T>(object);
        novoNo.setRefNo(refTopo);
        refTopo = novoNo;

    }

    public T pop (){
        if (!isEmpty()){
            No noRetirado = refTopo;
            refTopo = noRetirado.getRefNo();
            return (T) noRetirado.getObject();
        }
        return null;
    }

    public T top(){
        return (T) refTopo.getObject();
    }

    public boolean isEmpty(){
//        if (this.refTopo == null) {
//            return true;
//        }
//        return false;
        return refTopo == null? true: false;
    }

    @Override
    public String toString() {
        String stringRetorno = "-----------------\n";
        stringRetorno += "      Pilha\n";
        stringRetorno +=  "-----------------\n";

        No noAuxiliar = refTopo;

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
