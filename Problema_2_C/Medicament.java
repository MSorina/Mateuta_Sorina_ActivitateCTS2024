package Problema_2_C;

public class Medicament {
    private String denumire;
    private double pret;
    private Factory factory;

    public Medicament(String denumire, double pret, Factory factory) {
        this.denumire = denumire;
        this.pret = pret;
        this.factory = factory;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public Factory getFactory() {
        return factory;
    }

    public void setFactory(Factory factory) {
        this.factory = factory;
    }

    @Override
    public String toString() {
        return "Medicament{" +
                "denumire='" + denumire + '\'' +
                ", pret=" + pret +
                ", categorie=" + factory.getNume() +
                '}';
    }
}
