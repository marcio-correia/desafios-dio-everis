package datas;

import java.util.Calendar;

public class Principal {
    /* Testa se uma conta já venceu. Caso não tenha vencido, calcula quantos dias faltam para o vencimento.
    Este código só considera dias úteis (seg, ter, qua, qui, sex).
     */
    public static void main(String[] args) {
        // Dados sobre a data de vencimento da conta
        int ano = 2021;
        int mes = 10;
        int diaMes = 05;

        int millisDia = 86400000;

        Calendar dataVencimento = Calendar.getInstance();
        Calendar dataAtual = Calendar.getInstance();
        dataVencimento.set(ano,mes,diaMes,23,59,59);
        dataAtual.set(Calendar.MILLISECOND,0);
        dataAtual.set(Calendar.SECOND,59);
        dataAtual.set(Calendar.MINUTE,59);
        dataAtual.set(Calendar.HOUR,23);

        if (dataVencimento.get(dataVencimento.DAY_OF_WEEK) == Calendar.SATURDAY){
            dataVencimento.add(dataVencimento.DATE,2);
        }
        else if (dataVencimento.get(dataVencimento.DAY_OF_WEEK)== Calendar.SUNDAY){
            dataVencimento.add(dataVencimento.DATE,1);
        }

        float difDias = (dataVencimento.getTimeInMillis() - dataAtual.getTimeInMillis())/millisDia + 1;
        if (difDias < 0){
            System.out.println("A conta já venceu.");
        }
        else{
            System.out.printf("A conta vence em %.0f dias",difDias);
        }

    }
}
