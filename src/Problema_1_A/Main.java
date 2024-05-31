package Problema_1_A;

public class Main {

    public static void main (String[] args){
        Pacient pacient1 = new PacientBuilder("Ana", 45).build();

        Pacient pacient2 = new PacientBuilder("Maria", 30)
                .setPatRabatabil(true)
                .setMicDejunInclus(true)
                .setPapuciDeCamera(true)
                .setHalatInterior(true)
                .build();

        System.out.println(pacient1);
        System.out.println(pacient2);
    }

}
