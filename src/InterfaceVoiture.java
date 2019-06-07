import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class InterfaceVoiture extends JFrame implements ActionListener{

    private JButton retour;
    private JButton ajout;
    private JButton ficheVoiture;

    private JFrame fenetreV;


    public InterfaceVoiture(){

        fenetreV = new JFrame();
        fenetreV.setBounds(350, 100, 700, 500);
        fenetreV.setResizable(false);
        fenetreV.setTitle(" Voiture");


        ajout = new JButton("Ajouter Voiture");
        ajout.addActionListener(this);
        JButton ficheVoiture = new JButton("Fiche Voiture");

        retour = new JButton("Retour");
        retour.addActionListener(this);

        JPanel panBoutons = new JPanel();
        JPanel panBouton1 = new JPanel();
        JPanel panBouton2 = new JPanel();
        JPanel panListe = new JPanel();
        JPanel panRetour = new JPanel();



        panBouton1.setLayout(new FlowLayout(FlowLayout.CENTER,0,fenetreV.getHeight()/4 - ajout.getHeight()/2));

        panBouton2.setLayout(new FlowLayout(FlowLayout.CENTER, 0, fenetreV.getHeight()/4- ajout.getHeight()/2));

        //panListe.setLayout(new FlowLayout(FlowLayout.CENTER,0,fenetre.getHeight()/4 - ajout.getHeight()/2));


        panBouton1.add(ajout);
        panBouton2.add(ficheVoiture);

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

        fenetreV.setLayout(grilleGlobale);

        fenetreV.add(panListe,0);

        fenetreV.add(panBoutons,1);

        panBouton1.setBackground(Color.LIGHT_GRAY);
        panBouton2.setBackground(Color.DARK_GRAY);
        panListe.setBackground(Color.GRAY);
        panRetour.setBackground(Color.GRAY);

        fenetreV.setVisible(true);

    }


    @Override

    public void actionPerformed(ActionEvent e){

        if(e.getSource()==retour){
            InterfaceVehicule menu = new InterfaceVehicule();
            fenetreV.dispose();
        }

        if(e.getSource()==ajout){
            InterfaceAjoutVoiture intVoiture = new InterfaceAjoutVoiture();
            fenetreV.dispose();
        }
    }
}