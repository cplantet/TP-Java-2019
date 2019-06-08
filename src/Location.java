import java.util.Date;


public class Location {
    private Client client;
    private Vehicule vehicule;
    private String debut;
    private String fin;
    private float kmprevu;

    /**
     * Le constructeur créé un objet Location avec les informations passées en paramètre, qui sont celles rentrées par l'utilisateur.
     * @param vehicule
     * @param debut
     * @param fin
     * @param kmprevu
     */
    public Location(Client client, Vehicule vehicule, String debut, String fin, float kmprevu) {
        this.client = client;
        this.vehicule = vehicule;
        this.debut = debut;
        this.fin = fin;
        this.kmprevu = kmprevu;
    }

    public Client getClient() {
        return client;
    }

    public Vehicule getVehicule() {
        return vehicule;
    }

    public String getDebut() {
        return debut;
    }

    public String getFin() {
        return fin;
    }

    public float getKmprevu() {
        return kmprevu;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    public void setDebut(String debut) {
        this.debut = debut;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public void setKmprevu(float kmprevu) {
        this.kmprevu = kmprevu;
    }
}
