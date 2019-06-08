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
    private JFrame fenetreAjout;
    private static JComboBox vehiculeJComboBox;
    private static JComboBox clientJComboBox;
    private static JComboBox vehiculeJComboBox2;
    private static ArrayList<String> clientLoc;
    private static String man;
    private static String vehicule;
    private static ArrayList<String> vehiculeLoc;
    private static ArrayList<String> vehiculeTypeLoc;
    private String[] typeVehicule= {"Avion","Moto","Voiture"};




    public InterfaceAjoutLocation() {


        fenetreAjout = new JFrame();
        fenetreAjout.setBounds(350, 100, 800, 125);
        fenetreAjout.setTitle("Ajout Location");
        vehiculeLoc = new ArrayList<>();
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
        ajoutListeVehiculeLoc();


     ajout = new JButton("Ajout");
     info = new JButton("Information");
    ajout.addActionListener(this);

    GridLayout grilleGlobale = new GridLayout(1,3);




    JPanel panglobal = new JPanel();
    panglobal.setLayout(grilleGlobale);
    JPanel panListeClient = new JPanel();


    panglobal.add(clientJComboBox);


    panglobal.add(vehiculeJComboBox);

        //JPanel panListeVeh = new JPanel();
       // panListeVeh.add(vehiculeJList);
        //panglobal.add(panListeClient);


    JPanel panBouton = new JPanel();
    GridLayout grillebouton = new GridLayout(2,1);
    panBouton.setLayout(grillebouton);

    panBouton.add(ajout);
    panBouton.add(info);
    panglobal.add(panBouton);
fenetreAjout.add(panglobal);



        fenetreAjout.setVisible(true);




    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==ajout) {


            fenetreAjout.dispose();

        }
        if(e.getSource()==info){
            System.out.println("bouton info is ok");
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

    public static void ajoutListeVehiculeLoc(){

        int i;
        File dossier = new File("./Vehicule/"+vehiculeJComboBox.getSelectedItem()+"/");
        File[] fichiersClient = dossier.listFiles();
        for (i = 0; i < fichiersClient.length; i++) {

            String[] tab = fichiersClient[i].toString().split("/");
            String[] nomFichier = tab[3].split(".xml");
            String[] nomFichierh = nomFichier[0].split(" ");
            String prenom = nomFichierh[1];
            String nom = nomFichierh[0];
            vehicule= nom + " " + prenom;


            vehiculeLoc.add(vehicule);
        }

        comboBoxInitVehicule();


    }

    private static void comboBoxInitVehicule(){
        vehiculeJComboBox2.removeAllItems();
        for (String c:vehiculeLoc){


            vehiculeJComboBox2.addItem(c);

        }


    }






}