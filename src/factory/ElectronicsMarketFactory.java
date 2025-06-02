package factory;

import market.ElectronicsInvoice;
import market.ElectronicsNotifier;
import market.ElectronicsProduct;
import market.Invoice;
import market.Notifier;
import product.Product;

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

