import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Click extends JFrame {
    private int count;
    private final JButton button;

    public Click() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        count = 0;
        button = new JButton(Integer.toString(count));
        button.addActionListener(event -> {
            count++;
            button.setText(Integer.toString(count));
        });

        JPanel content = new JPanel(new BorderLayout());
        content.add(button);
        setContentPane(content);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Click window = new Click();
            window.setVisible(true);
        });
    }
}
