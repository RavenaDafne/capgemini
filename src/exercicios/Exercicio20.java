package exercicios;

import java.util.Scanner;
/**
 * @autor Ravena Dafne
  */
public class Exercicio20 {
    public static void main(String[] args) {
        //Analisar as variaveis de entrada:
        int anoFabricacao = 0 ;
        float valorCarro = 0.0f;
        char desejoRepetir = 's';
        float porcentaDesconto = 0;
        float valorDesconto= 0;


        int totalCarrosSemiNovos = 0;
        int totalCarros = 0;
        Scanner leitor =  new Scanner(System.in);

        while (desejoRepetir == 's' || desejoRepetir == 'S'){
            System.out.println("Digite o ano de Fabricação do carro: ");
            anoFabricacao = leitor.nextInt();

            System.out.println("Digite o valor do carro: ");
            valorCarro = leitor.nextInt();

            if(anoFabricacao <= 2000){

                System.out.println("Valor do veiucolo é de " + (valorCarro *0.88));
                porcentaDesconto = 0.12f;
                valorDesconto = valorCarro * porcentaDesconto;
                System.out.println("O valor do desconto aplicado é de : " +  valorDesconto);
            }else{
                System.out.println("Valor do veiucolo é de " + (valorCarro *0.93));
                porcentaDesconto = 0.07f;
                valorDesconto = valorCarro * porcentaDesconto;
                System.out.println("O valor do desconto aplicado é de : " +  valorDesconto);
                totalCarrosSemiNovos++;
            }
            totalCarros++;
            System.out.println("Deseja cadastrar mais? Se Sim - S, se Não - N");
            desejoRepetir = leitor.next().charAt(0);

        }

        System.out.println("Total de carros semi novos é :" +  totalCarrosSemiNovos);
        System.out.println("Total de carros é :" +  totalCarros);
    }
}
