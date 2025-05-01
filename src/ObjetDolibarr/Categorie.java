package ObjetDolibarr;

import java.sql.Date;

public class Categorie {

    private Integer rowid;
    private Integer entity = 1;
    private Integer fkParent = 0;
    private String label;
    private String refExt;
    private Integer type = 1;
    private String description;
    private String color;
    private Integer position = 0;
    private Integer fkSoc;
    private Integer visible;
    private Date dateCreation;
    private Date tms;
    private Integer fkUserCreat;
    private Integer fkUserModif;
    private String importKey;

    // Constructor
    public Categorie(Integer rowid, Integer entity, Integer fkParent, String label, String refExt, Integer type, String description,
                     String color, Integer position, Integer fkSoc, Integer visible, Date dateCreation, Date tms,
                     Integer fkUserCreat, Integer fkUserModif, String importKey) {
        this.rowid = rowid;
        this.entity = entity;
        this.fkParent = fkParent;
        this.label = label;
        this.refExt = refExt;
        this.type = type;
        this.description = description;
        this.color = color;
        this.position = position;
        this.fkSoc = fkSoc;
        this.visible = visible;
        this.dateCreation = dateCreation;
        this.tms = tms;
        this.fkUserCreat = fkUserCreat;
        this.fkUserModif = fkUserModif;
        this.importKey = importKey;
    }

    // Getters and setters for all attributes
    public Integer getRowid() {
        return rowid;
    }

    public void setRowid(int rowid) {
        this.rowid = rowid;
    }

    public Integer getEntity() {
        return entity;
    }

    public void setEntity(int entity) {
        this.entity = entity;
    }

    public Integer getFkParent() {
        return fkParent;
    }

    public void setFkParent(int fkParent) {
        this.fkParent = fkParent;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getRefExt() {
        return refExt;
    }

    public void setRefExt(String refExt) {
        this.refExt = refExt;
    }

    public Integer getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public Integer getFkSoc() {
        return fkSoc;
    }

    public void setFkSoc(Integer fkSoc) {
        this.fkSoc = fkSoc;
    }

    public Integer getVisible () { return visible;}

    public void setVisible(Integer visible) {
        this.visible = visible;
    }

    public java.sql.Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public java.sql.Date getTms() {
        return tms;
    }

    public void setTms(Date tms) {
        this.tms = tms;
    }

    public Integer getFkUserCreat() {
        return fkUserCreat;
    }

    public void setFkUserCreat(Integer fkUserCreat) {
        this.fkUserCreat = fkUserCreat;
    }

    public Integer getFkUserModif() {
        return fkUserModif;
    }

    public void setFkUserModif(Integer fkUserModif) {
        this.fkUserModif = fkUserModif;
    }

    public String getImportKey() {
        return importKey;
    }

    public void setImportKey(String importKey) {
        this.importKey = importKey;
    }
}
