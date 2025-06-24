
package modelo;

public class NaveDefesa extends NaveEspacial {

    public NaveDefesa(int x, int y) {
        super(x, y, 5);
    }

    @Override
    public void mover(String direcao) {
        switch (direcao) {
            case "up": posY -= velocidade; break;
            case "down": posY += velocidade; break;
            case "left": posX -= velocidade; break;
            case "right": posX += velocidade; break;
        }
    }

    @Override
    public Tiro atirar() {
        return new Tiro(posX + 20, posY, 10);
    }
}
