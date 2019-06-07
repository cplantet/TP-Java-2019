import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class InterfaceFicheClient extends JFrame {

    public InterfaceFicheClient(Client leGars){
       // Client leGars = new Client("lo","l","kf","u","t");
        JLabel nom = new JLabel(leGars.getNom());
        JLabel prenom = new JLabel(leGars.getPrenom());
        JLabel  dateDeNaissance = new JLabel(leGars.getDateDeNaissance());
        JLabel adresse = new JLabel(leGars.getAdresse());
        JLabel telephone = new JLabel(leGars.getTelephone());

        JFrame fenetreFiche = new JFrame();
        fenetreFiche.setBounds(350, 100, 200, 400);
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
