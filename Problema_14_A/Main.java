package Problema_14_A;

public class Main {
    public static void main(String[] args) {
        Internare internare = new InternarePacient();
        Pacient pacient1 = new Pacient("Ana", "Grav");
        Pacient pacient2 = new Pacient("Bianca", "Grav");

        System.out.println("Internare pacientul 1:");
        internare.internarePacient(pacient1);
        System.out.println("\n");
        System.out.println("Internare pacientul 2:");
        internare.internarePacient(pacient2);
    }
}
