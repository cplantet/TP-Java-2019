import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InterfaceClients extends JFrame{

    public InterfaceClients(){

        JFrame fenetre = new JFrame();
        fenetre.setBounds(350, 100, 700, 500);
        fenetre.setResizable(false);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String [] tab = {"---"};


        JComboBox listeClients = new JComboBox(tab);
        JButton ajout = new JButton("Ajouter Client");
        JButton ficheClient = new JButton("Fiche Client");
        JPanel panBoutons = new JPanel();
        JPanel panBouton1 = new JPanel();
        JPanel panBouton2 = new JPanel();
        JPanel panListe = new JPanel();

        GridLayout grilleListe = new GridLayout(11,1);


        panBouton1.setLayout(new FlowLayout(FlowLayout.CENTER,0,fenetre.getHeight()/4 - ajout.getHeight()/2));
        panBouton2.setLayout(new FlowLayout(FlowLayout.CENTER, 0, fenetre.getHeight()/4- ajout.getHeight()/2));

        panListe.setLayout(new FlowLayout(FlowLayout.CENTER,0,fenetre.getHeight()/4 - ajout.getHeight()/2));

        listeClients.setSize(100,20);
        panBouton1.add(ajout);
        panBouton2.add(ficheClient);

        GridLayout grilleGlobale = new GridLayout(1,2);
        GridLayout grilleBoutons = new GridLayout(2,1);

        panListe.setLayout(grilleListe);

        panBoutons.setLayout(grilleBoutons);
        panBoutons.add(panBouton1);
        panBoutons.add(panBouton2);
        panListe.add(listeClients);

        fenetre.setLayout(grilleGlobale);
        fenetre.add(panListe,0);
        fenetre.add(panBoutons,1);

        panBouton1.setBackground(Color.RED);
        panBouton2.setBackground(Color.BLUE);

        fenetre.setVisible(true);





    }

    public static void main(String[] args) {
        InterfaceClients fenetreClients = new InterfaceClients();
    }

}