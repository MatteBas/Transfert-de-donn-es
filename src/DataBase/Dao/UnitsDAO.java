package DataBase.Dao;

import DataBase.DolibarrDatabaseConnection;
import ObjetDolibarr.Units;
import java.sql.*;
import java.util.ArrayList;

public class UnitsDAO {

    public ArrayList<Units> getAllUnits() {
        ArrayList<Units> unitsArray = new ArrayList<>();
        String query = "SELECT rowid, code, sortorder, scale, label, short_label, unit_type, active FROM llx_c_units";

        try (Connection conn = DolibarrDatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                Units u = new Units(
                        rs.getInt("rowid"),
                        rs.getString("code"),
                        rs.getShort("sortorder"),
                        rs.getInt("scale"),
                        rs.getString("label"),
                        rs.getString("short_label"),
                        rs.getString("unit_type"),
                        rs.getShort("active")
                );
                unitsArray.add(u);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return unitsArray;
    }
    public int getScaleFromUnit(String unitCode) {
        int scale = 0;
        String query = "SELECT scale FROM llx_c_units WHERE code = '" + unitCode + "'";

        try (Connection conn = DolibarrDatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            if (rs.next()) {
                scale = rs.getInt("scale");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return scale;
    }

    public Integer getRowIDFromCode(String unitCode) {
        String sql = "SELECT rowid FROM llx_c_units WHERE code = ?";
        try ( Connection conn = DolibarrDatabaseConnection.getConnection();
              PreparedStatement ps = conn.prepareStatement(sql) ) {
            ps.setString(1, unitCode);
            try ( ResultSet rs = ps.executeQuery() ) {
                if (rs.next()) {
                    return rs.getInt("rowid");
                }
            }
        } catch (SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
