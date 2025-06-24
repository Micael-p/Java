package visao;

import javax.swing.*;
import java.awt.event.*;
import controle.ControleJogo;

public class TelaMenu extends JFrame {
    public TelaMenu() {
        setTitle("Jogo de Nave Espacial");
        setSize(400, 300);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel label = new JLabel("Escolha sua Nave:");
        label.setBounds(130, 20, 200, 30);
        add(label);

        JButton btnAtaque = new JButton("Nave de Ataque");
        btnAtaque.setBounds(100, 60, 200, 30);
        add(btnAtaque);

        JButton btnDefesa = new JButton("Nave de Defesa");
        btnDefesa.setBounds(100, 100, 200, 30);
        add(btnDefesa);

        JButton btnExploradora = new JButton("Nave Exploradora");
        btnExploradora.setBounds(100, 140, 200, 30);
        add(btnExploradora);

        JButton btnRanking = new JButton("Ver Ranking");
        btnRanking.setBounds(100, 180, 200, 30);
        add(btnRanking);

        btnAtaque.addActionListener(e -> {
            new ControleJogo("ataque");
            dispose();
        });

        btnDefesa.addActionListener(e -> {
            new ControleJogo("defesa");
            dispose();
        });

        btnExploradora.addActionListener(e -> {
            new ControleJogo("exploradora");
            dispose();
        });

        btnRanking.addActionListener(e -> {
            new TelaRanking();
            dispose();
        });

        setLocationRelativeTo(null);
        setVisible(true);
    }
}
