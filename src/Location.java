import java.beans.XMLEncoder;
import java.io.FileOutputStream;
import java.util.Date;


public class Location {
    private String nomClient;
    private String prenomClient;
    private String vehicule;
    private String debut;
    private String fin;
    private String kmprevu;
    private String prix;

    /**
     * Le constructeur créé un objet Location avec les informations passées en paramètre, qui sont celles rentrées par l'utilisateur.
     * @param vehicule
     * @param debut
     * @param fin
     * @param kmprevu
     * @param nomClient
     * @param prenomClient
     */
    public Location(String nomClient,String prenomClient, String vehicule, String debut, String fin, String kmprevu,String prix) {
        this.nomClient = nomClient;
        this.prenomClient=prenomClient;
        this.vehicule = vehicule;
        this.debut = debut;
        this.fin = fin;
        this.kmprevu = kmprevu;
        this.prix = prix;
    }

    // ---------------------------------------Accesseurs---------------------------------------\\

    public String getNomClient() {
        return nomClient;
    }

    public String getPrenomClient() {
        return prenomClient;
    }

    public String getVehicule() {
        return vehicule;
    }

    public String getDebut() {
        return debut;
    }

    public String getFin() {
        return fin;
    }

    public String getKmprevu() {
        return kmprevu;
    }

    public String getPrix() {
        return prix;
    }

    //------------------------------------------Mutateurs-----------------------------------------\\



    public void setClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public void setVehicule(Vehicule prenomClient) {
        this.vehicule = vehicule;
    }

    public void setDebut(String debut) {
        this.debut = debut;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public void setKmprevu(String kmprevu) {
        this.kmprevu = kmprevu;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

    public void setVehicule(String vehicule) {
        this.vehicule = vehicule;
    }

    public static void ecrireLocation(Location aLocation, Client aClient, Vehicule aVehicule) {

        try {
            FileOutputStream loca = new FileOutputStream("./Location/"+aClient.getNom()+"_"+aVehicule.getMarque()+".xml");
            XMLEncoder encoder = new XMLEncoder(loca);
            encoder.writeObject(aLocation);
            encoder.close();
            loca.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }



}
