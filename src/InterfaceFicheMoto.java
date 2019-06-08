import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class InterfaceFicheMoto extends JFrame {

    public InterfaceFicheMoto(Moto laMoto){

        JLabel marque = new JLabel(laMoto.getMarque());
        JLabel modele = new JLabel(laMoto.getModele());
        JLabel  vitesseMax = new JLabel(laMoto.getVitesseMax());
        JLabel etat = new JLabel(laMoto.getEtat());
        JLabel puissance = new JLabel(laMoto.getPuissance());
        JLabel km = new JLabel(laMoto.getKm());
        JLabel prixLoc = new JLabel(laMoto.getPrixLoc());
        JLabel nbPlace = new JLabel(laMoto.getNbPlace());

        JLabel marqueF = new JLabel("Marque");
        JLabel modeleF = new JLabel("Modèle");
        JLabel vitesseMaxF = new JLabel("Vitesse Maximale");
        JLabel etatF = new JLabel("Etat");
        JLabel puissanceF = new JLabel("Puissance");
        JLabel kmF = new JLabel("Km");
        JLabel prixLocF = new JLabel("Prix de Location");
        JLabel nbPlaceF = new JLabel("Nombre de Places");


        JFrame fenetreFiche = new JFrame();
        JPanel panFiche = new JPanel();

        fenetreFiche.setBounds(200, 100, 500, 400);
        fenetreFiche.setResizable(false);
        fenetreFiche.setTitle("Fiche Moto");
        fenetreFiche.add(panFiche);
        GridLayout grille = new GridLayout(6,2);
        panFiche.setLayout(grille);
        panFiche.setBackground(Color.white);

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

        fenetreFiche.setVisible(true);

    }

}
