import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class InterfaceMoto  extends JFrame implements ActionListener {

    private float km;
    private int nbPlace;
    private float puissance;
    private float prixLoc;

    private JButton retour;
    private JButton ajout;
    private JButton ficheMoto;

    private JFrame fenetre;


    public InterfaceMoto(){

        fenetre = new JFrame();
        fenetre.setBounds(350, 100, 700, 500);
        fenetre.setResizable(false);
        fenetre.setTitle(" Avion");


        ajout = new JButton("Ajouter Moto");
        ajout.addActionListener(this);
        JButton ficheClient = new JButton("Fiche Moto");

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

        panBouton1.add(ajout);
        //   panBouton2.add(ficheAvion);

        GridLayout grilleGlobale = new GridLayout(1,2);
        GridLayout grilleBoutons = new GridLayout(2,1);

        panListe.setLayout(grilleListe);
        panRetour.add(retour);

        panBoutons.setLayout(grilleBoutons);
        panBoutons.add(panBouton1);
        panBoutons.add(panBouton2);



        fenetre.setLayout(grilleGlobale);
        fenetre.add(panListe,0);

        fenetre.add(panBoutons,1);

        panBouton1.setBackground(Color.LIGHT_GRAY);
        panBouton2.setBackground(Color.GRAY);

        fenetre.setVisible(true);





    }


    @Override

    public void actionPerformed(ActionEvent e){

        if(e.getSource()==retour){

            InterfaceVehicule menu = new InterfaceVehicule();
            fenetre.dispose();

        }
/*
        if(e.getSource()==ajout){


            InterfaceAjoutAvion avion = new InterfaceAjoutAvion();
            fenetre.dispose();

        }*/


    }



}
