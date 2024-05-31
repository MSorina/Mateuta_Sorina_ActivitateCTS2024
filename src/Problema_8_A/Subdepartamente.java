package Problema_8_A;

import java.util.ArrayList;

public class Subdepartamente extends ANod{
    private ArrayList<ANod> subNoduri = new ArrayList<>();
    private String numeSubdepartamente;

    public Subdepartamente(String numeSubdepartamente) {
        this.numeSubdepartamente = numeSubdepartamente;
    }

    @Override
    public String getNume() {
        return numeSubdepartamente;
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
