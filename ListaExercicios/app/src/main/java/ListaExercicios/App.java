/*ex.01
        int n1;
        int n2;
        int resposta;
        
        Scanner leitorScanner = new Scanner(System.in);
        
        System.out.println("Digite um valor");        
        n1 = leitorScanner.nextInt();
        System.out.println("digite outro valor");
        n2 = leitorScanner.nextInt();
        resposta = n1 + n2 ;
        System.out.println("o resultado e = " + resposta);
 */
 /*ex.15

if(numero >= 100 && numero <= 200){
            System.out.println("o numero esta no intervalo");
        } else {
            System.out.println("o numero nao esta no intervalo");
        }

 */
package ListaExercicios;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int n1;
        int n2;
        int soma;
        int multiplcacao;
        int subtracao;
        float divisao;

        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Digite um valor");
        n1 = leitorScanner.nextInt();
        System.out.println("digite outro valor");
        n2 = leitorScanner.nextInt();
        soma = n1 + n2;
        multiplcacao = n1 * n2;
        subtracao = n1 - n2;
        divisao = n1 / n2;
        System.out.println("o resultados sao soma = " + soma +"  multiplicacao = " + multiplcacao+ "  subtracao = "+subtracao+ "  divisao = " +divisao);

    }
}
