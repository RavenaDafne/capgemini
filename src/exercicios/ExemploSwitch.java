package exercicios;

import java.util.Scanner;

public class ExemploSwitch {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira o código do produto: ");
        int codProd = leitor.nextInt();


        switch (codProd){
            case 1 :
                codProd = 1;
                System.out.println("O produto é sabão");
                break;
            case 2:
                codProd = 2;
                System.out.println("O produto é pão");
                break;
            case 3:
                codProd = 3;
                System.out.println("O produto é carne");
                break;
            default:
                System.out.println("Produto não cadastrado");
        }
    }
}
