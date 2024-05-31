package Problema_13_A;

public class Main {
    public static void main(String[] args) {
        Pacient pacient1 = new Pacient("Ana");
        Pacient pacient2 = new Pacient("Corina");
        pacient1.schimbaStare(new SubObservatie());
        pacient1.schimbaStare(new Externat());
        pacient2.schimbaStare(new Externat());
    }
}
