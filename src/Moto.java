public class Moto{

    private float km;
    private int nbPlace;
    private String marque;
    private String modele;
    private int puissance;
    private float prixLoc;
    private String etat;
    private int vitesseMax;

    public Moto() {
        km=0;
        nbPlace=0;
        marque="";
        modele="";
        puissance=0;
        prixLoc=0;
        etat="";
        vitesseMax=0;
    }

    //All of the get..();

    public float getKm() {
        return km;
    }

    public int getNbPlace() {
        return nbPlace;
    }

    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }

    public int getPuissance() {
        return puissance;
    }

    public float getPrixLoc() {
        return prixLoc;
    }

    public String getEtat() {
        return etat;
    }

    public int getVitesseMax() {
        return vitesseMax;
    }


    //All f the set..();


    public void setKm(float km) {
        this.km = km;
    }

    public void setNbPlace(int nbPlace) {
        this.nbPlace = nbPlace;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    public void setPrixLoc(float prixLoc) {
        this.prixLoc = prixLoc;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public void setVitesseMax(int vitesseMax) {
        this.vitesseMax = vitesseMax;
    }
}