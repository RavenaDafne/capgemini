package exercicioJava;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor depositado: " );
        double valorDepositado = leitor.nextFloat();;

        double taxa = 0.0007d;
        System.out.println("Quando dias depositou o dinheiro: ");
        int dias = leitor.nextInt();

        if(dias == 30){
            double  valorNovoDepositado =  valorDepositado + (valorDepositado*taxa);
            System.out.println("O valor da Popupança é de  : " + valorNovoDepositado);
        }else{
            System.out.println("O juros só entra a partir de 30 dias, favor aguardar!");

        }
    }
}
