package br.com.dio;

public class Estudante extends Pessoa{
    public String matricula;
    public String serie;

    public Estudante(String nome, String sobrenome, int idade, String matricula, String serie) {
        super(nome, sobrenome, idade);
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
