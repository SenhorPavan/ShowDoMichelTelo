
package showdomicheltelo;


public class Vip extends Ingresso {

    public Vip(double preco) {
        super(preco+50.0);
    }

    @Override
    public void ImprimirValor() {
        
        System.out.println("O VALOR DO INGRESSO VIP É: "+ this.preco);
        
    }

    
    
    
    
}
