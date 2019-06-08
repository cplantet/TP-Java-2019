import javax.print.DocFlavor;
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
import java.lang.*;

public class InterfaceAjoutLocationAvance extends JFrame implements ActionListener {

    private JButton ajout;
    private JButton annuler;
    private static JComboBox vehiculeJComboBox2;
    private static JTextField dateDebut;
    private static JTextField datefin;
    private JTextField nbKm;
    private JFrame fenetre;
    private static ArrayList<String> vehiculeLoc;
    private static String vehicule;
    private static String unMec;
    private static Client leIenclit;
    private static Vehicule unVehicule;
    private static String leType;

    public InterfaceAjoutLocationAvance(String typeVehicule,Client aClient) {
        fenetre = new JFrame();
        vehiculeLoc = new ArrayList<>();
        vehiculeJComboBox2 = new JComboBox();
        fenetre.setBounds(350, 100, 800, 250);
        vehiculeJComboBox2.setSize(100,20);
        vehiculeJComboBox2.addActionListener(this);
        ajoutListeVehiculeLoc(typeVehicule);

        unMec = aClient.getNom()+" "+aClient.getPrenom();




        ajout = new JButton("Ajouter");
        ajout.addActionListener(this);

        GridLayout grille = new GridLayout(2,1);


        JLabel dateDebut1 = new JLabel("dateDebut");
        JLabel dateFin1 = new JLabel("dateFin");
        JLabel nombreKm=new JLabel("Nombre de Km");
        JPanel panAjout = new JPanel();



        dateDebut = new JTextField();
        datefin = new JTextField();
        nbKm=new JTextField();

        annuler = new JButton("Annuler");
        annuler.addActionListener(this);

        GridLayout grilleInfos = new GridLayout(4, 2);
        panAjout.setLayout(grilleInfos);

        panAjout.setLayout(grilleInfos);


        panAjout.add(dateDebut1);
        panAjout.add(dateDebut);
        panAjout.add(dateFin1);
        panAjout.add(datefin);
        panAjout.add(nombreKm);
        panAjout.add(nbKm);
        panAjout.add(annuler);
        panAjout.add(ajout);
        fenetre.setLayout(grille);
        fenetre.add(vehiculeJComboBox2);
        fenetre.add(panAjout);
        fenetre.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ajout) {

            String[] tabClient = unMec.split(" ");
            String dateDeb= dateDebut.getText();
            String dateFin = datefin.getText();
            String nbJour = "";
            nbJour = Integer.toString(calculTempsLocation(dateDeb,dateFin));

            if(leType=="Avion"){
                unVehicule = InterfaceAvion.ficheInitAvion((String) vehiculeJComboBox2.getSelectedItem());
            }
            if(leType=="Moto"){
                unVehicule = InterfaceMoto.ficheInitMoto((String) vehiculeJComboBox2.getSelectedItem());
            }if(leType=="Voiture"){
                unVehicule = InterfaceVoiture.ficheInitVoiture((String) vehiculeJComboBox2.getSelectedItem());
            }

            ajoutLocation(tabClient[0],tabClient[1],(String)vehiculeJComboBox2.getSelectedItem(),nbJour,dateDeb,dateFin,nbKm.getText(),leIenclit,unVehicule);
            InterfaceLocation.ajoutListeLocation();

            fenetre.dispose();
            InterfaceLocation interloc = new InterfaceLocation();


        }
        if (e.getSource() == annuler) {
            InterfaceAjoutLocation intajoutloc = new InterfaceAjoutLocation();
            fenetre.dispose();


        }
    }

    public static void ajoutLocation(String nom,String prenom,String vehicule,String prix,String debut,String fin,String nbKm,Client aClient,Vehicule aVehicule){

        Location aLocation = new Location(nom, prenom, vehicule,debut,fin,nbKm,prix);

        Location.ecrireLocation(aLocation,aClient,aVehicule);
    }

    public static void ajoutListeVehiculeLoc(String typeVehicule){

        int i;
        File dossier = new File("./Location/"+typeVehicule+"/");
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

    private static int calculTempsLocation(String dateDebut,String dateFin){

        String[] tableauDeb = dateDebut.split("/");
        String jour = tableauDeb[0];
        String mois = tableauDeb[1];
        String année = tableauDeb[2];

        int nbJours = Integer.parseInt(jour)+(Integer.parseInt(mois)*31)+(Integer.parseInt(année));

        return nbJours;
    }

    private static Double prixLoc(String prix,int nbJour,int km){

        Double prixLocation=0d;

        if(km>50 && km<=100){

            prixLocation = Integer.parseInt(prix)+(0.50*km);
        }

        if(km>100 && km<=200){

             prixLocation = Integer.parseInt(prix)+(0.30*km);
        }

        if(km>200 && km<=300){

             prixLocation = Integer.parseInt(prix)+(0.20*km);
        }

        if(km>300){

             prixLocation = Integer.parseInt(prix)+(0.10*km);
        }

        if(nbJour>7){
            prixLocation = prixLocation*0.1;
        }

        return prixLocation;
    }






}



