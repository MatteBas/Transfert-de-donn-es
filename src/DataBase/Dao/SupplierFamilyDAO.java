package DataBase.Dao;

import DataBase.DolibarrDatabaseConnection;
import DataBase.EBPDatabaseConnection;
import ObjetDolibarr.SupplierFamily;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SupplierFamilyDAO {
    public ArrayList<SupplierFamily> getSupplierFamilies() {
        Integer fk_categorie;
        Integer fk_soc;
        String import_key = null;
        String supplierCaption;
        ArrayList<SupplierFamily> supplierFamilies = new ArrayList<>();
        String query = "SELECT Id, FamilyId FROM Supplier";


        try (java.sql.Connection conn = EBPDatabaseConnection.getConnection();
             java.sql.Statement stmt = conn.createStatement();
             java.sql.ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {

                CategorieDAO categorieDAO = new CategorieDAO();
                supplierCaption = categorieDAO.getCaptionFromSupplierId(rs.getString("FamilyId"));
                System.out.println(supplierCaption);
                fk_categorie = categorieDAO.getRowIdFromSupplierId(supplierCaption);
                System.out.println(fk_categorie);

                ThirdPartyDAO thirdPartyDAO = new ThirdPartyDAO();
                fk_soc = thirdPartyDAO.getRowIdFromId(rs.getString("Id"));

                SupplierFamily supplierFamily = new SupplierFamily(fk_categorie, fk_soc, import_key);
                supplierFamilies.add(supplierFamily);
            }

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return supplierFamilies;
    }
    public void insertSupplierFamily(ArrayList<SupplierFamily> supplierFamilies) {
        String query = "INSERT INTO llx_categorie_fournisseur " +
                "(fk_categorie, fk_soc, import_key) " +
                "VALUES (?, ?, ?)";

        try (Connection conn = DolibarrDatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            for (SupplierFamily supplierFamily : supplierFamilies) {

                    stmt.setInt(1, supplierFamily.getFk_categorie());
                    stmt.setInt(2, supplierFamily.getFk_soc());
                    stmt.setString(3, supplierFamily.getImport_key());

                    stmt.executeUpdate();
                }


            System.out.println("Transfert des catégories fournisseurs terminé avec succès.");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
