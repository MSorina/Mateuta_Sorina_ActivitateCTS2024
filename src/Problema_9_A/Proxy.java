package Problema_9_A;

public class Proxy implements IPacient{
    private Spital spital;

    public Proxy(Spital spital) {
        this.spital = spital;
    }

    @Override
    public boolean verificaAsigurareSanatate() {
        return false;
    }

    public void internare() {
        System.out.println("Pacientul nu are asigurare de sanatate si nu poate fi internat.");
    }
}
