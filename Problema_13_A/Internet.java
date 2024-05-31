package Problema_13_A;

public class Internet implements Stare {

        @Override
        public void schimbaStare(Pacient pacient) {
            System.out.println("Pacientul " + pacient.getNume() + " a fost internat.");
            pacient.setStare(this);
        }

        @Override
        public String toString() {
            return "Internat";
        }

}
