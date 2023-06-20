package exercicioJava;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner leitor  = new Scanner(System.in);
        System.out.println("Insira o valor da compra");
        double valorCompra = leitor.nextDouble();


        double parcela =  valorCompra / 5;

        System.out.println("Sua compra de valor " +  valorCompra +  " possui parcelas de R$ " +  parcela + " reais por mês");

        }


    }

