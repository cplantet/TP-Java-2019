import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class InterfaceMoto  extends JFrame implements ActionListener {

    private JButton retour;
    private JButton ajout;
    private JButton ficheMoto;

    private JFrame fenetre;
    private static ArrayList<String> moto;
    private static JComboBox listeMoto;


    public InterfaceMoto(){

        fenetre = new JFrame();
        fenetre.setBounds(350, 100, 700, 400);
        fenetre.setResizable(false);
        fenetre.setTitle(" Avion");


        ajout = new JButton("Ajouter Moto");
        ajout.addActionListener(this);
        JButton ficheMoto = new JButton("Fiche Moto");

        moto = new ArrayList();
        listeMoto = new JComboBox(moto.toArray());

        retour = new JButton("Retour");
        retour.addActionListener(this);

        JPanel panListe = new JPanel();


        GridLayout grilleListe = new GridLayout(4,1);

        listeMoto.setSize(100,20);

        panListe.setLayout(grilleListe);

        panListe.add(listeMoto);
        panListe.add(ficheMoto);
        panListe.add(ajout);

        panListe.add(retour);

        ficheMoto.setBackground(Color.white);
        ficheMoto.setForeground(Color.black);
        ajout.setBackground(Color.white);
        ajout.setForeground(Color.black);
        retour.setBackground(Color.white.darker());
        retour.setForeground(Color.black);

        fenetre.add(panListe);
        fenetre.setVisible(true);


    }


    @Override

    public void actionPerformed(ActionEvent e){

        if(e.getSource()==retour){

            InterfaceVehicule menu = new InterfaceVehicule();
            fenetre.dispose();

        }

        if(e.getSource()==ajout){

            InterfaceAjoutMoto aMoto = new InterfaceAjoutMoto();
            fenetre.dispose();

        }
        /*
        if(e.getSource()==ficheMoto){

            InterfaceFicheMoto fMoto= new InterfaceFicheMoto(MotoInit((String)listeClients.getSelectedItem()));
        }
*/

    }



}
