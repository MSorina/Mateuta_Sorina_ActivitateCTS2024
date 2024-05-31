package Problema_11_B;

public class Main {
    public static void main(String[] args) {
        Client clientCuCash = new Client(new Cash());
        clientCuCash.efectueazaPlata(150.0);

        Client clientCuCard = new Client(new Card());
        clientCuCard.efectueazaPlata(1000.0);
    }
}
