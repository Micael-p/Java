
package banco;

import java.sql.*;
import java.util.*;

public class RankingDAO {
    public void salvarPontuacao(String nome, int pontuacao) {
        try (Connection con = Conexao.conectar()) {
            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO ranking (nome_jogador, pontuacao, data) VALUES (?, ?, date('now'))"
            );
            ps.setString(1, nome);
            ps.setInt(2, pontuacao);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<String> buscarTop5() {
        List<String> lista = new ArrayList<>();
        try (Connection con = Conexao.conectar()) {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(
                "SELECT nome_jogador, pontuacao, data FROM ranking ORDER BY pontuacao DESC LIMIT 5"
            );
            while (rs.next()) {
                lista.add(rs.getString("nome_jogador") + " - " +
                          rs.getInt("pontuacao") + " pts - " +
                          rs.getString("data"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }
}
