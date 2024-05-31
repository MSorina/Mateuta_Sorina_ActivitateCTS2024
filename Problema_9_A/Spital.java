package Problema_9_A;

public class Spital implements IPacient{

    @Override
    public boolean verificaAsigurareSanatate() {
        return false;
    }

    @Override
    public void internare() {
        System.out.println("Nu are asigurare de santate si nu se poate interna");
    }
}
