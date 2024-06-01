package Problema_11_C;

public class Client {
    private Plata plata;

    public void setPlata(Plata plata) {
        this.plata = plata;
    }

    public void plateste(double suma) {
        if (plata != null) {
            plata.plateste(suma);
        } else {
            System.out.println("Selectati modul de plata. Modul de plata nu a fost selectata");
        }
    }
}
