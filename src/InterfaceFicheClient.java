import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfaceFicheClient extends JFrame {

    public InterfaceFicheClient(Client aClient){

        JLabel nom = new JLabel(aClient.getNom());
        JLabel prenom = new JLabel(aClient.getPrenom());
        JLabel  dateDeNaissance = new JLabel(aClient.getDateDeNaissance());
        JLabel adresse = new JLabel(aClient.getAdresse());
        JLabel telephone = new JLabel(aClient.getTelephone());

        JFrame fenetreFiche = new JFrame();
        fenetreFiche.setBounds(350, 100, 400, 500);
        fenetreFiche.setResizable(false);
        fenetreFiche.setTitle("Fiche Client");

        GridLayout grille = new GridLayout(6,1);
        fenetreFiche.setLayout(grille);
        fenetreFiche.add(nom);
        fenetreFiche.add(prenom);
        fenetreFiche.add(dateDeNaissance);
        fenetreFiche.add(adresse);
        fenetreFiche.add(telephone);


        fenetreFiche.setVisible(true);

    }

}
