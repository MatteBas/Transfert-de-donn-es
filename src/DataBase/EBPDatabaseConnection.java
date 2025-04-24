package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EBPDatabaseConnection {
    private static final String URL =
            "jdbc:sqlserver://localhost;"
                    + "instanceName=ebp;"
                    + "databaseName=DemoBuilding13.1FR30_0895452f-b7c1-4c00-a316-c6a6d0ea4bf4;"
                    + "encrypt=false;trustServerCertificate=true;";
    private static final String USER = "sa"; // Mets l'utilisateur EBP ici
    private static final String PASSWORD = "@ebp78EBP"; // Mets le mot de passe ici

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}