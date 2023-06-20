package imc;

public class Pessoa {
    //Atributos
    private float peso;
    private float altura;
    //Método Construtor -> passando valores default
    public Pessoa(float peso, float altura){
       this.peso =  peso;
       this.altura = altura;
    }

    //Métodos
    public float calcularImc(){
        float imc = peso / (altura * altura);
        return imc;


    }
    //Métodos Acessores
    public  void setPeso(float peso){

        this.peso =  peso;
    }
    public  float getPeso(){

        return peso;
    }
    public  void setAltura(float altura){

        this.altura =  altura;
    }public  float getAltura(){

        return altura;
    }

}
