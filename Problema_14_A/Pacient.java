package Problema_14_A;

public class Pacient {
    private String nume;
    private String stare;
    private boolean arePat;

    public Pacient(String nume, String stare) {
        this.nume = nume;
        this.stare = stare;
        this.arePat = false;
    }

    public String getNume() {
        return nume;
    }

    public String getStare() {
        return stare;
    }

    public void setArePat(boolean arePat) {
        this.arePat = arePat;
    }

    public boolean isArePat() {
        return arePat;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "nume='" + nume + '\'' +
                ", stare='" + stare + '\'' +
                ", arePatDisponibil=" + arePat +
                '}';
    }

}
