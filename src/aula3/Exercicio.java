package aula3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Exercicio {
    public static void main(String[] args) {

         List<Produto> listaProdutos =  new ArrayList<>();
         listaProdutos.add(new Produto("Feijao", 10.89));
         listaProdutos.add(new Produto("Frango", 20.3));
         listaProdutos.add(new Produto("Agua", 1.89));
        //System.out.println(10.89+20.3+1.89);
        Function<List<Produto>, Double> corpoDoMetodo = produtos -> {
            double soma = 0;
            for (Produto produto : produtos) {
                soma += produto.getPreco();
            }
            return soma;
        };

        Integer numero = 7;
        Function<Integer, Double> dobroValor = (Integer num) -> numero *2d;
        Double resultado1 = calcula(numero, dobroValor);

        Double resultado = calcula(listaProdutos, corpoDoMetodo);
        System.out.println(resultado);
        System.out.println(resultado1);

    }

    private static Double calcula(Integer numero, Function<Integer, Double> dobroValor) {
        return dobroValor.apply(numero);
    }

    private static Double calcula(List<Produto> produtos, Function<List<Produto>, Double> corpoDoMetodo) {
        return corpoDoMetodo.apply(produtos);
    }
}
