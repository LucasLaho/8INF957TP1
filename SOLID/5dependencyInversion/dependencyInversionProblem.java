public class Etudiant {
    public void etudier() {
        System.out.println("L'étudiant étudie.");
    }
}

public class Professeur {
    public void enseigner() {
        System.out.println("Le professeur enseigne.");
    }
}

public class Utilisateur {
    private Etudiant etudiant;
    private Professeur professeur;

    public Utilisateur() {
        this.etudiant = new Etudiant();
        this.professeur = new Professeur();
    }

    public void actionEtudiant() {
        etudiant.etudier();
    }

    public void actionProfesseur() {
        professeur.enseigner();
    }
}