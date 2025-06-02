package factory;

import market.Invoice;
import market.Notifier;
import product.Product;

/**
 * Interface pour la création des éléments spécifiques à un marché.
 */

public interface MarketFactory {

	/**
	 * Crée un produit spécifique au marché.
	 * @param type Le type de produit.
	 * @return Le produit créé.
	 */

	Product createProduct(String type);

	/**
	 * Crée une facture spécifique au marché.
	 * @return La facture créée.
	 */

	Invoice createInvoice();

	/**
	 * Crée un système de notification spécifique au marché.
	 * @return Le notifier créé.
	 */

	Notifier createNotifier();
}

