package Problema_8_A;

import java.util.ArrayList;

public class Departamente extends ANod{
    private ArrayList<ANod> subNoduri = new ArrayList<>();
    private String numeDepartamente;

    public Departamente(String numeDepartamente) {
        this.numeDepartamente = numeDepartamente;
    }

    @Override
    public String getNume() {
        return numeDepartamente;
    }

    @Override
    public void adaugaNod(ANod nod) {
        subNoduri.add(nod);
    }

    @Override
    public void eliminaNod(ANod nod) {
        subNoduri.remove(nod);
    }

    @Override
    public ANod getNod(int index) {
        return subNoduri.get(index);
    }
}
