package showdomicheltelo;

public class Ingresso {
    
    public Ingresso(double preco){
        this.preco = preco;
        
    }

    public double preco;

    public void ImprimirValor() {

        System.out.println("O VALOR DO INGRESSO É: " + this.preco);
        System.out.println("----------------------"); 
    }
    
}
