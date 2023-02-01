package aula3;

import java.util.function.Function;

public class ProgramacaoFuncional {
    public static void main(String[] args) {
        Integer numero1 = 7;
        Integer numero2 = 7;
        Integer soma = numero1 + numero2;
        System.out.println(soma);
        // Problema
        System.out.println(calcula(7, 7));
        Operacao corpoDoMetodo = (num1,  num2) -> num1 + num2; // lambda simples.  lambda e interface andam juntas
        Operacao corpoDoMetodo1 = (num1,  num2) -> {
            return num1 - num2;  // lambda com mais de uma linha
        }; // lambda é como se fosse uma funçao anônima
        System.out.println(calcula(8, 7, corpoDoMetodo1));


    }
    public static Integer calcula(Integer numero1, Integer numero2) {
        return (numero1 + numero2);
    }

    public static Integer subtrai(Integer numero1, Integer numero2) {
        return (numero1 - numero2);
    }

    public static Integer calcula(Integer numero1, Integer numero2, Operacao operacao) {
        return operacao.executa(numero1, numero2);
    }

}
