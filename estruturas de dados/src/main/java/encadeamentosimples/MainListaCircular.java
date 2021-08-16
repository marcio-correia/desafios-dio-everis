package encadeamentosimples;

public class MainListaCircular {
    public static void main(String[] args) {
        ListaCircular<Integer> minhaLista = new ListaCircular<>();

        minhaLista.add(1);
        minhaLista.add(2);
        minhaLista.add(3);
        minhaLista.add(4);
        System.out.println(minhaLista);
        System.out.println(minhaLista.remove(0));
        System.out.println(minhaLista);
        System.out.println(minhaLista.get(0));





    }
}
