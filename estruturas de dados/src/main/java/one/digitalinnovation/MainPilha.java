package one.digitalinnovation;

public class MainPilha {
    public static void main(String[] args) {
        No<Integer> no1 = new No<>(1);
        No<Integer> no2 = new No<>(2);
        No<Integer> no3 = new No<>(3);
        No<Integer> no4 = new No<>(4);

        Pilha minhaPilha = new Pilha();

        minhaPilha.push(new No<Integer>(1));
        minhaPilha.push(new No<Integer>(2));
        minhaPilha.push(new No<Integer>(3));
        minhaPilha.push(new No<Integer>(4));
        minhaPilha.push(new No<Integer>(5));
        minhaPilha.push(new No<Integer>(6));
        System.out.println(minhaPilha.pop().getRefNo());
        System.out.println(minhaPilha);
    }
}
