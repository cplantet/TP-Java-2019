import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;


public class InterfaceClients extends JFrame implements ActionListener{

    private JButton retour;
    private JButton ajout;
    private JButton ficheClient;
    private static ArrayList<String> client;
    private static JComboBox listeClients;


    public InterfaceClients(){



        JFrame fenetre = new JFrame();
        fenetre.setBounds(350, 100, 700, 500);
        fenetre.setResizable(false);
        fenetre.setTitle(" Clients");
        client = new ArrayList();





        listeClients = new JComboBox(client.toArray());



        ajout = new JButton("Ajouter Client");
        ajout.addActionListener(this);
        JButton ficheClient = new JButton("Fiche Client");

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



        listeClients.setSize(100,20);
        panBouton1.add(ajout);
        panBouton2.add(ficheClient);

        GridLayout grilleGlobale = new GridLayout(1,2);
        GridLayout grilleBoutons = new GridLayout(2,1);

        panListe.setLayout(grilleListe);
        panRetour.add(retour);

        panBoutons.setLayout(grilleBoutons);
        panBoutons.add(panBouton1);
        panBoutons.add(panBouton2);

        panListe.add(listeClients);
        panListe.add(panRetour);

        fenetre.setLayout(grilleGlobale);
        fenetre.add(panListe,0);

        fenetre.add(panBoutons,1);

        panBouton1.setBackground(Color.LIGHT_GRAY);
        panBouton2.setBackground(Color.GRAY);

        fenetre.setVisible(true);





    }

    public static void main(String[] args) {
        InterfaceClients fenetreClients = new InterfaceClients();
    }

    @Override

    public void actionPerformed(ActionEvent e){

        if(e.getSource()==retour){

            Interface menu = new Interface();
            this.setVisible(false);

        }

        if(e.getSource()==ajout){


            InterfaceAjoutClient client = new InterfaceAjoutClient();


        }


    }

    public static Client ajoutClient(String nom,String prenom,String adresse,String telephone,String dateDeNaissance){

        Client aClient = new Client(nom, prenom, dateDeNaissance, telephone, adresse);

        return aClient;
    }

    public static void ajoutListe(Client aClient){

        String element = aClient.getPrenom()+" "+ aClient.getNom();

        InterfaceClients.client.add(element);

        comboBoxInit();


    }

    private static void comboBoxInit(){

        listeClients.removeAllItems();
        for (String c:client){


            listeClients.addItem(c);

        }


    }
}

