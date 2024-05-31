package Problema_11_A;

public class Main {

    public static void main(String[] args) {

        ModPlata card = new Card();
        Pacient pacientCard = new Pacient("Ana", card);
        System.out.println("Pacientul: " + pacientCard.getNume());
        System.out.println("A platit cu " + pacientCard.getModPlata().getClass().getSimpleName());
        ModPlata cash = new Cash();
        Pacient pacientCash = new Pacient("Maria", cash);
        System.out.println("Pacientul: " + pacientCash.getNume());
        System.out.println("A platit " + pacientCash.getModPlata().getClass().getSimpleName());
    }
}
