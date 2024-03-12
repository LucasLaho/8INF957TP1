//Classe avant l'ajout de notion d'étudiant étranger
public class Etudiant {
    private String nom;
    private String codePermanent;
    private Integer fraisDeScolarite;

    Etudiant(String nom, String codePermanent, Integer fraisDeScolarite) {
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

    public void setFraisDeScolarite(String fraisDeScolarite) {
        this.fraisDeScolarite = fraisDeScolarite;
    }

}

//Classe après l'ajout de notion d'étudiant étranger
public class Etudiant {
    private String nom;
    private String codePermanent;
    private Integer fraisDeScolarite;
    private Boolean estEtranger;

    Etudiant(String nom, String codePermanent, Boolean estEtranger) {
        this.nom = nom;
        this.codePermanent = codePermanent;
        this.fraisDeScolarite = fraisDeScolarite;
        this.estEtranger = estEtranger;
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
        if(!estEtranger) return fraisDeScolarite;
        else return fraisDeScolarite * 2;
    }

    public void setFraisDeScolarite(String fraisDeScolarite) {
        this.fraisDeScolarite = fraisDeScolarite;
    }

}