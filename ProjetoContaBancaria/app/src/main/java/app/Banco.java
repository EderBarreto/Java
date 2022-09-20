package app;

import core.ContaBancaria;
 import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner teclado;
        teclado = new Scanner(System.in);
        int opcao;
        double valor;
        ContaBancaria conta = new ContaBancaria(1001,2,"Eder","111.222.333-44",100.00);
        
        
        do{
            System.out.println("EderBank - Seu banco na internet!");
            System.out.println("Digite 1-Deposito  /  2-Saque  /  3-Info  /  0-Sair ");
            opcao = teclado.nextInt();
            switch(opcao){
                case 1:
                    System.out.println(">>>DEPOSITO - Digite o valor: ");
                    valor = teclado.nextDouble();
                    conta.depositar(valor);
                    break;
                case 2:
                    System.out.println(">>>saque - digite o valor: ");
                    valor = teclado.nextDouble();
                    boolean res = conta.sacar(valor);
                    if (res) {
                        System.out.println("     Saque efetuado!");
                    }
                    else{
                        System.out.println("     saldo insulficiente");
                    }
                case 3:
                    System.out.println(">>> INFO:  "+conta.exibirDados());
                    break;
                case 0:
                    System.out.println("Obrigado pela preferencia - volte sempre!");
                    break;
                default:
                    System.out.println("***  Opção invalida  ***");
            }
            
        } while (opcao != 0);
        teclado.close();
    }
    
}
