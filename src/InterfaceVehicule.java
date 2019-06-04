import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InterfaceVehicule extends Interface implements ActionListener {

    private JButton avion;
    private JButton voiture;
    private JButton moto;

    public InterfaceVehicule(){

        JFrame fenetre = new JFrame();
        fenetre.setBounds(500, 10, 700, 500);
        fenetre.setTitle("Véhicule");
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setLocationRelativeTo(null);
        fenetre.setResizable(false);

        JPanel panAvion =new JPanel();
        JPanel panVoiture = new JPanel();
        JPanel panMoto = new JPanel();

        avion = new JButton("Avion");
        voiture = new JButton("Voiture");
        moto = new JButton("Moto");

        //panAvion.setLayout(new FlowLayout(FlowLayout.CENTER,0,fenetre.getHeight()/3 - avion.getHeight()/2));
        //panVoiture.setLayout(new FlowLayout(FlowLayout.CENTER,0,fenetre.getHeight()/3 - voiture.getHeight()/2));
        //panMoto.setLayout(new FlowLayout(FlowLayout.CENTER,0,fenetre.getHeight()/3 - moto.getHeight()/2));

        panAvion.add(avion);
        panVoiture.add(voiture);
        panMoto.add(moto);


        GridLayout grilleVehicule = new GridLayout(3,1);

        fenetre.setLayout(grilleVehicule);
        fenetre.add(panAvion);
        fenetre.add(panVoiture);
        fenetre.add(panMoto);

        fenetre.setVisible(true);




    }
    public void actionPerformed(ActionEvent e){

        if(e.getSource()==avion){
            InterfaceAvion fenetreAvion = new InterfaceAvion();
            this.dispose();
        }
    }

}
