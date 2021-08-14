package encadeamentosimples;

public class No<T> {
    private T object;
    private No refNo;

    public No() {
    }

    public No(T object) {
        this.object = object;
        this.refNo = null;
    }

    public T getObject() {
        return object;
    }

    public No getRefNo() {
        return refNo;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "dado='" + object + '\'' +
                '}';
    }
}
