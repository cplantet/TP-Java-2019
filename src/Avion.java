public class Avion {

    private float km;
    private String model;
    private String marque;
    private String Etat;
    private float prixLoc;
    private int nbMoteur;
    private int vMax;

    public Avion(){

        km = 0;
        model = "";
        marque = "";
        Etat = "";
        prixLoc = 0;
        nbMoteur = 0;
        vMax = 0;
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

    public void setModel(String model) {
        this.model = model;
    }

    public void setNbMoteur(int nbMoteur) {
        this.nbMoteur = nbMoteur;
    }

    public void setPrixLoc(float prixLoc) {
        this.prixLoc = prixLoc;
    }

    public void setvMax(int vMax) {
        this.vMax = vMax;
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

    public String getModel() {
        return model;
    }

    public int getvMax() {
        return vMax;
    }


}



