package builder;

import factory.MarketFactory;
import market.Invoice;
import market.Notifier;
import order.Order;
import product.Product;

public class ConcreteOrderBuilder implements OrderBuilder {
    private MarketFactory factory;
    private Order order;

    public ConcreteOrderBuilder(MarketFactory factory) {
        this.factory = factory;
    }

    @Override
    public void startOrder() {
        order = new Order();
        order.setInvoice(factory.createInvoice());
        order.setNotifier(factory.createNotifier());
    }

    @Override
    public void setClient(String name) {
        order.setClientName(name);
    }

    @Override
    public void addProduct(String name, int quantity) {
        Product p = factory.createProduct(name);
        order.addProduct(p, quantity);
    }

    @Override
    public void applyDiscount(double d) {
        order.setDiscount(d);
    }

    @Override
    public void finalizeOrder() {
        // Rien de spécial ici pour l’instant
    }

    @Override
    public Order getOrder() {
        return order;
    }
}
