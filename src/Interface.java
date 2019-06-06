import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Interface extends JFrame implements ActionListener{//KeyListener{

    private JButton bout1;
    private JButton bout2;
    private JButton bout3;

    public Interface() {


        //JFrame fenetre = new JFrame();
        this.setBounds(500, 10, 500, 200);
        this.setTitle("Location de Véhicules");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

// Panel Texte
/*
        JPanel txt1 = new JPanel();
        txt1.setLayout(new BoxLayout(txt1, BoxLayout.LINE_AXIS));
        txt1.add(new JLabel("Ajouter / Rechercher"));
*/
// Panel Boutons

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


        b1.add(bout1);
        b2.add(bout2);
        b3.add(bout3);

        GridLayout grille = new GridLayout(3,1);
        boutons.setLayout(grille);

        b1.setBackground(Color.GRAY);
        b2.setBackground(Color.LIGHT_GRAY);
        b3.setBackground(Color.GRAY);

        boutons.add(b1);
        boutons.add(b2);
        boutons.add(b3);




// Panel Global


        JPanel global = new JPanel();
        global.setLayout(new BoxLayout(global, BoxLayout.PAGE_AXIS));
       // global.add(txt1);
        global.add(boutons);

        this.getContentPane().add(global);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        Interface accueil = new Interface();

    }

    @Override

    public void actionPerformed(ActionEvent e){

        if(e.getSource()==bout1){
            InterfaceClients fenetreClient = new InterfaceClients();
            this.dispose();
        }

        if(e.getSource()==bout2){
            InterfaceVehicule fenetreVehicule = new InterfaceVehicule();
            this.dispose();

        }
    }
}
