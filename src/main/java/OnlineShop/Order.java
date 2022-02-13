package OnlineShop;

public class Order {

    private String orderId;
    private int lengthProductList;
    private Product[] products = new Product[lengthProductList];

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

    @Override
    public String toString() {
        String order = orderId + ": ";
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                order += (products[i] + ", ");
            }
        }
        return order;
    }
}
