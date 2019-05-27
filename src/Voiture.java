public class Voiture extends Vehicule{

    private float km;
    private int nbPlaces;
    private int puissance;
    private float prixLoc;

    Voiture(){
        km=0;
        nbPlaces=0;
        puissance = 0;
        prixLoc = 0;

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
                ", prixLoc=" + prixLoc +
                "marque='" + super.marque + '\'' +
                ", modele='" + super.modele + '\'' +
                ", vitesseMax=" + super.vitesseMax +
                ", etat=" +super.etat +
                '}';
    }
}
