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

        JFrame fenetreFiche = new JFrame();
        fenetreFiche.setBounds(350, 100, 200, 400);
        fenetreFiche.setResizable(false);
        fenetreFiche.setTitle("Fiche Client");

        GridLayout grille = new GridLayout(9,1);
        fenetreFiche.setLayout(grille);
        fenetreFiche.add(marque);
        fenetreFiche.add(modele);
        fenetreFiche.add(vitesseMax);
        fenetreFiche.add(prixLoc);
        fenetreFiche.add(etat);
        fenetreFiche.add(nbPlace);
        fenetreFiche.add(km);
        fenetreFiche.add(puissance);



        fenetreFiche.setVisible(true);

    }

}