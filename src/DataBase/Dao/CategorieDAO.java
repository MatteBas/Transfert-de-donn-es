package DataBase.Dao;

import DataBase.DolibarrDatabaseConnection;
import DataBase.EBPDatabaseConnection;
import ObjetDolibarr.Categorie;
import ObjetDolibarr.Units;

import java.sql.*;
import java.util.ArrayList;

public class CategorieDAO {

    public ArrayList<Categorie> getAllProductCategorie() {
        int rowId = 0;
        ArrayList<Categorie> categoriesArray = new ArrayList<>();
        String query = "SELECT Caption, SysCreatedDate, SysModifiedDate FROM ItemFamily";

        try (Connection conn = EBPDatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {

                rowId++;
                Categorie categorie = new Categorie(
                        rowId,
                        1,
                        0,
                        rs.getString("Caption"),
                        null,
                        0,
                        null,
                        "000000",
                        0,
                        null,
                        0,
                        rs.getDate("SysCreatedDate"),
                        rs.getDate("SysModifiedDate"),
                        1,
                        1,
                        null
                );
                categoriesArray.add(categorie);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return categoriesArray;
    }

    /*public ArrayList<Categorie> getAllSubCategorie(ArrayList<Categorie> categoriesArray) {
        int rowId = categoriesArray.getLast().getRowid();

        String query = "SELECT Caption, ItemFamilyId, SysCreatedDate, SysModifiedDate FROM ItemSubFamily";

        try (Connection conn = EBPDatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                String subCategorieId = rs.getString("ItemFamilyId");
                int position = subCategorieId.length();
                int subCategorieParent = subCategorieId.charAt(position-1);
                rowId++;
                Categorie categorie = new Categorie(
                        rowId,
                        1,
                        subCategorieParent,
                        rs.getString("Caption"),
                        null,
                        0,
                        null,
                        "000000",
                        0,
                        null,
                        0,
                        rs.getDate("SysCreatedDate"),
                        rs.getDate("SysModifiedDate"),
                        1,
                        1,
                        null
                );
                categoriesArray.add(categorie);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return categoriesArray;
    }
*/
    public void insertCategorie(ArrayList<Categorie> categoriesArray) {
        String query = "INSERT INTO llx_categorie " +
                "(entity, fk_parent, label, ref_ext, type, description, color, position, fk_soc, visible, date_creation, tms, fk_user_creat, fk_user_modif, import_key) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DolibarrDatabaseConnection.getConnection()) {
            PreparedStatement stmtDolibarr = conn.prepareStatement(query);

            for (Categorie cat : categoriesArray) {
                stmtDolibarr.setInt(1, cat.getEntity());
                stmtDolibarr.setInt(2, cat.getFkParent());
                stmtDolibarr.setString(3, cat.getLabel());
                stmtDolibarr.setString(4, cat.getRefExt());
                stmtDolibarr.setInt(5, cat.getType());
                stmtDolibarr.setString(6, cat.getDescription());
                stmtDolibarr.setString(7, cat.getColor());
                stmtDolibarr.setInt(8, cat.getPosition());
                stmtDolibarr.setObject(9, cat.getFkSoc());
                stmtDolibarr.setInt(10, cat.getVisible());
                stmtDolibarr.setDate(11, cat.getDateCreation());
                stmtDolibarr.setDate(12, cat.getTms());
                stmtDolibarr.setInt(13, cat.getFkUserCreat());
                stmtDolibarr.setInt(14, cat.getFkUserModif());
                stmtDolibarr.setString(15, cat.getImportKey());

                stmtDolibarr.executeUpdate();
            }

            System.out.println("Transfert terminé avec succès.");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public ArrayList<Categorie> getAllSupplierCategorie() {
        int rowId = 0;
        ArrayList<Categorie> categoriesArray = new ArrayList<>();
        String query = "SELECT Id, Caption, SysCreatedDate, SysModifiedDate FROM SupplierFamily";

        try (Connection conn = EBPDatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {

                rowId++;
                Categorie categorie = new Categorie(
                        rowId,
                        1,
                        0,
                        rs.getString("Caption"),
                        null,
                        1,
                        rs.getString("Id"),
                        "000000",
                        0,
                        null,
                        0,
                        rs.getDate("SysCreatedDate"),
                        rs.getDate("SysModifiedDate"),
                        1,
                        1,
                        null
                );
                categoriesArray.add(categorie);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return categoriesArray;
    }
    public Integer getRowIdFromSupplierId(String supplierId) throws SQLException, ClassNotFoundException {
        Integer rowId = null;
        System.out.println(supplierId);
        // Utilisation de requêtes paramétrées (évite les injections SQL)
        String query = "SELECT rowid FROM llx_categorie WHERE label = ?";

        try (Connection conn = DolibarrDatabaseConnection.getConnection();
             PreparedStatement stmtDolibarr = conn.prepareStatement(query)) {
                stmtDolibarr.setString(1, supplierId);
                try (ResultSet rs = stmtDolibarr.executeQuery()) {
                    if (rs.next()) {
                        rowId = rs.getInt("rowid");
                    }
                }
            }
        return rowId;
    }

    public String getCaptionFromSupplierId(String supplierId) throws SQLException, ClassNotFoundException {
        String caption = null;
        System.out.println(supplierId);
        // Utilisation de requêtes paramétrées (évite les injections SQL)
        String query = "SELECT Caption FROM SupplierFamily WHERE Id = ?";

        try (Connection conn = EBPDatabaseConnection.getConnection()) {

            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setString(1, supplierId);
                try (ResultSet rs = stmt.executeQuery()) {
                    if (rs.next()) {
                      caption = rs.getString("Caption");
                    }
                }
            }
        }
        return caption;
    }

    public ArrayList<Categorie> getAllCustomerCategorie() {
        int rowId = 0;
        ArrayList<Categorie> categoriesArray = new ArrayList<>();
        String query = "SELECT Id, Caption, SysCreatedDate, SysModifiedDate FROM CustomerFamily";

        try (Connection conn = EBPDatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {

                rowId++;
                Categorie categorie = new Categorie(
                        rowId,
                        1,
                        0,
                        rs.getString("Caption"),
                        null,
                        2,
                        rs.getString("Id"),
                        "000000",
                        0,
                        null,
                        0,
                        rs.getDate("SysCreatedDate"),
                        rs.getDate("SysModifiedDate"),
                        1,
                        1,
                        null
                );
                categoriesArray.add(categorie);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return categoriesArray;
    }
    public String getCaptionFromCustomerId(String customerId) throws SQLException, ClassNotFoundException {
        String caption = null;
        System.out.println(customerId);
        // Utilisation de requêtes paramétrées (évite les injections SQL)
        String query = "SELECT Caption FROM CustomerFamily WHERE Id = ?";

        try (Connection conn = EBPDatabaseConnection.getConnection()) {

            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setString(1, customerId);
                try (ResultSet rs = stmt.executeQuery()) {
                    if (rs.next()) {
                        caption = rs.getString("Caption");
                    }
                }
            }
        }
        return caption;
    }
    public Integer getRowIdFromCustomerId(String customerId) throws SQLException, ClassNotFoundException {
        Integer rowId = null;
        System.out.println(customerId);
        // Utilisation de requêtes paramétrées (évite les injections SQL)
        String query = "SELECT rowid FROM llx_categorie WHERE label = ?";

        try (Connection conn = DolibarrDatabaseConnection.getConnection();
             PreparedStatement stmtDolibarr = conn.prepareStatement(query)) {
            stmtDolibarr.setString(1, customerId);
            try (ResultSet rs = stmtDolibarr.executeQuery()) {
                if (rs.next()) {
                    rowId = rs.getInt("rowid");
                }
            }
        }
        return rowId;
    }
}
