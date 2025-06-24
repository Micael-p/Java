
package modelo;

public class Tiro {
    private int posX, posY;
    private int velocidade;

    public Tiro(int x, int y, int velocidade) {
        this.posX = x;
        this.posY = y;
        this.velocidade = velocidade;
    }

    public void mover() {
        posX += velocidade;
    }

    public int getPosX() { return posX; }
    public int getPosY() { return posY; }
}
