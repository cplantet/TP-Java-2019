

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Avion extends Vehicule{

    private String heuresVol;
    private String prixLoc;
    private String nbMoteur;


    public Avion(String marque, String modele, String vitesseMax, String etat,String heuresVol,String prixLoc, String nbMoteur) {
        super(marque, modele, vitesseMax, etat);
        this.heuresVol = heuresVol;
        this.prixLoc = prixLoc;
        this.nbMoteur = nbMoteur;
    }

    public Avion(){}

    /* ------------------------------------------Accesseurs-----------------------------------*/

    public void setKm(String km) {
        this.heuresVol = km;
    }


    public void setNbMoteur(String nbMoteur) {
        this.nbMoteur = nbMoteur;
    }

    public void setPrixLoc(String prixLoc) {
        this.prixLoc = prixLoc;
    }

    /* -------------------------------------------------Mutateurs-------------------------------------*/

    public String getHeuresVol() {
        return heuresVol;
    }

    public String getPrixLoc() {
        return prixLoc;
    }

    public String getNbMoteur() {
        return nbMoteur;
    }

    @Override
    public String getModele() {
        return super.getModele();
    }

    @Override
    public String getEtat() {
        return super.getEtat();
    }

    @Override
    public String getMarque() {
        return super.getMarque();
    }

    @Override
    public String getVitesseMax() {
        return super.getVitesseMax();
    }

    @Override
    public String toString() {
        return "Avion{" +
                "km=" + heuresVol +
                ", prixLoc=" + prixLoc +
                ", nbMoteur=" + nbMoteur +
              '}';
    }

    public static void ecrireAvion(Avion anAvion) {

        try {
            FileOutputStream plane = new FileOutputStream("./Vehicule/Avion/"+anAvion.getMarque()+" "+anAvion.getModele()+".xml");
            XMLEncoder encoder = new XMLEncoder(plane);
            encoder.writeObject(anAvion);
            encoder.close();
            plane.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }


    public static Avion lireAvion(String marque,String modele) {
        Avion decodedAvion=null;

        try {
            FileInputStream plane = new FileInputStream("./Client/"+marque + " " + modele + ".xml");
            XMLDecoder decoder = new XMLDecoder(plane);
            decodedAvion = (Avion) decoder.readObject();
            decoder.close();
            plane.close();

        }
        catch (Exception e) {
            System.out.println(e);

        }
        return decodedAvion;
    }
}



