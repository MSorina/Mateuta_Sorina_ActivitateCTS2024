package Problema_12_C;

public class Main {
    public static void main(String[] args) {


        Farmacie farmacie = new Farmacie("Dr. MAX");
        Client client = new Client("Ana");
        farmacie.stergeClient(client);
        farmacie.trimiteNotificare("Oferta nou");

    }
}
