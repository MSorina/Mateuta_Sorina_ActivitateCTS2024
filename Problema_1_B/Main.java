package Problema_1_B;

public class Main {
    public static void main(String[] args) {
        FactorySupa fabricaLegume = new FactorySupaDeLegume();
        FactorySupa fabricaCiuperci = new FactorySupaDeCiuperci();
        FactorySupa fabricaVita = new FactorySupaDeVita();

        Supa supaLegume = fabricaLegume.creazaSupa();
        Supa supaCiuperci = fabricaCiuperci.creazaSupa();
        Supa supaVita = fabricaVita.creazaSupa();

        supaLegume.afiseazaTipul();
        supaCiuperci.afiseazaTipul();
        supaVita.afiseazaTipul();
    }
}
