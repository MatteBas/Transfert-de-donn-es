package ObjetDolibarr;

import java.sql.Date;
import java.sql.Timestamp;

public class CustomerProduct {

        private Integer rowid;
        private Integer entity;
        private Date datec;
        private Timestamp tms;
        private Integer fk_product;
        private Integer fk_soc;
        private String ref_customer;
        private Double price;
        private Double price_ttc;
        private Double price_min;
        private Double price_min_ttc;
        private String price_base_type;
        private String default_vat_code;
        private Double tva_tx;
        private Integer recuperableonly;
        private Double localtax1_tx;
        private String localtax1_type;
        private Double localtax2_tx;
        private String localtax2_type;
        private Integer fk_user;
        private String price_label;
        private String import_key;

        public CustomerProduct(Integer rowid, Integer entity, Date datec, Timestamp tms, Integer fk_product, Integer fk_soc,
                             String ref_customer, Double price, Double price_ttc, Double price_min, Double price_min_ttc,
                             String price_base_type, String default_vat_code, Double tva_tx, Integer recuperableonly,
                             Double localtax1_tx, String localtax1_type, Double localtax2_tx, String localtax2_type,
                             Integer fk_user, String price_label, String import_key) {
            this.rowid = rowid;
            this.entity = entity;
            this.datec = datec;
            this.tms = tms;
            this.fk_product = fk_product;
            this.fk_soc = fk_soc;
            this.ref_customer = ref_customer;
            this.price = price;
            this.price_ttc = price_ttc;
            this.price_min = price_min;
            this.price_min_ttc = price_min_ttc;
            this.price_base_type = price_base_type;
            this.default_vat_code = default_vat_code;
            this.tva_tx = tva_tx;
            this.recuperableonly = recuperableonly;
            this.localtax1_tx = localtax1_tx;
            this.localtax1_type = localtax1_type;
            this.localtax2_tx = localtax2_tx;
            this.localtax2_type = localtax2_type;
            this.fk_user = fk_user;
            this.price_label = price_label;
            this.import_key = import_key;
        }

        // Getters
        public Integer getRowid() { return rowid; }
        public Integer getEntity() { return entity; }
        public Date getDatec() { return datec; }
        public Timestamp getTms() { return tms; }
        public Integer getFk_product() { return fk_product; }
        public Integer getFk_soc() { return fk_soc; }
        public String getRef_customer() { return ref_customer; }
        public Double getPrice() { return price; }
        public Double getPrice_ttc() { return price_ttc; }
        public Double getPrice_min() { return price_min; }
        public Double getPrice_min_ttc() { return price_min_ttc; }
        public String getPrice_base_type() { return price_base_type; }
        public String getDefault_vat_code() { return default_vat_code; }
        public Double getTva_tx() { return tva_tx; }
        public Integer getRecuperableonly() { return recuperableonly; }
        public Double getLocaltax1_tx() { return localtax1_tx; }
        public String getLocaltax1_type() { return localtax1_type; }
        public Double getLocaltax2_tx() { return localtax2_tx; }
        public String getLocaltax2_type() { return localtax2_type; }
        public Integer getFk_user() { return fk_user; }
        public String getPrice_label() { return price_label; }
        public String getImport_key() { return import_key; }

        // Setters
        public void setRowid(Integer rowid) { this.rowid = rowid; }
        public void setEntity(Integer entity) { this.entity = entity; }
        public void setDatec(Date datec) { this.datec = datec; }
        public void setTms(Timestamp tms) { this.tms = tms; }
        public void setFk_product(Integer fk_product) { this.fk_product = fk_product; }
        public void setFk_soc(Integer fk_soc) { this.fk_soc = fk_soc; }
        public void setRef_customer(String ref_customer) { this.ref_customer = ref_customer; }
        public void setPrice(Double price) { this.price = price; }
        public void setPrice_ttc(Double price_ttc) { this.price_ttc = price_ttc; }
        public void setPrice_min(Double price_min) { this.price_min = price_min; }
        public void setPrice_min_ttc(Double price_min_ttc) { this.price_min_ttc = price_min_ttc; }
        public void setPrice_base_type(String price_base_type) { this.price_base_type = price_base_type; }
        public void setDefault_vat_code(String default_vat_code) { this.default_vat_code = default_vat_code; }
        public void setTva_tx(Double tva_tx) { this.tva_tx = tva_tx; }
        public void setRecuperableonly(Integer recuperableonly) { this.recuperableonly = recuperableonly; }
        public void setLocaltax1_tx(Double localtax1_tx) { this.localtax1_tx = localtax1_tx; }
        public void setLocaltax1_type(String localtax1_type) { this.localtax1_type = localtax1_type; }
        public void setLocaltax2_tx(Double localtax2_tx) { this.localtax2_tx = localtax2_tx; }
        public void setLocaltax2_type(String localtax2_type) { this.localtax2_type = localtax2_type; }
        public void setFk_user(Integer fk_user) { this.fk_user = fk_user; }
        public void setPrice_label(String price_label) { this.price_label = price_label; }
        public void setImport_key(String import_key) { this.import_key = import_key; }
    }

