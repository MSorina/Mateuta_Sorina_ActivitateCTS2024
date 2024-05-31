package Problema_1_A;

public class Pacient {
        private String nume;
        private int varsta;
        private boolean arepatRabatabil;
        private boolean aremicDejunInclus;
        private boolean arepapuciDeCamera;
        private boolean arehalatInterior;


    public Pacient(String nume, int varsta, boolean arepatRabatabil, boolean aremicDejunInclus, boolean arepapuciDeCamera, boolean arehalatInterior) {
        this.nume = nume;
        this.varsta = varsta;
        this.arepatRabatabil = arepatRabatabil;
        this.aremicDejunInclus = aremicDejunInclus;
        this.arepapuciDeCamera = arepapuciDeCamera;
        this.arehalatInterior = arehalatInterior;
    }

    public String getNume() {
        return nume;
    }

    public Pacient setNume(String nume) {
        this.nume = nume;
        return this;
    }

    public int getVarsta() {
        return varsta;
    }

    public Pacient setVarsta(int varsta) {
        this.varsta = varsta;
        return this;
    }

    public boolean isArepatRabatabil() {
        return arepatRabatabil;
    }


    public boolean isAremicDejunInclus() {
        return aremicDejunInclus;
    }


    public boolean isArepapuciDeCamera() {
        return arepapuciDeCamera;
    }


    public boolean isArehalatInterior() {
        return arehalatInterior;
    }

    public Pacient setArepatRabatabil(boolean arepatRabatabil) {
        this.arepatRabatabil = arepatRabatabil;
        return this;
    }

    public Pacient setAremicDejunInclus(boolean aremicDejunInclus) {
        this.aremicDejunInclus = aremicDejunInclus;
        return this;
    }

    public Pacient setArepapuciDeCamera(boolean arepapuciDeCamera) {
        this.arepapuciDeCamera = arepapuciDeCamera;
        return this;
    }

    public Pacient setArehalatInterior(boolean arehalatInterior) {
        this.arehalatInterior = arehalatInterior;
        return this;
    }

    @Override
        public String toString() {
        return "Pacient{" +
                "nume=" + nume +
                "varsta" + varsta +
                ", arePatRabatabil=" + arepatRabatabil +
                ", areMicDejunInclus=" + aremicDejunInclus +
                ", arePapuciDeCamera=" + arepapuciDeCamera +
                ", areHalatInterior=" + arehalatInterior +
                '}';
        }




}
