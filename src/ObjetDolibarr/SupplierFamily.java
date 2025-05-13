package ObjetDolibarr;

public class SupplierFamily {
    Integer fk_categorie;
    Integer fk_soc;
    String import_key;

    public SupplierFamily(Integer fk_categorie, Integer fk_soc, String import_key) {
        this.fk_categorie = fk_categorie;
        this.fk_soc = fk_soc;
        this.import_key = import_key;
    }
    public Integer getFk_categorie() {
        return fk_categorie;
    }
    public void setFk_categorie(Integer fk_categorie) {
        this.fk_categorie = fk_categorie;
    }
    public Integer getFk_soc() {
        return fk_soc;
    }
    public void setFk_soc(Integer fk_soc) {
        this.fk_soc = fk_soc;
    }
    public String getImport_key() {
        return import_key;
    }
    public void setImport_key(String import_key) {
        this.import_key = import_key;
    }
}
