package encadeamentosimples;

public class MainFila {
    public static void main(String[] args) {
        Fila<Integer> minhaFila = new Fila<>();

        minhaFila.enqueue(1);
        minhaFila.enqueue(2);
        minhaFila.enqueue(3);
        minhaFila.enqueue(4);
        minhaFila.enqueue(5);
        minhaFila.enqueue(6);

        System.out.println(minhaFila);

        System.out.println(minhaFila.dequeue());
        System.out.println(minhaFila);
    }

}
