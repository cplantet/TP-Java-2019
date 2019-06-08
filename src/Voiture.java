import java.beans.XMLEncoder;
import java.io.FileOutputStream;

public class Voiture extends Vehicule{

    private String km;
    private String nbPlaces;
    private String puissance;
    private String prixLoc;

    public Voiture(String marque, String modele, String vitesseMax, String etat, String km, String nbPlaces, String puissance, String prixLoc) {
        super(marque, modele, vitesseMax, etat);
        this.km = km;
        this.nbPlaces = nbPlaces;
        this.puissance = puissance;
        this.prixLoc = prixLoc;
    }

    public Voiture(){}

    /*--------------------------------------Accesseurs---------------------------------------*/

    public void setPrixLoc(String prixLoc) {
        this.prixLoc = prixLoc;
    }


    public void setKm(String km) {
        this.km = km;
    }



    public void setNbPlaces(String nbPlaces) {
        this.nbPlaces = nbPlaces;
    }

    public void setPuissance(String puissance) {
        this.puissance = puissance;
    }

    @Override
    public void setEtat(String etat) {
        super.setEtat(etat);
    }

    @Override
    public void setMarque(String marque) {
        super.setMarque(marque);
    }

    @Override
    public void setModele(String modele) {
        super.setModele(modele);
    }

    @Override
    public void setVitesseMax(String vitesseMax) {
        super.setVitesseMax(vitesseMax);
    }


    /* ----------------------------------------Mutateurs--------------------------------------*/


    public String getPrixLoc() {
        return prixLoc;
    }

    public String getKm() {
        return km;
    }

    public String getNbPlaces() {
        return nbPlaces;
    }

    public String getPuissance() {
        return puissance;
    }

    @Override
    public String getVitesseMax() {
        return super.getVitesseMax();
    }

    @Override
    public String getMarque() {
        return super.getMarque();
    }

    @Override
    public String getEtat() {
        return super.getEtat();
    }

    @Override
    public String getModele() {
        return super.getModele();
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "km=" + km +
                ", nbPlaces=" + nbPlaces +
                ", puissance=" + puissance +
                ", prixLoc=" + prixLoc
                +
                "}"
               ;
    }

    public static void ecrireVoiture(Voiture aVoiture) {

        try {
            FileOutputStream car = new FileOutputStream("./Vehicule/Voiture/"+aVoiture.getMarque()+" "+aVoiture.getModele()+".xml");
            XMLEncoder encoder = new XMLEncoder(car);
            encoder.writeObject(aVoiture);
            encoder.close();
            car.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }



}
