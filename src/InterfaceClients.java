import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.beans.XMLDecoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.util.ArrayList;


public class InterfaceClients extends JFrame implements ActionListener {

    private JButton retour;
    private JButton ajout;
    private JButton ficheClient;
    private JFrame fenetre;


    private static String client;
    private static ArrayList<String> locataire;

    public static JComboBox listeClients;


    public InterfaceClients() {


        fenetre = new JFrame();
        fenetre.setBounds(350, 100, 700, 500);
        fenetre.setResizable(false);
        fenetre.setTitle(" Clients");

        locataire = new ArrayList();


        listeClients = new JComboBox();
        listeClients.addActionListener(this);
        ajoutListe();


        ajout = new JButton("Ajouter Client");
        ajout.addActionListener(this);

        ficheClient = new JButton("Fiche Client");
        ficheClient.addActionListener(this);

        retour = new JButton("Retour");
        retour.addActionListener(this);

        JPanel panBoutons = new JPanel();
        JPanel panBouton1 = new JPanel();
        JPanel panBouton2 = new JPanel();
        JPanel panListe = new JPanel();
        JPanel panRetour = new JPanel();


        GridLayout grilleListe = new GridLayout(11, 1);


        panBouton1.setLayout(new FlowLayout(FlowLayout.CENTER, 0, fenetre.getHeight() / 4 - ajout.getHeight() / 2));

        panBouton2.setLayout(new FlowLayout(FlowLayout.CENTER, 0, fenetre.getHeight() / 4 - ajout.getHeight() / 2));

        //panListe.setLayout(new FlowLayout(FlowLayout.CENTER,0,fenetre.getHeight()/4 - ajout.getHeight()/2));


        listeClients.setSize(100, 20);
        panBouton1.add(ajout);
        panBouton2.add(ficheClient);

        GridLayout grilleGlobale = new GridLayout(1, 2);
        GridLayout grilleBoutons = new GridLayout(2, 1);

        panListe.setLayout(grilleListe);
        panRetour.add(retour);

        panBoutons.setLayout(grilleBoutons);
        panBoutons.add(panBouton1);
        panBoutons.add(panBouton2);

        panListe.add(listeClients);
        panListe.add(panRetour);

        fenetre.setLayout(grilleGlobale);
        fenetre.add(panListe, 0);

        fenetre.add(panBoutons, 1);

        panBouton1.setBackground(Color.LIGHT_GRAY);
        panBouton2.setBackground(Color.GRAY);


        fenetre.setVisible(true);


    }


    @Override

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == retour) {

            Interface menu = new Interface();
            fenetre.dispose();

        }

        if (e.getSource() == ajout) {


            InterfaceAjoutClient client = new InterfaceAjoutClient();


        }

        if (e.getSource() == ficheClient) {

            Client aClient = ficheInit((String) listeClients.getSelectedItem());
            InterfaceFicheClient interfaceFiche = new InterfaceFicheClient(aClient);
            this.setVisible(false);

        }


    }

    public static void ajoutClient(String nom, String prenom, String adresse, String telephone, String dateDeNaissance) {

        Client aClient = new Client(nom, prenom, dateDeNaissance, telephone, adresse);
        Client.ecrireClient(aClient);

    }

    public static void ajoutListe() {

        FilenameFilter filtre = new FilenameFilter() {
            @Override
            public boolean accept(File file, String s) {
                return s.endsWith(".xml");
            }
        };

        int i;
        File dossier = new File("./Client");
        File[] fichiersIencli = dossier.listFiles(filtre);
        for (i = 0; i < fichiersIencli.length; i++) {

            String[] tab = fichiersIencli[i].toString().split("/");
            String[] nomFichier = tab[2].split(".xml");
            String[] nomFichierh = nomFichier[0].split(" ");
            String nom = nomFichierh[1];
            String prenom = nomFichierh[0];
            client = prenom + " " + nom;
            locataire.add(client);
        }
        comboBoxInit();


    }

    private static void comboBoxInit() {


        listeClients.removeAllItems();

        for (String c : locataire) {


            listeClients.addItem(c);
        }
    }

    public static Client ficheInit(String personne) {

        Client leGars = null;
        try {
            FileInputStream fichier = new FileInputStream("./Client/" + personne + ".xml");
            XMLDecoder decoder = new XMLDecoder(fichier);
            leGars = (Client) decoder.readObject();
            decoder.close();
            fichier.close();
            return leGars;
        }

        catch(Exception e){
            System.out.println(e);
        }
        return leGars;
    }
}



