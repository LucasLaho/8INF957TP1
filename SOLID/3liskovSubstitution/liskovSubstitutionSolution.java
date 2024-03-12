public class Individu {
    private String nom;
    private String codePermanent;

    Individu(String nom, String codePermanent) {
        this.nom = nom;
        this.codePermanent = codePermanent;
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

}

public class Etudiant extends Individu {
    private Integer fraisDeScolarite;

    Etudiant(String nom, String codePermanent, Integer fraisDeScolarite) {
        super(nom, codePermanent);
        this.fraisDeScolarite = fraisDeScolarite;
    }

    public String getFraisDeScolarite() {
        return fraisDeScolarite;
    }

    public void setFraisDeScolarite(Integer fraisDeScolarite) {
        this.fraisDeScolarite = fraisDeScolarite;
    }

}

public class Professeur extends Individu {
    Professeur(String nom, String codePermanent) {
        super(nom, codePermanent);
    }
    
}