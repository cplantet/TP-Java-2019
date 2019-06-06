import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class InterfaceAjoutMoto extends JFrame implements ActionListener{



    private JButton ajout ;
    private JButton annuler ;
    private JTextField km;
    private JTextField prixLoc;
    private JTextField nbMoteur;
    private JTextField marque;
    private JTextField modele;
    private JTextField vitesseMax;
    private JTextField etat;
    private JTextField puissance;
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

        JTextField  textmarque = new JTextField();
        JTextField textmodele  = new JTextField();
        JTextField textvitesseMax = new JTextField();
        JTextField textetat = new JTextField();
        JTextField textkm = new JTextField();
        JTextField textprixLoc = new JTextField();
        JTextField textnbPlace = new JTextField();
        JTextField textpuissance = new JTextField();

        textmarque.setForeground(Color.BLUE);
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
        panInfos.add(pannbPlace);
        panInfos.add(textnbPlace);
        panInfos.add(panpuissance);
        panInfos.add(textpuissance);

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

        kmS=textmarque.getText();
        prixLocS=textprixLoc.getText();
        nbPlaceS=textnbPlace.getText();
        marqueS=textmarque.getText();
        modeleS=textmodele.getText();
        vitesseMaxS=textvitesseMax.getText();
        etatS=textetat.getText();
        puissanceS=textpuissance.getText();

        fenetreAjout.setVisible(true);

    }

    @Override

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==ajout) {


            //zone de conversion

            float kmf = Float.parseFloat(kmS);
            Integer nbPlacef = Integer.parseInt(nbPlaceS);
            float prixLocf = Float.parseFloat(prixLocS);
            float vitesseMaxf = Float.parseFloat(vitesseMaxS);
            float puissancef = Float.parseFloat(puissanceS);

            Moto aMoto = new Moto(marqueS,modeleS,vitesseMaxf,etatS,kmf,nbPlacef,puissancef,prixLocf);
            InterfaceMoto intMoto= new InterfaceMoto();
            fenetreAjout.dispose();



        }
        if(e.getSource()==annuler){
            InterfaceMoto intMoto= new InterfaceMoto();
            fenetreAjout.dispose();



        }

    }


}
