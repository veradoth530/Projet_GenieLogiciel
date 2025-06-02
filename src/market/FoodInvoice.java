package market;

/**
 * Facture pour les produits alimentaires.
 */
public class FoodInvoice implements Invoice {
    @Override
    public String generate() {
        return "Facture générée pour des produits alimentaires.";
    }
}
