import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class InterfaceAvion extends JFrame implements ActionListener{

    private JButton retour;
    private JButton ajout;
    private JButton ficheAvion;
    private static JComboBox listeAvions;
    private JFrame fenetre;

    private static ArrayList<Avion> avion;
    private DefaultComboBoxModel model;

    public InterfaceAvion(){

        fenetre = new JFrame();
        fenetre.setBounds(350, 100, 700, 500);
        fenetre.setResizable(false);
        fenetre.setTitle(" Avion");
        avion = new ArrayList();

        listeAvions = new JComboBox(avion.toArray());
        comboBoxInit();

        ajout = new JButton("Ajouter Avion");
        ajout.addActionListener(this);
        JButton ficheAvion = new JButton("Fiche Avion");

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

        listeAvions.setSize(100,20);
        panBouton1.add(ajout);
        panBouton2.add(ficheAvion);

        GridLayout grilleGlobale = new GridLayout(1,2);
        GridLayout grilleBoutons = new GridLayout(2,1);

        panListe.setLayout(grilleListe);
        panRetour.add(retour);
        panRetour.setBackground(Color.GRAY);
        panBoutons.setLayout(grilleBoutons);
        panBoutons.add(panBouton1);
        panBoutons.add(panBouton2);

        panListe.add(listeAvions);
        panListe.add(panRetour);

        fenetre.setLayout(grilleGlobale);
        fenetre.add(panListe,0);

        fenetre.add(panBoutons,1);

        panBouton1.setBackground(Color.LIGHT_GRAY);
        panBouton2.setBackground(Color.DARK_GRAY);
        panListe.setBackground(Color.GRAY);

        fenetre.setVisible(true);

    }


    @Override

    public void actionPerformed(ActionEvent e){

        if(e.getSource()==retour){
            InterfaceVehicule menu = new InterfaceVehicule();
            fenetre.dispose();
        }

        if(e.getSource()==ajout){
            InterfaceAjoutAvion avion = new InterfaceAjoutAvion();
            fenetre.dispose();
        }
    }


    public static void ajoutListe(Avion aAvion){

        InterfaceAvion.avion.add(aAvion);
        comboBoxInit();
    }

    private static void comboBoxInit(){

        listeAvions.removeAllItems();
        for (Avion c:avion){
            listeAvions.addItem(c);
        }
    }
}