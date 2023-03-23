package PaqViviendas;

public class Chalet extends Unifamiliar{
    protected double metrosjardin;

    public Chalet(double precio, double numerodeplantas, double metrosjardin){
        super(precio, numerodeplantas);
        if(metrosjardin>0){
            this.metrosjardin=metrosjardin;
        }
    }
}
