public class Avion {

    private float km;
    private String modele;
    private String marque;
    private String Etat;
    private float prixLoc;
    private int nbMoteur;
    private int vitesseMax;

    public Avion(){

        km = 0;
        modele = "";
        marque = "";
        Etat = "";
        prixLoc = 0;
        nbMoteur = 0;
        vitesseMax = 0;
    }

    /* ------------------------------------------Accesseurs-----------------------------------*/

    public void setKm(float km) {
        this.km = km;
    }

    public void setEtat(String etat) {
        Etat = etat;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setModele(String model) {
        this.modele = model;
    }

    public void setNbMoteur(int nbMoteur) {
        this.nbMoteur = nbMoteur;
    }

    public void setPrixLoc(float prixLoc) {
        this.prixLoc = prixLoc;
    }

    public void setVitesseMax(int vMax) {
        this.vitesseMax = vMax;
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

    public String getEtat() {
        return Etat;
    }

    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }

    public int getvitesseMax() {
        return vitesseMax;
    }


}



