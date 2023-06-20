package exercicioJava;

import java.util.Scanner;

public class ex08 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual o valor da cotação do Dolar atual: (Em relação ao Real)");
        float cotacaoDolar = leitor.nextFloat();
        System.out.println("Informe a sua quantidade de dolares disponivel: ");
        float dolarDisp = leitor.nextFloat();

        float valorReal = cotacaoDolar *dolarDisp;
        System.out.println("O valor de dinheiro R$ em dolar " + dolarDisp +  "em real é de R$ " + valorReal );

    }
}
