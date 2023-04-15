package cz.czechitas.ukol6;


import com.formdev.flatlaf.FlatLightLaf;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Aplikace extends JFrame {

    public static void main(String[] args) {
        FlatLightLaf.setup();
        new Aplikace().start();
    }

    public Aplikace() throws HeadlessException {
        super("Farmářka 1.0");
        this.init();
    }

    public void start() {
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void init() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setIconImage(new ImageIcon(Aplikace.class.getResource("czechitas-icon.png")).getImage());
        setLayout(new MigLayout("wrap 2", "[right]rel[50:120:150,grow,fill]"));
        setMinimumSize(new Dimension(250, 200));

        //Husy:
        JLabel husyLabel = new JLabel("Husy");
        add(husyLabel);

        JTextField husyField = new JTextField();
        add(husyField);

        //Králici:
        JLabel kraliciLabel = new JLabel("Králíci");
        add(kraliciLabel);

        JTextField kraliciField = new JTextField();
        add(kraliciField);

        JLabel mezeraPredVypocitat = new JLabel(" ");
        add(mezeraPredVypocitat);

        //Vypočítat:

        JButton vypocitatButton = new JButton("Vypočítat");
        add(vypocitatButton);


        //Výsledek hlavy:
        JLabel hlavyLabel = new JLabel("Počet hlav");
        add(hlavyLabel);

        JTextField hlavyField = new JTextField();
        add(hlavyField);
        hlavyField.setEditable(false);


        //Výsledek nohy:
        JLabel nohyLabel = new JLabel("Počet nohou");
        add(nohyLabel);

        JTextField nohyField = new JTextField();
        add(nohyField);
        nohyField.setEditable(false);

        vypocitatButton.addActionListener(e ->

        int pocetHlav = Integer.parseInt(husyField.getText()) + Integer.parseInt(kraliciField.getText());

        hlavyField.setText(Integer.toString(pocetHlav));

        int pocetNohou = Integer.parseInt(husyField.getText()) * 2 + Integer.parseInt(kraliciField.getText()) * 4;

        nohyField.setText((Integer.toString(pocetNohou)));
        );
        pack();


    }


}
