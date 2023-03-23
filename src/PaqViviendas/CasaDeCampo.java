package PaqViviendas;

public class CasaDeCampo extends Vivienda{
    double metrosparcela;
    Chalet chalet;

    public CasaDeCampo(double precio, double numerodeplantas, double metrosparcela, Chalet chalet){
        super(precio, numerodeplantas);
        if(metrosparcela>0){
            this.metrosparcela=metrosparcela;
        }
        this.chalet=chalet;
    }

    @Override
    public double impuesto() {
        return super.impuesto()+(0.5*this.metrosparcela);
    }
}
