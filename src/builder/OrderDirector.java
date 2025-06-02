package builder;

public class OrderDirector {
    public void buildSimpleOrder(OrderBuilder builder) {
        builder.startOrder();
        builder.setClient("Client Test");
        builder.addProduct("TestProduit", 1);
        builder.applyDiscount(0.0);
        builder.finalizeOrder();
    }
}
