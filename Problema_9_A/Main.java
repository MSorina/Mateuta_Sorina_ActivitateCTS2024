package Problema_9_A;

public class Main {

    public static void main(String[] args) {

        Spital spital = new Spital();

        Proxy proxy = new Proxy(spital);

        Pacient pacient1 = new Pacient(false);
        System.out.println(pacient1);

        Pacient pacient2 = new Pacient(true);
        System.out.println(pacient2);
}
}
