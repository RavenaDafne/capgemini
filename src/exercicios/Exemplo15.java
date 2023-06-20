package exercicios;

import java.util.Scanner;

public class Exemplo15 {
    public static void main(String[] args) {
        System.out.println("Insira um valor: ");

        Scanner leitor =  new Scanner(System.in);
        double valor = leitor.nextDouble();

        if( valor>=100 && valor<= 200){
            System.out.println("O valor escolhido está no intervalo desejado");

        }else{
            System.out.println("O valor escolhido está fora do intervalo");
        }
    }
}
