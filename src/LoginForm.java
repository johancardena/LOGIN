
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JPanel {
    private JFrame parentFrame;

    public LoginForm(JFrame parentFrame) {
        this.parentFrame = parentFrame;
        setLayout(new GridLayout(3, 2));

        JLabel userLabel = new JLabel("Usuario:");
        JTextField userText = new JTextField(20);

        JLabel passwordLabel = new JLabel("Contraseña:");
        JPasswordField passwordText = new JPasswordField(20);

        JButton loginButton = new JButton("Login");

        add(userLabel);
        add(userText);
        add(passwordLabel);
        add(passwordText);
        add(loginButton);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = userText.getText();
                String password = new String(passwordText.getPassword());

                // Aquí puedes agregar la validación de credenciales
                if (user.equals("admin") && password.equals("1234")) {
                    parentFrame.setContentPane(new BioForm(parentFrame));
                    parentFrame.revalidate();
                } else {
                    JOptionPane.showMessageDialog(null, "Credenciales incorrectas");
                }
            }
        });
    }
}

