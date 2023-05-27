package mysqlimagenes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AgenteConexion {
    private static Connection conex;

    public static Connection devolverConexion() throws SQLException {
        if (conex == null) {
            conex = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
        }

        return conex;
    }
}