package Problema_11_B;

public class Cash implements Plata{
    @Override
    public void efecuarePlata(double suma) {
        System.out.println("Se va efectua cach plata de " + suma );
    }
}
