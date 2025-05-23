package builder;

import marche.Product;

public interface OrderBuilder {
	
	public void startOrder();
	public void setClient(String nom);
	public void addProduct(String type, int quantite);
	public void finalizeOrder();
	public void getOrder();
}
