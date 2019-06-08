import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InterfaceVehicule extends JFrame implements ActionListener {

    private JButton avion;
    private JButton voit;
    private JButton moto;
    private JButton menu;
    private JFrame fenetre;

    public InterfaceVehicule(){

        fenetre = new JFrame();
        fenetre.setBounds(500, 10, 500, 300);
        fenetre.setTitle("Véhicule");
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setLocationRelativeTo(null);
        fenetre.setResizable(false);

        JPanel panAvion =new JPanel();
        JPanel panVoit = new JPanel();
        JPanel panMoto = new JPanel();
        JPanel panMenu = new JPanel();

        avion = new JButton("Avion");
        avion.addActionListener(this);
        voit = new JButton("Voiture");
        voit.addActionListener(this);
        moto = new JButton("Moto");
        moto.addActionListener(this);

        menu = new JButton("Retour");
        menu.addActionListener(this);

        avion.setBackground(Color.white);
        voit.setBackground(Color.white);
        moto.setBackground(Color.white.brighter());
        menu.setBackground(Color.WHITE.darker());

        avion.setForeground(Color.black);
        voit.setForeground(Color.black);
        moto.setForeground(Color.black);
        menu.setForeground(Color.black);


        panAvion.setBackground(Color.GRAY);
        panVoit.setBackground(Color.LIGHT_GRAY);
        panMoto.setBackground(Color.GRAY);
        panMenu.setBackground(Color.BLUE.brighter());

        GridLayout grilleVehicule = new GridLayout(4,1);

        fenetre.setLayout(grilleVehicule);
        fenetre.add(avion);
        fenetre.add(voit);
        fenetre.add(moto);
        fenetre.add(menu);

        fenetre.setVisible(true);


    }

    /**
     * En fonction des boutons cliqués, on fait une action diffrente.
     * menu : on ferme la fenêtre et on ouvre une nouvelle fenêtre Interface().
     *voiture : on ferme la fenêtre et on ouvre une nouvelle fenêtre de InterfaceVoiture().
     * moto : on ferme la fenêtre et on ouvre une nouvelle fenêtre de InterfaceMoto().
     * avion : on ferme la fenêtre et on ouvre une nouvelle fenêtre de InterfaceAvion().
     */
    public void actionPerformed(ActionEvent e){

        if(e.getSource()==avion){
            InterfaceAvion fenetreAvion = new InterfaceAvion();
            fenetre.dispose();
        }
        else if(e.getSource()==menu){
            Interface fenetreInt = new Interface();

            this.fenetre.dispose();
        }
        else
        if(e.getSource()==moto){
            InterfaceMoto fenetreMoto = new InterfaceMoto();

            this.fenetre.dispose();
        }
        else if(e.getSource()==voit){
            System.out.println("rentrer");
            InterfaceVoiture fenetreVoiture = new InterfaceVoiture();
            System.out.println("fenetre créer");
            this.fenetre.dispose();
        }
    }

}
