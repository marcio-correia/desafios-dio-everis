package datas;

import java.util.Date;

/* Manipulação da dados do tipo data considerando a biblioteca java.util.Date
Esta classe é antiga e seus métodos estão classificados como depreciados. Ela foi substituída pela classe Calendar.
 */
public class Dates {
    public static void main(String[] args) {
        Date dataAniversario = new Date(889585200000L);
        Date dataTeste = new Date(889585200000L);

        /* O método compareTo() retorna -1 se a data sendo comparada é anterior a data de comparação, 1 caso seja posterior
        e 0 caso as datas sejam iguais
         */
        System.out.println("A data de aniversário é anterior (-1), posterior (1) ou igual (0) a data teste? " +
                dataAniversario.compareTo(dataTeste));

        System.out.println("A data de aniversário é anterior a data teste? " +
                dataAniversario.before(dataTeste));

        System.out.println("A data de aniversário é posterior a data teste? " +
                dataAniversario.after(dataTeste));

    }
}
