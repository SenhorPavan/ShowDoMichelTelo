
package showdomicheltelo;

public class CamaroteSup extends Vip {

    public CamaroteSup(double preco) {
        super(preco+30);
    }

    @Override
    public void ImprimirValor() {
        System.out.println("O VALOR DO INGRESSO VIP CAMAROTE SUPERIOR É: "+this.preco);
        
    }

    
    
    
    
}
