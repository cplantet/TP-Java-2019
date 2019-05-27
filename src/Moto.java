public class Moto extends Vehicule{

    private float km;
    private int nbPlace;
    private int puissance;
    private float prixLoc;

    Moto() {
        km=0;
        nbPlace=0;
        puissance=0;
        prixLoc=0;

    }

    //All of the get..();

    public float getKm() {
        return km;
    }

    public int getNbPlace() {
        return nbPlace;
    }

    public int getPuissance() {
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


    public void setPuissance(int puissance) {
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
                "marque='" + super.marque + '\'' +
                ", modele='" + super.modele + '\'' +
                ", vitesseMax=" + super.vitesseMax +
                ", etat=" +super.etat +
                '}';
    }
}