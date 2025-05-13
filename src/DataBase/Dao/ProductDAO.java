package DataBase.Dao;

import DataBase.DolibarrDatabaseConnection;
import DataBase.EBPDatabaseConnection;
import ObjetDolibarr.Categorie;
import ObjetDolibarr.Product;

import java.sql.*;
import java.util.ArrayList;

public class ProductDAO {

    public ArrayList<Product> getAllProducts() throws SQLException, ClassNotFoundException {
        ArrayList<Product> listProducts = new ArrayList<>();
        Integer rowId = 0;
        Product product;

        String query = "SELECT Id, sysCreatedDate, sysModifiedDate, Caption, NotesClear, DesComClear, UnitId, SalePriceVatExcluded, SalePriceVatIncluded, CostPrice, Weight, WeightUnitId, Volume, VolumeUnitId, Length, Width, Height, DimensionUnitId, RealStock, Pump FROM Item WHERE ItemType = 0";

        try (Connection conn = EBPDatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {

            VatDAO vatDAO = new VatDAO();
            ArrayList<Integer> accountingCodes = vatDAO.getAccountingCode();

            UnitsDAO unitsDAO = new UnitsDAO();
            Integer weightScale = unitsDAO.getScaleFromUnit(rs.getString("WeightUnitId"));
            Integer volumeScale = unitsDAO.getScaleFromUnit(rs.getString("VolumeUnitId"));
            Integer dimensionScale = unitsDAO.getScaleFromUnit(rs.getString("DimensionUnitId"));

             Integer sellUnit = unitsDAO.getRowIDFromCode(rs.getString("UnitId"));



                rowId++;
                product = new Product(
                        rowId,
                        rs.getString("Id"),
                        1,
                        null,
                        rs.getDate("sysCreatedDate"),
                        rs.getTimestamp("sysModifiedDate"),
                        0,
                        rs.getString("Caption"),
                        rs.getString("DesComClear"),
                        rs.getString("NotesClear"),
                        null,
                        null,
                        null,
                        null,
                        rs.getDouble("SalePriceVatExcluded"),
                        rs.getDouble("SalePriceVatIncluded"),
                        rs.getDouble("SalePriceVatExcluded"),
                        rs.getDouble("SalePriceVatIncluded"),
                        "HT",
                        null,
                        rs.getDouble("CostPrice"),
                        null,
                        20.0000,
                        0,
                        0.0000,
                        "0",
                        0.0000,
                        "0",
                        1,
                        1,
                        1,
                        1,
                        0,
                        0,
                        null,
                        0,
                        "0",
                        0.0000f,
                        null,
                        null,
                        null,
                        "707",
                        "707",
                        "707",
                        "607",
                        "607",
                        "607",
                        null,
                        null,
                        null,
                        rs.getFloat("Weight"),
                        weightScale,
                        rs.getFloat("Length"),
                        dimensionScale,
                        rs.getFloat("Width"),
                        dimensionScale,
                        rs.getFloat("Height"),
                        dimensionScale,
                        null,
                        null,
                        rs.getFloat("Volume"),
                        volumeScale,
                        1,
                        rs.getDouble("RealStock"),
                        rs.getDouble("Pump"),
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        0,
                        null,
                        null,
                        null,
                        0.0000f,
                        sellUnit,
                        0,
                        null,
                        0,
                        null
                );
                listProducts.add(product);
            }
            return listProducts;
        }
    }

