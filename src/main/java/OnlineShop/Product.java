package OnlineShop;

public class Product {

    private int productId;
    private String productName;

    public Product(int id, String name) {
        this.productId = id;
        this.productName = name;
    }

    public Product(String name) {
        this.productName = name;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public String toString() {
        return productName + " (Artikelnr. " + productId + ")";
    }
}
