package OnlineShop;

public class Order {

    private String orderId;
    private Product[] products = new Product[10];

    public Order (String orderId, Product[] products) {
        this.orderId = orderId;
        this.products = products;
    }

    public String getOrderId() {
        return orderId;
    }

    public Product[] getProducts() {
        return products;
    }
}
