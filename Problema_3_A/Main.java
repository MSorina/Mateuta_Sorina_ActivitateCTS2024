package Problema_3_A;

public class Main {
    private static void afisare(Factory factory){
        PersonalSpital personalSpital = factory.createPersonalSpital();
        personalSpital.descriere();
    }

    public static void main (String[] args){
        afisare(new FactoryAsistentSpital());
    }

}
