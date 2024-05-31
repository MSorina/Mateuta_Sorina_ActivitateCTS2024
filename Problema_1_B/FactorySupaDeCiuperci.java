package Problema_1_B;

public class FactorySupaDeCiuperci implements FactorySupa{

    @Override
    public Supa creazaSupa() {
        return new SupaDeCiuperci();
    }
}
