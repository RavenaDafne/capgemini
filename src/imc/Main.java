package imc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //O objeto está gerenciando sua informações: encapsulamento.

        Pessoa objetoPessoa =  new Pessoa(1.53f,62f);

        Scanner leitor =  new Scanner(System.in);
        System.out.println("Digite o peso - Kg");
        objetoPessoa.setPeso(leitor.nextFloat());
        System.out.println("Digite a altura - m");
        objetoPessoa.setAltura(leitor.nextFloat());

//O objeto pessoa nos fornece a informação do peso, nao temos acesso direto.
       //objetoPessoa.getPeso();

        System.out.println("O IMC é de "+  objetoPessoa.calcularImc());
    }
}
