package DataBase.Dao;

import DataBase.DolibarrDatabaseConnection;
import DataBase.EBPDatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DepartementsDAO {

    public Integer getRowId(String departementId) throws SQLException {
        Integer rowId = 0;
        String departement = departementId.substring(2)   ;
        String query = "SELECT rowid FROM llx_c_departements WHERE cheflieu LIKE ?";

        try (Connection conn = DolibarrDatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, departement + "%");

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    rowId = rs.getInt("rowid");
                }
            }
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return rowId;
    }
}
