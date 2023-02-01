package aula3;

import java.util.function.BiFunction;

public class Calculadora {
    public static void main(String[] args) {

        BiFunction<Double, Double, Double> corpoDoMetodoSoma = (num1, num2) -> num1+num2;
        BiFunction<Double, Double, Double> corpoDoMetodoSubtracao = (num1, num2) -> num1-num2;
        BiFunction<Double, Double, Double> corpoDoMetodoDivisao = (num1, num2) -> num1/num2;
        BiFunction<Double, Double, Double> corpoDoMetodoMultiplicacao = (num1, num2) -> num1*num2;


        Double resultadoSoma = executa(7., 8., corpoDoMetodoSoma);
        System.out.println("O resultado da soma é: " +resultadoSoma);
        Double resultadoSubtracao = executa(10., 8., corpoDoMetodoSubtracao);
        System.out.println("O resultado da subtração é: " +resultadoSubtracao);
        Double resultadoDivisao = executa(15., 3., corpoDoMetodoDivisao);
        System.out.println("O resultado da divisão é: " +resultadoDivisao);
        Double resultadoMulplicacao = executa(5., 6., corpoDoMetodoMultiplicacao);
        System.out.println("O resultado da multiplicação é: " + resultadoMulplicacao);

    }

    private static Double executa(Double num1, Double num2, BiFunction<Double, Double, Double> corpoDoMetodo) {
        return corpoDoMetodo.apply(num1, num2);
    }



}
