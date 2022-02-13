public class OrderId {

    private final String order = "Bestellnr. ";
    private int id;
    private String orderId;

    public String OrderId(int id) {
        return order + id;
    }
}
