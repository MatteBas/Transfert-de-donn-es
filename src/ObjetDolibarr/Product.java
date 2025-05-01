package ObjetDolibarr;

import java.sql.Date;
import java.sql.Timestamp;

public class Product {

    private Integer rowid;
    private String ref;
    private Integer entity;
    private String refExt;
    private Date datec;
    private Timestamp tms;
    private Integer fkParent;
    private String label;
    private String description;
    private String notePublic;
    private String note;
    private String customCode;
    private Integer fkCountry;
    private Integer fkState;
    private Double price;
    private Double priceTtc;
    private Double priceMin;
    private Double priceMinTtc;
    private String priceBaseType;
    private String priceLabel;
    private Double costPrice;
    private String defaultVatCode;
    private Double tvaTx;
    private Integer recuperableOnly;
    private Double localtax1Tx;
    private String localtax1Type;
    private Double localtax2Tx;
    private String localtax2Type;
    private Integer fkUserAuthor;
    private Integer fkUserModif;
    private Integer toSell;
    private Integer toBuy;
    private Integer toBatch;
    private Integer sellOrEatByMandatory;
    private String batchMask;
    private Integer fkProductType;
    private String duration;
    private Float seuilStockAlerte;
    private String url;
    private String barcode;
    private Integer fkBarcodeType;
    private String accountancyCodeSell;
    private String accountancyCodeSellIntra;
    private String accountancyCodeSellExport;
    private String accountancyCodeBuy;
    private String accountancyCodeBuyIntra;
    private String accountancyCodeBuyExport;
    private String partNumber;
    private Float netMeasure;
    private Integer netMeasureUnits;
    private Float weight;
    private Integer weightUnits;
    private Float length;
    private Integer lengthUnits;
    private Float width;
    private Integer widthUnits;
    private Float height;
    private Integer heightUnits;
    private Float surface;
    private Integer surfaceUnits;
    private Float volume;
    private Integer volumeUnits;
    private Integer stockableProduct;
    private Double stock;
    private Double pmp;
    private Double fifo;
    private Double lifo;
    private Integer fkDefaultWarehouse;
    private Integer fkDefaultBom;
    private Integer fkDefaultWorkstation;
    private String canvas;
    private Integer finished;
    private Integer lifetime;
    private Integer qcFrequency;
    private Integer hidden;
    private String importKey;
    private String modelPdf;
    private Integer fkPriceExpression;
    private Float desiredStock;
    private Integer fkUnit;
    private Integer priceAutogen;
    private Integer fkProject;
    private Integer mandatoryPeriod;
    private String lastMainDoc;

