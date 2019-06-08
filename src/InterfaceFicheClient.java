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
        JLabel nomF = new JLabel("Nom :");
        JLabel prenomF = new JLabel("Prénom :");
        JLabel dateDeNaissanceF = new JLabel("Date de Naissance (jj/mm/aaaa) :");
        JLabel numPermisF = new JLabel("Numéro de Permis :");
        JLabel adresseF = new JLabel("Adresse :");
        JLabel telephoneF = new JLabel("Téléphone :");


        JFrame fenetreFiche = new JFrame();
        JPanel panFiche = new JPanel();

        fenetreFiche.setBounds(200, 100, 500, 400);
        fenetreFiche.setResizable(false);
        fenetreFiche.setTitle("Fiche Client");
        fenetreFiche.add(panFiche);
        GridLayout grille = new GridLayout(6,2);
        panFiche.setLayout(grille);
        panFiche.setBackground(Color.white);

        panFiche.add(nomF);
        panFiche.add(nom);
        panFiche.add(prenomF);
        panFiche.add(prenom);
        panFiche.add(dateDeNaissanceF);
        panFiche.add(dateDeNaissance);
        panFiche.add(adresseF);
        panFiche.add(adresse);
        panFiche.add(telephoneF);
        panFiche.add(telephone);

        nomF.setBackground(Color.GRAY);
        prenomF.setBackground(Color.GRAY);
        dateDeNaissanceF.setBackground(Color.GRAY);
        adresseF.setBackground(Color.GRAY);
        telephoneF.setBackground(Color.GRAY);



        nom.setBackground(Color.white.darker());
        prenom.setBackground(Color.white.darker());
        dateDeNaissance.setBackground(Color.white.darker());
        adresse.setBackground(Color.white.darker());
        telephone.setBackground(Color.white.darker());

        fenetreFiche.setVisible(true);

    }

}
