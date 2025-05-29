package builder;

import market.Product;

public interface OrderBuilder {
	
	public void startOrder();
	public void setClient(String nom);
	public void addProduct(String type, int quantite);
	public void applyDiscount(double reduction);
	public void finalizeOrder();
	public void getOrder();
}
