package Problema_11_A;

public class Card implements ModPlata{

    @Override
    public void plateste(String nume, String modPlata) {
        System.out.println("Pacientul " + nume + " a platit cu " + modPlata);
    }
}
