import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class InterfaceAjoutLocation extends JFrame implements ActionListener{

    private JButton ajout ;
    private JTextField textNom;
    private JTextField textPrenom;
    private JFrame fenetreAjout;
    private JTextField textAdresse;
    private JTextField textDateDeNaissance;
    private JTextField textTelephone;

    public InterfaceAjoutLocation() {

        fenetreAjout = new JFrame();
        fenetreAjout.setBounds(350, 100, 700, 500);
        fenetreAjout.setTitle("Ajout Location");

        fenetreAjout.setResizable(false);

        JLabel client = new JLabel("Client");
        JLabel vehicue = new JLabel("Vehicule");
        JLabel dateDeDebut = new JLabel("Date de Début");
        JLabel dateDeFin = new JLabel("Date de Fin");
        JLabel prix = new JLabel("Prix");


        textNom = new JTextField();
        textPrenom = new JTextField();
        textDateDeNaissance = new JTextField();

        textAdresse = new JTextField();
        textTelephone = new JTextField();

        JPanel panInfos = new JPanel();
        JPanel panAjout = new JPanel();

        JPanel panNom =new JPanel();
        JPanel panPrenom =new JPanel();
        JPanel panAdresse =new JPanel();
        JPanel panTelephone =new JPanel();
        JPanel panPermis =new JPanel();
        JPanel panNaissance =new JPanel();



        panAjout.setBackground(Color.LIGHT_GRAY);

        ajout = new JButton("Ajouter");
        ajout.addActionListener(this);

        fenetreAjout.add(panAjout);
        fenetreAjout.add(panInfos);

        panAjout.setBounds(0,425,700,100);
        panAjout.add(ajout);

        GridLayout grilleInfos = new GridLayout(6,2);

        panInfos.setBounds(0,0,700,300);
        panInfos.setLayout(grilleInfos);
/*
        panInfos.add(prenom);
        panInfos.add(textPrenom);
        panInfos.add(nom);
        panInfos.add(textNom);
        panInfos.add(dateDeNaissance);
        panInfos.add(textDateDeNaissance);
        panInfos.add(adresse);
        panInfos.add(textAdresse);
        panInfos.add(telephone);
        panInfos.add(textTelephone);*/


        fenetreAjout.setVisible(true);




    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==ajout) {



            //Client aClient =InterfaceClients.ajoutClient(textNom.getText(),textPrenom.getText(),textAdresse.getText(),textTelephone.getText(),textDateDeNaissance.getText());
            //InterfaceClients.ajoutListe(aClient);

            fenetreAjout.dispose();

        }

    }

}