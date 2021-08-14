package one.digitalinnovation;

public class MainFila {
    public static void main(String[] args) {
        Fila minhaFila = new Fila();

//        minhaFila.enqueue(new No<Integer>(1));
//        minhaFila.enqueue(new No<Integer>(2));
//        minhaFila.enqueue(new No<Integer>(3));
//        minhaFila.enqueue(new No<Integer>(4));
//        minhaFila.enqueue(new No<Integer>(5));
//        minhaFila.enqueue(new No<Integer>(6));

        System.out.println(minhaFila);

        System.out.println(minhaFila.dequeue());
        System.out.println(minhaFila);
    }

}
