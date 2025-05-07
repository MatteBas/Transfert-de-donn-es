//package DataBase.Dao;
//
//import DataBase.DolibarrDatabaseConnection;
//import ObjetDolibarr.Product;
//
//import org.mariadb.jdbc.Statement;
//import DataBase.DolibarrDatabaseConnection;
//import DataBase.EBPDatabaseConnection;
//
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.HashMap;
//
//public class ProductFournisseurPriceDAO {
//    public void insertProductSupplierPrices(ArrayList<Product> productsArray, HashMap<String, Integer> supplierIdMap) {
//        String query = "INSERT INTO llx_product_fournisseur_price " +
//                "(entity, datec, tms, fk_product, fk_soc, ref_fourn, desc_fourn, " +
//                "fk_availability, price, quantity, remise_percent, remise, unitprice, " +
//                "charges, tva_tx, localtax1_tx, localtax1_type, localtax2_tx, " +
//                "localtax2_type, info_bits, fk_user, delivery_time_days, " +
//                "multicurrency_tx, multicurrency_price, status) " +
//                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
//
//        // Requête pour l'insertion des logs
//        String logQuery = "INSERT INTO llx_product_fournisseur_price_log " +
//                "(datec, fk_product_fournisseur, price, quantity, fk_user, " +
//                "multicurrency_tx, multicurrency_price) " +
//                "VALUES (?, ?, ?, ?, ?, ?, ?)";
//
//        try (Connection conn = DolibarrDatabaseConnection.getConnection()) {
//            // Prépare la requête principale et la requête de log
//            PreparedStatement stmtProdFournPrice = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
//            PreparedStatement stmtProdFournPriceLog = conn.prepareStatement(logQuery);
//
//            // Date actuelle pour datec et tms
//            Timestamp currentTimestamp = new Timestamp(System.currentTimeMillis());
//
//            for (Product product : productsArray) {
//                // Récupérer l'ID du fournisseur à partir du code fournisseur
//                Integer supplierId = supplierIdMap.get(product.getSupplierCode());
//                if (supplierId == null) {
//                    System.out.println("Fournisseur non trouvé pour le produit: " + product.getCode());
//                    continue; // Passe au produit suivant si le fournisseur n'est pas trouvé
//                }
//
//                int paramIndex = 1;
//
//                // Informations générales
//                stmtProdFournPrice.setInt(paramIndex++, 1);                             // entity (par défaut 1)
//                stmtProdFournPrice.setTimestamp(paramIndex++, product.getDatec());      // datec
//                stmtProdFournPrice.setTimestamp(paramIndex++, product.getLastPurchaseDate()); // tms (date de dernière maj)
//                stmtProdFournPrice.setInt(paramIndex++, product.getRowid());            // fk_product (id du produit)
//                stmtProdFournPrice.setInt(paramIndex++, supplierId);                    // fk_soc (id du fournisseur)
//                stmtProdFournPrice.setString(paramIndex++, product.getCode());          // ref_fourn (code produit chez le fournisseur)
//                stmtProdFournPrice.setString(paramIndex++, product.getDescription());   // desc_fourn (description fournisseur)
//
//                // Informations de disponibilité
//                stmtProdFournPrice.setInt(paramIndex++, 0);                             // fk_availability (par défaut 0)
//
//                // Informations de prix
//                stmtProdFournPrice.setDouble(paramIndex++, product.getLastPurchasePrice()); // price
//                stmtProdFournPrice.setDouble(paramIndex++, 1);                          // quantity (par défaut 1)
//                stmtProdFournPrice.setDouble(paramIndex++, 0);                          // remise_percent
//                stmtProdFournPrice.setDouble(paramIndex++, 0);                          // remise
//                stmtProdFournPrice.setDouble(paramIndex++, product.getLastPurchasePrice()); // unitprice
//                stmtProdFournPrice.setDouble(paramIndex++, 0);                          // charges
//
//                // Informations de TVA
//                double tvaTx = 20.0; // Taux par défaut
//                if (product.getTvaCode() == 3) {
//                    tvaTx = 5.5;
//                }
//                stmtProdFournPrice.setDouble(paramIndex++, tvaTx);                      // tva_tx
//                stmtProdFournPrice.setDouble(paramIndex++, 0);                          // localtax1_tx
//                stmtProdFournPrice.setString(paramIndex++, "0");                        // localtax1_type
//                stmtProdFournPrice.setDouble(paramIndex++, 0);                          // localtax2_tx
//                stmtProdFournPrice.setString(paramIndex++, "0");                        // localtax2_type
//                stmtProdFournPrice.setInt(paramIndex++, 0);                             // info_bits
//
//                // Informations utilisateur et délai
//                stmtProdFournPrice.setInt(paramIndex++, 1);                             // fk_user (admin par défaut)
//                stmtProdFournPrice.setObject(paramIndex++, product.getDeliveryDelay()); // delivery_time_days
//
//                // Informations de devise
//                stmtProdFournPrice.setDouble(paramIndex++, 1);                          // multicurrency_tx
//                stmtProdFournPrice.setDouble(paramIndex++, 0);                          // multicurrency_price
//
//                // Statut
//                stmtProdFournPrice.setInt(paramIndex++, 1);                             // status (actif par défaut)
//
//                // Exécution de la requête
//                stmtProdFournPrice.executeUpdate();
//
//                // Récupération de l'ID généré pour l'insertion dans la table de log
//                ResultSet generatedKeys = stmtProdFournPrice.getGeneratedKeys();
//                if (generatedKeys.next()) {
//                    int productFournisherId = generatedKeys.getInt(1);
//
//                    // Insertion dans la table de log
//                    paramIndex = 1;
//                    stmtProdFournPriceLog.setTimestamp(paramIndex++, product.getLastPurchaseDate()); // datec
//                    stmtProdFournPriceLog.setInt(paramIndex++, productFournisherId);                 // fk_product_fournisseur
//                    stmtProdFournPriceLog.setDouble(paramIndex++, product.getLastPurchasePrice());   // price
//                    stmtProdFournPriceLog.setDouble(paramIndex++, 1);                               // quantity
//                    stmtProdFournPriceLog.setInt(paramIndex++, 1);                                  // fk_user
//                    stmtProdFournPriceLog.setDouble(paramIndex++, 1);                               // multicurrency_tx
//                    stmtProdFournPriceLog.setDouble(paramIndex++, 0);                               // multicurrency_price
//
//                    stmtProdFournPriceLog.executeUpdate();
//                }
//            }
//
//            System.out.println("Transfert des prix fournisseurs terminé avec succès.");
//        } catch (SQLException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
//}
//
