package Exerciocio_04;

public class App {

    public static void main(String[] args) {
        Invoice inv = new Invoice(1,"mouse",10,50.0f); 
        System.out.println("descricao: "+ inv.getDescricao() + "   unidades: " + inv.getQuantidade());
        System.out.println("Valor total =  " + inv.getInvoiceAmount());
        
    }
}
