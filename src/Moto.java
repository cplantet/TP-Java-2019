public class Moto extends Vehicule{

    private String km;
    private String nbPlace;
    private String puissance;
    private String prixLoc;

    public Moto(String marque, String modele, String vitesseMax, String etat, String km, String nbPlace, String puissance, String prixLoc) {
        super(marque, modele, vitesseMax, etat);
        this.km = km;
        this.nbPlace = nbPlace;
        this.puissance = puissance;
        this.prixLoc = prixLoc;
    }

    //All of the get..();

    public String getKm() {
        return km;
    }

    public String getNbPlace() {
        return nbPlace;
    }

    public String getPuissance() {
        return puissance;
    }

    public String getPrixLoc() {
        return prixLoc;
    }



    //All of the set..();


    public void setKm(String km) {
        this.km = km;
    }

    public void setNbPlace(String nbPlace) {
        this.nbPlace = nbPlace;
    }


    public void setPuissance(String puissance) {
        this.puissance = puissance;
    }

    public void setPrixLoc(String prixLoc) {
        this.prixLoc = prixLoc;
    }


    @Override
    public String toString() {
        return "Moto{" +
                "km=" + km +
                ", nbPlace=" + nbPlace +
                ", puissance=" + puissance +
                ", prixLoc=" + prixLoc +

                '}';
    }
}