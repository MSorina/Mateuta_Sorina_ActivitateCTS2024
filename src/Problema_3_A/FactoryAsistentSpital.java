package Problema_3_A;

public class FactoryAsistentSpital implements Factory{

    @Override
    public PersonalSpital createPersonalSpital() {
        return new AsistentSpital();
    }
}
