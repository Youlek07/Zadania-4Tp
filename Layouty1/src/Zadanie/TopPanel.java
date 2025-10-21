package Zadanie;

import javax.swing.*;
import java.awt.*;

public class TopPanel extends JPanel {
    static JLabel lbl;
    public TopPanel() {
        setLayout(new FlowLayout(FlowLayout.CENTER));

        lbl = new JLabel("Panel Logowania");
        lbl.setFont(new Font("Arial", Font.BOLD, 15));

        setBackground(Color.CYAN);
        setForeground(Color.darkGray);


        add(lbl);
    }
}
