package showdomicheltelo;

public class ShowDoMichelTelo {

    public static void main(String[] args) {

        Ingresso i = new Ingresso(50);
        i.ImprimirValor();
        Vip v = new Vip(50);
        v.ImprimirValor();
        Normal n = new Normal(50);
        n.ImprimirValor();
        CamaroteInf ci = new CamaroteInf(50);
        ci.ImprimirValor();
        CamaroteSup cs = new CamaroteSup(50);
        cs.ImprimirValor();
        
    }
}
