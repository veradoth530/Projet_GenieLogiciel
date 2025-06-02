package market;

import product.Product;


/**
 * Produit alimentaire avec description.
 */

public class FoodProduct implements Product {
    private String name;

    public FoodProduct(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return "Produit alimentaire : " + name;
    }
}
