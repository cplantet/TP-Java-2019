import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class InterfaceAjoutAvion extends InterfaceAvion implements ActionListener{

    private JButton ajout ;
    private JTextField km;
    private JTextField prixLoc;
    private JTextField nbMoteur;
    private JTextField marque;
    private JTextField modele;
    private JTextField vitesseMax;
    private JTextField etat;
    private JFrame fenetreAjout;

    private String kmS;
    private String prixLocS;
    private String nbMoteurS;
    private String marqueS;
    private String modeleS;
    private String vitesseMaxS;
    private String etatS;




    public InterfaceAjoutAvion() {

        fenetreAjout = new JFrame();
        fenetreAjout.setBounds(350, 100, 700, 500);
        fenetreAjout.setTitle("Ajout Avion");
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

        JTextField  textmarque = new JTextField();
        JTextField textmodele  = new JTextField();
        JTextField textvitesseMax = new JTextField();
        JTextField textetat = new JTextField();
        JTextField textkm = new JTextField();
        JTextField textprixLoc = new JTextField();
        JTextField textnbMoteur = new JTextField();

        JPanel panInfos = new JPanel();
        JPanel panAjout = new JPanel();


        JPanel panMarque = new JPanel();
        JPanel panModele = new JPanel();
        JPanel panVit = new JPanel();
        JPanel panKm = new JPanel();
        JPanel panPrix = new JPanel();
        JPanel panMot = new JPanel();
        JPanel panEtat = new JPanel();

        panAjout.setBackground(Color.LIGHT_GRAY);

        ajout = new JButton("Ajouter");

        fenetreAjout.add(panAjout);
        fenetreAjout.add(panInfos);

        panAjout.setBounds(0,425,700,100);
        panAjout.add(ajout);

        GridLayout grilleInfos = new GridLayout(7,2);

        // on affiche les cases et les noms des lignes dans les cases de la grille du tableau
        panInfos.setBounds(0,0,600,300);
        panInfos.setLayout(grilleInfos);
             panInfos.add(panMarque);
             panInfos.add(textmarque);
             panInfos.add(panModele);
            panInfos.add(textmodele);
             panInfos.add(panVit);
             panInfos.add(textvitesseMax);
             panInfos.add(panEtat);
            panInfos.add(textetat);
             panInfos.add(panKm);
             panInfos.add(textkm);
            panInfos.add(panPrix);
            panInfos.add(textprixLoc);
            panInfos.add(panMot);
            panInfos.add(textnbMoteur);
            panPrix.add(prixLoc);
            panEtat.add(etat);
            panVit.add(vitesseMax);
            panKm.add(km);
            panModele.add(modele);
            panMarque.add(marque);

        //varaibles qui contiennt les valeurs de ce qu'on tape

        kmS=textmarque.getText();
        prixLocS=textprixLoc.getText();
        nbMoteurS=textnbMoteur.getText();
        marqueS=textmarque.getText();
        modeleS=textmodele.getText();
        vitesseMaxS=textvitesseMax.getText();
        etatS=textetat.getText();

        fenetreAjout.setVisible(true);

    }

    @Override

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==ajout) {
            fenetreAjout.dispose();


            Avion aAvion = new Avion();
            aAvion.setMarque(marqueS);
            aAvion.setModele(modeleS);
           // aAvion.setKm(kmS);
          //  aAvion.setNbMoteur();
           // aAvion.setPrixLoc();
          //  aAvion.setEtat();
           // aAvion.setVitesseMax();
            super.ajoutAvion(aAvion);
            System.out.println(aAvion.toString());


        }

    }

}