package ObjetDolibarr;
import java.time.LocalDateTime;
import java.sql.Timestamp;

public class SupplierProduct {
    private Integer rowid;
    private Integer entity;
    private LocalDateTime datec;
    private Timestamp tms;
    private Integer fkProduct;
    private Integer fkSoc;
    private String refFourn;
    private String descFourn;
    private Integer fkAvailability;
    private Double price;
    private Double quantity;
    private Double remisePercent;
    private Double remise;
    private Double unitprice;
    private Double charges;
    private String defaultVatCode;
    private String barcode;
    private Integer fkBarcodeType;
    private Double tvaTx;
    private Double localtax1Tx;
    private String localtax1Type;
    private Double localtax2Tx;
    private String localtax2Type;
    private Integer infoBits;
    private Integer fkUser;
    private Integer fkSupplierPriceExpression;
    private Integer deliveryTimeDays;
    private String supplierReputation;
    private Double packaging;
    private Integer fkMulticurrency;
    private String multicurrencyCode;
    private Double multicurrencyTx;
    private Double multicurrencyUnitprice;
    private Double multicurrencyPrice;
    private String importKey;
    private Integer status;

    public SupplierProduct(Integer rowid, Integer entity, LocalDateTime datec, Timestamp tms, Integer fkProduct,
                           Integer fkSoc, String refFourn, String descFourn, Integer fkAvailability, Double price, Double quantity,
                           Double remisePercent, Double remise, Double unitprice, Double charges, String defaultVatCode,
                           String barcode, Integer fkBarcodeType, Double tvaTx, Double localtax1Tx, String localtax1Type,
                           Double localtax2Tx, String localtax2Type, Integer infoBits, Integer fkUser,
                           Integer fkSupplierPriceExpression, Integer deliveryTimeDays, String supplierReputation, Double packaging,
                           Integer fkMulticurrency, String multicurrencyCode, Double multicurrencyTx, Double multicurrencyUnitprice,
                           Double multicurrencyPrice, String importKey, Integer status) {
        this.rowid = rowid;
        this.entity = entity;
        this.datec = datec;
        this.tms = tms;
        this.fkProduct = fkProduct;
        this.fkSoc = fkSoc;
        this.refFourn = refFourn;
        this.descFourn = descFourn;
        this.fkAvailability = fkAvailability;
        this.price = price;
        this.quantity = quantity;
        this.remisePercent = remisePercent;
        this.remise = remise;
        this.unitprice = unitprice;
        this.charges = charges;
        this.defaultVatCode = defaultVatCode;
        this.barcode = barcode;
        this.fkBarcodeType = fkBarcodeType;
        this.tvaTx = tvaTx;
        this.localtax1Tx = localtax1Tx;
        this.localtax1Type = localtax1Type;
        this.localtax2Tx = localtax2Tx;
        this.localtax2Type = localtax2Type;
        this.infoBits = infoBits;
        this.fkUser = fkUser;
        this.fkSupplierPriceExpression = fkSupplierPriceExpression;
        this.deliveryTimeDays = deliveryTimeDays;
        this.supplierReputation = supplierReputation;
        this.packaging = packaging;
        this.fkMulticurrency = fkMulticurrency;
        this.multicurrencyCode = multicurrencyCode;
        this.multicurrencyTx = multicurrencyTx;
        this.multicurrencyUnitprice = multicurrencyUnitprice;
        this.multicurrencyPrice = multicurrencyPrice;
        this.importKey = importKey;
        this.status = status;
    }

    // Les getters et setters
    public Integer getRowid() { return rowid; }
    public void setRowid(Integer rowid) { this.rowid = rowid; }

    public Integer getEntity() { return entity; }
    public void setEntity(Integer entity) { this.entity = entity; }

    public LocalDateTime getDatec() { return datec; }
    public void setDatec(LocalDateTime datec) { this.datec = datec; }

    public Timestamp getTms() { return tms; }
    public void setTms(Timestamp tms) { this.tms = tms; }

    public Integer getFkProduct() { return fkProduct; }
    public void setFkProduct(Integer fkProduct) { this.fkProduct = fkProduct; }

    public Integer getFkSoc() { return fkSoc; }
    public void setFkSoc(Integer fkSoc) { this.fkSoc = fkSoc; }

    public String getRefFourn() { return refFourn; }
    public void setRefFourn(String refFourn) { this.refFourn = refFourn; }

