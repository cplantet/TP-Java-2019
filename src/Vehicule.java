import java.beans.XMLEncoder;
import java.io.FileOutputStream;

public class Vehicule {

    private String marque;
    private String modele;
    private String vitesseMax;
    private String etat;

    /**
     *Ce constructeur créé un objet Véhicule avec les informations passées en paramètres.
     * @param marque
     * @param modele
     * @param vitesseMax
     * @param etat
     */
    public Vehicule(String marque, String modele,String vitesseMax,String etat){
        this.marque=marque;
        this.modele=modele;
        this.etat=etat;
        this.vitesseMax=vitesseMax;
    }

    public Vehicule(){}


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

    public String getVitesseMax() {
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

    public void setVitesseMax(String vitesseMax) {
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
