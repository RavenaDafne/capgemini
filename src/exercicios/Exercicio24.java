package exercicios;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        char desejo = 's';

        while (desejo == 's' || desejo == 'S') {
            System.out.println("Digite um número: ");
            int numero = leitor.nextInt();
            if (numero > 0) {
                System.out.println("O número é positivo");
            } else {
                if (numero == 0) {
                    System.out.println("O número é neutro -  o");
                } else {
                    System.out.println("O numéro é negativo!");
                }

            }
            System.out.println("Deseja continuar pressione:  s /S, caso não : n/N");
            desejo = leitor.next().charAt(0);
        }
    }
}