import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

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

    public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        Etudiant etudiant1 = new Etudiant("Lucas Lahougue", "LAHL28110004", "llahougue@etu.uqac.ca");
        System.out.println(etudiant1.getNom());
        System.out.println(etudiant1.getCodePermanent());

        Field[] fields = etudiant1.getClass().getDeclaredFields();
        for(Field field : fields){
            if(field.getName().equals("nom")){
                field.setAccessible(true);
                field.set(etudiant1, "Jean Dupont");
            }
        }
        System.out.println(etudiant1.getNom());

        Method[] methods = etudiant1.getClass().getMethods();
        for(Method method : methods){
            if(method.getName().equals("setCodePermanent")){
                method.invoke(etudiant1, "DUPJ12030000");
            }
        }
        System.out.println(etudiant1.getCodePermanent());
    }

}