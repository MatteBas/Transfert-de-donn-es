package DataBase.Dao;

import DataBase.DolibarrDatabaseConnection;
import DataBase.EBPDatabaseConnection;
import ObjetDolibarr.CustomerProduct;
import ObjetDolibarr.SupplierProduct;

import java.sql.*;
import java.util.ArrayList;

public class CustomerProductDAO {
        public ArrayList<CustomerProduct> getSuppliersAndProducts() throws SQLException, ClassNotFoundException {
            Integer rowId = 0;
            Integer itemRowId = 0;
            Integer thirdPartyRowId = 0;
            Double sellUnitRowId = 0.0;
            ArrayList<CustomerProduct> customerProductArrayList = new ArrayList<>();
            String query = "SELECT ThirdId, ItemId, Reference FROM ThirdReference";

            try (Connection conn = EBPDatabaseConnection.getConnection();
                 Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery(query)) {

                while (rs.next()) {

                    ProductDAO productDAO = new ProductDAO();
                    itemRowId = productDAO.getRowIdFromId(rs.getString("ItemId"));
                    if (itemRowId != null) {
                        ThirdPartyDAO thirdPartyDAO = new ThirdPartyDAO();
                        thirdPartyRowId = thirdPartyDAO.getRowIdFromId(rs.getString("SupplierId"));

                        rowId++;
                        CustomerProduct customerProduct = new CustomerProduct(
                                rowId,
                                1,
                                null,
                                null,
                                itemRowId,
                                thirdPartyRowId,
                                rs.getString("Reference"),
                                null,
                                null,
                                null,
                                null,
                                null,
                                null,
                                null,
                                null,
                                null,
                                null,
                                null,
                                null,
                                null,
                                null,
                                null
                        );
                        customerProductArrayList.add(customerProduct);
                    }
                }
                return customerProductArrayList;
            }
        }
        public void insertCustomerProduct(ArrayList<CustomerProduct> customerProductArray) {

            String query = "INSERT INTO llx_product_customer_price " +
                    "(fk_product, fk_soc, ref_customer" +
                    "VALUES (?, ?, ?)";

            try (Connection conn = DolibarrDatabaseConnection.getConnection();
                 PreparedStatement stmtDolibarr = conn.prepareStatement(query)) {

                for (CustomerProduct customerProduct : customerProductArray) {

                stmtDolibarr.setInt(1, customerProduct.getFk_product());
                stmtDolibarr.setInt(2, customerProduct.getRowid());
                stmtDolibarr.setString(3, customerProduct.getRef_customer());

                    stmtDolibarr.executeUpdate();
                }

                System.out.println("Transfert des prix clients terminé avec succès.");
            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
}
