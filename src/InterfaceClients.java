import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InterfaceClients extends JFrame{

    public InterfaceClients(){

        JFrame fenetre = new JFrame();
        fenetre.setBounds(350, 100, 700, 500);
        fenetre.setResizable(false);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setVisible(true);

    }

    public static void main(String[] args) {
        InterfaceClients fenetreClients = new InterfaceClients();
    }

}