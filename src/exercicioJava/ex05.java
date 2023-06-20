package exercicioJava;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Escreva o nome do aluno: " );
        String nomeAluno = leitor.nextLine();
        System.out.println("Escreva as três notas que ele obtece: ");
        float nota1 = leitor.nextFloat();
        float nota2 = leitor.nextFloat();
        float nota3 = leitor.nextFloat();

        float media = (nota1 + nota2 + nota3) / 3;

        System.out.println("O aluno: " + nomeAluno + " ----- média final ----- " + media );

    }
}
