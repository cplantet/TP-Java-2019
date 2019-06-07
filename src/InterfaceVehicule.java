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

        //panAvion.setLayout(new FlowLayout(FlowLayout.CENTER,0,fenetre.getHeight()/3 - avion.getHeight()/2));
        //panVoiture.setLayout(new FlowLayout(FlowLayout.CENTER,0,fenetre.getHeight()/3 - voiture.getHeight()/2));
        //panMoto.setLayout(new FlowLayout(FlowLayout.CENTER,0,fenetre.getHeight()/3 - moto.getHeight()/2));
/*
        avion.setBackground(Color.GRAY);
        voiture.setBackground(Color.LIGHT_GRAY);
        moto.setBackground(Color.GRAY);
        menu.setBackground(Color.LIGHT_GRAY);
*/
        panAvion.setBackground(Color.GRAY);
        panVoit.setBackground(Color.LIGHT_GRAY);
        panMoto.setBackground(Color.GRAY);
        panMenu.setBackground(Color.LIGHT_GRAY);

        panAvion.add(avion);
        panVoit.add(voit);
        panMoto.add(moto);
        panMenu.add(menu);

        GridLayout grilleVehicule = new GridLayout(4,1);

        fenetre.setLayout(grilleVehicule);
        fenetre.add(panAvion);
        fenetre.add(panVoit);
        fenetre.add(panMoto);
        fenetre.add(panMenu);

        fenetre.setVisible(true);


    }


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
