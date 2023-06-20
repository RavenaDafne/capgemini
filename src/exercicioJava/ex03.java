package exercicioJava;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a distância total percorrida: ");
        float distanciaTot =  sc.nextFloat();
        System.out.println("Digite o volume em litros de combustivel totais gastos: ");
        float combustivelTot = sc.nextFloat();

        float consumo =  distanciaTot / combustivelTot;

        System.out.println("O consumo médio do veiculo é de:" + consumo + "km/l" );

    }
}
