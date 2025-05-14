package DataBase.Dao;

import DataBase.DolibarrDatabaseConnection;
import DataBase.EBPDatabaseConnection;
import ObjetDolibarr.ThirdPartyFamily;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class ThirdPartyFamilyDAO {
    public ArrayList<ThirdPartyFamily> getSupplierFamilies() {
        Integer fk_categorie;
        Integer fk_soc;
        String import_key = null;
        String supplierCaption;
        ArrayList<ThirdPartyFamily> supplierFamilies = new ArrayList<>();
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
                fk_soc = thirdPartyDAO.getRowIdFromSupplierId(rs.getString("Id"));

                ThirdPartyFamily supplierFamily = new ThirdPartyFamily(fk_categorie, fk_soc, import_key);
                supplierFamilies.add(supplierFamily);
            }

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return supplierFamilies;
    }
    public void insertSupplierFamily(ArrayList<ThirdPartyFamily> supplierFamilies) {
        String query = "INSERT INTO llx_categorie_fournisseur " +
                "(fk_categorie, fk_soc, import_key) " +
                "VALUES (?, ?, ?)";

        try (Connection conn = DolibarrDatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            for (ThirdPartyFamily supplierFamily : supplierFamilies) {

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
        public ArrayList<ThirdPartyFamily> getCustomersFamilies() {
            Integer fk_categorie;
            Integer fk_soc;
            String import_key = null;
            String supplierCaption;
            ArrayList<ThirdPartyFamily> supplierFamilies = new ArrayList<>();
            String query = "SELECT Id, FamilyId FROM Customer";


            try (java.sql.Connection conn = EBPDatabaseConnection.getConnection();
                 java.sql.Statement stmt = conn.createStatement();
                 java.sql.ResultSet rs = stmt.executeQuery(query)) {

                while (rs.next()) {

                    CategorieDAO categorieDAO = new CategorieDAO();
                    supplierCaption = categorieDAO.getCaptionFromCustomerId(rs.getString("FamilyId"));
                    System.out.println(supplierCaption);
                    fk_categorie = categorieDAO.getRowIdFromCustomerId(supplierCaption);
                    System.out.println(fk_categorie);

                    ThirdPartyDAO thirdPartyDAO = new ThirdPartyDAO();
                    fk_soc = thirdPartyDAO.getRowIdFromCustomerId(rs.getString("Id"));

                    ThirdPartyFamily customerFamily = new ThirdPartyFamily(fk_categorie, fk_soc, import_key);
                    supplierFamilies.add(customerFamily);
                }

            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
            }
            return supplierFamilies;
        }
        public void insertCustomerFamily(ArrayList<ThirdPartyFamily> supplierFamilies) {
            String query = "INSERT INTO llx_categorie_societe " +
                    "(fk_categorie, fk_soc, import_key) " +
                    "VALUES (?, ?, ?)";

            try (Connection conn = DolibarrDatabaseConnection.getConnection();
                 PreparedStatement stmt = conn.prepareStatement(query)) {

                for (ThirdPartyFamily supplierFamily : supplierFamilies) {

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
