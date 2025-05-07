package ObjetDolibarr;

import java.sql.Timestamp;
import java.util.Date;

public class ThirdParty {
    
        public int rowid;
        public String nom;
        public String nameAlias;
        public Integer entity;
        public String refExt;
        public Integer statut;
        public Integer parent;
        public Integer status;
        public String codeClient;
        public String codeFournisseur;
        public String codeCompta;
        public String codeComptaFournisseur;
        public String address;
        public String zip;
        public String town;
        public Integer fkDepartement;
        public Integer fkPays;
        public Double geolat;
        public Double geolong;
        public Double geoPoint;
        public String georesultcode;
        public String phone;
        public String phoneMobile;
        public String fax;
        public String url;
        public String email;
        public Integer fkAccount;
        public String socialnetworks;
        public Integer fkEffectif;
        public Integer fkTypent;
        public Integer fkFormeJuridique;
        public String fkCurrency;
        public String siren;
        public String siret;
        public String ape;
        public String idprof4;
        public String idprof5;
        public String idprof6;
        public String tvaIntra;
        public Double capital;
        public Integer fkStcomm;
        public String notePrivate;
        public String notePublic;
        public String modelPdf;
        public String lastMainDoc;
        public String prefixComm;
        public Integer client;
        public Integer fournisseur;
        public String supplierAccount;
        public String fkProspectlevel;
        public Integer fkIncoterms;
        public String locationIncoterms;
        public Integer customerBad;
        public Double customerRate;
        public Double supplierRate;
        public Double remiseClient;
        public Double remiseSupplier;
        public Integer modeReglement;
        public Integer condReglement;
        public String depositPercent;
        public Integer transportMode;
        public Integer modeReglementSupplier;
        public Integer condReglementSupplier;
        public Integer transportModeSupplier;
        public Integer fkShippingMethod;
        public Integer tvaAssuj;
        public Integer vatReverseCharge;
        public Integer localtax1Assuj;
        public Double localtax1Value;
        public Integer localtax2Assuj;
        public Double localtax2Value;
        public String barcode;
        public Integer fkBarcodeType;
        public Integer priceLevel;
        public Double outstandingLimit;
        public Double orderMinAmount;
        public Double supplierOrderMinAmount;
        public String defaultLang;
        public String logo;
        public String logoSquarred;
        public String canvas;
        public Integer fkWarehouse;
        public String webservicesUrl;
        public String webservicesKey;
        public String accountancyCodeSell;
        public String accountancyCodeBuy;
        public Timestamp tms;
        public Date datec;
        public Integer fkUserCreat;
        public Integer fkUserModif;
        public Integer fkMulticurrency;
        public String multicurrencyCode;
        public String importKey;

