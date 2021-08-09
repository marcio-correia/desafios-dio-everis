package modificadores;

import java.time.LocalDate;

public class Funcionario extends Pessoa{

    public int codigo;
    public LocalDate dataEntrada;

    public Funcionario(String nome, String sobrenome, int idade, int codigo, LocalDate dataEntrada) {
        super(nome, sobrenome, idade);
        this.codigo = codigo;
        this.dataEntrada = dataEntrada;}

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "codigo=" + codigo +
                ", dataEntrada=" + dataEntrada +
                ", nome='" + super.getNome() + '\'' +
                ", sobrenome='" + super.getSobrenome() + '\'' +
                ", idade=" + super.getIdade() +
                '}';
    }
}
