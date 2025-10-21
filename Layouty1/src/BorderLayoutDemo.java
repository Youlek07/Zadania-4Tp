import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo extends JFrame {
    public BorderLayoutDemo() {
        super("BorderLayout Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);

        setLayout(new BorderLayout(5, 5));

        add(new JButton("NORTH - Nagłówek"), BorderLayout.NORTH);
        add(new JButton("SOUTH - Stopka"), BorderLayout.SOUTH);
        add(new JTextField("WEST - Menu boczne"), BorderLayout.WEST);
//        add(new JTextArea("CENTER - Główna zawartość, która się rozciąga..."), BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayoutDemo();
    }
}