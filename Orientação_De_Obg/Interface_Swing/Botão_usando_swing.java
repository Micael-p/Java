import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Botão exemplo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();

        JButton button = new JButton("clique Aqui");

        button.addActionListener(e -> {
            System.out.println("Botão clicado");
        });
        panel.add(button);
        frame.add(panel);
        frame.setVisible(true);
    }
}
