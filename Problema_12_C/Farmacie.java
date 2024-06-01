package Problema_12_C;

import Problema_12_A.Pacient;

import java.util.ArrayList;
import java.util.List;

public class Farmacie implements Notificare{

    private List<Client> clienti;
    private String numeFarmacie;

    public Farmacie(String numeFarmacie) {
        this.numeFarmacie = numeFarmacie;
        this.clienti = new ArrayList<>();
    }

    @Override
    public void trimiteNotificare(String notificare) {
        for (Client client : clienti) {
            client.update(notificare);
        }
    }

    public void stergeClient(Client client) {
        clienti.add(client);
    }
}
