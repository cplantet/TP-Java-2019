public class Avion extends Vehicule{

    private float km;
    private float prixLoc;
    private int nbMoteur;

    public Avion(){

        km = 0;
        prixLoc = 0;
        nbMoteur = 0;

    }

    /* ------------------------------------------Accesseurs-----------------------------------*/

    public void setKm(float km) {
        this.km = km;
    }


    public void setNbMoteur(int nbMoteur) {
        this.nbMoteur = nbMoteur;
    }

    public void setPrixLoc(float prixLoc) {
        this.prixLoc = prixLoc;
    }

    /* -------------------------------------------------Mutateurs-------------------------------------*/

    public float getKm() {
        return km;
    }

    public float getPrixLoc() {
        return prixLoc;
    }

    public int getNbMoteur() {
        return nbMoteur;
    }


    @Override
    public String toString() {
        return "Avion{" +
                "km=" + km +
                ", prixLoc=" + prixLoc +
                ", nbMoteur=" + nbMoteur +
                "marque='" + super.marque + '\'' +
                ", modele='" + super.modele + '\'' +
                ", vitesseMax=" + super.vitesseMax +
                ", etat=" +super.etat +
                '}';
    }
}



