interface ActionsEtudiant {
    void assisterCours();
    void faireDevoirs();
}

interface ActionsProfesseur {
    void donnerCours();
    void corrigerDevoirs();
}

class Etudiant implements ActionsEtudiant {
    public void assisterCours() {
        System.out.println("L'étudiant assiste au cours.");
    }

    public void faireDevoirs() {
        System.out.println("L'étudiant fait ses devoirs.");
    }
}

class Professeur implements ActionsProfesseur {
    public void donnerCours() {
        System.out.println("Le professeur donne le cours.");
    }

    public void corrigerDevoirs() {
        System.out.println("Le professeur corrige les devoirs.");
    }
}