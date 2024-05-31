package Problema_14_A;

abstract class Internare {
    public final void internarePacient(Pacient pacient) {
        analizeazaStare(pacient);
        verificaDisponibilitate(pacient);
        emiteFisaInternare(pacient);
    }

    protected abstract void analizeazaStare(Pacient pacient);

    protected abstract void verificaDisponibilitate(Pacient pacient);

    protected abstract void emiteFisaInternare(Pacient pacient);
}
