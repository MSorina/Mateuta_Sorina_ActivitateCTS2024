package Problema_13_A;

public class SubObservatie implements Stare{
    @Override
    public void schimbaStare(Pacient pacient) {
        System.out.println("Pacientul " + pacient.getNume() + " este sub observație.");
        pacient.setStare(this);
    }

    @Override
    public String toString() {
        return "SubObservatie";
    }
}
