interface Actions {
    void assisterCours();
    void faireDevoirs();
    void donnerCours();
    void corrigerDevoirs();
}

class Etudiant implements Actions {
    public void assisterCours() {
        System.out.println("L'étudiant assiste au cours.");
    }

    public void faireDevoirs() {
        System.out.println("L'étudiant fait ses devoirs.");
    }

    public void donnerCours() {}

    public void corrigerDevoirs() {}
    
}

class Professeur implements Actions {
    public void assisterCours() {}

    public void faireDevoirs() {}

    public void donnerCours() {
        System.out.println("Le professeur donne le cours.");
    }

    public void corrigerDevoirs() {
        System.out.println("Le professeur corrige les devoirs.");
    }
}