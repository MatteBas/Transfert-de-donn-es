package DataBase.Dao;

import DataBase.EBPDatabaseConnection;
import ObjetDolibarr.Categorie;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class VatDAO {

    public ArrayList<Integer> getAccountingCode() {
        ArrayList<Integer> accountingCodes = new ArrayList<>();
        String query = "SELECT SellingCollectionVatAccount, SellingDebitVatAccount, SellingGoodsAccount, PurchaseCollectionVatAccount, PurchaseDebitVatAccount, PurchaseGoodsAccount FROM Vat WHERE Id = '36CAB0DE-3E5B-4BEE-A556-8EABB1673E76'";

        try (Connection conn = EBPDatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            accountingCodes.add(rs.getInt("SellingCollectionVatAccount"));
            accountingCodes.add(rs.getInt("SellingDebitVatAccount"));
            accountingCodes.add(rs.getInt("SellingGoodsAccount"));
            accountingCodes.add(rs.getInt("PurchaseCollectionVatAccount"));
            accountingCodes.add(rs.getInt("PurchaseDebitVatAccount"));
            accountingCodes.add(rs.getInt("PurchaseGoodsAccount"));

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return accountingCodes;
    }
}
