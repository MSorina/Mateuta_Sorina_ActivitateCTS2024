package Problema_1_A;

public class PacientBuilder implements IBuilder{

    private String nume;
    private int varsta;
    private boolean arepatRabatabil = false;
    private boolean aremicDejunInclus = false;
    private boolean arepapuciDeCamera = false;
    private boolean arehalatInterior = false;

    public PacientBuilder(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public PacientBuilder setPatRabatabil(boolean patRabatabil) {
        this.arepatRabatabil = patRabatabil;
        return this;
    }

    public PacientBuilder setMicDejunInclus(boolean micDejunInclus) {
        this.aremicDejunInclus = micDejunInclus;
        return this;
    }

    public PacientBuilder setPapuciDeCamera(boolean papuciDeCamera) {
        this.arepapuciDeCamera= papuciDeCamera;
        return this;
    }

    public PacientBuilder setHalatInterior(boolean halatInterior) {
        this.arehalatInterior = halatInterior;
        return this;
    }

    public Pacient build() {
        return new Pacient(nume, varsta, arepatRabatabil,
                aremicDejunInclus, arepapuciDeCamera, arehalatInterior );




    }
}


