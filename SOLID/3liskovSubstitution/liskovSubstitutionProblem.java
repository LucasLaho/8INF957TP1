public class Individu {
    private String nom;
    private String codePermanent;
    private Integer fraisDeScolarite;

    Individu(String nom, String codePermanent, Integer fraisDeScolarite) {
        this.nom = nom;
        this.codePermanent = codePermanent;
        this.fraisDeScolarite = fraisDeScolarite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCodePermanent() {
        return codePermanent;
    }

    public void setCodePermanent(String codePermanent) {
        this.codePermanent = codePermanent;
    }

    public String getFraisDeScolarite() {
        return fraisDeScolarite;
    }

    public void setFraisDeScolarite(Integer fraisDeScolarite) {
        this.fraisDeScolarite = fraisDeScolarite;
    }

}

public class Etudiant extends Individu {
    Etudiant(String nom, String codePermanent, Integer fraisDeScolarite) {
        super(nom, codePermanent, fraisDeScolarite);
    }
}

public class Professeur extends Individu {
    Professeur(String nom, String codePermanent) {
        super(nom, codePermanent, null);
    }

    @Override
    public Integer getFraisDeScolarite() {
        throw new RuntimeException("Les professeurs n'ont pas de frais de scolarité.");
    }
}