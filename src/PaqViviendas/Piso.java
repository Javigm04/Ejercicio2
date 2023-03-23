package PaqViviendas;

public class Piso extends Vivienda{
    protected double metrosPiso;
    protected boolean terraza;

    public Piso(double precio, double numerodeplantas,double metrosPiso, boolean terraza){
        super(precio, numerodeplantas);
        if(metrosPiso>0){
            this.metrosPiso=metrosPiso;
        }
        this.terraza=terraza;
    }

    @Override
    public double impuesto() {
        return 1.5*this.metrosPiso;
    }
}
