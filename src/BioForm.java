
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BioForm extends JPanel {
    private JFrame parentFrame;

    public BioForm(JFrame parentFrame) {
        this.parentFrame = parentFrame;
        setLayout(new BorderLayout());

        JTextArea bioArea = new JTextArea("Esta es la biografía del usuario.\n\n" +
                "Nombre: Juan Perez\n" +
                "Edad: 30\n" +
                "Ocupación: Desarrollador de Software");
        bioArea.setEditable(false);
        add(bioArea, BorderLayout.CENTER);

        JButton hobbyButton = new JButton("Ver Hobby");
        add(hobbyButton, BorderLayout.SOUTH);

        hobbyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentFrame.setContentPane(new HobbyForm(parentFrame));
                parentFrame.revalidate();
            }
        });
    }
}

