import DataBase.Dao.*;
import ObjetDolibarr.*;

import java.sql.SQLException;
import java.util.ArrayList;


public class ProgrammeTransfertDeDonnees {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        CategorieDAO categorieDAO = new CategorieDAO();
        ArrayList<Categorie>categories = new ArrayList<>();
        categories = categorieDAO.getAllProductCategorie();
        categorieDAO.insertCategorie(categories);

        ProductNatureDAO fourniture = new ProductNatureDAO();
        fourniture.insertProductNature();

        ProductDAO productDAO = new ProductDAO();
        ArrayList<Product> products = new ArrayList<>();
        products = productDAO.getAllProducts();
        productDAO.insertProduct(products);

        ProductCategorieDAO productCategorieDAO = new ProductCategorieDAO();
        productCategorieDAO.insertProductCategorie(products);

        ThirdPartyDAO thirdPartyDAO = new ThirdPartyDAO();
        ArrayList<ThirdParty> customers = new ArrayList<>();
        customers = thirdPartyDAO.getCustomers();
        thirdPartyDAO.insertThirdParty(customers);

        ArrayList<ThirdParty> suppliers = new ArrayList<>();
        suppliers = thirdPartyDAO.getSuppliers();
        thirdPartyDAO.insertSuppliers(suppliers);

        SupplierProductDAO supplierProductDAO = new SupplierProductDAO();
        ArrayList<SupplierProduct> supplierProducts = new ArrayList<>();
        supplierProducts = supplierProductDAO.getSuppliersAndProducts();
        supplierProductDAO.insertSupplierProduct(supplierProducts);

        categories = categorieDAO.getAllSupplierCategorie();
        categorieDAO.insertCategorie(categories);

        ThirdPartyFamilyDAO supplierFamilyDAO = new ThirdPartyFamilyDAO();
        ArrayList<ThirdPartyFamily> supplierFamilies = new ArrayList<>();
        supplierFamilies = supplierFamilyDAO.getSupplierFamilies();
        supplierFamilyDAO.insertSupplierFamily(supplierFamilies);

        categories = categorieDAO.getAllCustomerCategorie();
        categorieDAO.insertCategorie(categories);

        ThirdPartyFamilyDAO customerFamilyDAO = new ThirdPartyFamilyDAO();
        ArrayList<ThirdPartyFamily> customersFamilies = new ArrayList<>();
        customersFamilies = customerFamilyDAO.getCustomersFamilies();
        supplierFamilyDAO.insertCustomerFamily(customersFamilies);


































        /*UnitsDAO dao = new UnitsDAO();
        try (
                Connection ebpConn = EBPDatabaseConnection.getConnection();
                Connection dolibarrConn = DolibarrDatabaseConnection.getConnection();
        ) {
            // Lire l'unité 'AL' depuis EBP
            String selectEBP = "SELECT * FROM Unit WHERE Id = ?";
            PreparedStatement stmtEBP = ebpConn.prepareStatement(selectEBP);
            stmtEBP.setString(1, "AL");
            ResultSet rs = stmtEBP.executeQuery();

            // Préparation de l'INSERT dans Dolibarr
            String insertDolibarr =
                    "INSERT INTO llx_c_units " +
                            "(code, sortorder, scale, label, short_label, unit_type, active) " +
                            "VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmtDolibarr = dolibarrConn.prepareStatement(insertDolibarr);

            while (rs.next()) {
                // Création de l'objet à partir des données EBP
                String code       = rs.getString("Id").toLowerCase();
                short  sortOrder  = 700;
                int    scale      = 31557600;
                String label      = rs.getString("Caption");
                String shortLabel = code;
                String unitType   = "size";
                short  active     = 1;

                Units anneeLumiere = new Units(
                        37, code, sortOrder, scale,
                        label, shortLabel, unitType, active
                );

                // Injection des paramètres
                stmtDolibarr.setString(1, anneeLumiere.getCode());
                stmtDolibarr.setShort (2, anneeLumiere.getSortOrder());
                stmtDolibarr.setInt   (3, anneeLumiere.getScale());
                stmtDolibarr.setString(4, anneeLumiere.getLabel());
                stmtDolibarr.setString(5, anneeLumiere.getShortLabel());
                stmtDolibarr.setString(6, anneeLumiere.getUnitType());
                stmtDolibarr.setShort (7, anneeLumiere.getActive());

                // Exécution de l'INSERT
                stmtDolibarr.executeUpdate();
            }

            System.out.println("Transfert terminé avec succès.");

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }*/
    }
}

