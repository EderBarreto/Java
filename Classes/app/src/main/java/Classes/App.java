package Classes;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Pessoa objetoPessoa = new Pessoa();
        Scanner leitor = new Scanner (System.in);

        System.out.println("digite o peso");
        objetoPessoa.setPeso(leitor.nextFloat());
        System.out.println("digite altura");
        objetoPessoa.setAltura(leitor.nextFloat());
        
        System.out.println("imc= "+ objetoPessoa.calcularIMC());
    }
}
