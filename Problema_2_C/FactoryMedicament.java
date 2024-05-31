package Problema_2_C;

public class FactoryMedicament {

    public static Medicament createMedicament(String denumire, double pret, String categorie) {
        Factory cat;
        switch (categorie.toLowerCase()) {
            case "raceala":
                cat = new Raceala();
                break;
            case "durere":
                cat = new Durere();
                break;
            case "body":
                cat = new Body();
                break;
            default:
                throw new IllegalArgumentException("Categorie necunoscută: " + categorie);
        }
        return new Medicament(denumire, pret, cat);
    }
}
