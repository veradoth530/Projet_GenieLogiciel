package market;
/**
 * Interface de notification de client.
 */
public interface Notifier {
	/**
	 * Envoie une notification au client.
	 * @param clientName Le nom du client.
	 */
	void notifyClient(String clientName);
}
