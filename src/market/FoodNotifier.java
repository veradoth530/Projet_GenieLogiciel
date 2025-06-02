package market;


/**
 * Notification pour les clients du marché alimentaire.
 */
public class FoodNotifier implements Notifier {
    @Override
    public void notifyClient(String clientName) {
        System.out.println("Notification alimentaire envoyée à : " + clientName);
    }
}
