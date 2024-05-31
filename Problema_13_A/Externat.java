package Problema_13_A;

public class Externat implements Stare{
    @Override
    public void schimbaStare(Pacient pacient) {
        System.out.println("Pacientul " + pacient.getNume() + " a fost externat.");
        pacient.setStare(this);
    }

    @Override
    public String toString() {
        return "Externat";
    }
}