    public String getDescFourn() { return descFourn; }
    public void setDescFourn(String descFourn) { this.descFourn = descFourn; }

    public Integer getFkAvailability() { return fkAvailability; }
    public void setFkAvailability(Integer fkAvailability) { this.fkAvailability = fkAvailability; }

    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }

    public Double getQuantity() { return quantity; }
    public void setQuantity(Double quantity) { this.quantity = quantity; }

    public Double getRemisePercent() { return remisePercent; }
    public void setRemisePercent(Double remisePercent) { this.remisePercent = remisePercent; }

    public Double getRemise() { return remise; }
    public void setRemise(Double remise) { this.remise = remise; }

    public Double getUnitprice() { return unitprice; }
    public void setUnitprice(Double unitprice) { this.unitprice = unitprice; }

    public Double getCharges() { return charges; }
    public void setCharges(Double charges) { this.charges = charges; }

    public String getDefaultVatCode() { return defaultVatCode; }
    public void setDefaultVatCode(String defaultVatCode) { this.defaultVatCode = defaultVatCode; }

    public String getBarcode() { return barcode; }
    public void setBarcode(String barcode) { this.barcode = barcode; }

    public Integer getFkBarcodeType() { return fkBarcodeType; }
    public void setFkBarcodeType(Integer fkBarcodeType) { this.fkBarcodeType = fkBarcodeType; }

    public Double getTvaTx() { return tvaTx; }
    public void setTvaTx(Double tvaTx) { this.tvaTx = tvaTx; }

    public Double getLocaltax1Tx() { return localtax1Tx; }
    public void setLocaltax1Tx(Double localtax1Tx) { this.localtax1Tx = localtax1Tx; }

    public String getLocaltax1Type() { return localtax1Type; }
    public void setLocaltax1Type(String localtax1Type) { this.localtax1Type = localtax1Type; }

    public Double getLocaltax2Tx() { return localtax2Tx; }
    public void setLocaltax2Tx(Double localtax2Tx) { this.localtax2Tx = localtax2Tx; }

    public String getLocaltax2Type() { return localtax2Type; }
    public void setLocaltax2Type(String localtax2Type) { this.localtax2Type = localtax2Type; }

    public Integer getInfoBits() { return infoBits; }
    public void setInfoBits(Integer infoBits) { this.infoBits = infoBits; }

    public Integer getFkUser() { return fkUser; }
    public void setFkUser(Integer fkUser) { this.fkUser = fkUser; }

    public Integer getFkSupplierPriceExpression() { return fkSupplierPriceExpression; }
    public void setFkSupplierPriceExpression(Integer fkSupplierPriceExpression) { this.fkSupplierPriceExpression = fkSupplierPriceExpression; }

    public Integer getDeliveryTimeDays() { return deliveryTimeDays; }
    public void setDeliveryTimeDays(Integer deliveryTimeDays) { this.deliveryTimeDays = deliveryTimeDays; }

    public String getSupplierReputation() { return supplierReputation; }
    public void setSupplierReputation(String supplierReputation) { this.supplierReputation = supplierReputation; }

    public Double getPackaging() { return packaging; }
    public void setPackaging(Double packaging) { this.packaging = packaging; }

    public Integer getFkMulticurrency() { return fkMulticurrency; }
    public void setFkMulticurrency(Integer fkMulticurrency) { this.fkMulticurrency = fkMulticurrency; }

    public String getMulticurrencyCode() { return multicurrencyCode; }
    public void setMulticurrencyCode(String multicurrencyCode) { this.multicurrencyCode = multicurrencyCode; }

    public Double getMulticurrencyTx() { return multicurrencyTx; }
    public void setMulticurrencyTx(Double multicurrencyTx) { this.multicurrencyTx = multicurrencyTx; }

    public Double getMulticurrencyUnitprice() { return multicurrencyUnitprice; }
    public void setMulticurrencyUnitprice(Double multicurrencyUnitprice) { this.multicurrencyUnitprice = multicurrencyUnitprice; }

    public Double getMulticurrencyPrice() { return multicurrencyPrice; }
    public void setMulticurrencyPrice(Double multicurrencyPrice) { this.multicurrencyPrice = multicurrencyPrice; }

    public String getImportKey() { return importKey; }
    public void setImportKey(String importKey) { this.importKey = importKey; }

    public Integer getStatus() { return status; }
    public void setStatus(Integer status) { this.status = status; }
}
