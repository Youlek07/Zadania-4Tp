package Zadanie;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame{
    private JTextField txtWiek;
    private JCheckBox checkRegulamin;
    private JButton btnZatwierdz;
    App() {
        super("Formularz Weryfikacji");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(300, 150);

        txtWiek = new JTextField(10);
        checkRegulamin = new JCheckBox("Akceptuję regulamin");
        btnZatwierdz = new JButton("Zatwierdź");

        btnZatwierdz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int wiek;

                try {
                    wiek = Integer.parseInt(txtWiek.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(App.this,"Podaj poprawny wiek!");
                    return;
                }

                if(wiek >= 18 && checkRegulamin.isSelected()) {
                    JOptionPane.showMessageDialog(App.this,"Rejestracja pomyślna!");
                } else {
                    JOptionPane.showMessageDialog(App.this,"Wymagany wiek 18+ i akceptacja regulaminu!");
                }
            }
        });

        add(new JLabel("Podaj wiek:"));
        add(txtWiek);
        add(checkRegulamin);
        add(btnZatwierdz);

        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(App::new);
    }
}
