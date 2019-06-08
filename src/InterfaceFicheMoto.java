import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class InterfaceFicheMoto extends JFrame {

    public InterfaceFicheMoto(Moto laMoto){
        // Client leGars = new Client("lo","l","kf","u","t");
        JLabel marque = new JLabel(laMoto.getMarque());
        JLabel modele = new JLabel(laMoto.getModele());
        JLabel vitesseMax = new JLabel(laMoto.getVitesseMax());
        JLabel prixLoc = new JLabel(laMoto.getPrixLoc());
        JLabel etat = new JLabel(laMoto.getEtat());
        JLabel nbPlaces = new JLabel(laMoto.getNbPlace());
        JLabel km = new JLabel(laMoto.getKm());
        JLabel puissance = new JLabel(laMoto.getPuissance());

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
        fenetreFiche.add(nbPlaces);
        fenetreFiche.add(km);
        fenetreFiche.add(puissance);



        fenetreFiche.setVisible(true);

    }

}