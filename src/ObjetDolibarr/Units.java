package ObjetDolibarr;

// Cette classe est une copie de la classe Units de Dolibarr (llx_c_units
public class Units {
    int rowid;
    String code;
    short sortOrder;
    int scale;
    String label;
    String short_label;
    String unit_type;
    short active;

    public Units( int rowid, String code, short sortOrder, int scale, String label, String short_label, String unit_type, short active) {
        this.rowid = rowid;
        this.code = code;
        this.sortOrder = sortOrder;
        this.scale = scale;
        this.label = label;
        this.short_label = short_label;
        this.unit_type = unit_type;
        this.active = active;
    }

    public int getRowid() {
        return this.rowid;
    }
    public String getCode() {
        return this.code;
    }
    public short getSortOrder() {
        return this.sortOrder;
    }
    public int getScale() {
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
    public short getActive() {
        return this.active;
    }

}
