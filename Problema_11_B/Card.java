package Problema_11_B;

public class Card implements Plata{

    @Override
    public void efecuarePlata(double suma) {
        System.out.println("Se va efectua cu cardul plata de " + suma );
    }
}
