package exercicioJava;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha o primeiro número a");
        double a = sc.nextDouble();
        System.out.println("Escolha o primeiro número b");
        double b  = sc.nextDouble();

        double soma = a+b;
        System.out.println("A soma dos números é: " +  soma);

        double multi = a * b;
        System.out.println("A multiplicação é : "  + multi);

        double div = a/b;
        System.out.println("A divisão  de a / b é : " + div);
    }
}
