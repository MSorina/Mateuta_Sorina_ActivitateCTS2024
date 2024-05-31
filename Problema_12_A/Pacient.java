package Problema_12_A;

public class Pacient implements Observator{

    private String nume;

    public Pacient(String nume) {
        this.nume=nume;
    }

    @Override
    public void notificare(String mesaj) {
        System.out.println( "Pacientul: " + nume + " a primit notificare: " + mesaj);
    }
}
