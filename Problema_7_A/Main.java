package Problema_7_A;

public class Main {
    public static void main(String[] args) {
        Initial initial = new Initial();
        CareTaker careTaker = new CareTaker();

        initial.setStareAnterioara("Rezultat printat");
        System.out.println("Situatia initiala: " + initial.getStareAnterioara());
        careTaker.add(initial.saveStareToMemento());

        initial.setStareAnterioara("Rezultat Online");
        System.out.println("Situatia finala : " + initial.getStareAnterioara());
        careTaker.add(initial.saveStareToMemento());

        initial.setStareAnterioara("Rezultat printat si rezultat online");
        System.out.println("Situatia finala: " + initial.getStareAnterioara());

        initial.getStareFromMemento(careTaker.get());
        System.out.println("Revenire la: " + initial.getStareAnterioara());

        initial.getStareFromMemento(careTaker.get());
        System.out.println("Revenire la: " + initial.getStareAnterioara());
    }

}
