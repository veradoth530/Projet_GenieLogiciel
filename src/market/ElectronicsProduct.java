package market;

import product.Product;
/**
 * Produit électronique avec description.
 */
public class ElectronicsProduct implements Product {
    private String name;
    public ElectronicsProduct(String name) {
        this.name = name;
    }
    public String getDescription() {
        return "Produit électronique : " + name;
    }
}
