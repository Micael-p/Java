package modelo;

public class Inimigo {
    private int posX, posY;
    private int velocidade = 5;

    public Inimigo(int x, int y) {
        this.posX = x;
        this.posY = y;
    }

    public void mover() {
        posX -= velocidade;
    }

    public int getPosX() { return posX; }
    public int getPosY() { return posY; }
}
