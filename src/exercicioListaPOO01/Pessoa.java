package exercicioListaPOO01;

import java.time.LocalDate;
import java.util.Date;

public class Pessoa {
    private  String nome;
    private Date dataNascimento;

    private int anoNascimento;

    private float altura;

    public Pessoa(String nome, Date dataNascimento, int anoNascimento, float altura) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.anoNascimento = anoNascimento;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public float getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public  void imprimirDadosPessoa(){
        System.out.println("Nome: " + getNome());
        System.out.println("Data Nascimento: " + getDataNascimento());
        System.out.println("Altura: " + getAltura());
        int anoAtual = LocalDate.now().getYear();
        int idade = (int) (anoAtual - getAnoNascimento());

        System.out.println("Idade : " + idade);
    }


}
