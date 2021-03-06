import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class InterfaceAjoutMoto extends JFrame implements ActionListener{



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

    private String kmS;
    private String prixLocS;
    private String nbPlaceS;
    private String marqueS;
    private String modeleS;
    private String vitesseMaxS;
    private String etatS;
    private String puissanceS;



    public InterfaceAjoutMoto() {

        fenetreAjout = new JFrame();
        fenetreAjout.setBounds(350, 100, 700, 700);
        fenetreAjout.setTitle("Ajout Moto");
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
        JPanel panInfos = new JPanel();

        ajout = new JButton("Ajouter");
        ajout.addActionListener(this);
        annuler = new JButton("Annuler");
        annuler.addActionListener(this);

        GridLayout grilleInfos = new GridLayout(9,2);

        panInfos.setPreferredSize(new Dimension(700,600));

        panInfos.setLayout(grilleInfos);
        panInfos.add(marque);
        panInfos.add(textMarque);
        panInfos.add(modele);
        panInfos.add(textModele);
        panInfos.add(vitesseMax);
        panInfos.add(textVitesseMax);
        panInfos.add(etat);
        panInfos.add(textEtat);
        panInfos.add(km);
        panInfos.add(textKm);
        panInfos.add(prixLoc);
        panInfos.add(textPrixLoc);
        panInfos.add(nbPlace);
        panInfos.add(textNbPlace);
        panInfos.add(puissance);
        panInfos.add(textPuissance);


        panInfos.add(annuler);
        panInfos.add(ajout);
        fenetreAjout.add(panInfos);
        fenetreAjout.setVisible(true);

    }

    @Override

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==ajout) {


            InterfaceMoto.ajoutMoto(textMarque.getText(),textModele.getText(),textVitesseMax.getText(),textEtat.getText(),textNbPlace.getText(),textKm.getText(),textPuissance.getText(),textPrixLoc.getText());

            InterfaceMoto.ajoutListeMoto();
            fenetreAjout.dispose();
            InterfaceMoto fenetreMoto = new InterfaceMoto();

        }
        if(e.getSource()==annuler){
            InterfaceMoto intMoto= new InterfaceMoto();
            fenetreAjout.dispose();



        }

    }


}
