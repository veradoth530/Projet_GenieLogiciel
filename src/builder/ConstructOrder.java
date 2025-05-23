package builder;

import order.Order;
import factory.MarketFactory;
import marche.Product;

public class ConstructOrder implements OrderBuilder{
	private Order order;
	private MarketFactory factory;
	
	public ConstructOrder(MarketFactory factory) {
		this.factory = factory;
	}
	
	@Override
	public void startOrder() {
		System.out.println("Initalisation de la commande");
		order = new Order();
	}
	
	@Override
	public void setClient(String nom) {
		order.setClient(nom);
	}
	
	/*
	@Override
	public void addProuct(String type, int quantite) {
		Product p = factory.createProduct(type);
		order.addProduct(p, quantite);
	}
	*/
}
