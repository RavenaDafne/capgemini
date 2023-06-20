package exercicios04POO;

public class Invoice {
    private int codigoItem;
    private String descItem;
    private int qntItem;
     private float precoUnitario;

    public Invoice(int codigoItem, String descItem, int qntItem, float precoUnitario) {
        this.setCodigoItem(codigoItem);
        this.setDescItem(descItem);
        this.setQntItem(qntItem);
        this.setPrecoUnitario(precoUnitario);
    }

    public double getInvoiceAmount(){
       return qntItem * precoUnitario;

    }

    public int getCodigoItem() {
        return codigoItem;
    }

    public void setCodigoItem(int codigoItem) {
        this.codigoItem = codigoItem;
    }

    public String getDescItem() {
        return descItem;
    }

    public void setDescItem(String descItem) {
        this.descItem = descItem;
    }

    public int getQntItem() {
        return qntItem;
    }

    public void setQntItem(int qntItem) {
        if(qntItem < 0){
            this.qntItem =0;
        }else{
            this.qntItem =qntItem;
        }
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {
        if(precoUnitario < 0){
            this.precoUnitario = 0;
        }else{
            this.precoUnitario = precoUnitario;
        }
    }
}
