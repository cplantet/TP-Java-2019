import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class InterfaceFicheLocation extends JFrame {

    private JFrame fenetre;


    public InterfaceFicheLocation(Location aLocation,Client aClient,String aVehicule,String Km,String price ,String debut,String fin) {

        fenetre = new JFrame();

        JLabel nomclient = new JLabel("Nom :");

        JLabel prenomClient = new JLabel ("Prenom :");

        JLabel vehicule = new JLabel("Vehicule :");

        JLabel nbKmprevu = new JLabel("Nombre de Km prévu :");

        JLabel prixLoc = new JLabel("Prix Location :");

        JLabel dateDebut1 = new JLabel("dateDebut");

        JLabel dateFin1 = new JLabel("dateFin");


        JLabel nom = new JLabel(aClient.getNom());

        JLabel prenom = new JLabel (aClient.getPrenom());

        JLabel vehic = new JLabel(aVehicule);

        JLabel nbKm = new JLabel(Km);

        JLabel prix = new JLabel(price);

        JLabel dateDebut = new JLabel(debut);

        JLabel dateFin = new JLabel(fin);








        JPanel panGlobale = new JPanel();

        GridLayout grille = new GridLayout(7,2);


        panGlobale.setLayout(grille);


        panGlobale.add(nomclient);

        panGlobale.add(prenomClient);

        panGlobale.add(vehicule);

        panGlobale.add(nbKmprevu);

        panGlobale.add(prixLoc);

        panGlobale.add(dateDebut1);

        panGlobale.add(dateFin1);

        panGlobale.add(nom);

        panGlobale.add(prenom);

        panGlobale.add(vehic);

        panGlobale.add(nbKm);

        panGlobale.add(prix);

        panGlobale.add(dateDebut);

        panGlobale.add(dateFin);


        fenetre.add(panGlobale);
        fenetre.setVisible(true);

    }

}
