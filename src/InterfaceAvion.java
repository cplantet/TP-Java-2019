import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;


public class InterfaceAvion extends JFrame implements ActionListener{

    private JButton retour;
    private JButton ajout;
    private JButton ficheAvion;
    private ArrayList avion;
    private JComboBox listeAvions;

    public InterfaceAvion(){

        JFrame fenetre = new JFrame();
        fenetre.setBounds(350, 100, 700, 500);
        fenetre.setResizable(false);
        fenetre.setTitle(" Avion");
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        avion = new ArrayList();



        listeAvions = new JComboBox(avion.toArray());
        ajout = new JButton("Ajouter Avion");
        ajout.addActionListener(this);
        JButton ficheClient = new JButton("Fiche Avion");

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
     //   panBouton2.add(ficheAvion);

        GridLayout grilleGlobale = new GridLayout(1,2);
        GridLayout grilleBoutons = new GridLayout(2,1);

        panListe.setLayout(grilleListe);
        panRetour.add(retour);

        panBoutons.setLayout(grilleBoutons);
        panBoutons.add(panBouton1);
        panBoutons.add(panBouton2);

        panListe.add(listeAvions);
        panListe.add(panRetour);

        fenetre.setLayout(grilleGlobale);
        fenetre.add(panListe,0);

        fenetre.add(panBoutons,1);

        panBouton1.setBackground(Color.LIGHT_GRAY);
        panBouton2.setBackground(Color.GRAY);

        fenetre.setVisible(true);





    }

    public static void main(String[] args) {
        InterfaceAvion fenetreAvion = new InterfaceAvion();
    }

    @Override

    public void actionPerformed(ActionEvent e){

        if(e.getSource()==retour){
            this.dispose();
            Interface menu = new Interface();

        }

        if(e.getSource()==ajout){

            InterfaceAjoutAvion avion = new InterfaceAjoutAvion();
            this.dispose();
        }


    }

    public void ajoutAvion(Avion aAvion){
        avion.add(aAvion);

    }
}

