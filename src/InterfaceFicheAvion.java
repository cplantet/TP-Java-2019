import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class InterfaceFicheAvion extends JFrame {

    public InterfaceFicheAvion(Avion lavion){

        JLabel marque = new JLabel(lavion.getMarque());
        JLabel modele = new JLabel(lavion.getModele());
        JLabel vitesseMax = new JLabel(lavion.getVitesseMax());
        JLabel prixLoc = new JLabel(lavion.getPrixLoc());
        JLabel etat = new JLabel(lavion.getEtat());
        JLabel nbMoteur = new JLabel(lavion.getNbMoteur());
        JLabel heuresVol = new JLabel(lavion.getKm());

        JFrame fenetreFiche = new JFrame();
        fenetreFiche.setBounds(350, 100, 200, 400);
        fenetreFiche.setResizable(false);
        fenetreFiche.setTitle("Fiche Client");

        GridLayout grille = new GridLayout(7,1);
        fenetreFiche.setLayout(grille);
        fenetreFiche.add(marque);
        fenetreFiche.add(modele);
        fenetreFiche.add(vitesseMax);
        fenetreFiche.add(prixLoc);
        fenetreFiche.add(etat);
        fenetreFiche.add(nbMoteur);
        fenetreFiche.add(heuresVol);



        fenetreFiche.setVisible(true);

    }

}
