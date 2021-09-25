package l21_final_examination;

import java.io.Serializable;

public class ImportedProduct extends Product {

    private double importPrices;
    private String province;
    private double importTax;

    public ImportedProduct() {
    }

    public ImportedProduct(int id, String codeProduct, String nameProduct, Double price, int quantity, String producer, double importPrices, String province, double importTax) {
        super(id, codeProduct, nameProduct, price, quantity, producer);
        this.importPrices = importPrices;
        this.province = province;
        this.importTax = importTax;
    }

    public double getImportPrices() {
        return importPrices;
    }

    public void setImportPrices(double importPrices) {
        this.importPrices = importPrices;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public double getImportTax() {
        return importTax;
    }

    public void setImportTax(double importTax) {
        this.importTax = importTax;
    }

    @Override
    public String toString() {
        return "ImportedProduct{" +
                "importPrices=" + importPrices +
                ", province='" + province + '\'' +
                ", importTax=" + importTax +
                "} " + super.toString();
    }
}
