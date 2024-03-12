public interface Etudiant {
    String getNom();
    String getCodePermanent();
    Integer getFraisDeScolarite();
}

public class EtudiantNonEtranger implements Etudiant {
    private String nom;
    private String codePermanent;
    private Integer fraisDeScolarite;

    public EtudiantNonEtranger(String nom, String codePermanent, Integer fraisDeScolarite) {
        this.nom = nom;
        this.codePermanent = codePermanent;
        this.fraisDeScolarite = fraisDeScolarite;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public String getCodePermanent() {
        return codePermanent;
    }

    @Override
    public Integer getFraisDeScolarite() {
        return fraisDeScolarite;
    }
}

public class EtudiantEtranger implements Etudiant {
    private String nom;
    private String codePermanent;
    private Integer fraisDeScolarite;

    public EtudiantEtranger(String nom, String codePermanent, Integer fraisDeScolarite) {
        this.nom = nom;
        this.codePermanent = codePermanent;
        this.fraisDeScolarite = fraisDeScolarite;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public String getCodePermanent() {
        return codePermanent;
    }

    @Override
    public Integer getFraisDeScolarite() {
        return fraisDeScolarite * 2;
    }
}