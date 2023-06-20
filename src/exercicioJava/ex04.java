package exercicioJava;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Escreva o nome do vendedor: ");
        String nome = leitor.nextLine();
        System.out.println("Escreva o salario fixo do vendedor: ");
        double salario = leitor.nextDouble();
        System.out.println("Escreva o Total de vendas do vendedor: ");
        double totVendas = leitor.nextDouble();

        double salarioNovo =  salario + (0.15*totVendas);

        System.out.println("O Vendedor : " + nome + " - Possui salario fixo de : " + salario + " e salario final de: " + salarioNovo);
    }
}
