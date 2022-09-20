package ProjetoEmpregado;

public class EmpregadoTeste {
   
    public static void main (String[] args) {

        Empregado e1,e2;
        
        e1 = new Empregado("Dev.Ederson",3000.00);
        e2 = new Empregado("coordenador Jose",7000.00);
        
        // antes do reajuste
        System.out.println("------informacoes originais -----------");
        System.out.println(e1.exibir());
        System.out.println(e2.exibir());
        
             
    }

 
}