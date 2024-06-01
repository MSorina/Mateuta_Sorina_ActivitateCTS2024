package Problema_11_C;

public class Card implements Plata{
    @Override
    public void plateste(double suma) {
        System.out.println("Afost platita cu cadrul suma de" + suma);
    }
}
