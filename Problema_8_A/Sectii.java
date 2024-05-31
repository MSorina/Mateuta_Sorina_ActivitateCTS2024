package Problema_8_A;

public class Sectii extends ANod{
    String numeSectii;

    public Sectii(String denumireSectii){
        this.numeSectii = numeSectii;

    }

    @Override
    public String getNume() {
        return this.numeSectii;
    }

}
