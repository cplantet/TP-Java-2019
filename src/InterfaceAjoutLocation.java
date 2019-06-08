import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class InterfaceAjoutLocation extends JFrame implements ActionListener{

    private JButton ajout ;
  private JButton info;
    private JFrame fenetreAjout;


    public InterfaceAjoutLocation() {

        fenetreAjout = new JFrame();
        fenetreAjout.setBounds(350, 100, 700, 500);
        fenetreAjout.setTitle("Ajout Location");

        fenetreAjout.setResizable(false);


    JComboBox<Vehicule> vehiculeJComboBox = new JComboBox<Vehicule>();
    JList<Client> clientJList=new JList<Client>();
     ajout = new JButton("Ajout");
     info = new JButton("Information");
    ajout.addActionListener(this);
    JList<Vehicule> vehiculeJList = new JList<Vehicule>();
    GridLayout grilleGlobale = new GridLayout(1,3);
    JPanel panglobal = new JPanel();
    panglobal.setSize(700,500);

    JPanel panListeClient = new JPanel();
    panListeClient.add(clientJList);
    panglobal.add(panListeClient);

    JPanel panvehicule = new JPanel();
    GridLayout grilleVehicule = new GridLayout(2,1);
    panvehicule.setLayout(grilleVehicule);
    panvehicule.add(vehiculeJComboBox);
        JPanel panListeVeh = new JPanel();
        panListeVeh.add(vehiculeJList);
        panglobal.add(panListeClient);
    panvehicule.add(panListeVeh);
    panglobal.add(panvehicule);

    JPanel panBouton = new JPanel();
    GridLayout grillebouton = new GridLayout(2,1);
    panBouton.setLayout(grillebouton);
    panBouton.add(ajout);
    panBouton.add(info);
    panglobal.add(panBouton);
fenetreAjout.add(panglobal);

        fenetreAjout.setVisible(true);




    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==ajout) {


            fenetreAjout.dispose();

        }
        if(e.getSource()==info){
            System.out.println("bouton info is ok");
        }

    }

}