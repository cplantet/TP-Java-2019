import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class InterfaceFicheVoiture extends JFrame {

    public InterfaceFicheVoiture(Voiture laVoiture){
        // Client leGars = new Client("lo","l","kf","u","t");
        JLabel marque = new JLabel(laVoiture.getMarque());
        JLabel modele = new JLabel(laVoiture.getModele());
        JLabel vitesseMax = new JLabel(laVoiture.getVitesseMax());
        JLabel prixLoc = new JLabel(laVoiture.getPrixLoc());
        JLabel etat = new JLabel(laVoiture.getEtat());
        JLabel nbPlace = new JLabel(laVoiture.getNbPlaces());
        JLabel km = new JLabel(laVoiture.getKm());
        JLabel puissance = new JLabel(laVoiture.getPuissance());

        JLabel marqueF = new JLabel("Marque");
        JLabel modeleF = new JLabel("Modèle");
        JLabel vitesseMaxF = new JLabel("Vitesse Maximale");
        JLabel etatF = new JLabel("Etat");
        JLabel puissanceF = new JLabel("Puissance");
        JLabel kmF = new JLabel("Km");
        JLabel prixLocF = new JLabel("Prix de Location");
        JLabel nbPlaceF = new JLabel("Nombre de Places");

        JFrame fenetreFiche = new JFrame();
        fenetreFiche.setBounds(350, 100, 500, 400);
        fenetreFiche.setResizable(false);
        fenetreFiche.setTitle("Fiche Voiture");
    JPanel panFiche = new JPanel();

        GridLayout grille = new GridLayout(9,2);
        panFiche.setLayout(grille);
        panFiche.add( marqueF);
        panFiche.add(marque);
        panFiche.add(modeleF);
        panFiche.add(modele);
        panFiche.add(vitesseMaxF);
        panFiche.add(vitesseMax);
        panFiche.add(etatF);
        panFiche.add(etat);
        panFiche.add(puissanceF);
        panFiche.add(puissance);
        panFiche.add(kmF);
        panFiche.add(km);
        panFiche.add(prixLocF);
        panFiche.add(prixLoc);
        panFiche.add(nbPlaceF);
        panFiche.add(nbPlace);


fenetreFiche.add(panFiche);
        fenetreFiche.setVisible(true);

    }

}