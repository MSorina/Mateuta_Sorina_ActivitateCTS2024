package Problema_1_B;

public class FactorySupaDeLegume implements FactorySupa{


    @Override
    public Supa creazaSupa() {
        return new SupaDeLegume();
    }
}
