package one.digitalinnovation;

public class Pilha {
    No refTopo;

    public Pilha() {
        this.refTopo = null;
    }

    public void push(No novoNo){
        novoNo.setRefNo(refTopo);
        refTopo = novoNo;

    }

    public No pop (){
        if (!isEmpty()){
            No noRetirado = refTopo;
            refTopo = noRetirado.getRefNo();
            return noRetirado;
        }
        return null;
    }

    public No top(){
        return refTopo;
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
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            }else{
                break;
            }
        }
        stringRetorno += "===========\n";
        return stringRetorno;
    }
}
