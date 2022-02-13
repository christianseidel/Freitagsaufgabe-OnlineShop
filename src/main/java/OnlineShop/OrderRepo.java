package OnlineShop;

import java.util.Arrays;

public class OrderRepo {

    private final int lengthOfOrderBook = 10;
    private Order[] orders;


    public void OrderRepo() {
        this.orders = new Order[lengthOfOrderBook];
    }

    public OrderRepo listAllOrders(OrderRepo allOrders) {
        return allOrders;
    }

    public Order[] getOrders() {
        return orders;
    }

    public Order[] add(Order plus) {
        int i = 0;
        while (i < lengthOfOrderBook) {
            if (this.orders[i] != null) {
                orders[i] = plus;
                break;
            }
        }
        return this.orders;
    }

    @Override
    public String toString() {
        return "OrderRepo: " + Arrays.toString(orders) + ",";
    }
}
