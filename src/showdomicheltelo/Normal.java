
package showdomicheltelo;


public class Normal extends Ingresso {

    public Normal(double preco) {
        super(preco);
    }
    
    public void MostrarIngresso(){
        System.out.println("INGRESSO NORMAL..."); 
       
    }

    @Override
    public void ImprimirValor() {
        
        System.out.println("O VALOR DO INGRESSO NORMAL É: "+ this.preco);
        System.out.println("----------------------------------------");
    }
    
    

    
    
}
