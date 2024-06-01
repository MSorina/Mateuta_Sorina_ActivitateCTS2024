package Problema_1_C;

public class Main {

    public static void main(String[] args){
        MedicamenteFactory medicamenteFactory = new MedicamenteFactory();
        IMedicamente medicamente =null;
        try{
            medicamente = medicamenteFactory.creareMedicamente(Categorii.Raceala);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        medicamente.descriere();
    }
}
