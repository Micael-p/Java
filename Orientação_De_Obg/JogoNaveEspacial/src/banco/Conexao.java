package banco;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    public static Connection conectar() {
        try {
            Class.forName("org.sqlite.JDBC");
            return DriverManager.getConnection("jdbc:sqlite:ranking.db");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
