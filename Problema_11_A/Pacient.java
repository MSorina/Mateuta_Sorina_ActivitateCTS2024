package Problema_11_A;

public class Pacient {

    private String nume;
    private ModPlata modPlata;

    public Pacient(String nume, ModPlata modplata) {
        this.nume = nume;
        this.modPlata = modplata;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public ModPlata getModPlata() {
        return modPlata;
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }
}

