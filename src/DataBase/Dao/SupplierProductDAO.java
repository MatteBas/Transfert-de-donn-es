package DataBase.Dao;

import DataBase.DolibarrDatabaseConnection;
import DataBase.EBPDatabaseConnection;
import ObjetDolibarr.SupplierProduct;
import ObjetDolibarr.ThirdParty;

import java.sql.*;
import java.util.ArrayList;

public class SupplierProductDAO {
    public ArrayList<SupplierProduct> getSuppliersAndProducts() throws SQLException, ClassNotFoundException {
        Integer rowId = 0;
        Integer itemRowId = 0;
        Integer thirdPartyRowId = 0;
        Double sellUnitRowId = 0.0;
        String thirdPartyName = null;
        Double charges = 0.0;
        ArrayList<SupplierProduct> suppliersItemArray = new ArrayList<>();
        String query = "SELECT ItemId, SupplierId, PublicPurchasePrice, PurchaseOrderMinimumQuantity, PurchaseUnitId, DiscountRate,DiscountAmount, NetPurchasePrice FROM SupplierItem";

        try (Connection conn = EBPDatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {

                ProductDAO productDAO = new ProductDAO();
                itemRowId = productDAO.getRowIdFromId(rs.getString("ItemId"));
                if (itemRowId != null) {
                    ThirdPartyDAO thirdPartyDAO = new ThirdPartyDAO();
                    thirdPartyRowId = thirdPartyDAO.getRowIdFromId(rs.getString("SupplierId"));
                    thirdPartyName = thirdPartyDAO.getNameFromId(rs.getString("SupplierId"));

                    UnitsDAO unitsDAO = new UnitsDAO();
                    if (rs.getString("PurchaseUnitId") != null) {
                        Integer unitRowId = unitsDAO.getRowIDFromCode(rs.getString("PurchaseUnitId"));
                        if (unitRowId != null) {
                            sellUnitRowId = Double.valueOf(unitRowId);
                        }
                    }

                    if (rs.getInt("publicPurchasePrice") != 0 && rs.getInt("NetPurchasePrice") != 0) {
                        charges = rs.getDouble("PublicPurchasePrice") - rs.getInt("NetPurchasePrice");
                    }

                    rowId++;
                    SupplierProduct supplierProduct = new SupplierProduct(
                            rowId,
                            1,
                            null,
                            null,
                            itemRowId,
                            thirdPartyRowId,
                            rs.getString("ItemId"),
                            null,
                            1,
                            rs.getDouble("PublicPurchasePrice"),
                            rs.getDouble("PurchaseOrderMinimumQuantity"),
                            rs.getDouble("DiscountRate"),
                            rs.getDouble("DiscountAmount"),
                            sellUnitRowId,
                            charges,
                            null,
                            null,
                            null,
                            20.000,
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
                            null,
                            null,
                            null
                    );
                    suppliersItemArray.add(supplierProduct);
                }
            }
            return suppliersItemArray;
        }
    }
    public void insertSupplierProduct(ArrayList<SupplierProduct> supplierProductArray) {

        String query = "INSERT INTO llx_product_fournisseur_price " +
                "(entity, datec, tms, fk_product, fk_soc, ref_fourn, desc_fourn, fk_availability, " +
                "price, quantity, remise_percent, remise, unitprice, charges, tva_tx, localtax1_tx, " +
                "localtax1_type, localtax2_tx, localtax2_type, info_bits, multicurrency_tx, status) " +
                "VALUES (?, NOW(), NOW(), ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0.0000, '0', 0.0000, '0', 0, 1.00000000, 1)";

        try (Connection conn = DolibarrDatabaseConnection.getConnection();
             PreparedStatement stmtDolibarr = conn.prepareStatement(query)) {

            for (SupplierProduct supplierProduct : supplierProductArray) {
                int i = 1;
                stmtDolibarr.setObject(i++, supplierProduct.getEntity());
                stmtDolibarr.setObject(i++, supplierProduct.getFkProduct());
                stmtDolibarr.setObject(i++, supplierProduct.getFkSoc());
                stmtDolibarr.setString(i++, supplierProduct.getRefFourn());
                stmtDolibarr.setString(i++, supplierProduct.getDescFourn());
                stmtDolibarr.setObject(i++, supplierProduct.getFkAvailability());
                stmtDolibarr.setObject(i++, supplierProduct.getPrice());
                stmtDolibarr.setObject(i++, supplierProduct.getQuantity());
                stmtDolibarr.setObject(i++, supplierProduct.getRemisePercent());
                stmtDolibarr.setObject(i++, supplierProduct.getRemise());
                stmtDolibarr.setObject(i++, supplierProduct.getUnitprice());
                stmtDolibarr.setObject(i++, supplierProduct.getCharges());
                stmtDolibarr.setObject(i++, supplierProduct.getTvaTx());

                stmtDolibarr.executeUpdate();
            }

            System.out.println("Transfert des prix fournisseurs terminé avec succès.");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
