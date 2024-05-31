package Problema_12_A;

public class Main {

    public static void main(String[] args) {

        Spital spital=new Spital("Spitalul Floreasca");
        Pacient pacient1 = new Pacient("Ana");
        spital.stergePacient(pacient1);
        spital.trimiteNotificare("Alerta Covid!");

    }
}
