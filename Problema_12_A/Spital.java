package Problema_12_A;

import java.util.ArrayList;
import java.util.List;

public class Spital implements Notificare{

    private List<Pacient> pacienti;
    private String numeSpital;

    public Spital(String numeSpital) {
        this.numeSpital = numeSpital;
        this.pacienti = new ArrayList<>();
    }

    @Override
    public void trimiteNotificare(String notificare) {
        for (Pacient pacient : pacienti) {
            pacient.notificare(notificare);
        }
    }

    public void stergePacient(Pacient pacient) {
        pacienti.add(pacient);
    }

}
