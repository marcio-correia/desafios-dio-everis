package modificadores;

public class Estudante extends Pessoa{
    protected String matricula;
    private String serie;

    public Estudante(String nome, String sobrenome, int idade, String matricula, String serie) {
        super(nome, sobrenome, idade);
        /*super se refere a superclasse que deu origem a esta classe. No caso Pessoa é a superclasse da classe Estudante
         */
        this.matricula = matricula;
        this.serie = serie;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    @Override
    public String toString() {
        return "Estudante{" +
                "matricula='" + matricula + '\'' +
                ", serie='" + serie + '\'' +
                ", nome='" + super.getNome() + '\'' +
                ", sobrenome='" + super.getSobrenome() + '\'' +
                ", idade=" + super.getIdade() +
                '}';
    }
}
