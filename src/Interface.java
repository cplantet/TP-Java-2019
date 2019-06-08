import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;


public class Interface extends JFrame implements ActionListener{//KeyListener{

    private JButton bout1;
    private JButton bout2;
    private JButton bout3;

    /**
     * Constructeur de l'interface principale.
     * Elle permet d'afficher les differents boutons qui accèdent à :
     * interfaceClient
     * InterfaceVehicule
     * InterfaceLocation

     */
    public Interface() {


        //JFrame fenetre = new JFrame();
        this.setBounds(500, 10, 800, 150);
        this.setTitle("Location de Véhicules");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel boutons = new JPanel();

        boutons.setLayout(new BoxLayout(boutons, BoxLayout.LINE_AXIS));


        JPanel b1 = new JPanel();
        JPanel b2 = new JPanel();
        JPanel b3 = new JPanel();

        bout1 = new JButton("Gérer les clients");
        bout1.addActionListener(this);

        bout2 = new JButton("Gérer les Véhicules");
        bout2.addActionListener(this);

        bout3 = new JButton("Gérer les Locations");
        bout3.addActionListener(this);
    bout1.setForeground(Color.black);
        bout2.setForeground(Color.black);
        bout3.setForeground(Color.black);

        GridLayout grille = new GridLayout(1,3);
        boutons.setLayout(grille);

        bout1.setBackground(Color.white);
        bout2.setBackground(Color.white);
        bout3.setBackground(Color.white);
        boutons.add(bout1);

        boutons.add(bout3);
        boutons.add(bout2);

        JPanel global = new JPanel();
        global.setLayout(new BoxLayout(global, BoxLayout.PAGE_AXIS));
       // global.add(txt1);
        global.add(boutons);

        this.getContentPane().add(global);

        this.setVisible(true);
    }

    public static void main(String[] args) {

        File dossClient = new File("./Client/");
        File dossVehicule = new File("./Vehicule/");
        File dossAvion = new File("./Vehicule/Avion/");
        File dossMoto = new File("./Vehicule/Moto/");
        File dossVoiture = new File("./Vehicule/Voiture/");
        File dossLocation = new File("./Location/");

        dossClient.mkdirs();
        dossVehicule.mkdirs();
        dossAvion.mkdirs();
        dossMoto.mkdirs();
        dossVoiture.mkdirs();
        dossLocation.mkdirs();

        Interface accueil = new Interface();

    }

    @Override
/**
 * Procédure de ActionListener qui permet de
 * ouvrir une interface InterfaceClient si on clique sur le bouton client (bout1)
 * ouvrir une interface InterfaceVehicule si on clique sur le bouton vehicule (bout2)
 * ouvrir une interface InterfaceLocation si on clique sur le bouton location (bout3)
 */
    public void actionPerformed(ActionEvent e){

        if(e.getSource()==bout1){
            InterfaceClients fenetreClient = new InterfaceClients();
            this.dispose();
        }

        if(e.getSource()==bout2){
            InterfaceVehicule fenetreVehicule = new InterfaceVehicule();
            this.dispose();

        }
        if(e.getSource()==bout3){
            InterfaceLocation fenetreLocation = new InterfaceLocation();
            this.dispose();
        }
    }
}
