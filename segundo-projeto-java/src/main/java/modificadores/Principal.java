package modificadores;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {

        Funcionario joao = new Funcionario("João","Santos",42,123,LocalDate.now());
        System.out.println(joao);

        Estudante maria = new Estudante("Maria","Santos",36,"AXB125","3");
        System.out.println(maria);

        /* Modificador um atributo static altera seu valor em todas as instâncias da classe
         */
        joao.sobrenome = "Silva";
        System.out.println(String.format("Novo sobrenome de João é %s", joao.sobrenome));
        System.out.println(String.format("Novo sobrenome de Maria é %s", maria.sobrenome));

        /* Tentar alterar um atributo final resulta em erro
         */
//        joao.idade = 35

    }
}
