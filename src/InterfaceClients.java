import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.beans.XMLDecoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.util.ArrayList;


public class InterfaceClients extends JFrame implements ActionListener{

    private JButton retour;
    private JButton ajout;
    private JButton ficheClient;
    private static ArrayList<String> client;
    private static JComboBox listeClients;
    private static String man;
    private JFrame fenetre;

    public InterfaceClients(){



       fenetre = new JFrame();
        fenetre.setBounds(350, 100, 700, 300);
        fenetre.setResizable(false);
        fenetre.setTitle(" Clients");
        client = new ArrayList();





        listeClients = new JComboBox();
        listeClients.addActionListener(this);
        ajoutListeClient();



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


        GridLayout grilleListe = new GridLayout(4,1);

        panListe.setLayout(grilleListe);
        panListe.add(listeClients);
        panListe.add(ficheClient);
        panListe.add(ajout);
        panListe.add(retour);

        ficheClient.setBackground(Color.white);
        ficheClient.setForeground(Color.black);
        ajout.setBackground(Color.white);
        ajout.setForeground(Color.black);
        retour.setBackground(Color.white.darker());
        retour.setForeground(Color.black);

        fenetre.add(panListe);
        fenetre.setVisible(true);





    }

    public static void main(String[] args) {
        InterfaceClients fenetreClients = new InterfaceClients();
    }

    @Override

    public void actionPerformed(ActionEvent e){

        if(e.getSource()==retour){

            Interface menu = new Interface();
            this.fenetre.dispose();

        }

        if(e.getSource()==ajout){


            InterfaceAjoutClient client = new InterfaceAjoutClient();
            this.fenetre.dispose();


        }
        if(e.getSource()==ficheClient){

            InterfaceFicheClient interfaceFiche = new InterfaceFicheClient(ficheInit((String)listeClients.getSelectedItem()));


        }




    }

    public static void ajoutClient(String nom,String prenom,String adresse,String telephone,String dateDeNaissance){

        Client aClient = new Client(nom, prenom, dateDeNaissance, telephone, adresse);

        Client.ecrireClient(aClient);
    }

    public static void ajoutListeClient(){

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
            System.out.println(man);

            client.add(man);
        }

        comboBoxInit();


    }
    private static void comboBoxInit(){
        listeClients.removeAllItems();
        for (String c:client){


            listeClients.addItem(c);

        }


    }

    public static Client ficheInit(String client) {

        Client mec = null;
        try {
            FileInputStream fichier = new FileInputStream("./Client/" + client + ".xml");
            XMLDecoder decoder = new XMLDecoder(fichier);
            mec = (Client) decoder.readObject();
            decoder.close();
            fichier.close();

        }

        catch(Exception e){
            System.out.println(e);
        }
        return mec;
    }
}


