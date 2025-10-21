package Zadanie;

import javax.swing.*;
import java.awt.*;

public class CenterPanel extends JPanel {
    private JTextField txtLogin;
    private JPasswordField txtHaslo;

    public CenterPanel() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBorder(BorderFactory.createEmptyBorder(20, 50, 20, 50));

        JLabel lblLogin = new JLabel("Login:");
        txtLogin = new JTextField(15);

        JLabel lblHaslo = new JLabel("Hasło:");
        txtHaslo = new JPasswordField(15);

        JPanel loginRow = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5));
        JPanel passRow  = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5));

        loginRow.add(lblLogin);
        loginRow.add(txtLogin);
        passRow.add(lblHaslo);
        passRow.add(txtHaslo);

        loginRow.setAlignmentX(Component.CENTER_ALIGNMENT);
        passRow.setAlignmentX(Component.CENTER_ALIGNMENT);

        add(loginRow);
        add(Box.createRigidArea(new Dimension(0, 10)));
        add(passRow);
    }

    public String getLogin() {
        return txtLogin.getText().trim();
    }

    public char[] getPassword() {
        return txtHaslo.getPassword();
    }


}
