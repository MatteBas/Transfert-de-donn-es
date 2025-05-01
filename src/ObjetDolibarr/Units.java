package ObjetDolibarr;

// Cette classe est une copie de la classe Units de Dolibarr (llx_c_units
public class Units {
    Integer rowid;
    String code;
    Short sortOrder;
    Integer scale;
    String label;
    String short_label;
    String unit_type;
    Short active;

    public Units( Integer rowid, String code, Short sortOrder, Integer scale, String label, String short_label, String unit_type, Short active) {
        this.rowid = rowid;
        this.code = code;
        this.sortOrder = sortOrder;
        this.scale = scale;
        this.label = label;
        this.short_label = short_label;
        this.unit_type = unit_type;
        this.active = active;
    }

    public Integer getRowid() {
        return this.rowid;
    }
    public String getCode() {
        return this.code;
    }
    public Short getSortOrder() {
        return this.sortOrder;
    }
    public Integer getScale() {
        return this.scale;
    }
    public String getLabel() {
        return this.label;
    }
    public String getShortLabel() {
        return this.short_label;
    }
    public String getUnitType() {
        return this.unit_type;
    }
    public Short getActive() {
        return this.active;
    }

}
