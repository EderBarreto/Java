package Heranca;

import java.util.HashSet;
import java.util.Set;

public class Main {
    
    public static void main(String[] args) {

        Vendedor v = new Vendedor();
        v.setNome("Ederson");
        v.setSalario(1000.0f);
        v.setCpf("33333333333");
        v.setDataNascimento(new Date());
        v.setComissaoPorItem(10.0f);
        v.setTotalItensVendidos(10);
        System.out.println("o salario do vendedor e: "+ v.calcularSalario());
        
        Motorista m = new Motorista();
        m.setCpf("222222222222");
        
    }
    
}
