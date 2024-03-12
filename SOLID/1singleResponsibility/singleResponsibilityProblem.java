public class Etudiant {
    private String nom;
    private String codePermanent;
    private String adresseMail;

    Etudiant(String nom, String codePermanent, String adresseMail) {
        this.nom = nom;
        this.codePermanent = codePermanent;
        this.adresseMail = adresseMail;
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

    public String getAdresseMail() {
        return adresseMail;
    }

    public void setAdresseMail(String adresseMail) {
        this.adresseMail = adresseMail;
    }

    public void envoyerMail(String adresseMailDestinataire, String contenu) {
        //Code pour envoyer un mail
        System.out.println("Le mail contenant "+contenu+" a bien été envoyé de "+this.adresseMail+" à "+adresseMailDestinataire);
    }
}