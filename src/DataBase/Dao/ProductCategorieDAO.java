package DataBase.Dao;

import DataBase.DolibarrDatabaseConnection;
import DataBase.EBPDatabaseConnection;
import ObjetDolibarr.Categorie;
import ObjetDolibarr.Product;
import ObjetDolibarr.ProductCategorie;
import Utilitaire.FamilyUtilitaire;
import jdk.jfr.Description;

import java.lang.reflect.GenericArrayType;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductCategorieDAO {


    public String getFamilyId(String idItem) {
        String familyId = null;
        String sql = "SELECT FamilyId FROM Item WHERE Id = ?";

        try (Connection conn = EBPDatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, idItem);              // bind du paramètre
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    familyId = rs.getString("FamilyId");
                }
            }

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return familyId;
    }

    public String getFamilyCaptionFromID(String familyId) throws SQLException, ClassNotFoundException {
        String familyCaption = null;

        // Utilisation de requêtes paramétrées (évite les injections SQL)
        String queryFamily = "SELECT Caption FROM ItemFamily WHERE Id = ?";

        try (Connection conn = EBPDatabaseConnection.getConnection()) {

            try (PreparedStatement stmt = conn.prepareStatement(queryFamily)) {
                stmt.setString(1, familyId);
                try (ResultSet rs = stmt.executeQuery()) {
                    if (rs.next()) {
                        familyCaption = rs.getString("Caption");
                    }
                }
            }

            return familyCaption;
        }
    }

    public Integer getRowIdFromCaption(String caption) throws SQLException, ClassNotFoundException {
        Integer rowId = null;

        // Utilisation de requêtes paramétrées (évite les injections SQL)
        String query = "SELECT rowid FROM llx_categorie WHERE label = ?";

        try (Connection conn = DolibarrDatabaseConnection.getConnection()) {

            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setString(1, caption);
                try (ResultSet rs = stmt.executeQuery()) {
                    if (rs.next()) {
                        rowId = rs.getInt("rowid");
                    }
                }
            }

            return rowId;
        }
    }


    public void insertProductCategorie(List<Product> products) {
        String query = "INSERT INTO llx_categorie_product"
                + " (fk_categorie, fk_product, import_key)"
                + " VALUES (?, ?, null)";

        try (Connection conn = DolibarrDatabaseConnection.getConnection();
             PreparedStatement insertStmt = conn.prepareStatement(query)) {

            // Pour chaque produit, on calcule les IDs, on bind les paramètres et on exécute l'INSERT
            for (Product product : products) {
                String familyId        = getFamilyId(product.getRef());
                String familyCaption   = getFamilyCaptionFromID(familyId);
                Integer rowId          = getRowIdFromCaption(familyCaption);

                if (rowId != null) {
                    insertStmt.setInt(1, rowId);
                    insertStmt.setInt(2, product.getRowid());
                    insertStmt.executeUpdate();
                }
            }

            System.out.println("Insertion des catégories-produits terminée.");

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
         /*int rowId = 0;
    String familyId;
    String subFamilyId;

    public Map<Integer, FamilyUtilitaire> getFamilyInfo() {
        Map<Integer, FamilyUtilitaire> map = new HashMap<>();
        String query = "SELECT FamilyId, SubFamilyId,  FROM Item";

        try (Connection conn = EBPDatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                rowId++;
                familyId = rs.getString("FamilyId");
                subFamilyId = rs.getString("SubFamilyId");
                map.put(rowId, new FamilyUtilitaire(familyId, subFamilyId));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        rowId = 0;
        return map;
    }

    public Map<Integer, FamilyUtilitaire> getCaptionFromSubFamilyId(Map<Integer, FamilyUtilitaire> map) {
        for (int i = 0; i < map.size(); i++) {
            subFamilyId = map.get(i).getStr2();
            String query = "SELECT Caption, FROM ItemSubFamily WHERE SubFamilyId = '" + subFamilyId + "'";
            try (Connection conn = EBPDatabaseConnection.getConnection();
                 Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery(query)) {

                map.get(i).setStr2(rs.getString("Caption"));

            } catch (SQLException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }   return map;
    }
    public Map<Integer, FamilyUtilitaire> getRowIdFromCaption(Map<Integer, FamilyUtilitaire> map) {
        for (int i = 0; i < map.size(); i++) {
            String caption = map.get(i).getStr2();
            String query = "SELECT rowid, label  FROM llx_categorie WHERE label = '" + caption + "'";
            try (Connection conn = EBPDatabaseConnection.getConnection();
                 Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery(query)) {

                if (caption == rs.getString("label")) {
                    map.get(i).setStr2(rs.getString("rowid"));
                }

            } catch (SQLException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }   return map;
    }
    public void insertProductCategorie(Map<Integer, FamilyUtilitaire> map) {
        ProductCategorie prodCat;
        String query = "INSERT INTO llx_categorie_product" +
                "(fk_categorie, fk_product, import_key) " +
                "VALUES (?, ?, null)";

        try (Connection conn = DolibarrDatabaseConnection.getConnection()) {
            PreparedStatement stmtDolibarr = conn.prepareStatement(query);

            for (int i = 1; i <= map.size(); i++) {

                if (map.get(i).getStr2() != null && map.get(i).getStr1() != null) {
                    int postion = map.get(i).getStr1().length();
                    int fk_categorie = map.get(i).getStr1().charAt(postion);
                    prodCat = new ProductCategorie(fk_categorie, i,null);
                    stmtDolibarr.setInt(1,prodCat.getFk_categorie());
                    stmtDolibarr.setInt(2, prodCat.getFk_product());
                    stmtDolibarr.executeUpdate();

                    prodCat = new ProductCategorie(Integer.parseInt(map.get(i).getStr2()), i,null);
                    stmtDolibarr.setInt(1,prodCat.getFk_categorie());
                    stmtDolibarr.setInt(2, prodCat.getFk_product());
                    stmtDolibarr.executeUpdate();
                }
                else if (map.get(i).getStr1() != null) {
                    int postion = map.get(i).getStr1().length();
                    int fk_categorie = map.get(i).getStr1().charAt(postion);
                    prodCat = new ProductCategorie(fk_categorie, i,null);
                    stmtDolibarr.setInt(1,prodCat.getFk_categorie());
                    stmtDolibarr.setInt(2, prodCat.getFk_product());
                    stmtDolibarr.executeUpdate();
                }
                else if (map.get(i).getStr2() != null) {
                    prodCat = new ProductCategorie(Integer.parseInt(map.get(i).getStr2()), i,null);
                    stmtDolibarr.setInt(1,prodCat.getFk_categorie());
                    stmtDolibarr.setInt(2, prodCat.getFk_product());
                    stmtDolibarr.executeUpdate();
                }
            }

            System.out.println("Transfert terminé avec succès.");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }*/