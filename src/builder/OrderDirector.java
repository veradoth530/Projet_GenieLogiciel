package builder;

public class OrderDirector {
    public void buildSimpleOrder(OrderBuilder builder) {
        builder.startOrder();
        builder.setClient("Alice");
        builder.addProduct("Laptop", 1);
        builder.applyDiscount(0.10);
        builder.finalizeOrder();
    }
}

