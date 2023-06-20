package exercicios04POO;

public class Main {
    public static void main(String[] args) {
        Invoice inv = new Invoice(0,"Mouse Gtech",-5,150f);
        System.out.println("Valor total : " + inv.getInvoiceAmount());

    }
}
