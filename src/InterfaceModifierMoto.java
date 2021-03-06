import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class InterfaceModifierMoto extends JFrame implements ActionListener{



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

    public InterfaceModifierMoto(Moto aMoto) {

        fenetreAjout = new JFrame();
        fenetreAjout.setBounds(350, 100, 700, 700);
        fenetreAjout.setTitle("Modifier Moto");
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

        textMarque.setText(aMoto.getMarque());
        textModele.setText(aMoto.getModele());
        textVitesseMax.setText(aMoto.getVitesseMax());
        textEtat.setText(aMoto.getEtat());
        textKm.setText(aMoto.getKm());
        textPrixLoc.setText(aMoto.getPrixLoc());
        textNbPlace.setText(aMoto.getNbPlace());
        textPuissance.setText(aMoto.getPuissance());


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


            InterfaceMoto.ajoutMoto(textMarque.getText(),textModele.getText(),textVitesseMax.getText(),textEtat.getText(),textNbPlace.getText(),textKm.getText(),textPuissance.getText(),textPrixLoc.getText());

            fenetreAjout.dispose();
            InterfaceMoto fenetreMoto = new InterfaceMoto();

        }
        if(e.getSource()==annuler){
            InterfaceMoto intMoto= new InterfaceMoto();
            fenetreAjout.dispose();



        }

    }
}
