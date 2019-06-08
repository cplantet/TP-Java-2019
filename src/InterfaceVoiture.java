import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.beans.XMLDecoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.util.ArrayList;

public class InterfaceVoiture extends JFrame implements ActionListener{

    private JButton retour;
    private JButton ajout;
    private JButton ficheVoiture;
    private static ArrayList<String> voiture;
    private static JComboBox listeVoiture;
    private static String chaineVoiture;

    private JFrame fenetreV;


    public InterfaceVoiture(){

        fenetreV = new JFrame();
        fenetreV.setBounds(350, 100, 700, 500);
        fenetreV.setResizable(false);
        fenetreV.setTitle(" Voiture");
        voiture = new ArrayList<>();

        listeVoiture = new JComboBox();
        listeVoiture.setSize(100,20);
        listeVoiture.addActionListener(this);
        ajoutListeVoiture();

        ajout = new JButton("Ajouter Voiture");
        ajout.addActionListener(this);

        ficheVoiture = new JButton("Fiche Voiture");
        ficheVoiture.addActionListener(this);

        retour = new JButton("Retour");
        retour.addActionListener(this);

        JPanel panBoutons = new JPanel();
        JPanel panBouton1 = new JPanel();
        JPanel panBouton2 = new JPanel();
        JPanel panListe = new JPanel();
        JPanel panRetour = new JPanel();



        panBouton1.setLayout(new FlowLayout(FlowLayout.CENTER,0,fenetreV.getHeight()/4 - ajout.getHeight()/2));

        panBouton2.setLayout(new FlowLayout(FlowLayout.CENTER, 0, fenetreV.getHeight()/4- ajout.getHeight()/2));

        //panListe.setLayout(new FlowLayout(FlowLayout.CENTER,0,fenetre.getHeight()/4 - ajout.getHeight()/2));


        panBouton1.add(ajout);
        panBouton2.add(ficheVoiture);

        GridLayout grilleListe = new GridLayout(11,1);

        panListe.setLayout(grilleListe);


        panRetour.add(retour);
        panRetour.setBackground(Color.GRAY);

        panListe.add(listeVoiture);
        panListe.add(panRetour);

        GridLayout grilleBoutons = new GridLayout(2,1);

        panBoutons.setLayout(grilleBoutons);
        panBoutons.add(panBouton1);
        panBoutons.add(panBouton2);






        GridLayout grilleGlobale = new GridLayout(1,2);

        fenetreV.setLayout(grilleGlobale);

        fenetreV.add(panListe,0);

        fenetreV.add(panBoutons,1);

        panBouton1.setBackground(Color.LIGHT_GRAY);
        panBouton2.setBackground(Color.DARK_GRAY);
        panListe.setBackground(Color.GRAY);
        panRetour.setBackground(Color.GRAY);

        fenetreV.setVisible(true);

    }


    @Override

    public void actionPerformed(ActionEvent e){

        if(e.getSource()==retour){
            InterfaceVehicule menu = new InterfaceVehicule();
            fenetreV.dispose();
        }

        if(e.getSource()==ajout){
            InterfaceAjoutVoiture intVoiture = new InterfaceAjoutVoiture();
            fenetreV.dispose();
        }

        if(e.getSource()==ficheVoiture){
            InterfaceFicheVoiture interfaceFicheVoiture= new InterfaceFicheVoiture(ficheInitVoiture((String)listeVoiture.getSelectedItem()));
        }
    }

    public static void ajoutVoiture(String marque, String modele, String vitesseMax, String etat, String nbPlaces , String km
                                    ,String puissance,String prixloc) {

        Voiture aVoiture = new Voiture(marque,modele,vitesseMax,etat,km,nbPlaces,puissance,prixloc);
        Voiture.ecrireVoiture(aVoiture);

    }


    public static void ajoutListeVoiture(){

        FilenameFilter filtre = new FilenameFilter() {
            @Override
            public boolean accept(File file, String s) {
                return s.endsWith(".xml");
            }
        };

        int i;
        File dossier = new File("./Vehicule/Voiture/");
        File[] fichiersVehicule = dossier.listFiles(filtre);
        for (i = 0; i < fichiersVehicule.length; i++) {

            String[] tab = fichiersVehicule[i].toString().split("/");
            String[] nomFichier = tab[3].split(".xml");
            String[] nomFichierh = nomFichier[0].split(" ");
            String marque = nomFichierh[0];
            String modele = nomFichierh[1];
            chaineVoiture= marque + " " + modele;
            voiture.add(chaineVoiture);
        }
        comboBoxInit();


    }

    private static void comboBoxInit(){

        listeVoiture.removeAllItems();
        for (String c: voiture){
            listeVoiture.addItem(c);
        }
    }


    public static Voiture ficheInitVoiture(String voiture) {

        Voiture car = null;
        try {
            FileInputStream fichier = new FileInputStream("./Vehicule/Voiture/" + voiture + ".xml");
            XMLDecoder decoder = new XMLDecoder(fichier);
            car = (Voiture) decoder.readObject();
            decoder.close();
            fichier.close();
            return car;
        }

        catch(Exception e){
            System.out.println(e);
        }
        return car;
    }
}