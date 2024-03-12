public interface Personne {
    void action();
}

public class Etudiant implements Personne {
    @Override
    public void action() {
        System.out.println("L'étudiant étudie.");
    }
}

public class Professeur implements Personne {
    @Override
    public void action() {
        System.out.println("Le professeur enseigne.");
    }
}

public class Utilisateur {
    private Personne personne;

    public Utilisateur(Personne personne) {
        this.personne = personne;
    }

    public void actionPersonne() {
        personne.action();
    }
}