package DataBase.Dao;

import DataBase.DolibarrDatabaseConnection;
import DataBase.EBPDatabaseConnection;
import ObjetDolibarr.ThirdParty;

import java.sql.*;
import java.util.ArrayList;

public class ThirdPartyDAO {
    public ArrayList<ThirdParty> getCustomers() {
        int rowId = 0;
        ArrayList<ThirdParty> customersArray = new ArrayList<>();
        String query = "SELECT Id, Name, MainDeliveryContact_Name,  MainDeliveryContact_FirstName, Accounts_Account, MainDeliveryAddress_Address1, MainDeliveryAddress_ZipCode, MainDeliveryAddress_City, MainDeliveryAddress_State, MainDeliveryAddress_CountryIsoCode,  MainDeliveryContact_Phone,  MainDeliveryContact_Cellphone,  MainDeliveryContact_Fax,  MainDeliveryContact_Email, Siren, Nic, Naf, CurrentAmount, DiscountRate FROM Customer";

        try (Connection conn = EBPDatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                String alias = rs.getString("MainDeliveryContact_Name") + " " + rs.getString("MainDeliveryContact_FirstName");
                String siret = rs.getString("Siren") + rs.getString("Nic");

                DepartementsDAO depDao = new DepartementsDAO();
                Integer departement = depDao.getRowId(rs.getString("MainDeliveryAddress_ZipCode"));

                rowId++;
                ThirdParty customer = new ThirdParty(
                        rowId,
                        rs.getString("Name"),
                        alias,
                        1,
                        null,
                        0,
                        null,
                        1,
                        rs.getString("Id"),
                        null,
                        rs.getString("Accounts_Account"),
                        null,
                        rs.getString("MainDeliveryAddress_Address1"),
                        rs.getString("MainDeliveryAddress_ZipCode"),
                        rs.getString("MainDeliveryAddress_City"),
                        departement,
                        1,
                        null,
                        null,
                        null,
                        null,
                        rs.getString("MainDeliveryContact_Phone"),
                        rs.getString("MainDeliveryContact_Cellphone"),
                        rs.getString("MainDeliveryContact_Fax"),
                        null,
                        rs.getString("MainDeliveryContact_Email"),
                        0,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        rs.getString("Siren"),
                        siret,
                        rs.getString("Naf"),
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
                        1,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        rs.getDouble("DiscountRate"),
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
                        null,
                        null,
                        null,
                        null,
                        null
                        );
                customersArray.add(customer);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return customersArray;
    }
    public void insertThirdParty(ArrayList<ThirdParty> customersArray) {
        String query = "INSERT INTO llx_societe " +
                "(nom, name_alias, entity, ref_ext, statut, parent, status, code_client, code_fournisseur, code_compta, " +
                "code_compta_fournisseur, address, zip, town, fk_departement, fk_pays, phone, phone_mobile, fax, email, " +
                "siren, siret, ape, client, fk_account) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DolibarrDatabaseConnection.getConnection()) {
            PreparedStatement stmtDolibarr = conn.prepareStatement(query);

            for (ThirdParty customer : customersArray) {
                stmtDolibarr.setString(1, customer.getNom());
                stmtDolibarr.setString(2, customer.getNameAlias());
                stmtDolibarr.setObject(3, customer.getEntity());
                stmtDolibarr.setString(4, customer.getRefExt());
                stmtDolibarr.setObject(5, customer.getStatut());
                stmtDolibarr.setObject(6, customer.getParent());
                stmtDolibarr.setObject(7, customer.getStatus());
                stmtDolibarr.setString(8, customer.getCodeClient());
                stmtDolibarr.setString(9, customer.getCodeFournisseur());
                stmtDolibarr.setString(10, customer.getCodeCompta());
                stmtDolibarr.setString(11, customer.getCodeComptaFournisseur());
                stmtDolibarr.setString(12, customer.getAddress());
                stmtDolibarr.setString(13, customer.getZip());
                stmtDolibarr.setString(14, customer.getTown());
                stmtDolibarr.setObject(15, customer.getFkDepartement());
                stmtDolibarr.setObject(16, customer.getFkPays());
                stmtDolibarr.setString(17, customer.getPhone());
                stmtDolibarr.setString(18, customer.getPhoneMobile());
                stmtDolibarr.setString(19, customer.getFax());
                stmtDolibarr.setString(20, customer.getEmail());
                stmtDolibarr.setString(21, customer.getSiren());
                stmtDolibarr.setString(22, customer.getSiret());
                stmtDolibarr.setString(23, customer.getApe());
                stmtDolibarr.setObject(24, customer.getClient());
                stmtDolibarr.setObject(25, customer.getFkAccount());

                stmtDolibarr.executeUpdate();
            }

            System.out.println("Transfert des clients terminé avec succès.");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public ArrayList<ThirdParty> getSuppliers() {
        int rowId = 0;
        ArrayList<ThirdParty> customersArray = new ArrayList<>();
        String query = "SELECT Id, Name, MainDeliveryContact_Name,  MainDeliveryContact_FirstName, Accounts_Account, MainDeliveryAddress_Address1, MainDeliveryAddress_ZipCode, MainDeliveryAddress_City, MainDeliveryAddress_State, MainDeliveryAddress_CountryIsoCode,  MainDeliveryContact_Phone,  MainDeliveryContact_Cellphone,  MainDeliveryContact_Fax,  MainDeliveryContact_Email, Siren, Nic, Naf, CurrentAmount, DiscountRate, IntracommunityVATNumber, VatMode, SettlementModeId, AllowedAmount, PaymentDate  FROM Supplier";

        try (Connection conn = EBPDatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                String alias = rs.getString("MainDeliveryContact_Name") + " " + rs.getString("MainDeliveryContact_FirstName");
                String siret = rs.getString("Siren") + rs.getString("Nic");

                DepartementsDAO depDao = new DepartementsDAO();
                Integer departement = depDao.getRowId(rs.getString("MainDeliveryAddress_ZipCode"));

                rowId++;
                ThirdParty customer = new ThirdParty(
                        rowId,
                        rs.getString("Name"),
                        alias,
                        1,
                        null,
                        0,
                        null,
                        1,
                        null,
                        rs.getString("Id"),
                        null,
                        rs.getString("Accounts_Account"),
                        rs.getString("MainDeliveryAddress_Address1"),
                        rs.getString("MainDeliveryAddress_ZipCode"),
                        rs.getString("MainDeliveryAddress_City"),
                        departement,
                        1,
                        null,
                        null,
                        null,
                        null,
                        rs.getString("MainDeliveryContact_Phone"),
                        rs.getString("MainDeliveryContact_Cellphone"),
                        rs.getString("MainDeliveryContact_Fax"),
                        null,
                        rs.getString("MainDeliveryContact_Email"),
                        0,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        rs.getString("Siren"),
                        siret,
                        rs.getString("Naf"),
                        null,
                        null,
                        rs.getString("IntracommunityVATNumber"),
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        0,
                        1,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        rs.getDouble("DiscountRate"),
                        rs.getInt("SettlementModeId"),
                        rs.getInt("PaymentDate"),
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        1,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        rs.getDouble("AllowedAmount"),
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
                        null,
                        null
                );
                customersArray.add(customer);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return customersArray;
    }
    public void insertSuppliers(ArrayList<ThirdParty> customersArray) {
        String query = "INSERT INTO llx_societe " +
                "(nom, name_alias, entity, status, code_fournisseur, code_compta_fournisseur, address, " +
                "zip, town, fk_departement, fk_pays, phone, phone_mobile, fax, email, " +
                "siren, siret, ape, tva_intra, remise_supplier, mode_reglement_supplier, " +
                "cond_reglement_supplier, outstanding_limit, fournisseur, client, tva_assuj) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DolibarrDatabaseConnection.getConnection()) {
            PreparedStatement stmtDolibarr = conn.prepareStatement(query);

            for (ThirdParty customer : customersArray) {
                int paramIndex = 1;

                // Informations générales
                stmtDolibarr.setString(paramIndex++, customer.getNom());                     // nom (Name)
                stmtDolibarr.setString(paramIndex++, customer.getNameAlias());               // name_alias (MainDeliveryContact_Name + FirstName)
                stmtDolibarr.setInt(paramIndex++, 1);                                        // entity (par défaut 1)
                stmtDolibarr.setInt(paramIndex++, 1);                                        // status (actif par défaut)
                stmtDolibarr.setString(paramIndex++, customer.getCodeFournisseur());         // code_fournisseur (Id)
                stmtDolibarr.setString(paramIndex++, customer.getCodeComptaFournisseur());   // code_compta_fournisseur (Accounts_Account)

                // Adresse et coordonnées
                stmtDolibarr.setString(paramIndex++, customer.getAddress());                 // address (MainDeliveryAddress_Address1)
                stmtDolibarr.setString(paramIndex++, customer.getZip());                     // zip (MainDeliveryAddress_ZipCode)
                stmtDolibarr.setString(paramIndex++, customer.getTown());                    // town (MainDeliveryAddress_City)
                stmtDolibarr.setObject(paramIndex++, customer.getFkDepartement());           // fk_departement (calcul basé sur ZipCode)
                stmtDolibarr.setInt(paramIndex++, 1);                                        // fk_pays (par défaut 1 pour France)
                stmtDolibarr.setString(paramIndex++, customer.getPhone());                   // phone (MainDeliveryContact_Phone)
                stmtDolibarr.setString(paramIndex++, customer.getPhoneMobile());             // phone_mobile (MainDeliveryContact_Cellphone)
                stmtDolibarr.setString(paramIndex++, customer.getFax());                     // fax (MainDeliveryContact_Fax)
                stmtDolibarr.setString(paramIndex++, customer.getEmail());                   // email (MainDeliveryContact_Email)

                // Informations légales et fiscales
                stmtDolibarr.setString(paramIndex++, customer.getSiren());                   // siren (Siren)
                stmtDolibarr.setString(paramIndex++, customer.getSiret());                   // siret (Siren + Nic)
                stmtDolibarr.setString(paramIndex++, customer.getApe());                     // ape (Naf)
                stmtDolibarr.setString(paramIndex++, customer.getTvaIntra());                // tva_intra (IntracommunityVATNumber)

                // Informations commerciales et comptables
                stmtDolibarr.setDouble(paramIndex++, customer.getRemiseSupplier());          // remise_supplier (DiscountRate)

                // Conversion du mode de règlement EBP vers Dolibarr
                Integer settlementMode = customer.getModeReglementSupplier();                // mode_reglement_supplier (SettlementModeId)
                if (settlementMode != null) {
                    stmtDolibarr.setInt(paramIndex++, settlementMode);
                } else {
                    stmtDolibarr.setNull(paramIndex++, java.sql.Types.INTEGER);
                }

                // Conversion des conditions de règlement EBP vers Dolibarr
                Integer paymentTerms = customer.getCondReglementSupplier();                  // cond_reglement_supplier (PaymentDate)
                if (paymentTerms != null) {
                    stmtDolibarr.setInt(paramIndex++, paymentTerms);
                } else {
                    stmtDolibarr.setNull(paramIndex++, java.sql.Types.INTEGER);
                }

                // Encours et limites
                Double allowedAmount = customer.getOutstandingLimit();                       // outstanding_limit (AllowedAmount)
                if (allowedAmount != null) {
                    stmtDolibarr.setDouble(paramIndex++, allowedAmount);
                } else {
                    stmtDolibarr.setNull(paramIndex++, java.sql.Types.DOUBLE);
                }

                // Type de tiers
                stmtDolibarr.setInt(paramIndex++, 1);                                       // fournisseur (toujours 1 pour un fournisseur)
                stmtDolibarr.setInt(paramIndex++, 0);                                       // client (0 par défaut pour un fournisseur)

                // TVA
                Integer vatMode = 1;                                                        // tva_assuj (VatMode)
                // VatMode dans EBP pourrait nécessiter une conversion selon les valeurs
                stmtDolibarr.setInt(paramIndex++, vatMode);

                stmtDolibarr.executeUpdate();
            }

            System.out.println("Transfert des fournisseurs terminé avec succès.");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

