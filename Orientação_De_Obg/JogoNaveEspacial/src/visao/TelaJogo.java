package visao;

import modelo.*;
import banco.RankingDAO;

import java.awt.*;
import java.awt.event.*;
import java.util.List;
import javax.swing.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class TelaJogo extends JFrame implements ActionListener, KeyListener {
    private NaveEspacial nave;
    private List<Tiro> tiros = new ArrayList<>();
    private List<Inimigo> inimigos = new ArrayList<>();
    private Timer timer;
    private int pontuacao = 0;
    private boolean jogoAtivo = true;
    private Image imgNave;
    private Image imgInimigo;

    public TelaJogo(NaveEspacial nave) {
        this.nave = nave;

        imgInimigo = new ImageIcon(getClass().getResource("/imagens/inimigo.png")).getImage();

        if (nave instanceof NaveAtaque) {
            imgNave = new ImageIcon(getClass().getResource("/imagens/nave_azul.png")).getImage();
        } else if (nave instanceof NaveDefesa) {
            imgNave = new ImageIcon(getClass().getResource("/imagens/nave_verde.png")).getImage();
        } else if (nave instanceof NaveExploradora) {
            imgNave = new ImageIcon(getClass().getResource("/imagens/nave_amarela.png")).getImage();
        }

        setTitle("Jogo de Nave Espacial");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        addKeyListener(this);
        setFocusable(true);

        timer = new Timer(30, this);
        timer.start();

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (jogoAtivo) {
            atualizarTiros();
            atualizarInimigos();
            verificarColisoes();
            gerarInimigos();
            pontuacao++;
            repaint();
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 800, 600);

        // Nave
        g.drawImage(imgNave, nave.getPosX(), nave.getPosY(), 60, 60, this);


        // Tiros
        g.setColor(Color.YELLOW);
        for (Tiro tiro : tiros) {
            g.fillRect(tiro.getPosX(), tiro.getPosY() + 15, 10, 5);
        }

        // Inimigos
        for (Inimigo inimigo : inimigos) {
            g.drawImage(imgInimigo, inimigo.getPosX(), inimigo.getPosY(), 60, 60, this);
        }

        // Pontuação
        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.BOLD, 18));
        g.drawString("Pontuação: " + pontuacao, 600, 50);
    }

    private void atualizarTiros() {
        List<Tiro> remover = new ArrayList<>();
        for (Tiro tiro : tiros) {
            tiro.mover();
            if (tiro.getPosX() > 800) {
                remover.add(tiro);
            }
        }
        tiros.removeAll(remover);
    }

    private void atualizarInimigos() {
        List<Inimigo> remover = new ArrayList<>();
        for (Inimigo inimigo : inimigos) {
            inimigo.mover();
            if (inimigo.getPosX() < -40) {
                remover.add(inimigo);
            }
        }
        inimigos.removeAll(remover);
    }

    private void gerarInimigos() {
        if (new Random().nextInt(100) < 3) {
            int y = new Random().nextInt(500) + 50;
            inimigos.add(new Inimigo(800, y));
        }
    }

    private void verificarColisoes() {
        List<Inimigo> inimigosRemover = new ArrayList<>();
        List<Tiro> tirosRemover = new ArrayList<>();

        // Tiro vs Inimigo
        for (Tiro tiro : tiros) {
            for (Inimigo inimigo : inimigos) {
                if (new Rectangle(tiro.getPosX(), tiro.getPosY(), 10, 5)
                        .intersects(new Rectangle(inimigo.getPosX(), inimigo.getPosY(), 40, 40))) {
                    inimigosRemover.add(inimigo);
                    tirosRemover.add(tiro);
                    pontuacao += 100;
                }
            }
        }
        inimigos.removeAll(inimigosRemover);
        tiros.removeAll(tirosRemover);

        // Nave vs Inimigo
        for (Inimigo inimigo : inimigos) {
            if (new Rectangle(nave.getPosX(), nave.getPosY(), 40, 40)
                    .intersects(new Rectangle(inimigo.getPosX(), inimigo.getPosY(), 40, 40))) {
                fimDeJogo();
            }
        }
    }

    private void fimDeJogo() {
        jogoAtivo = false;
        timer.stop();

        String nome = JOptionPane.showInputDialog(this,
                "Fim de jogo! Sua pontuação: " + pontuacao + "\nDigite seu nome:");

        if (nome != null && !nome.trim().isEmpty()) {
            RankingDAO dao = new RankingDAO();
            dao.salvarPontuacao(nome, pontuacao);
        }

        int opcao = JOptionPane.showConfirmDialog(this, "Deseja jogar novamente?", "Game Over",
                JOptionPane.YES_NO_OPTION);

        if (opcao == JOptionPane.YES_OPTION) {
            new visao.TelaMenu();
        } else {
            System.exit(0);
        }
        dispose();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                nave.mover("up");
                break;
            case KeyEvent.VK_DOWN:
                nave.mover("down");
                break;
            case KeyEvent.VK_LEFT:
                nave.mover("left");
                break;
            case KeyEvent.VK_RIGHT:
                nave.mover("right");
                break;
            case KeyEvent.VK_SPACE:
                tiros.add(nave.atirar());
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}
    @Override
    public void keyTyped(KeyEvent e) {}
}
