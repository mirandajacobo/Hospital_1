import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LoginWindow loginWindow = new LoginWindow();
            loginWindow.setVisible(true);
        });
    }
}

class LoginWindow extends JFrame {
    private JTextField emailField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LoginWindow() {
        setTitle("Login");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        JLabel emailLabel = new JLabel("Correo electrónico:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(emailLabel, gbc);

        emailField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 0;
        add(emailField, gbc);

        JLabel passwordLabel = new JLabel("Contraseña:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(passwordLabel, gbc);

        passwordField = new JPasswordField(20);
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(passwordField, gbc);

        loginButton = new JButton("Iniciar sesión");
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.EAST;
        add(loginButton, gbc);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleLogin();
            }
        });

        setLocationRelativeTo(null);
    }

    private void handleLogin() {
        String email = emailField.getText();
        String password = new String(passwordField.getPassword());

        System.out.println("Correo: " + email);
        System.out.println("Contraseña: " + password);
    }
}