    public ThirdParty(int rowid, String nom, String nameAlias, Integer entity, String refExt, Integer statut,
                      Integer parent, Integer status, String codeClient, String codeFournisseur, String codeCompta,
                      String codeComptaFournisseur, String address, String zip, String town, Integer fkDepartement,
                      Integer fkPays, Double geolat, Double geolong, Double geoPoint, String georesultcode, String phone,
                      String phoneMobile, String fax, String url, String email, Integer fkAccount,
                      String socialnetworks, Integer fkEffectif, Integer fkTypent, Integer fkFormeJuridique,
                      String fkCurrency, String siren, String siret, String ape, String idprof4, String idprof5,
                      String idprof6, String tvaIntra, Double capital, Integer fkStcomm, String notePrivate,
                      String notePublic, String modelPdf, String lastMainDoc, String prefixComm, Integer client,
                      Integer fournisseur, String supplierAccount, String fkProspectlevel, Integer fkIncoterms,
                      String locationIncoterms, Integer customerBad, Double customerRate, Double supplierRate,
                      Double remiseClient, Double remiseSupplier, Integer modeReglement, Integer condReglement,
                      String depositPercent, Integer transportMode, Integer modeReglementSupplier,
                      Integer condReglementSupplier, Integer transportModeSupplier, Integer fkShippingMethod,
                      Integer tvaAssuj, Integer vatReverseCharge, Integer localtax1Assuj, Double localtax1Value,
                      Integer localtax2Assuj, Double localtax2Value, String barcode, Integer fkBarcodeType,
                      Integer priceLevel, Double outstandingLimit, Double orderMinAmount,
                      Double supplierOrderMinAmount, String defaultLang, String logo, String logoSquarred,
                      String canvas, Integer fkWarehouse, String webservicesUrl, String webservicesKey,
                      String accountancyCodeSell, String accountancyCodeBuy, Timestamp tms, Date datec,
                      Integer fkUserCreat, Integer fkUserModif, Integer fkMulticurrency, String multicurrencyCode,
                      String importKey) {
        this.rowid = rowid;
        this.nom = nom;
        this.nameAlias = nameAlias;
        this.entity = entity;
        this.refExt = refExt;
        this.statut = statut;
        this.parent = parent;
        this.status = status;
        this.codeClient = codeClient;
        this.codeFournisseur = codeFournisseur;
        this.codeCompta = codeCompta;
        this.codeComptaFournisseur = codeComptaFournisseur;
        this.address = address;
        this.zip = zip;
        this.town = town;
        this.fkDepartement = fkDepartement;
        this.fkPays = fkPays;
        this.geolat = geolat;
        this.geolong = geolong;
        this.geoPoint = geoPoint;
        this.georesultcode = georesultcode;
        this.phone = phone;
        this.phoneMobile = phoneMobile;
        this.fax = fax;
        this.url = url;
        this.email = email;
        this.fkAccount = fkAccount;
        this.socialnetworks = socialnetworks;
        this.fkEffectif = fkEffectif;
        this.fkTypent = fkTypent;
        this.fkFormeJuridique = fkFormeJuridique;
        this.fkCurrency = fkCurrency;
        this.siren = siren;
        this.siret = siret;
        this.ape = ape;
        this.idprof4 = idprof4;
        this.idprof5 = idprof5;
        this.idprof6 = idprof6;
        this.tvaIntra = tvaIntra;
        this.capital = capital;
        this.fkStcomm = fkStcomm;
        this.notePrivate = notePrivate;
        this.notePublic = notePublic;
        this.modelPdf = modelPdf;
        this.lastMainDoc = lastMainDoc;
        this.prefixComm = prefixComm;
        this.client = client;
        this.fournisseur = fournisseur;
        this.supplierAccount = supplierAccount;
        this.fkProspectlevel = fkProspectlevel;
        this.fkIncoterms = fkIncoterms;
        this.locationIncoterms = locationIncoterms;
        this.customerBad = customerBad;
        this.customerRate = customerRate;
        this.supplierRate = supplierRate;
        this.remiseClient = remiseClient;
        this.remiseSupplier = remiseSupplier;
        this.modeReglement = modeReglement;
        this.condReglement = condReglement;
        this.depositPercent = depositPercent;
        this.transportMode = transportMode;
        this.modeReglementSupplier = modeReglementSupplier;
        this.condReglementSupplier = condReglementSupplier;
        this.transportModeSupplier = transportModeSupplier;
        this.fkShippingMethod = fkShippingMethod;
        this.tvaAssuj = tvaAssuj;
        this.vatReverseCharge = vatReverseCharge;
        this.localtax1Assuj = localtax1Assuj;
        this.localtax1Value = localtax1Value;
        this.localtax2Assuj = localtax2Assuj;
        this.localtax2Value = localtax2Value;
        this.barcode = barcode;
        this.fkBarcodeType = fkBarcodeType;
        this.priceLevel = priceLevel;
        this.outstandingLimit = outstandingLimit;
        this.orderMinAmount = orderMinAmount;
        this.supplierOrderMinAmount = supplierOrderMinAmount;
        this.defaultLang = defaultLang;
        this.logo = logo;
        this.logoSquarred = logoSquarred;
        this.canvas = canvas;
        this.fkWarehouse = fkWarehouse;
        this.webservicesUrl = webservicesUrl;
        this.webservicesKey = webservicesKey;
        this.accountancyCodeSell = accountancyCodeSell;
        this.accountancyCodeBuy = accountancyCodeBuy;
        this.tms = tms;
        this.datec = datec;
        this.fkUserCreat = fkUserCreat;
        this.fkUserModif = fkUserModif;
        this.fkMulticurrency = fkMulticurrency;
        this.multicurrencyCode = multicurrencyCode;
        this.importKey = importKey;
    }

    // Getters et Setters
    public int getRowid() {
        return rowid;
    }

