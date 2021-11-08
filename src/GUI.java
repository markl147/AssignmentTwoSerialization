import javax.swing.*;

public class GUI extends JFrame {

    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JButton b1 = new JButton("Show all");
    JButton b2 = new JButton("Clear");
    JTextArea display = new JTextArea();

    public GUI() {

        panel.setBorder(BorderFactory.createEmptyBorder(25, 250, 250, 250));

        panel.add(b1);
        panel.add(b2);
        panel.add(display);

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Phones");

        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }


    public static void main(String[] args) { new GUI(); }
}
