package exercicioJava;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Escreve um número A " );
        float a = leitor.nextFloat();
        System.out.println("Escreva um outro número B");
        float b = leitor.nextFloat();

        float troca = a;
        a = b;
        b = troca;

        System.out.println("O valor de A: " + a + "O valor de B: " + b);


    }
}
