package modificadores;

public class Pessoa {
    /*
    Modificador public: classes, métodos e atributos estão disponíveis de qualquer lugar e por qualquer entidade;

    Modificador private: atributos e métodos só podem ser acessado pela classe em que foram definidos.
    Para mudar ou visualizar o valor do atributo deve se usar os setters and getters (métodos podem ser
    public, protected...). Um método private não pode ser visualizado por outras classes. Essas características também
    valem para classes herdadas;

    Modificador protected: os atributos ou métodos só podem ser acessados por classes do mesmo pacote ou classes
    herdadas;

    Modificador default (sem modificador na declaração): classes, atributos e métodos estão disponíveis somente para
    classes do mesmo pacote;

    Modificador final: Para classes, não permite estendê-la a outras classes. Para métodos, não permite Override.
    Para atributos, não permite que seus valores sejam modificados uma vez que tenham sido declarados;

    Modificador abstract: Não é aplicado a atributos. Quando aplicado a classes, a classe resultante não pode ser
    instaciada. Caso um método seja abstract a classe também deve ser abstract;

    Modificador static: Quando aplicado a um atributo, o valor deste atributo será compartilhado por todas as
    instâncias da classe, quando ele é modificado em uma das instâncias, será modificado em todas as outras instâncias;

    */

    private String nome;
    static String sobrenome;
    final int idade;

    public Pessoa(String nome, String sobrenome, int idade) {
        this.nome = nome;
        Pessoa.sobrenome = sobrenome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        Pessoa.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }



    @Override
    /* Override o método toString() da classe Object. toString() de classes que são herança da classe Pessoa devem
    overrride o toString() definido nesta classe.
     */
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", idade=" + idade +
                '}';
    }
}

