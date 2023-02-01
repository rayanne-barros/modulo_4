package aula3;

@FunctionalInterface
public interface Operacao {

    Integer executa(int num1, int num2); // só pode ter 1 método abstrato

    //Integer executa1(int num1, int num2);
}

