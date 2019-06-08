import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class InterfaceFicheClient extends JFrame {

    private JTextField textNom;
    private JTextField textPrenom;
    private JFrame fenetreAjout;
    private JTextField textAdresse;
    private JTextField textDateDeNaissance;
    private JTextField textTelephone;

    public InterfaceFicheClient(Client leGars){
       // Client leGars = new Client("lo","l","kf","u","t");
        JLabel nom = new JLabel(leGars.getNom());
        JLabel prenom = new JLabel(leGars.getPrenom());
        JLabel  dateDeNaissance = new JLabel(leGars.getDateDeNaissance());
        JLabel adresse = new JLabel(leGars.getAdresse());
        JLabel telephone = new JLabel(leGars.getTelephone());
        JLabel nomF = new JLabel("Nom");
        JLabel prenomF = new JLabel("Prénom");
        JLabel dateDeNaissanceF = new JLabel("Date de Naissance (jj/mm/aaaa)");
        JLabel numPermisF = new JLabel("Numéro de Permis");
        JLabel adresseF = new JLabel("Adresse");
        JLabel telephoneF = new JLabel("Téléphone");


        JFrame fenetreFiche = new JFrame();
        fenetreFiche.setBounds(200, 100, 300, 400);
        fenetreFiche.setResizable(false);
        fenetreFiche.setTitle("Fiche Client");

        GridLayout grille = new GridLayout(6,2);
        fenetreFiche.setLayout(grille);

        fenetreFiche.add(nomF);
        fenetreFiche.add(nom);
        fenetreFiche.add(prenomF);
        fenetreFiche.add(prenom);

        fenetreFiche.add(dateDeNaissanceF);
        fenetreFiche.add(dateDeNaissance);

        fenetreFiche.add(adresseF);
        fenetreFiche.add(adresse);

        fenetreFiche.add(telephoneF);
        fenetreFiche.add(telephone);

        nomF.setBackground(Color.white);
        prenomF.setBackground(Color.white);
        dateDeNaissanceF.setBackground(Color.white);
        adresseF.setBackground(Color.white);
        telephoneF.setBackground(Color.white);


        nom.setBackground(Color.white.darker());
        prenom.setBackground(Color.white.darker());
        dateDeNaissance.setBackground(Color.white.darker());
        adresse.setBackground(Color.white.darker());
        telephone.setBackground(Color.white.darker());

        fenetreFiche.setVisible(true);

    }

}
