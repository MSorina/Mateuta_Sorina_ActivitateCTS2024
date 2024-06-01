package Problema_11_C;

public class Cash implements Plata{
    @Override
    public void plateste(double suma) {
        System.out.println("A fost placita cash suma de" + suma);
    }
}
