import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.beans.XMLDecoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.util.ArrayList;

public class InterfaceAvion extends JFrame implements ActionListener{

    private JButton retour;
    private JButton ajout;
    private JButton ficheAvion;
    private static JComboBox listeAvions;
    private JFrame fenetre;





    private static ArrayList<String> avion;
    private static String chaineAvion;


    private DefaultComboBoxModel model;


    public InterfaceAvion(){

        fenetre = new JFrame();
        fenetre.setBounds(350, 100, 700, 500);
        fenetre.setResizable(false);
        fenetre.setTitle(" Avion");
        avion = new ArrayList<>();

        listeAvions = new JComboBox(avion.toArray());
        listeAvions.addActionListener(this);
        ajoutListeAvion();

        ajout = new JButton("Ajouter Avion");
        ajout.addActionListener(this);
        ficheAvion = new JButton("Fiche Avion");
        ficheAvion.addActionListener(this);

        retour = new JButton("Retour");
        retour.addActionListener(this);

        JPanel panBoutons = new JPanel();
        JPanel panBouton1 = new JPanel();
        JPanel panBouton2 = new JPanel();
        JPanel panListe = new JPanel();
        JPanel panRetour = new JPanel();

        GridLayout grilleListe = new GridLayout(11,1);

        panBouton1.setLayout(new FlowLayout(FlowLayout.CENTER,0,fenetre.getHeight()/4 - ajout.getHeight()/2));

        panBouton2.setLayout(new FlowLayout(FlowLayout.CENTER, 0, fenetre.getHeight()/4- ajout.getHeight()/2));

        //panListe.setLayout(new FlowLayout(FlowLayout.CENTER,0,fenetre.getHeight()/4 - ajout.getHeight()/2));

        listeAvions.setSize(100,20);
        panBouton1.add(ajout);
        panBouton2.add(ficheAvion);

        GridLayout grilleGlobale = new GridLayout(1,2);
        GridLayout grilleBoutons = new GridLayout(2,1);

        panListe.setLayout(grilleListe);
        panRetour.add(retour);
        panRetour.setBackground(Color.GRAY);
        panBoutons.setLayout(grilleBoutons);
        panBoutons.add(panBouton1);
        panBoutons.add(panBouton2);

        panListe.add(listeAvions);
        panListe.add(panRetour);

        fenetre.setLayout(grilleGlobale);
        fenetre.add(panListe,0);

        fenetre.add(panBoutons,1);


        panBouton1.setBackground(Color.BLUE);
        panBouton2.setBackground(Color.LIGHT_GRAY);

        panBouton1.setBackground(Color.LIGHT_GRAY);
        panBouton2.setBackground(Color.DARK_GRAY);
        panListe.setBackground(Color.GRAY);


        fenetre.setVisible(true);

    }


    @Override

    public void actionPerformed(ActionEvent e){

        if(e.getSource()==retour){
            InterfaceVehicule menu = new InterfaceVehicule();
            fenetre.dispose();
        }

        if(e.getSource()==ajout){
            InterfaceAjoutAvion avion = new InterfaceAjoutAvion();
            fenetre.dispose();
        }

        if(e.getSource()==ficheAvion){
            InterfaceFicheAvion interfaceFicheAvion = new InterfaceFicheAvion(ficheInitAvion((String)listeAvions.getSelectedItem()));
        }

    }

    public static void ajoutAvion(String marque, String modele, String vitesseMax, String etat, String nbMoteur , String prixloc) {

        Avion anAvion = new Avion(marque,modele,vitesseMax,etat,prixloc,nbMoteur);
        Avion.ecrireAvion(anAvion);

    }


    public static void ajoutListeAvion(){

        FilenameFilter filtre = new FilenameFilter() {
            @Override
            public boolean accept(File file, String s) {
                return s.endsWith(".xml");
            }
        };

        int i;
        File dossier = new File("./Vehicule/Avion/");
        File[] fichiersVehicule = dossier.listFiles(filtre);
        for (i = 0; i < fichiersVehicule.length; i++) {

            String[] tab = fichiersVehicule[i].toString().split("/");
            String[] nomFichier = tab[3].split(".xml");
            String[] nomFichierh = nomFichier[0].split(" ");
            String marque = nomFichierh[0];
            String modele = nomFichierh[1];
            chaineAvion= marque + " " + modele;
            avion.add(chaineAvion);
        }
        comboBoxInit();


    }

    private static void comboBoxInit(){

        listeAvions.removeAllItems();
        for (String c: avion){
            listeAvions.addItem(c);
        }
    }


    public static Avion ficheInitAvion(String avion) {

        Avion plane = null;
        try {
            FileInputStream fichier = new FileInputStream("./Vehicule/Avion/" + avion + ".xml");
            XMLDecoder decoder = new XMLDecoder(fichier);
            plane = (Avion) decoder.readObject();
            decoder.close();
            fichier.close();
            return plane;
        }

        catch(Exception e){
            System.out.println(e);
        }
        return plane;
    }
}





