package herança;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Vendedor v =  new Vendedor();
        v.setNome("Bruna");
        v.setSalario(4500f);
        v.setCpf("85865496302");
        v.getDataNascimento(new Date());
        v.setComissaoPorItem(15f);
        v.setTotalItensVendidos(300);

        System.out.println("O Salário do Vendedor é de : "+ v.calcularSalario());

        Motorista m =  new Motorista();
        m.setNome("José");
        m.setCpf("5858484848");
        m.setSalario(1200f);
        m.setDataNascimento(new Date());
    }
}
