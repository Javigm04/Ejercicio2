package PaqViviendas;

public class Unifamiliar implements Comparable{
    protected double precio;
    protected double numerodeplantas;

    public Unifamiliar(double precio, double numerodeplantas){
        if(precio>0) {
            this.precio = precio;
        }
        if(numerodeplantas>0) {
            this.numerodeplantas = numerodeplantas;
        }
    }
    public double impuesto(){
        double impuesto;
        impuesto=precio*0.20;
        return impuesto;
    }
    public int compareTo(Object o) {
        if(!(o instanceof Unifamiliar)) return -1;
        Unifamiliar vivienda1=(Unifamiliar) o;
        if(this.impuesto()< vivienda1.impuesto())return -1;
        else if(this.impuesto()> vivienda1.impuesto())return 1;
        return 0;
    }
}
