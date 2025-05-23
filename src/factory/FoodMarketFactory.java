package factory;

import marche.Product;
import marche.Invoice;
import marche.Notifie;

public class FoodMarketFactory implements MarketFactory {
	
	@Override
	public Product createProduct(String type) {
		return new Product(type);
	}
	
	@Override
	public Invoice createInvoice() {
		return new Invoice();
	}
	
	@Override
	public Notifie createNotifie() {
		return new Notifie();
	}
}
