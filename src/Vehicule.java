public class Vehicule {

    private String marque;
    private String modele;
    private float vitesseMax;
    private boolean etat;

    public Vehicule(){
        marque="";
        modele="";
        etat=true;
        vitesseMax=0;

    }

    //All of the get..();

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    //All of the set..();

    public void setModele(String modele) {
        this.modele = modele;
    }

    public float getVitesseMax() {
        return vitesseMax;
    }

    public void setVitesseMax(float vitesseMax) {
        this.vitesseMax = vitesseMax;
    }

    public boolean isEtat() {
        return etat;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }
}
