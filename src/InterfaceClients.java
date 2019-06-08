import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.beans.XMLDecoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.util.ArrayList;


public class InterfaceClients extends JFrame implements ActionListener{

    private JFrame fenetre;
    private JButton retour;
    private JButton ajout;
    private JButton modifier;
    private JButton ficheClient;
    public static ArrayList<String> client;
    public static JComboBox listeClients;
    private static String man;


    public InterfaceClients(){



        fenetre = new JFrame();
        fenetre.setBounds(350, 100, 700, 500);
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

        modifier = new JButton("Modifier");
        modifier.addActionListener(this);


        listeClients.setSize(100,20);
        JPanel panListe = new JPanel();


        GridLayout grilleListe = new GridLayout(5,1);

        listeClients.setSize(100,20);

        panListe.setLayout(grilleListe);

        panListe.add(listeClients);
        panListe.add(ficheClient);
        panListe.add(ajout);
        panListe.add(modifier);

        panListe.add(retour);

        ficheClient.setBackground(Color.white);
        ficheClient.setForeground(Color.black);
        ajout.setBackground(Color.white);
        ajout.setForeground(Color.black);
        modifier.setBackground(Color.white);
        modifier.setForeground(Color.black);
        retour.setBackground(Color.white.darker());
        retour.setForeground(Color.black);

        fenetre.add(panListe);
        fenetre.setVisible(true);


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


        }
        if(e.getSource()==ficheClient){

            InterfaceFicheClient interfaceFiche = new InterfaceFicheClient(ficheInit((String)listeClients.getSelectedItem()));


        }

        if(e.getSource()==modifier){


            InterfaceModifierClient client = new InterfaceModifierClient(ficheInit((String)listeClients.getSelectedItem()));


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


