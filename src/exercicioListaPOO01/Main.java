package exercicioListaPOO01;


import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Pessoa indv = new Pessoa("Ravena Dafne", new Date(1992,9,23),1992,1.53f);
        indv.imprimirDadosPessoa();
    }
}
