package Problema_14_A;

public class InternarePacient extends Internare{
    @Override
    protected void analizeazaStare(Pacient pacient) {
        System.out.println("Se evaluaza starea pacientului " + pacient.getNume());
        if (pacient.getStare().equals("Grav")) {
            System.out.println("Pacientul este consultat.");
        } else {
            System.out.println("Pacientul trebuie internat.");
        }
    }

    @Override
    protected void verificaDisponibilitate(Pacient pacient) {
        System.out.println("Se verifica daca pacientul poate sa fie internat ");
        boolean disponibil = Math.random() > 0.5;
        pacient.setArePat(disponibil);

        if (disponibil) {
            System.out.println("Este un pat liber pentru pacient.");
        } else {
            System.out.println("Nu există paturi libere pentru pacient.");
        }
    }

    @Override
    protected void emiteFisaInternare(Pacient pacient) {
        if (pacient.isArePat()) {
            System.out.println("Se emite fișa de internare pentru pacientul " + pacient.getNume());
        } else {
            System.out.println("Nu se emite fișa de internare deoarece nu există paturi libere.");
        }
    }

}
