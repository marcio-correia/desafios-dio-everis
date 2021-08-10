package datas;

import java.util.Calendar;

/* Classe Calendar é usada para manipular dados do tipo data. Esta classe substituiu a classe Date.
A classe Calendar é abstract então não pode ser instanciada
 */
public class Calendars {
    public static void main(String[] args) {
        Calendar agora = Calendar.getInstance();
        System.out.println("Data atual: " + agora.getTime());

        agora.add(Calendar.DATE, -9);
        System.out.println("Data há 9 dias: " + agora.getTime());

        agora.add(Calendar.MONTH,3);
        System.out.println("Data daqui três meses: " + agora.getTime());

        /* Diferentes formas de apresentar o resultado para o usuário
         */

        System.out.printf("%tc\n",agora);
        // dom. out. 31 20:39:24 BRT 2021

        System.out.printf("%tF\n",agora);
//        2021-10-31

        System.out.printf("%tD\n",agora);
//        10/31/21

        System.out.printf("%tr\n",agora);
//        08:41:27 PM

        System.out.printf("%tT\n",agora);
//        20:41:27

    }
}
