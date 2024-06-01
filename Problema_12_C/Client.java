package Problema_12_C;

public class Client implements Observator{ private String nume;

    public Client(String nume) {
        this.nume=nume;
    }

    @Override
    public void update(String oferta) {
        System.out.println( "Clientul: " + nume + " a primit notificare: " + oferta);

    }

}
