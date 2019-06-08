import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;

public class Client {

    private String nom;
    private String prenom;
    private String dateDeNaissance;
    private String telephone;
    private String adresse;
    private String numero;

    /**
     * Constructeur de la classe Client. Il permet de créer un objet Clint avec les informations voulues par le loueur de Véhicules.
     * @param nom
     * @param prenom
     * @param dateDeNaissance
     * @param telephone
     * @param adresse
     */
    public Client(String nom,String prenom,String dateDeNaissance,String telephone,String adresse) {

        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
        this.adresse = adresse;
        this.telephone = telephone;
        this.numero = numero;

        File baseDeDonnées = new File("../Client/" + nom + "_" + prenom + "1");
        baseDeDonnées.mkdirs();
    }


    public Client(){}

    /*------------------------------------------Accesseur--------------------------------*/

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setDateDeNaissance(String dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    /*-------------------------------------------Mutateurs-------------------------------*/


    public String getAdresse() {
        return adresse;
    }

    public String getDateDeNaissance() {
        return dateDeNaissance;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getNumero() {
        return numero;
    }

    /**
     * Cette fonction permet de Créer un fichier .xml avec toutes les informations du client
     * @param aClient
     */


     public static void ecrireClient(Client aClient) {

        try {
            FileOutputStream mec = new FileOutputStream("./Client/"+aClient.getNom()+" "+aClient.getPrenom()+".xml");
            XMLEncoder encoder = new XMLEncoder(mec);
            encoder.writeObject(aClient);
            encoder.close();
            mec.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

}



