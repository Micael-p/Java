import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {

        // Criando a janela principal
        JFrame frame = new JFrame("Cálculo de Média");
        frame.setSize(450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Campo para o nome do aluno
        JTextField campoNome = new JTextField();
        campoNome.setBounds(150, 20, 200, 25);
        frame.add(campoNome);

        JLabel labelNome = new JLabel("Nome do Aluno:");
        labelNome.setBounds(30, 20, 120, 25);
        frame.add(labelNome);

        // Campos para as notas
        JLabel labelNota1 = new JLabel("Nota 1:");
        labelNota1.setBounds(30, 60, 120, 25);
        frame.add(labelNota1);

        JTextField campoNota1 = new JTextField();
        campoNota1.setBounds(150, 60, 50, 25);
        frame.add(campoNota1);

        JLabel labelNota2 = new JLabel("Nota 2:");
        labelNota2.setBounds(30, 90, 120, 25);
        frame.add(labelNota2);

        JTextField campoNota2 = new JTextField();
        campoNota2.setBounds(150, 90, 50, 25);
        frame.add(campoNota2);


        // Botão para calcular a média
        JButton botao = new JButton("Calcular Média");
        botao.setBounds(150, 160, 140, 30);
        frame.add(botao);

        // Label para exibir o resultado
        JLabel labelResultado = new JLabel("Resultado aparecerá aqui.");
        labelResultado.setBounds(30, 200, 400, 30);
        frame.add(labelResultado);

        // Ação do botão
        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nome = campoNome.getText();
                    double nota1 = Double.parseDouble(campoNota1.getText());
                    double nota2 = Double.parseDouble(campoNota2.getText());

                    double media = (nota1 + nota2 ) / 2.0;
                    String status = media >= 6.0 ? "Aluno aprovado :D" : "Aluno reprovado >:(";

                    labelResultado.setText("Aluno " + nome + " tem média " +
                            String.format("%.2f", media) + " - " + status);
                } catch (NumberFormatException ex) {
                    labelResultado.setText("Por favor, insira números válidos nas notas.");
                }
            }
        });

        // Tornando a janela visível
        frame.setVisible(true);
    }
}
