import java.beans.XMLEncoder;
import java.io.FileOutputStream;

public class Vehicule {

    private String marque;
    private String modele;
    private float vitesseMax;
    private String etat;

    public Vehicule(String marque, String modele,float vitesseMax,String etat){
        this.marque=marque;
        this.modele=modele;
        this.etat=etat;
        this.vitesseMax=vitesseMax;
    }



    //All of the get..();

    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }

    public String getEtat() {
        return etat;
    }

    public float getVitesseMax() {
        return vitesseMax;
    }

//All of the set..();

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public void setVitesseMax(int vitesseMax) {
        this.vitesseMax = vitesseMax;
    }

    @Override

    public String toString() {
        return "Vehicule{" +
                "marque='" + marque + '\'' +
                ", modele='" + modele + '\'' +
                ", vitesseMax=" + vitesseMax +
                ", etat=" + etat +
                '}';
    }



}
