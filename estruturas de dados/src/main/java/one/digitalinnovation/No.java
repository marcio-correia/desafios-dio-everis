package one.digitalinnovation;

public class No<T> {
    private T dado;
    private No<T> refNo;

    public No() {
    }

    public No(T dado) {
        this.dado = dado;
        this.refNo = null;
    }

    public T getDado() {
        return dado;
    }

    public No getRefNo() {
        return refNo;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "dado='" + dado + '\'' +
                '}';
    }
}