    public Product(Integer rowid, String ref, Integer entity, String refExt, Date datec, Timestamp tms, Integer fkParent, String label,
                   String description, String notePublic, String note, String customCode, Integer fkCountry, Integer fkState,
                   Double price, Double priceTtc, Double priceMin, Double priceMinTtc, String priceBaseType, String priceLabel,
                   Double costPrice, String defaultVatCode, Double tvaTx, Integer recuperableOnly, Double localtax1Tx,
                   String localtax1Type, Double localtax2Tx, String localtax2Type, Integer fkUserAuthor, Integer fkUserModif,
                   Integer toSell, Integer toBuy, Integer toBatch, Integer sellOrEatByMandatory, String batchMask, Integer fkProductType,
                   String duration, Float seuilStockAlerte, String url, String barcode, Integer fkBarcodeType,
                   String accountancyCodeSell, String accountancyCodeSellIntra, String accountancyCodeSellExport,
                   String accountancyCodeBuy, String accountancyCodeBuyIntra, String accountancyCodeBuyExport,
                   String partNumber, Float netMeasure, Integer netMeasureUnits, Float weight, Integer weightUnits,
                   Float length, Integer lengthUnits, Float width, Integer widthUnits, Float height, Integer heightUnits,
                   Float surface, Integer surfaceUnits, Float volume, Integer volumeUnits, Integer stockableProduct, Double stock,
                   Double pmp, Double fifo, Double lifo, Integer fkDefaultWarehouse, Integer fkDefaultBom,
                   Integer fkDefaultWorkstation, String canvas, Integer finished, Integer lifetime, Integer qcFrequency,
                   Integer hidden, String importKey, String modelPdf, Integer fkPriceExpression, Float desiredStock,
                   Integer fkUnit, Integer priceAutogen, Integer fkProject, Integer mandatoryPeriod, String lastMainDoc) {
        this.rowid = rowid;
        this.ref = ref;
        this.entity = entity;
        this.refExt = refExt;
        this.datec = datec;
        this.tms = tms;
        this.fkParent = fkParent;
        this.label = label;
        this.description = description;
        this.notePublic = notePublic;
        this.note = note;
        this.customCode = customCode;
        this.fkCountry = fkCountry;
        this.fkState = fkState;
        this.price = price;
        this.priceTtc = priceTtc;
        this.priceMin = priceMin;
        this.priceMinTtc = priceMinTtc;
        this.priceBaseType = priceBaseType;
        this.priceLabel = priceLabel;
        this.costPrice = costPrice;
        this.defaultVatCode = defaultVatCode;
        this.tvaTx = tvaTx;
        this.recuperableOnly = recuperableOnly;
        this.localtax1Tx = localtax1Tx;
        this.localtax1Type = localtax1Type;
        this.localtax2Tx = localtax2Tx;
        this.localtax2Type = localtax2Type;
        this.fkUserAuthor = fkUserAuthor;
        this.fkUserModif = fkUserModif;
        this.toSell = toSell;
        this.toBuy = toBuy;
        this.toBatch = toBatch;
        this.sellOrEatByMandatory = sellOrEatByMandatory;
        this.batchMask = batchMask;
        this.fkProductType = fkProductType;
        this.duration = duration;
        this.seuilStockAlerte = seuilStockAlerte;
        this.url = url;
        this.barcode = barcode;
        this.fkBarcodeType = fkBarcodeType;
        this.accountancyCodeSell = accountancyCodeSell;
        this.accountancyCodeSellIntra = accountancyCodeSellIntra;
        this.accountancyCodeSellExport = accountancyCodeSellExport;
        this.accountancyCodeBuy = accountancyCodeBuy;
        this.accountancyCodeBuyIntra = accountancyCodeBuyIntra;
        this.accountancyCodeBuyExport = accountancyCodeBuyExport;
        this.partNumber = partNumber;
        this.netMeasure = netMeasure;
        this.netMeasureUnits = netMeasureUnits;
        this.weight = weight;
        this.weightUnits = weightUnits;
        this.length = length;
        this.lengthUnits = lengthUnits;
        this.width = width;
        this.widthUnits = widthUnits;
        this.height = height;
        this.heightUnits = heightUnits;
        this.surface = surface;
        this.surfaceUnits = surfaceUnits;
        this.volume = volume;
        this.volumeUnits = volumeUnits;
        this.stockableProduct = stockableProduct;
        this.stock = stock;
        this.pmp = pmp;
        this.fifo = fifo;
        this.lifo = lifo;
        this.fkDefaultWarehouse = fkDefaultWarehouse;
        this.fkDefaultBom = fkDefaultBom;
        this.fkDefaultWorkstation = fkDefaultWorkstation;
        this.canvas = canvas;
        this.finished = finished;
        this.lifetime = lifetime;
        this.qcFrequency = qcFrequency;
        this.hidden = hidden;
        this.importKey = importKey;
        this.modelPdf = modelPdf;
        this.fkPriceExpression = fkPriceExpression;
        this.desiredStock = desiredStock;
        this.fkUnit = fkUnit;
        this.priceAutogen = priceAutogen;
        this.fkProject = fkProject;
        this.mandatoryPeriod = mandatoryPeriod;
        this.lastMainDoc = lastMainDoc;
    }

    // Getters et Setters
    public Integer getRowid() {
        return rowid;
    }

