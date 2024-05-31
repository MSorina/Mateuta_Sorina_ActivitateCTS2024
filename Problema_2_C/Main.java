package Problema_2_C;

public class Main {
    public static void main(String[] args) {
        Medicament medicament1 = FactoryMedicament.createMedicament("Paracetamol", 17.5, "Raceala");
        Medicament medicament2 = FactoryMedicament.createMedicament("Cafetin", 25.0, "Durere");
        Medicament medicament3 = FactoryMedicament.createMedicament("Magneziu", 10.0, "Body");

        System.out.println(medicament1);
        System.out.println(medicament2);
        System.out.println(medicament3);
    }
}

