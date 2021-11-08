import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GUI extends JFrame {

    JButton b1 = new JButton("Show all");
    JButton b2 = new JButton("Clear");

    JTextArea display = new JTextArea();

    public GUI() {


//        GridBagLayout gridbag = new GridBagLayout();
//        GridBagConstraints constraints = new GridBagConstraints();
//        getContentPane().setLayout(gridbag);
//        constraints.fill = GridBagConstraints.HORIZONTAL;

        setSize(1000, 1000);

//        constraints.gridx = 0;
//        constraints.gridy = 0;
//        gridbag.setConstraints(b1, constraints);
        getContentPane().add(b1);

//        constraints.gridx = 1;
//        constraints.gridy = 1;
//        gridbag.setConstraints(display, constraints);
        getContentPane().add(display);

//        constraints.gridx = 3;
//        constraints.gridy = 0;
//        gridbag.setConstraints(b2, constraints);
        getContentPane().add(b2);

//        display.setSize(600, 600);


        setVisible(true);


    }


    public static void main(String[] args) {

        new GUI();
    }
}
