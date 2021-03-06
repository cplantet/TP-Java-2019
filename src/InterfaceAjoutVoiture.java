import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class InterfaceAjoutVoiture extends JFrame implements ActionListener{



    private JButton ajout ;
    private JButton annuler ;
    private JTextField textKm;
    private JTextField textPrixLoc;
    private JTextField textNbPlace;
    private JTextField textMarque;
    private JTextField textModele;
    private JTextField textVitesseMax;
    private JTextField textEtat;
    private JTextField textPuissance;
    private JFrame fenetreAjout;




    public InterfaceAjoutVoiture() {

        fenetreAjout = new JFrame();
        fenetreAjout.setBounds(350, 100, 700, 700);
        fenetreAjout.setTitle("Ajout Voiture");
        fenetreAjout.setResizable(false);

        // declaration des Jlabel
        JLabel marque = new JLabel("marque");
        JLabel modele = new JLabel("modele");
        JLabel vitesseMax = new JLabel("vitesseMax");
        JLabel etat = new JLabel("etat");
        JLabel km = new JLabel("km");
        JLabel prixLoc = new JLabel("prixLoc");
        JLabel nbPlace = new JLabel("nbPlace");
        JLabel puissance = new JLabel("Puissance");

        textMarque = new JTextField();
        textModele  = new JTextField();
        textVitesseMax = new JTextField();
        textEtat = new JTextField();
        textKm = new JTextField();
        textPrixLoc = new JTextField();
        textNbPlace = new JTextField();
        textPuissance = new JTextField();

        textMarque.setForeground(Color.BLUE);
        JPanel panInfos = new JPanel();


        JPanel panMarque = new JPanel();
        JPanel panModele = new JPanel();
        JPanel panVit = new JPanel();
        JPanel panKm = new JPanel();
        JPanel panPrix = new JPanel();
        JPanel pannbPlace = new JPanel();
        JPanel panEtat = new JPanel();
        JPanel panpuissance = new JPanel();



        ajout = new JButton("Ajouter");
        ajout.addActionListener(this);
        annuler = new JButton("Annuler");
        annuler.addActionListener(this);



        //panAjout.setBounds(0,650,700,50);



        GridLayout grilleInfos = new GridLayout(9,2);

        // on affiche les cases et les noms des lignes dans les cases de la grille du tableau
        // panInfos.setBounds(0,0,700,600);
        //panInfos.setSize(700,600);
        panInfos.setPreferredSize(new Dimension(700,600));

        // textmarque.setPreferredSize( new Dimension( 200, 24 ) );
        panInfos.setLayout(grilleInfos);
        panInfos.add(panMarque);
        panInfos.add(textMarque);
        panInfos.add(panModele);
        panInfos.add(textModele);
        panInfos.add(panVit);
        panInfos.add(textVitesseMax);
        panInfos.add(panEtat);
        panInfos.add(textEtat);
        panInfos.add(panKm);
        panInfos.add(textKm);
        panInfos.add(panPrix);
        panInfos.add(textPrixLoc);
        panInfos.add(pannbPlace);
        panInfos.add(textNbPlace);
        panInfos.add(panpuissance);
        panInfos.add(textPuissance);

        panPrix.add(prixLoc);
        panEtat.add(etat);
        panVit.add(vitesseMax);
        panKm.add(km);
        panModele.add(modele);
        panMarque.add(marque);
        pannbPlace.add(nbPlace);
        panpuissance.add(puissance);

        panInfos.add(annuler);
        panInfos.add(ajout);
        fenetreAjout.add(panInfos);
        //varaibles qui contiennt les valeurs de ce qu'on tape


        fenetreAjout.setVisible(true);

    }

    @Override

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==ajout) {

            InterfaceVoiture.ajoutVoiture(textMarque.getText(),textModele.getText(),textVitesseMax.getText(),textEtat.getText(),textNbPlace.getText(),textKm.getText(),textPuissance.getText(),textPrixLoc.getText());

            InterfaceVoiture.ajoutListeVoiture();
            fenetreAjout.dispose();
            InterfaceVoiture fenetreVoiture = new InterfaceVoiture();


        }

        if(e.getSource()==annuler){
            InterfaceVoiture intVoiture= new InterfaceVoiture();
            fenetreAjout.dispose();
        }

    }

}