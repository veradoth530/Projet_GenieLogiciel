package factory;

import marche.Product;
import marche.Invoice;
import marche.Notifie;

public interface MarketFactory {
	
	public Product createProduct(String type);
	public Invoice createInvoice();
	public Notifie createNotifie();
}
