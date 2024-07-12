
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HobbyForm extends JPanel {
    private JFrame parentFrame;

    public HobbyForm(JFrame parentFrame) {
        this.parentFrame = parentFrame;
        setLayout(new BorderLayout());

        JLabel hobbyLabel = new JLabel(new ImageIcon("https://s1.significados.com/foto/imagen-de-destaque-que-es-el-futbol.-jugadores-y-balon.jpg?class=ogImageRectangle")); // Reemplaza con la ruta a tu imagen
        add(hobbyLabel, BorderLayout.CENTER);

        JButton backButton = new JButton("Regresar a Biografía");
        add(backButton, BorderLayout.SOUTH);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentFrame.setContentPane(new BioForm(parentFrame));
                parentFrame.revalidate();
            }
        });
    }
}

