package visao;

import banco.RankingDAO;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class TelaRanking extends JFrame {
    public TelaRanking() {
        setTitle("Ranking");
        setSize(400, 300);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        RankingDAO dao = new RankingDAO();
        List<String> ranking = dao.buscarTop5();

        JTextArea area = new JTextArea();
        area.setEditable(false);
        area.setFont(new Font("Arial", Font.PLAIN, 16));

        StringBuilder texto = new StringBuilder("🏆 Top 5 Pontuações 🏆\n\n");
        for (String linha : ranking) {
            texto.append(linha).append("\n");
        }

        area.setText(texto.toString());
        add(new JScrollPane(area), BorderLayout.CENTER);

        JButton voltar = new JButton("Voltar");
        voltar.addActionListener(e -> {
            new TelaMenu();
            dispose();
        });

        add(voltar, BorderLayout.SOUTH);

        setLocationRelativeTo(null);
        setVisible(true);
    }
}
