/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Exercicio20;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        int totalCarros =0;
        int totalCarrosVelhos = 0;
        int anoFabricacao = 0;
        float valorCarro = 0.0f;
        float valorDesconto = 0.00f;
        float porcentagemDesconto = 0.0f;
        float valorPagar = 0.0f;
        
        Scanner leitor = new Scanner(System.in);
        
        char desejaRepetir = 's';
        
        while (desejaRepetir == 's' || desejaRepetir == 'S'){
            System.out.println("digite o ano de fabricacao do veiculo");
            anoFabricacao = leitor.nextInt();
            
            System.out.println("Digite o valor do veiculo");
            valorCarro = leitor.nextFloat();

            if (anoFabricacao <= 2000){
                porcentagemDesconto = 0.12f;
            }else {
                porcentagemDesconto = 0.07f;
                totalCarrosVelhos++;
              
            }
            totalCarros++;
            valorDesconto = valorCarro * porcentagemDesconto;
            valorPagar = valorCarro - valorDesconto;
            
            System.out.println("o valor do desconto foi de: "+ valorDesconto);
            System.out.println("O valor que vece ser pago e: " + valorPagar);
            
            System.out.println("deseja fazer mais cadastros? S -Sim / n - Nao");
            
            desejaRepetir = leitor.next().charAt(0);
        }
        System.out.println("total de carros antigos: " + totalCarrosVelhos);
        System.out.println("total de carros cadastrados: " + totalCarros);
        
    }
}
