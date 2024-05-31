package Problema_8_A;

public class Main {

    public static void main(String[] args) {

        Structura structuraSpital = new Structura("Spital Floreasca");


        ANod departamentUrgente = new Structura("Urgente");
        ANod subdepartamentOftalmologie = new Structura("Oftalmologie");
        structuraSpital.adaugaNod(departamentUrgente);
        structuraSpital.adaugaNod(subdepartamentOftalmologie);


        ANod sectieChirurgie = new Sectii("Chirurgie");
        ANod sectieCardiologie = new Sectii("Cardiologie");
        ((Structura) departamentUrgente).adaugaNod(sectieCardiologie);
        ((Structura) subdepartamentOftalmologie).adaugaNod(sectieChirurgie);

        System.out.println(structuraSpital.getInfo());
    }
}

