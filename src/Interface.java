import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Interface extends JFrame {//implements ActionListener, KeyListener{

    public Interface() {

        //JFrame fenetre = new JFrame();
        this.setBounds(500, 10, 500, 250);
        this.setTitle("Location de Véhicules");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);


        JPanel txt1 = new JPanel();
        txt1.setLayout(new BoxLayout(txt1, BoxLayout.LINE_AXIS));
        txt1.add(new JLabel("Location Véhicule"));

        JPanel boutons = new JPanel();

        boutons.setLayout(new BoxLayout(boutons, BoxLayout.LINE_AXIS));
        boutons.add(new JButton("Clients"));
        boutons.add(new JButton("Véhicules"));


        JPanel global = new JPanel();
        global.setLayout(new BoxLayout(global, BoxLayout.PAGE_AXIS));
        global.add(txt1);
        global.add(boutons);

        this.getContentPane().add(global);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        Interface accueil = new Interface();
    }
}
