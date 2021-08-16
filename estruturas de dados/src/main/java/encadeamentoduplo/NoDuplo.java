package encadeamentoduplo;

public class NoDuplo<T> {
    private T object;
    private NoDuplo<T> proximoNo;
    private NoDuplo<T> noAnterior;

    public NoDuplo(T object) {
        this.object = object;
        this.proximoNo = null;
        this.noAnterior = null;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public NoDuplo<T> getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(NoDuplo<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    public NoDuplo<T> getNoAnterior() {
        return noAnterior;
    }

    public void setNoAnterior(NoDuplo<T> noAnterior) {
        this.noAnterior = noAnterior;
    }

    @Override
    public String toString() {
        return "NoDuplo{" +
                "object=" + object +
                '}';
    }
}
