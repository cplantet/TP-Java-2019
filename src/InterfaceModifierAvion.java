import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class InterfaceModifierAvion extends JFrame implements ActionListener{

    private JButton modifier ;
    private JButton annuler ;
    private JFrame fenetreAjout;
    private JTextField textMarque ;
    private JTextField textModele ;
    private JTextField textVitesseMax;
    private JTextField textEtat ;
    private JTextField textKm ;
    private JTextField textPrixLoc ;
    private JTextField textNbMoteur;

    public InterfaceModifierAvion(Avion anAvion) {

        fenetreAjout = new JFrame();
        fenetreAjout.setBounds(350, 100, 700, 700);
        fenetreAjout.setTitle("Modifier Avion");
        fenetreAjout.setResizable(false);

        // declaration des Jlabel
        JLabel marque = new JLabel("marque");
        JLabel modele = new JLabel("modele");
        JLabel vitesseMax = new JLabel("vitesseMax");
        JLabel etat = new JLabel("etat");
        JLabel km = new JLabel("km");
        JLabel prixLoc = new JLabel("prixLoc");
        JLabel nbMoteur = new JLabel("nbMoteur");

        JLabel entrer = new JLabel("Appuyez sur la touche ENTREE pour valider");

        textMarque = new JTextField();
        textModele = new JTextField();
        textVitesseMax = new JTextField();
        textEtat = new JTextField();
        textKm = new JTextField();
        textPrixLoc = new JTextField();
        textNbMoteur = new JTextField();

        textMarque.setText(anAvion.getMarque());
        textModele.setText(anAvion.getModele());
        textVitesseMax.setText(anAvion.getVitesseMax());
        textEtat.setText(anAvion.getEtat());
        textKm.setText(anAvion.getHeuresVol());
        textPrixLoc.setText(anAvion.getPrixLoc());
        textNbMoteur.setText(anAvion.getNbMoteur());


        textMarque.setForeground(Color.BLUE);
        JPanel panInfos = new JPanel();


        JPanel panMarque = new JPanel();
        JPanel panModele = new JPanel();
        JPanel panVit = new JPanel();
        JPanel panKm = new JPanel();
        JPanel panPrix = new JPanel();
        JPanel panMot = new JPanel();
        JPanel panEtat = new JPanel();



        modifier = new JButton("Modifier");
        modifier.addActionListener(this);
        annuler = new JButton("Annuler");
        annuler.addActionListener(this);



        GridLayout grilleInfos = new GridLayout(8,2);

        panInfos.setPreferredSize(new Dimension(700,600));
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
        panInfos.add(panMot);
        panInfos.add(textNbMoteur);

        panPrix.add(prixLoc);
        panEtat.add(etat);
        panVit.add(vitesseMax);
        panKm.add(km);
        panModele.add(modele);
        panMarque.add(marque);
        panMot.add(nbMoteur);

        panInfos.add(annuler);
        panInfos.add(modifier);
        fenetreAjout.add(panInfos);

        fenetreAjout.setVisible(true);

    }


        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==modifier) {



                InterfaceAvion.ajoutAvion(textMarque.getText(),textModele.getText(),textVitesseMax.getText(),textEtat.getText(),textKm.getText(),textNbMoteur.getText(),textPrixLoc.getText());

                this.fenetreAjout.dispose();
                InterfaceAvion interfacePlane = new InterfaceAvion();

            }
        if(e.getSource()==annuler){
            this.fenetreAjout.dispose();
            InterfaceAvion intClient = new InterfaceAvion();
        }
    }

}
