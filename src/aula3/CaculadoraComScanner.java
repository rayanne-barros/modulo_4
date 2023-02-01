package aula3;

import java.util.Scanner;
import java.util.function.BiFunction;

public class CaculadoraComScanner {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Que operaçao deseja realizar? 1- Soma 2- Subtração 3- Divisão 4- Multiplicação");
        int opcao = entrada.nextInt();
        System.out.println("Digite um num1");
        Double numero1 = entrada.nextDouble();
        System.out.println("Digite um num2");
        Double numero2 = entrada.nextDouble();
        BiFunction<Double, Double, Double> corpoDoMetodoSoma = (num1, num2) -> num1+num2;
        BiFunction<Double, Double, Double> corpoDoMetodoSubtracao = (num1, num2) -> num1-num2;
        BiFunction<Double, Double, Double> corpoDoMetodoDivisao = (num1, num2) -> num1/num2;
        BiFunction<Double, Double, Double> corpoDoMetodoMultiplicacao = (num1, num2) -> num1*num2;

        switch (opcao) {
            case 1 -> {
                Double resultadoSoma = executa(numero1, numero2, corpoDoMetodoSoma);
                System.out.println("O resultado da soma é: " +resultadoSoma);
            }
            case 2 -> {
                Double resultadoSubtracao = executa(numero1, numero2, corpoDoMetodoSubtracao);
                System.out.println("O resultado da subtração é: " +resultadoSubtracao);
            }
            case 3 -> {
                Double resultadoDivisao = executa(numero1, numero2, corpoDoMetodoDivisao);
                System.out.println("O resultado da divisão é: " +resultadoDivisao);
            }
            case 4 -> {
                Double resultadoMulplicacao = executa(numero1, numero2, corpoDoMetodoMultiplicacao);
                System.out.println("O resultado da multiplicação é: " + resultadoMulplicacao);
            }
            default -> System.out.println("Digite uma opção válida");
        }

    }

    private static Double executa(Double num1, Double num2, BiFunction<Double, Double, Double> corpoDoMetodo) {
        return corpoDoMetodo.apply(num1, num2);
    }
}
