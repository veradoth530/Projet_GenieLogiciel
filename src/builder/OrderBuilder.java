package builder;

import order.Order;

public interface OrderBuilder {
	void startOrder();
	void setClient(String name);
	void addProduct(String name, int quantity);
	void applyDiscount(double d);
	void finalizeOrder();
	Order getOrder();
}
