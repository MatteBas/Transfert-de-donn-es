package ObjetDolibarr;

import java.sql.Date;

public class Product {

    int rowId;
    String ref;
    int entity;
    String ref_ext;
    Date datec;
    Date tms;
    int fk_parent;
    String label;
    String description;
    String note_public;
    String note;
    String customCode;
    int fk_country;
    int fk_state;
    Double price;
    Double price_ttc;
    Double price_min;
    Double price_min_ttc;
    String price_base_type;
    String price_label;
    double cost_price;
    String dafault_vat_code;
    Double tva_tx;
    int recupeableOnly;
    Double localtax1_tx;
    Double localtax1_type;
    Double localtax2_tx;
    Double localtax2_type;
    int fk_user_author;
    int fk_user_modif;
    int toSell;
    int toBuy;
    int toBatch;
    int sell_or_eat_by_mandatory;
    String batch_mask;

    // Nouveaux attributs
    int fk_product_type;
    String duration;
    Float seuil_stock_alerte;
    String url;
    String barcode;
    int fk_barcode_type;
    String accountancy_code_sell;
    String accountancy_code_sell_intra;
    String accountancy_code_sell_export;
    String accountancy_code_buy;
    String accountancy_code_buy_intra;
    String accountancy_code_buy_export;
    String partnumber;
    Float net_measure;
    Integer net_measure_units;
    Float width;
    Integer width_unit;
    int stockable_product;
    Double stock;
    Double pmp;
    Double fifo;
    Double lifo;
    int fk_default_warehouse;
    int fk_default_bom;
    int fk_default_workstation;
    String canvas;
    Integer finished;
    Integer lifetime;
    Integer qc_frequency;
    int hidden;
    String import_key;
    String model_pdf;
    int fk_price_expression;
    Float desiredstock;
    int fk_unit;
    int price_autogen;
    int fk_project;
    int mandatory_period;
    String last_main_doc;

    // Attribut des unités, llx_c_units
    int weight;
    int height;
    int length;
    int surface;
    int volume;

    int weight_unit;
    int height_unit;
    int length_unit;
    int surface_unit;
    int volume_unit;

    public Product(
        int weight, int height, int length, int surface, int volume, int weight_unit, int height_unit, int length_unit, int surface_unit, int volume_unit,
        int fk_product_type, String duration, Float seuil_stock_alerte, String url, String barcode, int fk_barcode_type, String accountancy_code_sell,
        String accountancy_code_sell_intra, String accountancy_code_sell_export, String accountancy_code_buy, String accountancy_code_buy_intra,
        String accountancy_code_buy_export, String partnumber, Float net_measure, Integer net_measure_units, Float width, Integer width_unit,
        int stockable_product, Double stock, Double pmp, Double fifo, Double lifo, int fk_default_warehouse, int fk_default_bom, int fk_default_workstation,
        String canvas, Integer finished, Integer lifetime, Integer qc_frequency, int hidden, String import_key, String model_pdf, int fk_price_expression,
        Float desiredstock, int fk_unit, int price_autogen, int fk_project, int mandatory_period, String last_main_doc,
        // Nouveaux attributs manquants
        int rowId, String ref, int entity, String ref_ext, Date datec, Date tms, int fk_parent, String label, String description, String note_public,
        String note, String customCode, int fk_country, int fk_state, Double price, Double price_ttc, Double price_min, Double price_min_ttc,
        String price_base_type, String price_label, double cost_price, String dafault_vat_code, Double tva_tx, int recupeableOnly, Double localtax1_tx,
        Double localtax1_type, Double localtax2_tx, Double localtax2_type, int fk_user_author, int fk_user_modif, int toSell, int toBuy, int toBatch,
        int sell_or_eat_by_mandatory, String batch_mask
    ) {
        // Attribut des unités, llx_c_units
        this.weight = weight;
        this.height = height;
        this.length = length;
        this.surface = surface;
        this.volume = volume;
        this.weight_unit = weight_unit;
        this.height_unit = height_unit;
        this.length_unit = length_unit;
        this.surface_unit = surface_unit;
        this.volume_unit = volume_unit;

        // Nouveaux attributs
        this.fk_product_type = fk_product_type;
        this.duration = duration;
        this.seuil_stock_alerte = seuil_stock_alerte;
        this.url = url;
        this.barcode = barcode;
        this.fk_barcode_type = fk_barcode_type;
        this.accountancy_code_sell = accountancy_code_sell;
        this.accountancy_code_sell_intra = accountancy_code_sell_intra;
        this.accountancy_code_sell_export = accountancy_code_sell_export;
        this.accountancy_code_buy = accountancy_code_buy;
        this.accountancy_code_buy_intra = accountancy_code_buy_intra;
        this.accountancy_code_buy_export = accountancy_code_buy_export;
        this.partnumber = partnumber;
        this.net_measure = net_measure;
        this.net_measure_units = net_measure_units;
        this.width = width;
        this.width_unit = width_unit;
        this.stockable_product = stockable_product;
        this.stock = stock;
        this.pmp = pmp;
        this.fifo = fifo;
        this.lifo = lifo;
        this.fk_default_warehouse = fk_default_warehouse;
        this.fk_default_bom = fk_default_bom;
        this.fk_default_workstation = fk_default_workstation;
        this.canvas = canvas;
        this.finished = finished;
        this.lifetime = lifetime;
        this.qc_frequency = qc_frequency;
        this.hidden = hidden;
        this.import_key = import_key;
        this.model_pdf = model_pdf;
        this.fk_price_expression = fk_price_expression;
        this.desiredstock = desiredstock;
        this.fk_unit = fk_unit;
        this.price_autogen = price_autogen;
        this.fk_project = fk_project;
        this.mandatory_period = mandatory_period;
        this.last_main_doc = last_main_doc;

        // Nouveaux attributs manquants
        this.rowId = rowId;
        this.ref = ref;
        this.entity = entity;
        this.ref_ext = ref_ext;
        this.datec = datec;
        this.tms = tms;
        this.fk_parent = fk_parent;
        this.label = label;
        this.description = description;
        this.note_public = note_public;
        this.note = note;
        this.customCode = customCode;
        this.fk_country = fk_country;
        this.fk_state = fk_state;
        this.price = price;
        this.price_ttc = price_ttc;
        this.price_min = price_min;
        this.price_min_ttc = price_min_ttc;
        this.price_base_type = price_base_type;
        this.price_label = price_label;
        this.cost_price = cost_price;
        this.dafault_vat_code = dafault_vat_code;
        this.tva_tx = tva_tx;
        this.recupeableOnly = recupeableOnly;
        this.localtax1_tx = localtax1_tx;
        this.localtax1_type = localtax1_type;
        this.localtax2_tx = localtax2_tx;
        this.localtax2_type = localtax2_type;
        this.fk_user_author = fk_user_author;
        this.fk_user_modif = fk_user_modif;
        this.toSell = toSell;
        this.toBuy = toBuy;
        this.toBatch = toBatch;
        this.sell_or_eat_by_mandatory = sell_or_eat_by_mandatory;
        this.batch_mask = batch_mask;
    }
}
