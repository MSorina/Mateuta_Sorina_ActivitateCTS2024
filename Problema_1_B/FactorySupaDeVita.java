package Problema_1_B;

public class FactorySupaDeVita implements FactorySupa{

    @Override
    public Supa creazaSupa() {
        return new SupaDeVita();
    }
}
