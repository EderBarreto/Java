package Classes;

public class Pessoa {
    //atributos
    private float peso;
    private float altura;
    
    //metodo construtor
    public Pessoa(){
        System.out.println("executando o metodo construtor");
    }
    public float calcularIMC(){
        float imc = peso / (altura * altura) ;
        return imc ;
    }
    
    //métodos acessores
    public void setPeso(float peso){
        this.peso = peso;
        
    }
    public float getPeso(){
        return peso;
    } 
    
    public void setAltura(float altura){
        this.altura = altura; 
    }
    
    public float getAltura(){
        return altura;
    }
            
}
