public class Voiture extends Vehicule{

    private String km;
    private String nbPlaces;
    private String puissance;
    private String prixLoc;

    public Voiture(String marque, String modele, String vitesseMax, String etat, String km, String nbPlaces, String puissance, String prixLoc) {
        super(marque, modele, vitesseMax, etat);
        this.km = km;
        this.nbPlaces = nbPlaces;
        this.puissance = puissance;
        this.prixLoc = prixLoc;
    }

    /*--------------------------------------Accesseurs---------------------------------------*/

    public void setPrixLoc(String prixLoc) {
        this.prixLoc = prixLoc;
    }


    public void setKm(String km) {
        this.km = km;
    }



    public void setNbPlaces(String nbPlaces) {
        this.nbPlaces = nbPlaces;
    }

    public void setPuissance(String puissance) {
        this.puissance = puissance;
    }



    /* ----------------------------------------Mutateurs--------------------------------------*/


    public String getPrixLoc() {
        return prixLoc;
    }

    public String getKm() {
        return km;
    }

    public String getNbPlaces() {
        return nbPlaces;
    }

    public String getPuissance() {
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
