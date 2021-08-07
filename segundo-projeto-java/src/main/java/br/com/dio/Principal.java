package br.com.dio;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Bem-vindo a empresa XXXX");

        Funcionario joao = new Funcionario("João","Santos",42,123,LocalDate.now());
        System.out.println(joao.toString());

        Estudante maria = new Estudante("Maria","Silva",36,"AXB125","3");
        System.out.println(maria.toString());

        Pessoa fatima = new Pessoa("Fátima", "Souza",72);
        System.out.println(fatima.toString());
        fatima.setNome("Fátima 2");
        System.out.println(fatima.toString());

    }
}
