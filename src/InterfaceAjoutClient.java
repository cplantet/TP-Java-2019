import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class InterfaceAjoutClient extends JFrame implements ActionListener{

    private JButton ajout ;
    private JButton retour ;
    private JTextField textNom;
    private JTextField textPrenom;
    private JFrame fenetreAjout;
    private JTextField textAdresse;
    private JTextField textDateDeNaissance;
    private JTextField textTelephone;

    public InterfaceAjoutClient() {

        fenetreAjout = new JFrame();
        fenetreAjout.setBounds(350, 100, 700, 500);
        fenetreAjout.setTitle("Ajout Client");

        fenetreAjout.setResizable(false);

        JLabel nom = new JLabel("Nom");
        JLabel prenom = new JLabel("Prénom");
        JLabel dateDeNaissance = new JLabel("Date de Naissance (jj/mm/aaaa)");
        JLabel numPermis = new JLabel("Numéro de Permis");
        JLabel adresse = new JLabel("Adresse");
        JLabel telephone = new JLabel("Téléphone");
        JLabel entrer = new JLabel("Appuyez sur la touche ENTREE pour valider");

        textNom = new JTextField();
        textPrenom = new JTextField();
        textDateDeNaissance = new JTextField();
        textAdresse = new JTextField();
        textTelephone = new JTextField();

        JPanel panInfos = new JPanel();

        ajout = new JButton("Ajouter");
        ajout.addActionListener(this);

        retour = new JButton("Retour");
        retour.addActionListener(this);

        fenetreAjout.add(panInfos);




        GridLayout grilleInfos = new GridLayout(6,2);

        panInfos.setBounds(0,0,700,300);
        panInfos.setLayout(grilleInfos);

            panInfos.setBackground(Color.white);
        panInfos.add(prenom);
        panInfos.add(textPrenom);
        panInfos.add(nom);
        panInfos.add(textNom);
        panInfos.add(dateDeNaissance);
        panInfos.add(textDateDeNaissance);
        panInfos.add(adresse);
        panInfos.add(textAdresse);
        panInfos.add(telephone);
        panInfos.add(textTelephone);
        panInfos.add(retour);
        panInfos.add(ajout);

        prenom.setBackground(Color.white);
        nom.setBackground(Color.white);
        dateDeNaissance.setBackground(Color.white);
        adresse.setBackground(Color.white);
        telephone.setBackground(Color.white);

retour.setBackground(Color.white.darker());
ajout.setBackground(Color.white);
retour.setForeground(Color.black);
ajout.setForeground(Color.black);


fenetreAjout.setVisible(true);




    }

    @Override

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==ajout) {



            InterfaceClients.ajoutClient(textNom.getText(),textPrenom.getText(),textAdresse.getText(),textTelephone.getText(),textDateDeNaissance.getText());
            InterfaceClients.ajoutListeClient();
            InterfaceClients interfacePlane = new InterfaceClients();



            fenetreAjout.dispose();

        }
        if(e.getSource()==retour){
            this.fenetreAjout.dispose();
            InterfaceClients intClient = new InterfaceClients();
        }
    }

}