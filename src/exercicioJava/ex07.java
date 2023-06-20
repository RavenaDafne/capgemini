package exercicioJava;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe a temperatura em graus Celsius: " );
        float temp = leitor.nextFloat();

        float temFinalF = ((9*temp)+160)/5;
        System.out.println("A temperatura convertida de  "+ temp + " Celsiu " + " em Fahrenheit é  " +  temFinalF +"F");
    }
}
