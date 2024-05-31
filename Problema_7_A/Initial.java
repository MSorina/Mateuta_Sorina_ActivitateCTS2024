package Problema_7_A;

public class Initial {
    private String stareAnterioara;

    public void setStareAnterioara(String stareAnterioara) {
        this.stareAnterioara = stareAnterioara;
    }

    public String getStareAnterioara() {
        return stareAnterioara;
    }

    public Memento saveStareToMemento() {
        return new Memento(stareAnterioara);
    }

    public void getStareFromMemento(Memento memento) {
        stareAnterioara = memento.getStare();
    }

}
