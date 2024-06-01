package Problema_1_C;

public class MedicamenteFactory {

    public IMedicamente creareMedicamente(Categorii categorii) throws Exception{
        switch(categorii){
            case Body:
                return new MedicamenteBody();
            case Durere:
                return new MedicamenteDurere();
            case Raceala:
                return new MedicamenteRaceala();
            default:
                throw new Exception("Categoria primita nu este corecta!");
        }
    }
}
