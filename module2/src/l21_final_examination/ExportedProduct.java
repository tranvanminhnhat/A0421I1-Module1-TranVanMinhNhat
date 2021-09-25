package l21_final_examination;

import java.io.Serializable;

public class ExportedProduct extends Product {

    private double exportPrice;
    private String importProductCountry;

    public ExportedProduct() {
    }

    public ExportedProduct(int id, String codeProduct, String nameProduct, Double price, int quantity, String producer, double exportPrice, String importProductCountry) {
        super(id, codeProduct, nameProduct, price, quantity, producer);
        this.exportPrice = exportPrice;
        this.importProductCountry = importProductCountry;
    }

    public double getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(double exportPrice) {
        this.exportPrice = exportPrice;
    }

    public String getImportProductCountry() {
        return importProductCountry;
    }

    public void setImportProductCountry(String importProductCountry) {
        this.importProductCountry = importProductCountry;
    }

    @Override
    public String toString() {
        return "ExportedProduct{" +
                "exportPrice=" + exportPrice +
                ", importProductCountry='" + importProductCountry + '\'' +
                "} " + super.toString();
    }
}
