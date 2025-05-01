package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DolibarrDatabaseConnection {
    // URL JDBC pour MariaDB (Dolibarr)
    private static final String URL =
            "jdbc:mariadb://localhost:3306/dolibarr?useSSL=false&allowPublicKeyRetrieval=true";
    private static final String USER = "root";
    private static final String PASSWORD = "ZsxOiu23++";

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        // Charge le driver MariaDB
        Class.forName("org.mariadb.jdbc.Driver");
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

}