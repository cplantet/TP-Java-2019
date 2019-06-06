public class Voiture extends Vehicule{

    private float km;
    private int nbPlaces;
    private int puissance;
    private float prixLoc;

    public Voiture(String marque, String modele, float vitesseMax, String etat, float km, int nbPlaces, int puissance, float prixLoc) {
        super(marque, modele, vitesseMax, etat);
        this.km = km;
        this.nbPlaces = nbPlaces;
        this.puissance = puissance;
        this.prixLoc = prixLoc;
    }

    /*--------------------------------------Accesseurs---------------------------------------*/

    public void setPrixLoc(float prixLoc) {
        this.prixLoc = prixLoc;
    }


    public void setKm(float km) {
        this.km = km;
    }



    public void setNbPlaces(int nbPlaces) {
        this.nbPlaces = nbPlaces;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }



    /* ----------------------------------------Mutateurs--------------------------------------*/


    public float getPrixLoc() {
        return prixLoc;
    }

    public float getKm() {
        return km;
    }

    public int getNbPlaces() {
        return nbPlaces;
    }

    public int getPuissance() {
        return puissance;
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "km=" + km +
                ", nbPlaces=" + nbPlaces +
                ", puissance=" + puissance +
                ", prixLoc=" + prixLoc
                +
                "}"
               ;
    }
}
