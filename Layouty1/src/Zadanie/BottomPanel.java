package Zadanie;

import javax.swing.*;
import java.awt.*;

public class BottomPanel extends JPanel {
    private JButton btnZaloguj, btnAnuluj;
    private CenterPanel center;

    public BottomPanel(CenterPanel centerPanel) {
        this.center = centerPanel;
        setLayout(new FlowLayout(FlowLayout.RIGHT));
        setBackground(Color.LIGHT_GRAY);

        btnZaloguj = new JButton("Zaloguj");
        btnAnuluj  = new JButton("Anuluj");

        add(btnZaloguj);
        add(btnAnuluj);

        btnZaloguj.addActionListener(e -> {
            String login = center.getLogin();
            char[] haslo = center.getPassword();

            if (login.isEmpty() || haslo.length == 0) {
                JOptionPane.showMessageDialog(this, "Uzupełnij login i hasło", "Brak hasła lub loginu", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (login.equals("admin") && String.valueOf(haslo).equals("haslo")) {
                JOptionPane.showMessageDialog(this, "Witaj, " + login + "!", "Logowanie", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Niepoprawny login lub hasło", "Niepoprawne dane", JOptionPane.ERROR_MESSAGE);
            }

        });

        btnAnuluj.addActionListener(e -> System.exit(0));
    }
}
