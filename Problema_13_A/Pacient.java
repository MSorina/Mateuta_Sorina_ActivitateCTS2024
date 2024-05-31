package Problema_13_A;

public class Pacient {
    private String nume;
    private Stare stare;

    public Pacient(String nume) {
        this.nume = nume;
        this.stare = new Internet();
        this.stare.schimbaStare(this);
    }

    public String getNume() {
        return nume;
    }

    public Stare getStare() {
        return stare;
    }

    public void setStare(Stare stare) {
        this.stare = stare;
    }

    public void schimbaStare(Stare nouaStare) {
        nouaStare.schimbaStare(this);
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "nume='" + nume + '\'' +
                ", stare=" + stare +
                '}';
    }
}
