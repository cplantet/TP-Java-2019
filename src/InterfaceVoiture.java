import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.beans.XMLDecoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.util.ArrayList;

public class InterfaceVoiture extends JFrame implements ActionListener{

    private JButton retour;
    private JButton ajout;
    private JButton ficheVoiture;
    private static ArrayList<String> voiture;
    private static JComboBox listeVoiture;
    private static String chaineVoiture;

    private JFrame fenetreV;


    public InterfaceVoiture(){

        fenetreV = new JFrame();
        fenetreV.setBounds(350, 100, 700, 500);
        fenetreV.setResizable(false);
        fenetreV.setTitle(" Voiture");
        voiture = new ArrayList<>();

        listeVoiture = new JComboBox();
        listeVoiture.setSize(100,20);
        listeVoiture.addActionListener(this);
        ajoutListeVoiture();

        ajout = new JButton("Ajouter Voiture");
        ajout.addActionListener(this);

        ficheVoiture = new JButton("Fiche Voiture");
        ficheVoiture.addActionListener(this);

        retour = new JButton("Retour");
        retour.addActionListener(this);

        JPanel panListe = new JPanel();



        GridLayout grilleListe = new GridLayout(11,1);

        panListe.setLayout(grilleListe);
        panListe.add(ficheVoiture);
        panListe.add(ajout);
        panListe.add(retour);

        ficheVoiture.setBackground(Color.white);
        ficheVoiture.setForeground(Color.black);
        ajout.setBackground(Color.white);
        ajout.setForeground(Color.black);
        retour.setBackground(Color.white.darker());
        retour.setForeground(Color.black);

        fenetreV.add(panListe);

        panListe.setBackground(Color.GRAY);

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