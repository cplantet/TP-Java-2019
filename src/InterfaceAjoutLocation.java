import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.EventObject;

public class InterfaceAjoutLocation extends JFrame implements ActionListener{

    private JButton ajout ;
  private JButton info;
    private JButton retour;
    private JFrame fenetreAjout;
    private static JComboBox vehiculeJComboBox;
    private static JComboBox clientJComboBox;
    private static JComboBox vehiculeJComboBox2;
    private static ArrayList<String> clientLoc;
    private static String man;


    private static ArrayList<String> vehiculeTypeLoc;
    private String[] typeVehicule= {"Avion","Moto","Voiture"};

    /**
     * Constructeur de InterfaceAjoutLocation qui permet de remplir des champs d'informations en fonction de ce qui est demandé
     * en affichant des JLabel et des JTextField
     * Il y a aussi des boutons ajouter et annuler
     *
     */



    public InterfaceAjoutLocation() {


        fenetreAjout = new JFrame();
        fenetreAjout.setBounds(350, 100, 800, 125);
        fenetreAjout.setTitle("Ajout Location");

        clientLoc = new ArrayList<>();
        vehiculeTypeLoc = new ArrayList<>();
        fenetreAjout.setResizable(false);

        vehiculeJComboBox = new JComboBox(typeVehicule);
        clientJComboBox = new JComboBox();
        vehiculeJComboBox2 = new JComboBox();

        vehiculeJComboBox.addActionListener(this);
        vehiculeJComboBox2.addActionListener(this);
        clientJComboBox.addActionListener(this);
        ajoutListeClientLoc();


     ajout = new JButton("Ajout");
        retour = new JButton("Retour");
     info = new JButton("Information");
     info.addActionListener(this);
    ajout.addActionListener(this);
        retour.addActionListener(this);

    GridLayout grilleGlobale = new GridLayout(1,3);

    JPanel panglobal = new JPanel();
    panglobal.setLayout(grilleGlobale);
    JPanel panListeClient = new JPanel();


    panglobal.add(clientJComboBox);


    panglobal.add(vehiculeJComboBox);


    JPanel panBouton = new JPanel();
    GridLayout grillebouton = new GridLayout(3,1);
    panBouton.setLayout(grillebouton);

    panBouton.add(ajout);
    panBouton.add(info);
    panBouton.add(retour);
    panglobal.add(panBouton);
    fenetreAjout.add(panglobal);

        fenetreAjout.setVisible(true);

    }

    /**
     * *
     *      *  * Procédure de ActionListener qui permet de
     *      *  ouvrir une interface InterfaceLocationAvancé et fermer la fenêtre actuelle
     *      *retourner à l'interface InterfaceAvion sans rien ajouter
     *
     * @param e
     */

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==ajout) {

            InterfaceAjoutLocationAvance intajoutlocav = new InterfaceAjoutLocationAvance((String)vehiculeJComboBox.getSelectedItem());
            fenetreAjout.dispose();

        }

        if(e.getSource()==info){
            InterfaceFicheClient afficheClient = new InterfaceFicheClient(InterfaceClients.ficheInit((String)clientJComboBox.getSelectedItem()));


        }
        if(e.getSource()==retour){
            InterfaceLocation intLoc = new InterfaceLocation();
            fenetreAjout.dispose();
        }

    }

    public static void ajoutListeClientLoc(){

        FilenameFilter filtre = new FilenameFilter() {
            @Override
            public boolean accept(File file, String s) {
                return s.endsWith(".xml");
            }
        };

        int i;
        File dossier = new File("./Client/");
        File[] fichiersClient = dossier.listFiles(filtre);
        for (i = 0; i < fichiersClient.length; i++) {

            String[] tab = fichiersClient[i].toString().split("/");
            String[] nomFichier = tab[2].split(".xml");
            String[] nomFichierh = nomFichier[0].split(" ");
            String prenom = nomFichierh[1];
            String nom = nomFichierh[0];
            man= nom + " " + prenom;


            clientLoc.add(man);
        }

        comboBoxInitClient();

    }

    private static void comboBoxInitClient(){
        clientJComboBox.removeAllItems();
        for (String c:clientLoc){

            clientJComboBox.addItem(c);

        }

    }



}