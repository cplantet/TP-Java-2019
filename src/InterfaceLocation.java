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

        JPanel panListe = new JPanel();


        GridLayout grilleListe = new GridLayout(4,1);

        panListe.setLayout(grilleListe);
        //panListe.add(listeLocation);
        panListe.add(ficheLocation);
        panListe.add(ajout);
        panListe.add(retour);

        ficheLocation.setBackground(Color.white);
        ficheLocation.setForeground(Color.black);
        ajout.setBackground(Color.white);
        ajout.setForeground(Color.black);
        retour.setBackground(Color.white.darker());
        retour.setForeground(Color.black);
        fenetreL.add(panListe);


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