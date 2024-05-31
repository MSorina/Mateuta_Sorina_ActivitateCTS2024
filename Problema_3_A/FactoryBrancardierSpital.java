package Problema_3_A;

public class FactoryBrancardierSpital implements Factory{

    @Override
    public PersonalSpital createPersonalSpital() {
        return new BrancardierSpital();
    }
}
