import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;

public class InterfaceLocation extends JFrame implements ActionListener{

    private JButton retour;
    private JButton ajout;
    private JButton ficheLocation;
    private static JComboBox listeLocation;
    private static ArrayList<String> locations;
    private static String loc;

    private JFrame fenetreL;


    public InterfaceLocation(){

        fenetreL = new JFrame();
        fenetreL.setBounds(350, 100, 700, 500);
        fenetreL.setResizable(false);
        fenetreL.setTitle("Location");

        listeLocation = new JComboBox();


        ajout = new JButton("Ajouter Location");
        ajout.addActionListener(this);
        JButton ficheLocation = new JButton("Fiche Location");

        retour = new JButton("Retour");
        retour.addActionListener(this);

        JPanel panListe = new JPanel();


        GridLayout grilleListe = new GridLayout(4,1);

        panListe.setLayout(grilleListe);
        panListe.add(listeLocation);
        panListe.add(ficheLocation);
        panListe.add(ajout);
        panListe.add(retour);

        ficheLocation.setBackground(Color.white);
        ficheLocation.setForeground(Color.black);
        ajout.setBackground(Color.white);
        ajout.setForeground(Color.black);
        retour.setBackground(Color.white.darker());
        retour.setForeground(Color.black);
        fenetreL.add(panListe);


        fenetreL.setVisible(true);

    }


    @Override

    public void actionPerformed(ActionEvent e){

        if(e.getSource()==retour){
            Interface menu = new Interface();
            fenetreL.dispose();
        }

        if(e.getSource()==ajout){
            InterfaceAjoutLocation intLocation = new InterfaceAjoutLocation();
            fenetreL.dispose();
        }
    }

    public static void ajoutListeLocation(){

        FilenameFilter filtre = new FilenameFilter() {
            @Override
            public boolean accept(File file, String s) {
                return s.endsWith(".xml");
            }
        };

        int i;
        File dossier = new File("./Location/");
        File[] fichiersLoca = dossier.listFiles(filtre);
        for (i = 0; i < fichiersLoca.length; i++) {

            String[] tab = fichiersLoca[i].toString().split("/");
            String[] nomFichier = tab[2].split(".xml");
            String[] nomFichierh = nomFichier[0].split(" ");
            String marque = nomFichierh[1];
            String nom = nomFichierh[0];
            loc= nom + " " + marque;


            locations.add(loc);
        }

        comboBoxInitLocation();


    }


    private static void comboBoxInitLocation(){
        listeLocation.removeAllItems();
        for (String c:locations){


            listeLocation.addItem(c);

        }


    }

}