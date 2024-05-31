package Problema_2_A;

import static Problema_2_A.ETipPersonal.*;

public class SpitalFactory {

    public ISpital createPersonal(ETipPersonal tip) throws Exception {
        switch (tip) {
            case Brancardier:
                return new SpitalBrancardier();
            case Asistent:
                return new SpitalAsistent();
            case Medic:
                return new SpitalMedic();
            default:
                throw new IllegalArgumentException("Tip personal necunoscut");
        }
    }

}
