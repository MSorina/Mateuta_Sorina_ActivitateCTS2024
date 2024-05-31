package Problema_10_A;

import java.util.HashMap;

public class PacientFactory implements IFactory{
    private final HashMap<String, Pacient> pacienti = new HashMap<>();

    @Override
    public Pacient getPacient(String nume, long numarTel, String adresa) {
        String key = nume + " " + numarTel;
        Pacient pacient = pacienti.get(key);

        if (pacient == null) {
            pacient = new Pacient(nume, numarTel, adresa);
            pacienti.put(key, pacient);
        }

        return pacient;
    }

}
