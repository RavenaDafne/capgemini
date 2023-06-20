package exercicios;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        String nomeProduto;
        float precoProduto;
        float precoVenda;
        float totalCusto = 0.0f;
        float totalVenda =0.0f;

        Scanner leitor =  new Scanner(System.in);

        int i = 0;
        for(; i < 2; i++){
            System.out.println("Insira o nome do prouto: ");
            nomeProduto = leitor.next();


            System.out.println("Insira o Preço do Produto R$:");
            precoProduto = leitor.nextFloat();

            System.out.println("Insira o Preço de Venda R$:");
            precoVenda = leitor.nextFloat();

            totalCusto =  totalCusto + precoProduto;
            totalVenda =  totalVenda + precoVenda;

            if( precoVenda == precoProduto){
                System.out.println("Não houve Lucro!");
            }else{
                if( precoVenda > precoProduto){
                    System.out.println("Houve Lucro!");
                }else{
                    System.out.println("Houve prejuizo!");
                }
            }
            System.out.println("Produto:" + nomeProduto + " , " + "preço de custo=  " +  precoProduto + " , " +  precoVenda + "O preço de venda" + ".");
        }
        System.out.println("A média do Preço de Custo é de: " + (totalCusto/i));
        System.out.println("A média do Preço de Venda é de: " + (totalVenda/i));
    }
}
