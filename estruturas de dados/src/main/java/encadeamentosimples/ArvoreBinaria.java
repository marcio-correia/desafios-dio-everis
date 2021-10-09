package encadeamentosimples;

import encadeamentoduplo.NoDuplo;

public class ArvoreBinaria<T extends Comparable<T>> {
    private NoBin<T> raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public NoBin<T> getRaiz() {
        return raiz;
    }

    public void setRaiz(NoBin<T> raiz) {
        this.raiz = raiz;
    }

    public void inserir(T conteudo){
        NoBin<T> novoNo = new NoBin<>(conteudo);
        raiz = inserir(raiz, novoNo);
    }

    private NoBin<T> inserir(NoBin<T> atual, NoBin<T> novoNo){
        if (atual == null){
            return novoNo;
        }else if(novoNo.getConteudo().compareTo(atual.getConteudo()) < 0){
            atual.setNoEsq(inserir(atual.getNoEsq(),novoNo));
        }else{
            atual.setNoDir(inserir(atual.getNoDir(),novoNo));
        }
        return atual;
    }

    public void exibirInOrdem(){
        System.out.println("Exibindo InOrdem");
        if (raiz == null){
            System.out.println("Arvore vazia");
        }else{
            exibirInOrdem(raiz);
            System.out.print("\n");
        }
    }

    private void exibirInOrdem(NoBin<T> atual) {
        if (atual != null) {
            exibirInOrdem(atual.getNoEsq());
            System.out.print(atual.getConteudo()+", ");
            exibirInOrdem(atual.getNoDir());
        }
    }
    public void exibirPosOrdem(){
        System.out.println("Exibindo PosOrdem");
        if (raiz == null){
            System.out.println("Arvore vazia");
        }else{
            exibirPosOrdem(raiz);
            System.out.print("\n");
        }
    }

    private void exibirPosOrdem(NoBin<T> atual) {
        if (atual != null) {
            exibirPosOrdem(atual.getNoEsq());
            exibirPosOrdem(atual.getNoDir());
            System.out.print(atual.getConteudo()+", ");
        }
    }

    public void exibirPreOrdem(){
        System.out.println("Exibindo PreOrdem");
        if (raiz == null){
            System.out.println("Arvore vazia");
        }else{
            exibirPreOrdem(raiz);
            System.out.print("\n");
        }
    }

    private void exibirPreOrdem(NoBin<T> atual) {
        if (atual != null) {
            System.out.print(atual.getConteudo()+", ");
            exibirPreOrdem(atual.getNoEsq());
            exibirPreOrdem(atual.getNoDir());
        }
    }

    private NoBin<T> maximo(NoBin<T> noAtual){
        NoBin<T> noTeste = null;
        if (noAtual == null){
            return noAtual;
        }
        while(noAtual.getNoDir() != null){
            noTeste = maximo(noAtual.getNoDir());
            return noTeste;
        }
        return noAtual;
    }

    private NoBin<T> noPai(T conteudoFilho, NoBin<T> noAtual,NoBin<T> noAnterior) {
            if(noAtual != null){
                if(noAtual.getConteudo().compareTo(conteudoFilho)>0){
                    NoBin<T> noRetorno = noPai(conteudoFilho,noAtual.getNoEsq(),noAtual);
                    return noRetorno;
                }else if(noAtual.getConteudo().compareTo(conteudoFilho)<0){
                    NoBin<T> noRetorno = noPai(conteudoFilho,noAtual.getNoDir(),noAtual);
                    return noRetorno;
                }else{
                    return noAnterior;
                }
            }
            return noAnterior;
    }

    public void remove (T conteudo){
        remove(conteudo,this.raiz,this.raiz);
    }

    private void remove(T conteudo, NoBin<T> atual, NoBin<T> anterior){
        if (atual != null){
            if (conteudo.compareTo(atual.getConteudo()) < 0){
                anterior = atual;
                remove(conteudo,atual.getNoEsq(),anterior);
            }else if(conteudo.compareTo(atual.getConteudo())>0){
                anterior = atual;
                remove(conteudo,atual.getNoDir(),anterior);
            }else{
                NoBin<T> maximo = maximo(atual.getNoEsq());
                if (maximo != null) {
                    NoBin<T> noPai = noPai(maximo.getConteudo(), atual,atual);
                    noPai.setNoDir(maximo.getNoEsq());
                    maximo.setNoEsq(atual.getNoEsq());
                    maximo.setNoDir(atual.  getNoDir());
                    if (raiz != atual){
                        anterior.setNoEsq(maximo);
                    }else{
                        raiz = maximo;
                    }
                }else{
                    if(anterior.getConteudo().compareTo(atual.getConteudo()) >  0){
                        anterior.setNoEsq(atual.getNoDir());
                    }else if (anterior.getConteudo().compareTo(atual.getConteudo()) <=  0){
                        if(raiz!= atual){
                            anterior.setNoDir(atual.getNoDir());
                        }else{
                            raiz = atual.getNoDir();
                        }
                    }
                }
            }
        }else{
            System.out.println("Conteudo não encontrado");
        }
    }


}

