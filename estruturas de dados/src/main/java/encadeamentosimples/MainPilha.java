package encadeamentosimples;

public class MainPilha {

    public static void main(String[] args) {

        Pilha<Long> minhaPilha = new Pilha<>();

        minhaPilha.push(1L);
        minhaPilha.push(2L);
        minhaPilha.push(3L);
        minhaPilha.push(4L);
        minhaPilha.push(5L);
        minhaPilha.push(6L);

        System.out.println(minhaPilha.pop());
        System.out.println(minhaPilha);
    }
}
