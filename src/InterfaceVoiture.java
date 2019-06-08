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
    private JButton modifier;
    private JButton ficheVoiture;
    private static ArrayList<String> voiture;
    private static JComboBox listeVoiture;
    private static String chaineVoiture;

    private JFrame fenetreV;

    /**
     * Constructeur de InterfaceVoiture.
     * On créé une interface avec :
     * des boutons : retour, ajout,ficheVoiture.
     * Une JComboBox : listeVoiture.     *
     */

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


        modifier = new JButton("Modifier Voiture");
        modifier.addActionListener(this);

        ficheVoiture = new JButton("Fiche Voiture");
        ficheVoiture.addActionListener(this);

        retour = new JButton("Retour");
        retour.addActionListener(this);

        JPanel panListe = new JPanel();

        GridLayout grilleListe = new GridLayout(5,1);

        panListe.setLayout(grilleListe);
        panListe.add(listeVoiture);
        panListe.add(ficheVoiture);
        panListe.add(ajout);
        panListe.add(modifier);
        panListe.add(retour);

        ficheVoiture.setBackground(Color.white);
        ficheVoiture.setForeground(Color.black);
        ajout.setBackground(Color.white);
        ajout.setForeground(Color.black);
        modifier.setBackground(Color.white);
        modifier.setForeground(Color.black);
        retour.setBackground(Color.white.darker());
        retour.setForeground(Color.black);

        fenetreV.add(panListe);

        panListe.setBackground(Color.GRAY);

        fenetreV.setVisible(true);

    }


    @Override
    /**
     * En fonction des boutons cliqués, on fait une action diffrente.
     * retour : on ferme la fenêtre et on ouvre une nouvelle fenêtre InterfaceVehicule().
     * ajout : on ferme la fenêtre et on ouvre une nouvelle fenêtre InterfaceAjoutVoiture().
     * fiche : on affiche une fenêtre InterfaceFicheVoiture pour la voiture selectionnée.
     */

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
            InterfaceFicheVoiture ficheVit = new InterfaceFicheVoiture(ficheInitVoiture((String)listeVoiture.getSelectedItem()));

        }


        if(e.getSource()==modifier){
            InterfaceModifierVoiture intVoiture = new InterfaceModifierVoiture(ficheInitVoiture((String)listeVoiture.getSelectedItem()));
            fenetreV.dispose();
        }
    }

    /**
     * Cette procdure permet de créer un objet de type Voiture et de l'écrire dans un fichier ;xml,  en faisant appelle au
     * Constructeur Voiture() et à la procédure ecrireVoiture() de la classe Voiture.
     * @param marque
     * @param modele
     * @param vitesseMax
     * @param etat
     * @param nbPlaces
     * @param km
     * @param puissance
     * @param prixloc
     */
    public static void ajoutVoiture(String marque, String modele, String vitesseMax, String etat, String nbPlaces , String km
            ,String puissance,String prixloc) {

        Voiture aVoiture = new Voiture(marque,modele,vitesseMax,etat,km,nbPlaces,puissance,prixloc);
        Voiture.ecrireVoiture(aVoiture);

    }

    /**
     * Cette fonction créé
     */
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

    /**
     * On remplit la JComboBox avec les informations contenues dans le tableau "voiture" contenant des objets Voiture.
     */
    private static void comboBoxInit(){

        listeVoiture.removeAllItems();
        for (String c: voiture){
            listeVoiture.addItem(c);
        }
    }

    /**
     * Cette fonction renvoit l'objet Voiture asocié à un élément de type String.
     * @param voiture
     * @return
     */
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