package encadeamentoduplo;

public class MainListaDupla {
    public static void main(String[] args) {
        ListaDuplaEncadeada<Integer> minhaLista = new ListaDuplaEncadeada<>();
        minhaLista.add(1);
        minhaLista.add(2);
        minhaLista.add(3);
        minhaLista.add(4);
        System.out.println(minhaLista);
        minhaLista.remove(0);
        System.out.println(minhaLista);
        minhaLista.add(0,99);
        System.out.println(minhaLista);
        System.out.println(minhaLista.getRefInicio());
        System.out.println(minhaLista.getRefFinal());
    }
    }
