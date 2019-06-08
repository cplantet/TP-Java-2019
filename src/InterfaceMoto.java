import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.beans.XMLDecoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.util.ArrayList;

public class InterfaceMoto  extends JFrame implements ActionListener {

    private JButton retour;
    private JButton ajout;
    private JButton modifier;
    private JButton ficheMoto;

    private JFrame fenetre;
    private static ArrayList<String> moto;
    private static String chaineMoto;
    private static JComboBox listeMoto;


    public InterfaceMoto(){

        fenetre = new JFrame();
        fenetre.setBounds(350, 100, 700, 400);
        fenetre.setResizable(false);
        fenetre.setTitle("Moto");


        ajout = new JButton("Ajouter Moto");
        ajout.addActionListener(this);


        modifier = new JButton("Modifier Moto");
        modifier.addActionListener(this);

        ficheMoto = new JButton("Fiche Moto");
        ficheMoto.addActionListener(this);

        moto = new ArrayList();
        listeMoto = new JComboBox(moto.toArray());
        listeMoto.addActionListener(this);
        ajoutListeMoto();

        retour = new JButton("Retour");
        retour.addActionListener(this);

        JPanel panListe = new JPanel();


        GridLayout grilleListe = new GridLayout(5,1);

        listeMoto.setSize(100,20);

        panListe.setLayout(grilleListe);

        panListe.add(listeMoto);
        panListe.add(ficheMoto);
        panListe.add(ajout);
        panListe.add(modifier);
        panListe.add(retour);

        ficheMoto.setBackground(Color.white);
        ficheMoto.setForeground(Color.black);
        ajout.setBackground(Color.white);
        ajout.setForeground(Color.black);
        modifier.setBackground(Color.white);
        modifier.setForeground(Color.black);
        retour.setBackground(Color.white.darker());
        retour.setForeground(Color.black);

        fenetre.add(panListe);
        fenetre.setVisible(true);


    }


    @Override
    /**
     * En fonction des boutons cliqués, on fait une action diffrente.
     * retour : on ferme la fenêtre et on ouvre une nouvelle fenêtre InterfaceVehicule().
     * ajout : on ferme la fenêtre et on ouvre une nouvelle fenêtre InterfaceAjoutMoto().
     * fiche : on affiche une fenêtre InterfaceFicheMoto pour la moto selectionnée.
     */

    public void actionPerformed(ActionEvent e){

        if(e.getSource()==retour){

            InterfaceVehicule menu = new InterfaceVehicule();
            fenetre.dispose();

        }

        if(e.getSource()==ajout){

            InterfaceAjoutMoto aMoto = new InterfaceAjoutMoto();
            fenetre.dispose();

        }

        if(e.getSource()==ficheMoto){

            InterfaceFicheMoto interfaceFicheMoto = new InterfaceFicheMoto(ficheInitMoto((String)listeMoto.getSelectedItem()));

        }

        if(e.getSource()==modifier){
            InterfaceModifierMoto interfaceModifiermot = new InterfaceModifierMoto(ficheInitMoto((String)listeMoto.getSelectedItem()));
            this.fenetre.dispose();
        }


    }

    /**
     * Cette procdure permet de créer un objet de type Motoet de l'écrire dans un fichier .xml,  en faisant appel au
     *Constructeur Moto() et à la procédure ecrireMoto() de la classe Moto.
     * @param marque
     * @param modele
     * @param vitesseMax
     * @param etat
     * @param nbPlace
     * @param km
     * @param puissance
     * @param prixLoc
     */
    public static void ajoutMoto(String marque, String modele, String vitesseMax, String etat, String nbPlace ,String km,String puissance, String prixLoc) {

        Moto aMoto = new Moto(marque,modele,vitesseMax,etat,km,nbPlace,puissance,prixLoc);
        Moto.ecrireMoto(aMoto);

    }

    /**
     * Cette fonction créé un dossier Moto dans le dossier Moto ou l'on va stocker les fichiers .xml avec les informations des différents
     * objets Moto
     */

    public static void ajoutListeMoto(){

        FilenameFilter filtre = new FilenameFilter() {
            @Override
            public boolean accept(File file, String s) {
                return s.endsWith(".xml");
            }
        };

        int i;
        File dossier = new File("./Vehicule/Moto/");
        File[] fichiersVehicule = dossier.listFiles(filtre);
        for (i = 0; i < fichiersVehicule.length; i++) {

            String[] tab = fichiersVehicule[i].toString().split("/");
            String[] nomFichier = tab[3].split(".xml");
            String[] nomFichierh = nomFichier[0].split(" ");
            String marque = nomFichierh[0];
            String modele = nomFichierh[1];
            chaineMoto= marque + " " + modele;
            moto.add(chaineMoto);
        }
        comboBoxInit();


    }
    /**
     * On remplit la JComboBox avec les informations contenues dans le tableau "moto" contenant des objets Moto.
     */
    private static void comboBoxInit(){

        listeMoto.removeAllItems();
        for (String c: moto){
            listeMoto.addItem(c);
        }
    }
    /**
     * Cette fonction renvoit l'objet Voiture asocié à un élément de type String.
     * @param moto
     * @return
     */
    public static Moto ficheInitMoto(String moto) {

        Moto cycle = null;
        try {
            FileInputStream fichier = new FileInputStream("./Vehicule/Moto/" + moto + ".xml");
            XMLDecoder decoder = new XMLDecoder(fichier);
            cycle = (Moto) decoder.readObject();
            decoder.close();
            fichier.close();
            return cycle;
        }

        catch(Exception e){
            System.out.println(e);
        }
        return cycle;
    }



}
