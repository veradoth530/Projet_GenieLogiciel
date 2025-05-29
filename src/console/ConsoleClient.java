package console;

import java.util.Scanner;
import console.*;

public class ConsoleClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MarketFactory factory;

        System.out.println("Système de Commande Multi-Marché");
        System.out.println("1. Électronique");
        System.out.println("2. Alimentation (à venir)");
        System.out.print("Choix du marché : ");
        int choix = scanner.nextInt();
        scanner.nextLine(); // consomme le saut de ligne

        if (choix == 1) {
            factory = new ElectronicsMarketFactory();
        } else {
            System.out.println("Marché non disponible. Fin.");
            return;
        }

        OrderBuilder builder = new ConcreteOrderBuilder(factory);
        OrderDirector director = new OrderDirector();

        System.out.print("Nom du client : ");
        String client = scanner.nextLine();

        builder.startOrder();
        builder.setClient(client);

        boolean continuer = true;
        while (continuer) {
            System.out.print("Nom du produit à ajouter : ");
            String produit = scanner.nextLine();
            builder.addProduct(produit, 1);

            System.out.print("Ajouter un autre produit ? (o/n) ");
            continuer = scanner.nextLine().equalsIgnoreCase("o");
        }

        builder.applyDiscount(0.05); // Remise fixe pour l’exemple
        builder.finalizeOrder();
        Order commande = builder.getOrder();

        System.out.println("\nRésumé de la commande");
        commande.print();
    }
}

