import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;


public class InterfaceClients extends JFrame implements ActionListener{

    private JButton retour;
    private JButton ajout;
    private JButton ficheClient;
    private ArrayList<String> client;
    private JComboBox listeClients;
    private DefaultComboBoxModel model;

    public InterfaceClients(){



        JFrame fenetre = new JFrame();
        fenetre.setBounds(350, 100, 700, 500);
        fenetre.setResizable(false);
        fenetre.setTitle(" Clients");
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        client = new ArrayList();
        client.add("Michel");


        model = modelInit();

        listeClients = new JComboBox(client.toArray());
        listeClients.setModel(model);

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
            this.setVisible(false);
            Interface menu = new Interface();

        }

        if(e.getSource()==ajout){
            this.setVisible(false);
            InterfaceAjoutClient client = new InterfaceAjoutClient();

        }


    }

    public void ajoutClient(String aClient){
        client.add(aClient);
    }

    private DefaultComboBoxModel modelInit(){
        DefaultComboBoxModel m = new DefaultComboBoxModel();
        for (String c:client){
            m.addElement(c);

        }
        return m;

    }
}

