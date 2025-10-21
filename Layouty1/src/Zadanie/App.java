package Zadanie;

import javax.swing.*;
import java.awt.*;

// login - admin, hasło - haslo

public class App extends JFrame {
    static TopPanel topPanel;
    static BottomPanel bottomPanel;
    static CenterPanel centerPanel;

    public App() {
        super("Logowanie");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        topPanel = new TopPanel();
        centerPanel = new CenterPanel();
        bottomPanel = new BottomPanel(centerPanel); 

        add(topPanel, BorderLayout.NORTH);
        add(bottomPanel, BorderLayout.SOUTH);
        add(centerPanel, BorderLayout.CENTER);
        setVisible(true);
    }

    public static void main(String[] args) {
        new App();
    }
}
