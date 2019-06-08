import java.util.Date;


public class Location {
    private Vehicule vehicule;
    private Date debut;
    private Date fin;
    private float kmprevu;

    /**
     * Le constructeur créé un objet Location avec les informations passées en paramètre, qui sont celles rentrées par l'utilisateur.
     * @param vehicule
     * @param debut
     * @param fin
     * @param kmprevu
     */

    public Location(Vehicule vehicule, Date debut, Date fin, float kmprevu) {
        this.vehicule = vehicule;
        this.debut = debut;
        this.fin = fin;
        this.kmprevu = kmprevu;
    }

    public Vehicule getVehicule() {
        return vehicule;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    public Date getDebut() {
        return debut;
    }

    public void setDebut(Date debut) {
        this.debut = debut;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public float getKmprevu() {
        return kmprevu;
    }

    public void setKmprevu(float kmprevu) {
        this.kmprevu = kmprevu;
    }

    @Override
    public String toString() {
        return "Location{" +
                "vehicule=" + vehicule +
                ", debut=" + debut +
                ", fin=" + fin +
                ", kmprevu=" + kmprevu +
                '}';
    }


}
