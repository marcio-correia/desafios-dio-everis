package encadeamentosimples;

public class MainArvoreBinaria {
    public static void main(String[] args) {
        ArvoreBinaria<String> minhaArvore = new ArvoreBinaria<>();

        minhaArvore.inserir("j");
        minhaArvore.inserir("d");
        minhaArvore.inserir("a");
        minhaArvore.inserir("am");
        minhaArvore.inserir("al");
        minhaArvore.inserir("z");
        minhaArvore.inserir("q");

        minhaArvore.exibirInOrdem();
        minhaArvore.exibirPreOrdem();
        minhaArvore.exibirPosOrdem();




    }
}
