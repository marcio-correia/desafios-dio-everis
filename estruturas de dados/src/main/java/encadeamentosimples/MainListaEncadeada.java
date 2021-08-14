package encadeamentosimples;

import java.util.List;

public class MainListaEncadeada {
    public static void main(String[] args) {
        ListaEncadeada<Integer> minhaLista = new ListaEncadeada<>();

        minhaLista.add(1);
        minhaLista.add(2);
        minhaLista.add(3);
        minhaLista.add(4);
        minhaLista.add(5);
        minhaLista.add(6);

        System.out.println(minhaLista);
        System.out.println(minhaLista.size());
        System.out.println(minhaLista.get(0));
    }
}
