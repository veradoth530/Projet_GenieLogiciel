package factory;

import marche.Product;
import marche.Invoice;
import marche.Notifie;

public class ElectronicsMarketFactory implements MarketFactory {
	@Override
	public Product createProduct(String type) {
		return new ElectronicsProduct(type);
	}

	@Override
	public Invoice createInvoice() {
		return new ElectronicsInvoice();
	}

	@Override
	public Notifier createNotifier() {
		return new ElectronicsNotifier();
	}
}

