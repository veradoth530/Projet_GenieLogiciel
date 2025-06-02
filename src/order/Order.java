package order;
/**
 * Classe représentant une commande client.
 */

import java.util.ArrayList;
import java.util.List;

import market.Invoice;
import market.Notifier;
import product.Product;

public class Order {
	private String clientName;
	private List<Product> products = new ArrayList<>();
	private double discount;
	private Invoice invoice;
	private Notifier notifier;

	public void setClientName(String name) { this.clientName = name; }
	public void addProduct(Product p, int q) { products.add(p); }
	public void setDiscount(double d) { this.discount = d; }
	public void setInvoice(Invoice i) { this.invoice = i; }
	public void setNotifier(Notifier n) { this.notifier = n; }


	/**
	 * Affiche le résumé de la commande.
	 */
	public void print() {
		System.out.println("Commande pour : " + clientName);
		for (Product p : products) {
			System.out.println("- " + p.getDescription());
		}
		System.out.println("Remise : " + (discount * 100) + "%");
		System.out.println(invoice.generate());
		notifier.notifyClient(clientName);
	}
}
