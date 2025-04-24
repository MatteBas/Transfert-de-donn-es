package ObjetDolibarr;

import java.util.Date;

public class Categorie {
    private int rowid;
    private int entity = 1;
    private int fkParent = 0;
    private String label;
    private String refExt;
    private int type = 1;
    private String description;
    private String color;
    private int position = 0;
    private Integer fkSoc;
    private boolean visible = true;
    private Date dateCreation;
    private Date tms;
    private Integer fkUserCreat;
    private Integer fkUserModif;
    private String importKey;

    // Constructor
    public Categorie(int rowid, int entity, int fkParent, String label, String refExt, int type, String description, 
                     String color, int position, Integer fkSoc, boolean visible, Date dateCreation, Date tms, 
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
    public int getRowid() {
        return rowid;
    }

    public void setRowid(int rowid) {
        this.rowid = rowid;
    }

    public int getEntity() {
        return entity;
    }

    public void setEntity(int entity) {
        this.entity = entity;
    }

    public int getFkParent() {
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

    public int getType() {
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

    public int getPosition() {
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

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Date getTms() {
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
