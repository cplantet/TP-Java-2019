import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InterfaceVehicule extends JFrame implements ActionListener {

    private JButton avion;
    private JButton voiture;
    private JButton moto;
    private JButton menu;
    private JFrame fenetre;

    public InterfaceVehicule(){

        fenetre = new JFrame();
        fenetre.setBounds(500, 10, 700, 500);
        fenetre.setTitle("Véhicule");
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setLocationRelativeTo(null);
        fenetre.setResizable(false);

        JPanel panAvion =new JPanel();
        JPanel panVoiture = new JPanel();
        JPanel panMoto = new JPanel();
        JPanel panMenu = new JPanel();

        avion = new JButton("Avion");
        avion.addActionListener(this);
        voiture = new JButton("Voiture");
        voiture.addActionListener(this);
        moto = new JButton("Moto");
        moto.addActionListener(this);

        menu = new JButton("Retour");
        menu.addActionListener(this);

        //panAvion.setLayout(new FlowLayout(FlowLayout.CENTER,0,fenetre.getHeight()/3 - avion.getHeight()/2));
        //panVoiture.setLayout(new FlowLayout(FlowLayout.CENTER,0,fenetre.getHeight()/3 - voiture.getHeight()/2));
        //panMoto.setLayout(new FlowLayout(FlowLayout.CENTER,0,fenetre.getHeight()/3 - moto.getHeight()/2));

        panAvion.add(avion);
        panVoiture.add(voiture);
        panMoto.add(moto);
        panMenu.add(menu);


        GridLayout grilleVehicule = new GridLayout(4,1);

        fenetre.setLayout(grilleVehicule);
        fenetre.add(panAvion);
        fenetre.add(panVoiture);
        fenetre.add(panMoto);
        fenetre.add(panMenu);

        fenetre.setVisible(true);




    }


    public void actionPerformed(ActionEvent e){

        if(e.getSource()==avion){

            InterfaceAvion fenetreAvion = new InterfaceAvion();
            fenetre.dispose();
        }
        if(e.getSource()==menu){
            Interface fenetreInt = new Interface();

            this.fenetre.dispose();
        }

        if(e.getSource()==moto){
            InterfaceMoto fenetreMoto = new InterfaceMoto();

            this.fenetre.dispose();
        }
    }

}
