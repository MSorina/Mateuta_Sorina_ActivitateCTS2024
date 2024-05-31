package Problema_10_A;

public class Pacient {
    private String nume;
    private long numarTel;
    private String adresa;

    public Pacient(String nume, long numarTel, String adresa) {
        this.nume = nume;
        this.numarTel = numarTel;
        this.adresa = adresa;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public long getNumarTel() {
        return numarTel;
    }

    public void setNumarTel(long numarTel) {
        this.numarTel = numarTel;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }
}
