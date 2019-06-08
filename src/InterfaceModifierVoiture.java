import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class InterfaceModifierVoiture extends JFrame implements ActionListener{



    private JButton modifier ;
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

    public InterfaceModifierVoiture(Voiture laVoiture) {

        fenetreAjout = new JFrame();
        fenetreAjout.setBounds(350, 100, 700, 700);
        fenetreAjout.setTitle("Modifier Voiture");
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

        textMarque.setText(laVoiture.getMarque());
        textModele.setText(laVoiture.getModele());
        textVitesseMax.setText(laVoiture.getVitesseMax());
        textEtat.setText(laVoiture.getEtat());
        textKm.setText(laVoiture.getKm());
        textPrixLoc.setText(laVoiture.getPrixLoc());
        textNbPlace.setText(laVoiture.getNbPlaces());
        textPuissance.setText(laVoiture.getPuissance());


        JPanel panInfos = new JPanel();

        modifier = new JButton("Modifier");
        modifier.addActionListener(this);
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
        panInfos.add(modifier);
        fenetreAjout.add(panInfos);
        fenetreAjout.setVisible(true);

    }

    @Override

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==modifier) {



            InterfaceVoiture.ajoutVoiture(textMarque.getText(),textModele.getText(),textVitesseMax.getText(),textEtat.getText(),textNbPlace.getText(),textKm.getText(),textPuissance.getText(),textPrixLoc.getText());
            
            fenetreAjout.dispose();
            InterfaceVoiture fenetreVoiture = new InterfaceVoiture();


        }
        if(e.getSource()==annuler){
            InterfaceVoiture intVoit= new InterfaceVoiture();
            fenetreAjout.dispose();



        }

    }
}
