import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener {

    JButton b1 = new JButton("Show all");
    JButton b2 = new JButton("Clear");

    JTextArea display = new JTextArea();


    public GUI() {
        GridBagLayout gridbag = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();
        getContentPane().setLayout(gridbag);
        constraints.fill = GridBagConstraints.HORIZONTAL;

        constraints.gridx = 0;
        constraints.gridy = 0;
        gridbag.setConstraints(b1, constraints);
        getContentPane().add(b1);

        constraints.gridx = 1;
        constraints.gridy = 1;
        gridbag.setConstraints(b2, constraints);
        getContentPane().add(b2);

        constraints.gridx = 2;
        constraints.gridy = 0;
        gridbag.setConstraints(display, constraints);
        getContentPane().add(display);

        b1.addActionListener(this);
        b2.addActionListener(this);

        setVisible(true);
        pack();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
