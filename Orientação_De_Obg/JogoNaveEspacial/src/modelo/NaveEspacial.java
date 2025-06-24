package modelo;

public abstract class NaveEspacial {
    protected int posX, posY;
    protected int velocidade;

    public NaveEspacial(int x, int y, int velocidade) {
        this.posX = x;
        this.posY = y;
        this.velocidade = velocidade;
    }

    public abstract void mover(String direcao);
    public abstract Tiro atirar();

    public int getPosX() { return posX; }
    public int getPosY() { return posY; }
}
