package aula3;

import java.util.function.BiFunction;

public class BigFunctionPractice {
    public static void main(String[] args) {
        BiFunction<Double, Double, Double> soma = (num1, num2) -> num1+num2;
        BiFunction<Double, Double, Double> subtracao = (num1, num2) -> num1+num2;
        BiFunction<Double, Double, Double> divisao = (num1, num2) -> num1+num2;
        BiFunction<Double, Double, Double> multiplicacao = (num1, num2) -> num1+num2;



        Double resultado = soma.apply(7.5,7.5);
        System.out.println(resultado);


    }
}
