import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.EventObject;

public class InterfaceAjoutLocationAvance extends JFrame implements ActionListener {

    private JButton ajout;
    private JButton annuler;
    private JComboBox vehiculeJComboBox;
    private JTextField dateDebut;
    private JTextField dateFin;
    private JFrame fenetre;

    public InterfaceAjoutLocationAvance() {
        fenetre = new JFrame();
        vehiculeJComboBox = new JComboBox();

        ajout = new JButton("Ajouter");
        ajout.addActionListener(this);

        JLabel dateDebut1 = new JLabel("dateDebut");
        JLabel dateFin1 = new JLabel("dateFin");
        JPanel panAjout = new JPanel();

        dateDebut = new JTextField();
        dateFin = new JTextField();

        annuler = new JButton("Annuler");
        annuler.addActionListener(this);

        GridLayout grilleInfos = new GridLayout(3, 2);
        panAjout.setLayout(grilleInfos);

        panAjout.setLayout(grilleInfos);


        panAjout.add(dateDebut1);
        panAjout.add(dateDebut);
        panAjout.add(dateFin1);
        panAjout.add(dateFin);
        panAjout.add(annuler);
        panAjout.add(ajout);
        fenetre.add(vehiculeJComboBox);
        fenetre.add(panAjout);
        fenetre.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ajout) {
            fenetre.dispose();
            InterfaceLocation interloc = new InterfaceLocation();


        }
        if (e.getSource() == annuler) {
            InterfaceAjoutLocation intajoutloc = new InterfaceAjoutLocation();
            fenetre.dispose();


        }
    }
}

