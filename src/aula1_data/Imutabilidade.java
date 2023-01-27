package aula1_data;

public class Imutabilidade {
    public static void main(String[] args) {

        String hello = "hello";
        //hello.concat("!!"); // é imutavel
        hello = hello.concat("!!");
        System.out.println(hello);
        StringBuilder b = new StringBuilder("Hello");
        b.append(", Rayanne!");
        System.out.println(b);
    }
}
