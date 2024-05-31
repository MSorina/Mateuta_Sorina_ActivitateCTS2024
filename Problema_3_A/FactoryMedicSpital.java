package Problema_3_A;

public class FactoryMedicSpital implements Factory{

    @Override
    public PersonalSpital createPersonalSpital() {
        return new MedicSpital();
    }
}
