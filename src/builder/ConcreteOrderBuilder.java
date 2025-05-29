public class ConcreteOrderBuilder implements OrderBuilder {
    private MarketFactory factory;
    private Order order;

    public ConcreteOrderBuilder(MarketFactory factory) {
        this.factory = factory;
    }

    public void startOrder() {
        order = new Order();
    }

    public void setClient(String name) {
        order.setClientName(name);
    }

    public void addProduct(String type, int quantity) {
        Product p = factory.createProduct(type);
        order.addProduct(p, quantity);
    }

    public void applyDiscount(double rate) {
        order.setDiscount(rate);
    }

    public void finalizeOrder() {
        order.setInvoice(factory.createInvoice());
        order.setNotifier(factory.createNotifier());
    }

    public Order getOrder() {
        return order;
    }
}
