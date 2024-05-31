package Problema_11_B;

public class Client {

    private Plata modulDePlata;

    public Client(Plata modulDePlata) {
        this.modulDePlata = modulDePlata;
    }

    public void efectueazaPlata(double suma) {
        modulDePlata.efecuarePlata(suma);
    }
}
