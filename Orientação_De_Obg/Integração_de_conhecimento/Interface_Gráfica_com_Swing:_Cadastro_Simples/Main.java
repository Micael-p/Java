import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {

        // Criando a janela principal
        JFrame frame = new JFrame("Cadastro Simples");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Botão para calcular a média
        JButton botao = new JButton("Fazer cadastro");
        botao.setBounds(100, 60, 140, 50);
        frame.add(botao);

        // Ação do botão
        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    String nome = JOptionPane.showInputDialog(frame, "Insira sua Nome:");
                    String email = JOptionPane.showInputDialog(frame, "Insira seu E-mail:");
                    String idadeStr = JOptionPane.showInputDialog(frame, "Insira sua idade:");
                    int idade = Integer.parseInt(idadeStr);

                JOptionPane.showInputDialog(frame, "Seu Cadastro: \nNome:" + nome + "\nE-mail:" + email + "\nIdade:" + idadeStr );
            }
        });

        frame.getContentPane().add(botao);

        // Tornando a janela visível
        frame.setVisible(true);
    }
}
