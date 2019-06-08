import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class InterfaceAjoutAvion extends JFrame implements ActionListener{

    private JButton ajout ;
    private JButton annuler ;
    private JFrame fenetreAjout;


    private JTextField textMarque ;
    private JTextField textModele ;
    private JTextField textVitesseMax;
    private JTextField textEtat ;
    private JTextField textHeureVol ;
    private JTextField textPrixLoc ;
    private JTextField textNbMoteur;




    public InterfaceAjoutAvion() {

        fenetreAjout = new JFrame();
        fenetreAjout.setBounds(350, 100, 700, 700);
        fenetreAjout.setTitle("Ajout Avion");
        fenetreAjout.setResizable(false);

        // declaration des Jlabel
        JLabel marque = new JLabel("marque");
        JLabel modele = new JLabel("modele");
        JLabel vitesseMax = new JLabel("vitesseMax");
        JLabel etat = new JLabel("etat");
        JLabel heuresDeVol = new JLabel("Heures de Vol");
        JLabel prixLoc = new JLabel("prixLoc");
        JLabel nbMoteur = new JLabel("nbMoteur");

        JLabel entrer = new JLabel("Appuyez sur la touche ENTREE pour valider");

         textMarque = new JTextField();
         textModele = new JTextField();
         textVitesseMax = new JTextField();
        textEtat = new JTextField();
        textHeureVol = new JTextField();
        textPrixLoc = new JTextField();
        textNbMoteur = new JTextField();

        textMarque.setForeground(Color.BLUE);
        JPanel panInfos = new JPanel();


        JPanel panMarque = new JPanel();
        JPanel panModele = new JPanel();
        JPanel panVit = new JPanel();
        JPanel panKm = new JPanel();
        JPanel panPrix = new JPanel();
        JPanel panMot = new JPanel();
        JPanel panEtat = new JPanel();



        ajout = new JButton("Ajouter");
        ajout.addActionListener(this);
        annuler = new JButton("Annuler");
        annuler.addActionListener(this);



       //panAjout.setBounds(0,650,700,50);



        GridLayout grilleInfos = new GridLayout(8,2);

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
             panInfos.add(textHeureVol);
            panInfos.add(panPrix);
            panInfos.add(textPrixLoc);
            panInfos.add(panMot);
            panInfos.add(textNbMoteur);

            panPrix.add(prixLoc);
            panEtat.add(etat);
            panVit.add(vitesseMax);
            panKm.add(heuresDeVol);
            panModele.add(modele);
            panMarque.add(marque);
            panMot.add(nbMoteur);

         panInfos.add(annuler);
            panInfos.add(ajout);
        fenetreAjout.add(panInfos);

        fenetreAjout.setVisible(true);

    }

    @Override

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==ajout) {



            InterfaceAvion.ajoutAvion(textMarque.getText(),textModele.getText(),textVitesseMax.getText(),textEtat.getText(),textHeureVol.getText(),textNbMoteur.getText(),textPrixLoc.getText());
            InterfaceAvion.ajoutListeAvion();
            fenetreAjout.dispose();
            InterfaceAvion interfacePlane = new InterfaceAvion();

        }
        if(e.getSource()==annuler){
            InterfaceAvion intAvion= new InterfaceAvion();
            fenetreAjout.dispose();

        }

    }

}