public class Moto extends Vehicule{

    private float km;
    private int nbPlace;
    private float puissance;
    private float prixLoc;

    public Moto(String marque, String modele, float vitesseMax, String etat, float km, int nbPlace, float puissance, float prixLoc) {
        super(marque, modele, vitesseMax, etat);
        this.km = km;
        this.nbPlace = nbPlace;
        this.puissance = puissance;
        this.prixLoc = prixLoc;
    }

    //All of the get..();

    public float getKm() {
        return km;
    }

    public int getNbPlace() {
        return nbPlace;
    }

    public float getPuissance() {
        return puissance;
    }

    public float getPrixLoc() {
        return prixLoc;
    }



    //All of the set..();


    public void setKm(float km) {
        this.km = km;
    }

    public void setNbPlace(int nbPlace) {
        this.nbPlace = nbPlace;
    }


    public void setPuissance(float puissance) {
        this.puissance = puissance;
    }

    public void setPrixLoc(float prixLoc) {
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