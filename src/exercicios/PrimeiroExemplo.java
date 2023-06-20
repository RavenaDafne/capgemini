package exercicios;

import java.util.Scanner;

public class PrimeiroExemplo {
    public static void main(String[] args) {

    double num1;
    double num2;

    Scanner leitor = new Scanner(System.in);

        System.out.println("Escreva  o primeiro numero: ");
        num1 =  leitor.nextDouble();
        System.out.println("Escreva  o segundo numero: ");
        num2 =  leitor.nextDouble();

        double soma =  num1 + num2;

        System.out.println("A soma dos numeros é: " +  soma);


    }


}
