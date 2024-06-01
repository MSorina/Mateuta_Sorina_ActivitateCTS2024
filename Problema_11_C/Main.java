package Problema_11_C;

public class Main {

    public static void main(String[] args) {
        Client client = new Client();

        client.setPlata(new Card());
        client.plateste(40.0);

        client.setPlata(new Cash());
        client.plateste(230.0);
    }
}
