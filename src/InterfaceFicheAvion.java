import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class InterfaceFicheAvion extends JFrame {

    public InterfaceFicheAvion(Avion lAvion){


        JLabel marque = new JLabel(lAvion.getMarque());
        JLabel modele = new JLabel(lAvion.getModele());
        JLabel  vitesseMax = new JLabel(lAvion.getVitesseMax());
        JLabel etat = new JLabel(lAvion.getEtat());
        JLabel heuresVol = new JLabel(lAvion.getHeuresVol());
        JLabel prixLoc = new JLabel(lAvion.getPrixLoc());
        JLabel nbMoteur = new JLabel(lAvion.getNbMoteur());

        JLabel marqueF = new JLabel("Marque");
        JLabel modeleF = new JLabel("Modèle");
        JLabel vitesseMaxF = new JLabel("Vitesse Maximale");
        JLabel etatF = new JLabel("Etat");
        JLabel HeuresVolF = new JLabel("Heures de vol");
        JLabel prixLocF = new JLabel("Prix de Location");
        JLabel nbMotF = new JLabel("Nombre de Moteurs");


        JFrame fenetreFiche = new JFrame();
        JPanel panFiche = new JPanel();

        fenetreFiche.setBounds(200, 100, 500, 400);
        fenetreFiche.setResizable(false);
        fenetreFiche.setTitle("Fiche Moto");
        fenetreFiche.add(panFiche);
        GridLayout grille = new GridLayout(7,2);
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
        panFiche.add(HeuresVolF);
        panFiche.add(heuresVol);
        panFiche.add(prixLocF);
        panFiche.add(prixLoc);
        panFiche.add(nbMotF);
        panFiche.add(nbMoteur);

        fenetreFiche.setVisible(true);

    }

}