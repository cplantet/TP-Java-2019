import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class InterfaceLocation extends JFrame implements ActionListener{

    private JButton retour;
    private JButton ajout;
    private JButton ficheLocation;

    private JFrame fenetreL;


    public InterfaceLocation(){

        fenetreL = new JFrame();
        fenetreL.setBounds(350, 100, 700, 500);
        fenetreL.setResizable(false);
        fenetreL.setTitle("Location");


        ajout = new JButton("Ajouter Location");
        ajout.addActionListener(this);
        JButton ficheLocation = new JButton("Fiche Location");

        retour = new JButton("Retour");
        retour.addActionListener(this);

        JPanel panBoutons = new JPanel();
        JPanel panBouton1 = new JPanel();
        JPanel panBouton2 = new JPanel();
        JPanel panListe = new JPanel();
        JPanel panRetour = new JPanel();



        panBouton1.setLayout(new FlowLayout(FlowLayout.CENTER,0,fenetreL.getHeight()/4 - ajout.getHeight()/2));

        panBouton2.setLayout(new FlowLayout(FlowLayout.CENTER, 0, fenetreL.getHeight()/4- ajout.getHeight()/2));

        //panListe.setLayout(new FlowLayout(FlowLayout.CENTER,0,fenetre.getHeight()/4 - ajout.getHeight()/2));


        panBouton1.add(ajout);
        panBouton2.add(ficheLocation);

        GridLayout grilleListe = new GridLayout(11,1);

        panListe.setLayout(grilleListe);

        panRetour.add(retour);
        panRetour.setBackground(Color.GRAY);
        panListe.add(panRetour);

        GridLayout grilleBoutons = new GridLayout(2,1);

        panBoutons.setLayout(grilleBoutons);
        panBoutons.add(panBouton1);
        panBoutons.add(panBouton2);






        GridLayout grilleGlobale = new GridLayout(1,2);

        fenetreL.setLayout(grilleGlobale);

        fenetreL.add(panListe,0);

        fenetreL.add(panBoutons,1);

        panBouton1.setBackground(Color.LIGHT_GRAY);
        panBouton2.setBackground(Color.DARK_GRAY);
        panListe.setBackground(Color.GRAY);
        panRetour.setBackground(Color.GRAY);

        fenetreL.setVisible(true);

    }


    @Override

    public void actionPerformed(ActionEvent e){

        if(e.getSource()==retour){
            Interface menu = new Interface();
            fenetreL.dispose();
        }

        if(e.getSource()==ajout){
            InterfaceAjoutLocation intLocation = new InterfaceAjoutLocation();
            fenetreL.dispose();
        }
    }
}