    public void insertProduct(ArrayList<Product> productArray) {
        String query = "INSERT INTO llx_product " +
                "(ref, entity, ref_ext, datec, tms, fk_parent, label, description, note_public, note, customcode, " +
                "fk_country, fk_state, price, price_ttc, price_min, price_min_ttc, price_base_type, price_label, cost_price, " +
                "default_vat_code, tva_tx, recuperableonly, localtax1_tx, localtax1_type, localtax2_tx, localtax2_type, " +
                "fk_user_author, fk_user_modif, tosell, tobuy, tobatch, sell_or_eat_by_mandatory, batch_mask, fk_product_type, " +
                "duration, seuil_stock_alerte, url, barcode, fk_barcode_type, accountancy_code_sell, accountancy_code_sell_intra, " +
                "accountancy_code_sell_export, accountancy_code_buy, accountancy_code_buy_intra, accountancy_code_buy_export, " +
                "partnumber, net_measure, net_measure_units, weight, weight_units, length, length_units, width, width_units, " +
                "height, height_units, surface, surface_units, volume, volume_units, stockable_product, stock, pmp, fifo, lifo, " +
                "fk_default_warehouse, fk_default_bom, fk_default_workstation, canvas, finished, lifetime, qc_frequency, hidden, " +
                "import_key, model_pdf, fk_price_expression, desiredstock, fk_unit, price_autogen, fk_project, mandatory_period, " +
                "last_main_doc) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DolibarrDatabaseConnection.getConnection()) {
            PreparedStatement stmtDolibarr = conn.prepareStatement(query);

            for (Product product : productArray) {
                stmtDolibarr.setString(1, product.getRef());
                stmtDolibarr.setInt(2, product.getEntity());
                stmtDolibarr.setString(3, product.getRefExt());
                stmtDolibarr.setDate(4, product.getDatec());
                stmtDolibarr.setTimestamp(5, product.getTms());
                stmtDolibarr.setInt(6, product.getFkParent());
                stmtDolibarr.setString(7, product.getLabel());
                stmtDolibarr.setString(8, product.getDescription());
                stmtDolibarr.setString(9, product.getNotePublic());
                stmtDolibarr.setString(10, product.getNote());
                stmtDolibarr.setString(11, product.getCustomCode());
                stmtDolibarr.setObject(12, product.getFkCountry());
                stmtDolibarr.setObject(13, product.getFkState());
                stmtDolibarr.setDouble(14, product.getPrice());
                stmtDolibarr.setDouble(15, product.getPriceTtc());
                stmtDolibarr.setDouble(16, product.getPriceMin());
                stmtDolibarr.setDouble(17, product.getPriceMinTtc());
                stmtDolibarr.setString(18, product.getPriceBaseType());
                stmtDolibarr.setString(19, product.getPriceLabel());
                stmtDolibarr.setDouble(20, product.getCostPrice());
                stmtDolibarr.setString(21, product.getDefaultVatCode());
                stmtDolibarr.setObject(22, product.getTvaTx());
                stmtDolibarr.setInt(23, product.getRecuperableOnly());
                stmtDolibarr.setObject(24, product.getLocaltax1Tx());
                stmtDolibarr.setString(25, product.getLocaltax1Type());
                stmtDolibarr.setObject(26, product.getLocaltax2Tx());
                stmtDolibarr.setString(27, product.getLocaltax2Type());
                stmtDolibarr.setObject(28, product.getFkUserAuthor());
                stmtDolibarr.setObject(29, product.getFkUserModif());
                stmtDolibarr.setObject(30, product.getToSell());
                stmtDolibarr.setObject(31, product.getToBuy());
                stmtDolibarr.setInt(32, product.getToBatch());
                stmtDolibarr.setInt(33, product.getSellOrEatByMandatory());
                stmtDolibarr.setString(34, product.getBatchMask());
                stmtDolibarr.setObject(35, product.getFkProductType());
                stmtDolibarr.setString(36, product.getDuration());
                stmtDolibarr.setObject(37, product.getSeuilStockAlerte());
                stmtDolibarr.setString(38, product.getUrl());
                stmtDolibarr.setString(39, product.getBarcode());
                stmtDolibarr.setObject(40, product.getFkBarcodeType());
                stmtDolibarr.setString(41, product.getAccountancyCodeSell());
                stmtDolibarr.setString(42, product.getAccountancyCodeSellIntra());
                stmtDolibarr.setString(43, product.getAccountancyCodeSellExport());
                stmtDolibarr.setString(44, product.getAccountancyCodeBuy());
                stmtDolibarr.setString(45, product.getAccountancyCodeBuyIntra());
                stmtDolibarr.setString(46, product.getAccountancyCodeBuyExport());
                stmtDolibarr.setString(47, product.getPartNumber());
                stmtDolibarr.setObject(48, product.getNetMeasure());
                stmtDolibarr.setObject(49, product.getNetMeasureUnits());
                stmtDolibarr.setObject(50, product.getWeight());
                stmtDolibarr.setObject(51, product.getWeightUnits());
                stmtDolibarr.setObject(52, product.getLength());
                stmtDolibarr.setObject(53, product.getLengthUnits());
                stmtDolibarr.setObject(54, product.getWidth());
                stmtDolibarr.setObject(55, product.getWidthUnits());
                stmtDolibarr.setObject(56, product.getHeight());
                stmtDolibarr.setObject(57, product.getHeightUnits());
                stmtDolibarr.setObject(58, product.getSurface());
                stmtDolibarr.setObject(59, product.getSurfaceUnits());
                stmtDolibarr.setObject(60, product.getVolume());
                stmtDolibarr.setObject(61, product.getVolumeUnits());
                stmtDolibarr.setInt(62, product.getStockableProduct());
                stmtDolibarr.setObject(63, product.getStock());
                stmtDolibarr.setObject(64, product.getPmp());
                stmtDolibarr.setObject(65, product.getFifo());
                stmtDolibarr.setObject(66, product.getLifo());
                stmtDolibarr.setObject(67, product.getFkDefaultWarehouse());
                stmtDolibarr.setObject(68, product.getFkDefaultBom());
                stmtDolibarr.setObject(69, product.getFkDefaultWorkstation());
                stmtDolibarr.setString(70, product.getCanvas());
                stmtDolibarr.setObject(71, product.getFinished());
                stmtDolibarr.setObject(72, product.getLifetime());
                stmtDolibarr.setObject(73, product.getQcFrequency());
                stmtDolibarr.setInt(74, product.getHidden());
                stmtDolibarr.setString(75, product.getImportKey());
                stmtDolibarr.setString(76, product.getModelPdf());
                stmtDolibarr.setObject(77, product.getFkPriceExpression());
                stmtDolibarr.setObject(78, product.getDesiredStock());
                stmtDolibarr.setObject(79, product.getFkUnit());
                stmtDolibarr.setInt(80, product.getPriceAutogen());
                stmtDolibarr.setObject(81, product.getFkProject());
                stmtDolibarr.setInt(82, product.getMandatoryPeriod());
                stmtDolibarr.setString(83, product.getLastMainDoc());

                stmtDolibarr.executeUpdate();
            }

            System.out.println("Transfert terminé avec succès.");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
