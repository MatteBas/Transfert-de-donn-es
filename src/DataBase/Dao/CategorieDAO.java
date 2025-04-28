package DataBase.Dao;

import DataBase.DolibarrDatabaseConnection;
import DataBase.EBPDatabaseConnection;
import ObjetDolibarr.Categorie;
import ObjetDolibarr.Units;

import java.sql.*;
import java.util.ArrayList;

public class CategorieDAO {

    public ArrayList<Categorie> getAllCategorie() {
        int rowId = 0;
        ArrayList<Categorie> categoriesArray = new ArrayList<>();
        String query = "SELECT Caption, SysCreatedDate, SysModifieddDate FROM Item_Family";

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
                        rs.getDate("SysModifieddDate"),
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

    public ArrayList<Categorie> getAllSubCategorie(ArrayList<Categorie> categoriesArray) {
        int rowId = categoriesArray.getLast().getRowid();

        String query = "SELECT Caption,ItemFamilyId, SysCreatedDate, SysModifieddDate FROM ItemFamily";

        try (Connection conn = EBPDatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                String subCategorieId = rs.getString("ItemFamilyId");
                int position = subCategorieId.length();
                int subCategorieParent = subCategorieId.charAt(position);
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
                        rs.getDate("SysModifieddDate"),
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

    public void insertCategorie(ArrayList<Categorie> categoriesArray) {
        String query = "INSERT INTO llx_categorie " +
                "(rowid, entity, fk_parent, label, ref_ext, type, description, color, position, fk_soc, visible, date_creation, tms, fk_user_creat, fk_user_modif, import_key) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DolibarrDatabaseConnection.getConnection()) {
            PreparedStatement stmtDolibarr = conn.prepareStatement(query);

            for (Categorie cat : categoriesArray) {
                stmtDolibarr.setInt(1, cat.getRowid());
                stmtDolibarr.setInt(2, cat.getEntity());
                stmtDolibarr.setInt(3, cat.getFkParent());
                stmtDolibarr.setString(4, cat.getLabel());
                stmtDolibarr.setString(5, cat.getRefExt());
                stmtDolibarr.setInt(6, cat.getType());
                stmtDolibarr.setString(7, cat.getDescription());
                stmtDolibarr.setString(8, cat.getColor());
                stmtDolibarr.setInt(9, cat.getPosition());
                stmtDolibarr.setInt(10, cat.getFkSoc());
                stmtDolibarr.setInt(11, cat.getVisible());
                stmtDolibarr.setDate(12, cat.getDateCreation());
                stmtDolibarr.setDate(13, cat.getTms());
                stmtDolibarr.setInt(14, cat.getFkUserCreat());
                stmtDolibarr.setInt(15, cat.getFkUserModif());
                stmtDolibarr.setString(16, cat.getImportKey());

                stmtDolibarr.executeUpdate();
            }

            System.out.println("Transfert terminé avec succès.");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
