package OnlineShop;

public class Product {

    private String productId;
    private String productName;

    public Product(String name) {
        this.productName = name;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }
}
