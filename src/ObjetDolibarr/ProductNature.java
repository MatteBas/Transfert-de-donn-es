package ObjetDolibarr;

public class ProductNature {
    Integer rowid;
    String code;
    String label;
    Integer active;

    public ProductNature(Integer rowid, String code, String label, Integer active) {
        this.rowid = rowid;
        this.code = code;
        this.label = label;
        this.active = active;
    }

    public Integer getRowid() {
        return rowid;
    }

    public String getCode() {
        return code;
    }

    public String getLabel() {
        return label;
    }

    public Integer getActive() {
        return active;
    }

    public void setRowid(Integer rowid) {
        this.rowid = rowid;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setActive(Integer active) {
        this.active = active;
    }
}
