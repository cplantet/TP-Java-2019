public class Voiture {

    private float km;
    private int nbPlaces;
    private String marque;
    private String modele;
    private String etat;
    private int puissance;
    private float prixLoc;
    private int vitesseMax;

    public Voiture(){
        km=0;
        nbPlaces=0;
        marque ="";
        modele = "";
        etat = "";
        puissance = 0;
        prixLoc = 0;
        vitesseMax = 0;
    }

    /*--------------------------------------Accesseurs---------------------------------------*/

    public void setPrixLoc(float prixLoc) {
        this.prixLoc = prixLoc;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public void setKm(float km) {
        this.km = km;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public void setNbPlaces(int nbPlaces) {
        this.nbPlaces = nbPlaces;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    public void setVitesseMax(int vitesseMax) {
        this.vitesseMax = vitesseMax;
    }

    /* ----------------------------------------Mutateurs--------------------------------------*/

    public String getMarque() {
        return marque;
    }

    public String getEtat() {
        return etat;
    }

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

    public int getVitesseMax() {
        return vitesseMax;
    }

    public String getModele() {
        return modele;
    }

}
