package market;

/**
 * Facture pour les produits électroniques.
 */

public class ElectronicsInvoice implements Invoice {
    @Override
    public String generate() {
        return "Facture générée pour des produits électroniques.";
    }
}
