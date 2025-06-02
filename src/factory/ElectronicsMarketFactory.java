package factory;

import market.ElectronicsInVoice;
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
		return new ElectronicsInVoice();
	}

	@Override
	public Notifier createNotifier() {
		return new ElectronicsNotifier();
	}
}

