package factory;

import market.*;
import product.Product;

public class FoodMarketFactory implements MarketFactory {
	@Override
	public Product createProduct(String type) {
		return new FoodProduct(type);
	}

	@Override
	public Invoice createInvoice() {
		return new FoodInvoice();
	}

	@Override
	public Notifier createNotifier() {
		return new FoodNotifier();
	}
}
