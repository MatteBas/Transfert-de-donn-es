package ObjetDolibarr;

public class ProductNature {
    int rowid;
    String code;
    String label;
    int active;

    public ProductNature(int rowid, String code, String label, int active) {
        this.rowid = rowid;
        this.code = code;
        this.label = label;
        this.active = active;
    }

    public int getRowid() {
        return rowid;
    }

    public String getCode() {
        return code;
    }

    public String getLabel() {
        return label;
    }

    public int getActive() {
        return active;
    }

    public void setRowid(int rowid) {
        this.rowid = rowid;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setActive(int active) {
        this.active = active;
    }
}