    public void setRowid(int rowid) {
        this.rowid = rowid;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNameAlias() {
        return nameAlias;
    }

    public void setNameAlias(String nameAlias) {
        this.nameAlias = nameAlias;
    }

    public int getEntity() {
        return entity;
    }

    public void setEntity(int entity) {
        this.entity = entity;
    }

    public String getRefExt() {
        return refExt;
    }

    public void setRefExt(String refExt) {
        this.refExt = refExt;
    }

    public Integer getStatut() {
        return statut;
    }

    public void setStatut(Integer statut) {
        this.statut = statut;
    }

    public Integer getParent() {
        return parent;
    }

    public void setParent(Integer parent) {
        this.parent = parent;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCodeClient() {
        return codeClient;
    }

    public void setCodeClient(String codeClient) {
        this.codeClient = codeClient;
    }

    public String getCodeFournisseur() {
        return codeFournisseur;
    }

    public void setCodeFournisseur(String codeFournisseur) {
        this.codeFournisseur = codeFournisseur;
    }

    public String getCodeCompta() {
        return codeCompta;
    }

    public void setCodeCompta(String codeCompta) {
        this.codeCompta = codeCompta;
    }

    public String getCodeComptaFournisseur() {
        return codeComptaFournisseur;
    }

    public void setCodeComptaFournisseur(String codeComptaFournisseur) {
        this.codeComptaFournisseur = codeComptaFournisseur;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public Integer getFkDepartement() {
        return fkDepartement;
    }

    public void setFkDepartement(Integer fkDepartement) {
        this.fkDepartement = fkDepartement;
    }

    public Integer getFkPays() {
        return fkPays;
    }

    public void setFkPays(Integer fkPays) {
        this.fkPays = fkPays;
    }

    public Double getGeolat() {
        return geolat;
    }

    public void setGeolat(Double geolat) {
        this.geolat = geolat;
    }

    public Double getGeolong() {
        return geolong;
    }

    public void setGeolong(Double geolong) {
        this.geolong = geolong;
    }

    public Double getGeoPoint() {
        return geoPoint;
    }

    public void setGeoPoint(Double geopoint) {
        this.geoPoint = geopoint;
    }

    public String getGeoresultcode() {
        return georesultcode;
    }

    public void setGeoresultcode(String georesultcode) {
        this.georesultcode = georesultcode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhoneMobile() {
        return phoneMobile;
    }

    public void setPhoneMobile(String phoneMobile) {
        this.phoneMobile = phoneMobile;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getFkAccount() {
        return fkAccount;
    }

    public void setFkAccount(Integer fkAccount) {
        this.fkAccount = fkAccount;
    }

    public String getSocialnetworks() {
        return socialnetworks;
    }

    public void setSocialnetworks(String socialnetworks) {
        this.socialnetworks = socialnetworks;
    }

    public Integer getFkEffectif() {
        return fkEffectif;
    }

    public void setFkEffectif(Integer fkEffectif) {
        this.fkEffectif = fkEffectif;
    }

    public Integer getFkTypent() {
        return fkTypent;
    }

    public void setFkTypent(Integer fkTypent) {
        this.fkTypent = fkTypent;
    }

    public Integer getFkFormeJuridique() {
        return fkFormeJuridique;
    }

    public void setFkFormeJuridique(Integer fkFormeJuridique) {
        this.fkFormeJuridique = fkFormeJuridique;
    }

    public String getFkCurrency() {
        return fkCurrency;
    }

    public void setFkCurrency(String fkCurrency) {
        this.fkCurrency = fkCurrency;
    }

    public String getSiren() {
        return siren;
    }

    public void setSiren(String siren) {
        this.siren = siren;
    }

    public String getSiret() {
        return siret;
    }

    public void setSiret(String siret) {
        this.siret = siret;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public String getIdprof4() {
        return idprof4;
    }

    public void setIdprof4(String idprof4) {
        this.idprof4 = idprof4;
    }

    public String getIdprof5() {
        return idprof5;
    }

    public void setIdprof5(String idprof5) {
        this.idprof5 = idprof5;
    }

    public String getIdprof6() {
        return idprof6;
    }

    public void setIdprof6(String idprof6) {
        this.idprof6 = idprof6;
    }

    public String getTvaIntra() {
        return tvaIntra;
    }

    public void setTvaIntra(String tvaIntra) {
        this.tvaIntra = tvaIntra;
    }

    public Double getCapital() {
        return capital;
    }

    public void setCapital(Double capital) {
        this.capital = capital;
    }

    public int getFkStcomm() {
        return fkStcomm;
    }

    public void setFkStcomm(int fkStcomm) {
        this.fkStcomm = fkStcomm;
    }

    public String getNotePrivate() {
        return notePrivate;
    }

    public void setNotePrivate(String notePrivate) {
        this.notePrivate = notePrivate;
    }

    public String getNotePublic() {
        return notePublic;
    }

    public void setNotePublic(String notePublic) {
        this.notePublic = notePublic;
    }

    public String getModelPdf() {
        return modelPdf;
    }

    public void setModelPdf(String modelPdf) {
        this.modelPdf = modelPdf;
    }

    public String getLastMainDoc() {
        return lastMainDoc;
    }

    public void setLastMainDoc(String lastMainDoc) {
        this.lastMainDoc = lastMainDoc;
    }

    public String getPrefixComm() {
        return prefixComm;
    }

    public void setPrefixComm(String prefixComm) {
        this.prefixComm = prefixComm;
    }

    public Integer getClient() {
        return client;
    }

    public void setClient(Integer client) {
        this.client = client;
    }

    public Integer getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(Integer fournisseur) {
        this.fournisseur = fournisseur;
    }

    public String getSupplierAccount() {
        return supplierAccount;
    }

    public void setSupplierAccount(String supplierAccount) {
        this.supplierAccount = supplierAccount;
    }

    public String getFkProspectlevel() {
        return fkProspectlevel;
    }

    public void setFkProspectlevel(String fkProspectlevel) {
        this.fkProspectlevel = fkProspectlevel;
    }

    public Integer getFkIncoterms() {
        return fkIncoterms;
    }

    public void setFkIncoterms(Integer fkIncoterms) {
        this.fkIncoterms = fkIncoterms;
    }

    public String getLocationIncoterms() {
        return locationIncoterms;
    }

    public void setLocationIncoterms(String locationIncoterms) {
        this.locationIncoterms = locationIncoterms;
    }

    public Integer getCustomerBad() {
        return customerBad;
    }

    public void setCustomerBad(Integer customerBad) {
        this.customerBad = customerBad;
    }

    public Double getCustomerRate() {
        return customerRate;
    }

    public void setCustomerRate(Double customerRate) {
        this.customerRate = customerRate;
    }

    public Double getSupplierRate() {
        return supplierRate;
    }

    public void setSupplierRate(Double supplierRate) {
        this.supplierRate = supplierRate;
    }

    public Double getRemiseClient() {
        return remiseClient;
    }

    public void setRemiseClient(Double remiseClient) {
        this.remiseClient = remiseClient;
    }

    public Double getRemiseSupplier() {
        return remiseSupplier;
    }

    public void setRemiseSupplier(Double remiseSupplier) {
        this.remiseSupplier = remiseSupplier;
    }

    public Integer getModeReglement() {
        return modeReglement;
    }

    public void setModeReglement(Integer modeReglement) {
        this.modeReglement = modeReglement;
    }

    public Integer getCondReglement() {
        return condReglement;
    }

    public void setCondReglement(Integer condReglement) {
        this.condReglement = condReglement;
    }

    public String getDepositPercent() {
        return depositPercent;
    }

    public void setDepositPercent(String depositPercent) {
        this.depositPercent = depositPercent;
    }

    public Integer getTransportMode() {
        return transportMode;
    }

    public void setTransportMode(Integer transportMode) {
        this.transportMode = transportMode;
    }

    public Integer getModeReglementSupplier() {
        return modeReglementSupplier;
    }

    public void setModeReglementSupplier(Integer modeReglementSupplier) {
        this.modeReglementSupplier = modeReglementSupplier;
    }

    public Integer getCondReglementSupplier() {
        return condReglementSupplier;
    }

    public void setCondReglementSupplier(Integer condReglementSupplier) {
        this.condReglementSupplier = condReglementSupplier;
    }

    public Integer getTransportModeSupplier() {
        return transportModeSupplier;
    }

    public void setTransportModeSupplier(Integer transportModeSupplier) {
        this.transportModeSupplier = transportModeSupplier;
    }

    public Integer getFkShippingMethod() {
        return fkShippingMethod;
    }

    public void setFkShippingMethod(Integer fkShippingMethod) {
        this.fkShippingMethod = fkShippingMethod;
    }

    public Integer getTvaAssuj() {
        return tvaAssuj;
    }

    public void setTvaAssuj(Integer tvaAssuj) {
        this.tvaAssuj = tvaAssuj;
    }

    public Integer getVatReverseCharge() {
        return vatReverseCharge;
    }

    public void setVatReverseCharge(Integer vatReverseCharge) {
        this.vatReverseCharge = vatReverseCharge;
    }

    public Integer getLocaltax1Assuj() {
        return localtax1Assuj;
    }

    public void setLocaltax1Assuj(Integer localtax1Assuj) {
        this.localtax1Assuj = localtax1Assuj;
    }

    public Double getLocaltax1Value() {
        return localtax1Value;
    }

    public void setLocaltax1Value(Double localtax1Value) {
        this.localtax1Value = localtax1Value;
    }

    public Integer getLocaltax2Assuj() {
        return localtax2Assuj;
    }

    public void setLocaltax2Assuj(Integer localtax2Assuj) {
        this.localtax2Assuj = localtax2Assuj;
    }

    public Double getLocaltax2Value() {
        return localtax2Value;
    }

    public void setLocaltax2Value(Double localtax2Value) {
        this.localtax2Value = localtax2Value;
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

    public Integer getPriceLevel() {
        return priceLevel;
    }

    public void setPriceLevel(Integer priceLevel) {
        this.priceLevel = priceLevel;
    }

    public Double getOutstandingLimit() {
        return outstandingLimit;
    }

    public void setOutstandingLimit(Double outstandingLimit) {
        this.outstandingLimit = outstandingLimit;
    }

    public Double getOrderMinAmount() {
        return orderMinAmount;
    }

    public void setOrderMinAmount(Double orderMinAmount) {
        this.orderMinAmount = orderMinAmount;
    }

    public Double getSupplierOrderMinAmount() {
        return supplierOrderMinAmount;
    }

    public void setSupplierOrderMinAmount(Double supplierOrderMinAmount) {
        this.supplierOrderMinAmount = supplierOrderMinAmount;
    }

    public String getDefaultLang() {
        return defaultLang;
    }

    public void setDefaultLang(String defaultLang) {
        this.defaultLang = defaultLang;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getLogoSquarred() {
        return logoSquarred;
    }

    public void setLogoSquarred(String logoSquarred) {
        this.logoSquarred = logoSquarred;
    }

    public String getCanvas() {
        return canvas;
    }

    public void setCanvas(String canvas) {
        this.canvas = canvas;
    }

    public Integer getFkWarehouse() {
        return fkWarehouse;
    }

    public void setFkWarehouse(Integer fkWarehouse) {
        this.fkWarehouse = fkWarehouse;
    }

    public String getWebservicesUrl() {
        return webservicesUrl;
    }

    public void setWebservicesUrl(String webservicesUrl) {
        this.webservicesUrl = webservicesUrl;
    }

    public String getWebservicesKey() {
        return webservicesKey;
    }

    public void setWebservicesKey(String webservicesKey) {
        this.webservicesKey = webservicesKey;
    }

    public String getAccountancyCodeSell() {
        return accountancyCodeSell;
    }

    public void setAccountancyCodeSell(String accountancyCodeSell) {
        this.accountancyCodeSell = accountancyCodeSell;
    }

    public String getAccountancyCodeBuy() {
        return accountancyCodeBuy;
    }

    public void setAccountancyCodeBuy(String accountancyCodeBuy) {
        this.accountancyCodeBuy = accountancyCodeBuy;
    }

    public Timestamp getTms() {
        return tms;
    }

    public void setTms(Timestamp tms) {
        this.tms = tms;
    }

    public Date getDatec() {
        return datec;
    }

    public void setDatec(Date datec) {
        this.datec = datec;
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

    public Integer getFkMulticurrency() {
        return fkMulticurrency;
    }

    public void setFkMulticurrency(Integer fkMulticurrency) {
        this.fkMulticurrency = fkMulticurrency;
    }

    public String getMulticurrencyCode() {
        return multicurrencyCode;
    }

    public void setMulticurrencyCode(String multicurrencyCode) {
        this.multicurrencyCode = multicurrencyCode;
    }

    public String getImportKey() {
        return importKey;
    }

    public void setImportKey(String importKey) {
        this.importKey = importKey;
    }
}
