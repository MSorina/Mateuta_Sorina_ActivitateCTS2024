package Problema_10_A;

public class Main {

    public static void main(String[] args) {
        IFactory factory = new PacientFactory();
        Pacient pacient = factory.getPacient("Ioana.", 752435789, "Str. Ana-Ipatescu, nr. 4, bl 6");
        Internare internare = new Internare(16, 3, 9, pacient);
        internare.descriere();
    }
}
