package market;

/**
 * Notification pour les clients du marché électronique.
 */

public class ElectronicsNotifier implements Notifier {
    @Override
    public void notifyClient(String clientName) {
        System.out.println("Notification envoyée au client : " + clientName);
    }
}
