package aula3;

import java.util.function.Function;

public class Funcional {
    public static void main(String[] args) {
        String palavra = "teste";
        int resultado = contaCaracteres(palavra);
                                                  // recebe String >> retorna inteiro
        Function<String, Integer> corpoDoMetodo = (String str) -> str.length();
        int resultado1 = contaCaracteres(palavra, corpoDoMetodo);
        System.out.println(resultado);
        System.out.println(resultado1);

    }

    private static int contaCaracteres(String palavra, Function<String, Integer> corpoDoMetodo) {
        return corpoDoMetodo.apply(palavra);
    }

    private static int contaCaracteres(String palavra) {
        return palavra.length();
    }

}
