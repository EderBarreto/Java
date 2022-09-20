package core;

public class ContaBancaria {
    private int numeroConta;
    private int digitoVerifif;
    private String nomeTitular;
    private String cpfTitular;
    private double saldo;

    public ContaBancaria(int numeroConta, int digitoVerifif, String nomeTitular, String cpfTitular, double saldo) {
        super();
        this.numeroConta = numeroConta;
        this.digitoVerifif = digitoVerifif;
        this.nomeTitular = nomeTitular;
        this.cpfTitular = cpfTitular;
        this.saldo = saldo;
    }

    //métodos especificos que dizem respeito a conta bancaria
    public void depositar (double valor){
        this.saldo+= valor;
    }
    
    public String exibirDados(){
        return "Conta: "+numeroConta+"-"+digitoVerifif+":"+nomeTitular+" ("+
                cpfTitular+") "+String.format("%.2f", saldo);
    }
    
    public boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        }
        
        return false;
    
    } 
    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getDigitoVerifif() {
        return digitoVerifif;
    }

    public void setDigitoVerifif(int digitoVerifif) {
        this.digitoVerifif = digitoVerifif;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getCpfTitular() {
        return cpfTitular;
    }

    public void setCpfTitular(String cpfTitular) {
        this.cpfTitular = cpfTitular;
    }

    
    

    public void getSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    
}
