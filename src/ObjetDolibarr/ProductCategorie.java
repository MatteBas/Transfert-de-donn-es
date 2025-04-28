package ObjetDolibarr;

public class ProductCategorie {
    int fk_categorie;
    int fk_product;
    String import_key;

    // Constructeur
    public ProductCategorie(int fk_categorie, int fk_product, String import_key) {
        this.fk_categorie = fk_categorie;
        this.fk_product = fk_product;
        this.import_key = import_key;
    }

    // Getter et Setter pour fk_categorie
    public int getFk_categorie() {
        return fk_categorie;
    }

    public void setFk_categorie(int fk_categorie) {
        this.fk_categorie = fk_categorie;
    }

    // Getter et Setter pour fk_product
    public int getFk_product() {
        return fk_product;
    }

    public void setFk_product(int fk_product) {
        this.fk_product = fk_product;
    }

    // Getter et Setter pour import_key
    public String getImport_key() {
        return import_key;
    }

    public void setImport_key(String import_key) {
        this.import_key = import_key;
    }
}
