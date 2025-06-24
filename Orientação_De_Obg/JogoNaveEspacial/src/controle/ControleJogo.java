
package controle;

import modelo.*;
import visao.TelaJogo;

public class ControleJogo {
    public ControleJogo(String tipoNave) {
        NaveEspacial nave;
        if (tipoNave.equals("ataque")) {
            nave = new NaveAtaque(100, 250);
        } else if (tipoNave.equals("defesa")) {
            nave = new NaveDefesa(100, 250);
        } else {
            nave = new NaveExploradora(100, 250);
        }

        new TelaJogo(nave);
    }
}
