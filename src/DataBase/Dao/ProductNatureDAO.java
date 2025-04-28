package DataBase.Dao;

import DataBase.DolibarrDatabaseConnection;
import ObjetDolibarr.ProductCategorie;
import Utilitaire.FamilyUtilitaire;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;

public class ProductNatureDAO {

    /**
     * Insère une nouvelle nature de produit dans la table llx_c_product_nature.
     * @param itemType code numérique unique de la nature de produit
     * @param label libellé associé à la nature de produit
     */
    public void insertProductNature(int itemType, String label) {
        // rowid est AUTO_INCREMENT, pas besoin de le définir.
        String query = "INSERT INTO llx_c_product_nature (code, label, active) VALUES (?, ?, ?)";

        try (Connection conn = DolibarrDatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, itemType);
            stmt.setString(2, label);
            stmt.setInt(3, 1);

            stmt.executeUpdate();
            System.out.println("Transfert terminé avec succès.");

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

