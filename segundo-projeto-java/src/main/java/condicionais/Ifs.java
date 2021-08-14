package condicionais;

public class Ifs {
    /* Os condicionais são usados para decidir entre vários caminhos possíveis.
    Essa escolha se dá através de um critério, tipo booleano (true ou false). Este critério pode ser resultado da comparação de variáveis
    com valores padrões.
    Além disso, é possível usar como condição de escolha o agrupamento de vários critérios.
    Em um dos casos a condição será satisfeita se todos os critérios retornarem true.
    No outro caso a condição será satisfeita se ao menos um dos critérios retornarem true.
    No caso "and", existem dois operadores "&" ou "&&".

     */
    static boolean metodoFalse(){
        System.out.println("Entrou no metodoFalse");
        return false;
    }

    static boolean metodoTrue(){
        System.out.println("Entrou no metodoTrue\n");
        return true;
    }

    public static void main(String[] args) {
        /*O operador "&" testa todos os critérios mesmo que o primeiro já tenha retornado false. Esse tipo de operador é
        conhecido como bitwise, existe também o operador "|" que retornará true se ao menos um dos critérios for true e
        testa todos os critérios mesmo que o primeiro já tenha retornado true*/
        System.out.println("Teste de comparação usando &\n");
        if (metodoFalse() & metodoTrue()) {
            System.out.println("Condição satisfeita");
        }
        /*O operador "&&" testa o primeiro critério, caso ele seja false a condição se torna automaticamente false e ele não
        verifica o próximo critério. Esse tipo de operador é conhecido como short circuit. Existe também o operador || que
        retorna true se ao menos um dos critérios é true e ao encontrar um critério true, ele não testa os outros critérios*/
        System.out.println("Teste de comparação usando &&\n");
        if (metodoFalse() && metodoTrue()){
            System.out.println("Condição satisfeita");
        }
    }



}