    public void setRowid(Integer rowid) {
        this.rowid = rowid;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public Integer getEntity() {
        return entity;
    }

    public void setEntity(Integer entity) {
        this.entity = entity;
    }

    public String getRefExt() {
        return refExt;
    }

    public void setRefExt(String refExt) {
        this.refExt = refExt;
    }

    public Date getDatec() {
        return datec;
    }

    public void setDatec(Date datec) {
        this.datec = datec;
    }

    public Timestamp getTms() {
        return tms;
    }

    public void setTms(Timestamp tms) {
        this.tms = tms;
    }

    public Integer getFkParent() {
        return fkParent;
    }

    public void setFkParent(Integer fkParent) {
        this.fkParent = fkParent;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNotePublic() {
        return notePublic;
    }

    public void setNotePublic(String notePublic) {
        this.notePublic = notePublic;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getCustomCode() {
        return customCode;
    }

    public void setCustomCode(String customCode) {
        this.customCode = customCode;
    }

    public Integer getFkCountry() {
        return fkCountry;
    }

    public void setFkCountry(Integer fkCountry) {
        this.fkCountry = fkCountry;
    }

    public Integer getFkState() {
        return fkState;
    }

    public void setFkState(Integer fkState) {
        this.fkState = fkState;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPriceTtc() {
        return priceTtc;
    }

    public void setPriceTtc(Double priceTtc) {
        this.priceTtc = priceTtc;
    }

    public Double getPriceMin() {
        return priceMin;
    }

    public void setPriceMin(Double priceMin) {
        this.priceMin = priceMin;
    }

    public Double getPriceMinTtc() {
        return priceMinTtc;
    }

    public void setPriceMinTtc(Double priceMinTtc) {
        this.priceMinTtc = priceMinTtc;
    }

    public String getPriceBaseType() {
        return priceBaseType;
    }

    public void setPriceBaseType(String priceBaseType) {
        this.priceBaseType = priceBaseType;
    }

    public String getPriceLabel() {
        return priceLabel;
    }

    public void setPriceLabel(String priceLabel) {
        this.priceLabel = priceLabel;
    }

    public Double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Double costPrice) {
        this.costPrice = costPrice;
    }

    public String getDefaultVatCode() {
        return defaultVatCode;
    }

    public void setDefaultVatCode(String defaultVatCode) {
        this.defaultVatCode = defaultVatCode;
    }

    public Double getTvaTx() {
        return tvaTx;
    }

    public void setTvaTx(Double tvaTx) {
        this.tvaTx = tvaTx;
    }

    public Integer getRecuperableOnly() {
        return recuperableOnly;
    }

    public void setRecuperableOnly(Integer recuperableOnly) {
        this.recuperableOnly = recuperableOnly;
    }

    public Double getLocaltax1Tx() {
        return localtax1Tx;
    }

    public void setLocaltax1Tx(Double localtax1Tx) {
        this.localtax1Tx = localtax1Tx;
    }

    public String getLocaltax1Type() {
        return localtax1Type;
    }

    public void setLocaltax1Type(String localtax1Type) {
        this.localtax1Type = localtax1Type;
    }

    public Double getLocaltax2Tx() {
        return localtax2Tx;
    }

    public void setLocaltax2Tx(Double localtax2Tx) {
        this.localtax2Tx = localtax2Tx;
    }

    public String getLocaltax2Type() {
        return localtax2Type;
    }

    public void setLocaltax2Type(String localtax2Type) {
        this.localtax2Type = localtax2Type;
    }

    public Integer getFkUserAuthor() {
        return fkUserAuthor;
    }

    public void setFkUserAuthor(Integer fkUserAuthor) {
        this.fkUserAuthor = fkUserAuthor;
    }

    public Integer getFkUserModif() {
        return fkUserModif;
    }

    public void setFkUserModif(Integer fkUserModif) {
        this.fkUserModif = fkUserModif;
    }

    public Integer getToSell() {
        return toSell;
    }

    public void setToSell(Integer toSell) {
        this.toSell = toSell;
    }

    public Integer getToBuy() {
        return toBuy;
    }

    public void setToBuy(Integer toBuy) {
        this.toBuy = toBuy;
    }

    public Integer getToBatch() {
        return toBatch;
    }

    public void setToBatch(Integer toBatch) {
        this.toBatch = toBatch;
    }

    public Integer getSellOrEatByMandatory() {
        return sellOrEatByMandatory;
    }

    public void setSellOrEatByMandatory(Integer sellOrEatByMandatory) {
        this.sellOrEatByMandatory = sellOrEatByMandatory;
    }

    public String getBatchMask() {
        return batchMask;
    }

    public void setBatchMask(String batchMask) {
        this.batchMask = batchMask;
    }

    public Integer getFkProductType() {
        return fkProductType;
    }

    public void setFkProductType(Integer fkProductType) {
        this.fkProductType = fkProductType;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Float getSeuilStockAlerte() {
        return seuilStockAlerte;
    }

    public void setSeuilStockAlerte(Float seuilStockAlerte) {
        this.seuilStockAlerte = seuilStockAlerte;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Integer getFkBarcodeType() {
        return fkBarcodeType;
    }

    public void setFkBarcodeType(Integer fkBarcodeType) {
        this.fkBarcodeType = fkBarcodeType;
    }

    public String getAccountancyCodeSell() {
        return accountancyCodeSell;
    }

    public void setAccountancyCodeSell(String accountancyCodeSell) {
        this.accountancyCodeSell = accountancyCodeSell;
    }

    public String getAccountancyCodeSellIntra() {
        return accountancyCodeSellIntra;
    }

    public void setAccountancyCodeSellIntra(String accountancyCodeSellIntra) {
        this.accountancyCodeSellIntra = accountancyCodeSellIntra;
    }

    public String getAccountancyCodeSellExport() {
        return accountancyCodeSellExport;
    }

    public void setAccountancyCodeSellExport(String accountancyCodeSellExport) {
        this.accountancyCodeSellExport = accountancyCodeSellExport;
    }

    public String getAccountancyCodeBuy() {
        return accountancyCodeBuy;
    }

    public void setAccountancyCodeBuy(String accountancyCodeBuy) {
        this.accountancyCodeBuy = accountancyCodeBuy;
    }

    public String getAccountancyCodeBuyIntra() {
        return accountancyCodeBuyIntra;
    }

    public void setAccountancyCodeBuyIntra(String accountancyCodeBuyIntra) {
        this.accountancyCodeBuyIntra = accountancyCodeBuyIntra;
    }

    public String getAccountancyCodeBuyExport() {
        return accountancyCodeBuyExport;
    }

    public void setAccountancyCodeBuyExport(String accountancyCodeBuyExport) {
        this.accountancyCodeBuyExport = accountancyCodeBuyExport;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public Float getNetMeasure() {
        return netMeasure;
    }

    public void setNetMeasure(Float netMeasure) {
        this.netMeasure = netMeasure;
    }

    public Integer getNetMeasureUnits() {
        return netMeasureUnits;
    }

    public void setNetMeasureUnits(Integer netMeasureUnits) {
        this.netMeasureUnits = netMeasureUnits;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Integer getWeightUnits() {
        return weightUnits;
    }

    public void setWeightUnits(Integer weightUnits) {
        this.weightUnits = weightUnits;
    }

    public Float getLength() {
        return length;
    }

    public void setLength(Float length) {
        this.length = length;
    }

    public Integer getLengthUnits() {
        return lengthUnits;
    }

    public void setLengthUnits(Integer lengthUnits) {
        this.lengthUnits = lengthUnits;
    }

    public Float getWidth() {
        return width;
    }

    public void setWidth(Float width) {
        this.width = width;
    }

    public Integer getWidthUnits() {
        return widthUnits;
    }

    public void setWidthUnits(Integer widthUnits) {
        this.widthUnits = widthUnits;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public Integer getHeightUnits() {
        return heightUnits;
    }

    public void setHeightUnits(Integer heightUnits) {
        this.heightUnits = heightUnits;
    }

    public Float getSurface() {
        return surface;
    }

    public void setSurface(Float surface) {
        this.surface = surface;
    }

    public Integer getSurfaceUnits() {
        return surfaceUnits;
    }

    public void setSurfaceUnits(Integer surfaceUnits) {
        this.surfaceUnits = surfaceUnits;
    }

    public Float getVolume() {
        return volume;
    }

    public void setVolume(Float volume) {
        this.volume = volume;
    }

    public Integer getVolumeUnits() {
        return volumeUnits;
    }

    public void setVolumeUnits(Integer volumeUnits) {
        this.volumeUnits = volumeUnits;
    }

    public Integer getStockableProduct() {
        return stockableProduct;
    }

    public void setStockableProduct(Integer stockableProduct) {
        this.stockableProduct = stockableProduct;
    }

    public Double getStock() {
        return stock;
    }

    public void setStock(Double stock) {
        this.stock = stock;
    }

    public Double getPmp() {
        return pmp;
    }

    public void setPmp(Double pmp) {
        this.pmp = pmp;
    }

    public Double getFifo() {
        return fifo;
    }

    public void setFifo(Double fifo) {
        this.fifo = fifo;
    }

    public Double getLifo() {
        return lifo;
    }

    public void setLifo(Double lifo) {
        this.lifo = lifo;
    }

    public Integer getFkDefaultWarehouse() {
        return fkDefaultWarehouse;
    }

    public void setFkDefaultWarehouse(Integer fkDefaultWarehouse) {
        this.fkDefaultWarehouse = fkDefaultWarehouse;
    }

    public Integer getFkDefaultBom() {
        return fkDefaultBom;
    }

    public void setFkDefaultBom(Integer fkDefaultBom) {
        this.fkDefaultBom = fkDefaultBom;
    }

    public Integer getFkDefaultWorkstation() {
        return fkDefaultWorkstation;
    }

    public void setFkDefaultWorkstation(Integer fkDefaultWorkstation) {
        this.fkDefaultWorkstation = fkDefaultWorkstation;
    }

    public String getCanvas() {
        return canvas;
    }

    public void setCanvas(String canvas) {
        this.canvas = canvas;
    }

    public Integer getFinished() {
        return finished;
    }

    public void setFinished(Integer finished) {
        this.finished = finished;
    }

    public Integer getLifetime() {
        return lifetime;
    }

    public void setLifetime(Integer lifetime) {
        this.lifetime = lifetime;
    }

    public Integer getQcFrequency() {
        return qcFrequency;
    }

    public void setQcFrequency(Integer qcFrequency) {
        this.qcFrequency = qcFrequency;
    }

    public Integer getHidden() {
        return hidden;
    }

    public void setHidden(Integer hidden) {
        this.hidden = hidden;
    }

    public String getImportKey() {
        return importKey;
    }

    public void setImportKey(String importKey) {
        this.importKey = importKey;
    }

    public String getModelPdf() {
        return modelPdf;
    }

    public void setModelPdf(String modelPdf) {
        this.modelPdf = modelPdf;
    }

    public Integer getFkPriceExpression() {
        return fkPriceExpression;
    }

    public void setFkPriceExpression(Integer fkPriceExpression) {
        this.fkPriceExpression = fkPriceExpression;
    }

    public Float getDesiredStock() {
        return desiredStock;
    }

    public void setDesiredStock(Float desiredStock) {
        this.desiredStock = desiredStock;
    }

    public Integer getFkUnit() {
        return fkUnit;
    }

    public void setFkUnit(Integer fkUnit) {
        this.fkUnit = fkUnit;
    }

    public Integer getPriceAutogen() {
        return priceAutogen;
    }

    public void setPriceAutogen(Integer priceAutogen) {
        this.priceAutogen = priceAutogen;
    }

    public Integer getFkProject() {
        return fkProject;
    }

    public void setFkProject(Integer fkProject) {
        this.fkProject = fkProject;
    }

    public Integer getMandatoryPeriod() {
        return mandatoryPeriod;
    }

    public void setMandatoryPeriod(Integer mandatoryPeriod) {
        this.mandatoryPeriod = mandatoryPeriod;
    }

    public String getLastMainDoc() {
        return lastMainDoc;
    }

    public void setLastMainDoc(String lastMainDoc) {
        this.lastMainDoc = lastMainDoc;
    }
}